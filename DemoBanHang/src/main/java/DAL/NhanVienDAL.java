package DAL;

import Model_DTO.NhanVienDTO;
import Utils.CommonUtils;

public class NhanVienDAL {

    public boolean AddNew(NhanVienDTO nv) {

        String hashedPassword = CommonUtils.encodePass(nv.getPassword());

        return true;
    }

    public boolean Delete(int id) {

        return true;
    }

    public boolean Login(String id, String pass) {

        String hashedEnteredPassword = CommonUtils.encodePass(pass);

        String storedHashedPassword = getStoredHashedPassword(id);

        return hashedEnteredPassword.equals(storedHashedPassword);
    }

    private String getStoredHashedPassword(String id) {

        return "storedHashedPasswordFromDB";  // Placeholder value
    }
}
