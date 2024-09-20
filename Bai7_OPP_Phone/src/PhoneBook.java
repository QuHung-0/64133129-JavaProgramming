import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class PhoneBook extends Phone
{
    private ArrayList<String> phoneList = new ArrayList<>();

    @Override
    void insertPhone(String name, String phone)
    {
        boolean tonTai = false;

        for (int i = 0; i < phoneList.size(); i++)
        {
            // Lấy dòng trong danh sách
            String Dong = phoneList.get(i);

            // nếu dòng đó bắt đầu với name:
            if (Dong.startsWith(name + " :"))
            {
                tonTai = true;

                if (!Dong.contains(phone)) // nếu đã tồn tại tên
                {
                    Dong += " : " + phone; // thêm số mới
                    phoneList.set(i, Dong);
                }
                break;// dừng lại do đã tìm thấy
            }
        }

        if (tonTai == false)
        {
            phoneList.add(name + " : " + phone);
        }
    }

    @Override
    void removePhone(String name)
    {
        for (int i = 0; i < phoneList.size(); i++)
        {
            String Dong = phoneList.get(i);

            if (Dong.startsWith(name + " :"))
            {
                phoneList.remove(i);
                System.out.println("Đã gở bỏ tên:" + name);
                return;
            }
        }
        System.out.println(name + "không tìm thấy trong danh sách");
    }

    @Override
    void updatePhone(String name, String phone)
    {
        for (int i = 0; i < phoneList.size(); i++)
        {
            String Dong = phoneList.get(i);

            if (Dong.startsWith(name + " :"))
            {
                String[] parts = Dong.split(":");
                String CapNhat = parts[0] + ": " + phone;
                phoneList.set(i, CapNhat);
                System.out.println("Cap nhat" + name + "voi so" + phone);
                return;
            }
        }
        System.out.println(name + "không tìm thấy trong danh sách");
    }

    @Override
    void searchPhone(String name)
    {
        for (int i = 0; i < phoneList.size(); i++)
        {
            String Dong = phoneList.get(i);

            if (Dong.startsWith(name + " :"))
            {
                System.out.println(Dong);
                return;
            }
        }
        System.out.println(name + "không tìm thấy trong danh sách");
    }

    @Override
    void sort()
    {
        Collections.sort(phoneList, new Comparator<String>() {
            public int compare(String s1, String s2)
            {
                return s1.split(":")[0].compareTo(s2.split(":")[0]);
            }
        });
        System.out.println("Danh sach sap xep");
    }

    void displayPhoneList()
    {
        for (String Dong : phoneList)
        {
            System.out.println(Dong);
        }
    }

}
