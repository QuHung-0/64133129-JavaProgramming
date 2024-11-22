package BLL;

import DAL.NhanVienDAL;
import Model_DTO.NhanVienDTO;

public class NhanVienBLL 
{
	NhanVienDAL nvDAL;
	boolean ThemMoi(NhanVienDTO nv)
	{
		// cac xl kha o day
		boolean kq = nvDAL.AddNew(nv);
		return kq;
	}
    public boolean checkLogin(String tenDN, String matKhau)
    {
        //Kiem tra tinh dung dan
        //vd: ten rong khong, co dung format khong, ...

        // thoa man roi, thi ra goi ham dich vu
        return nvDAL.Login(tenDN, matKhau);
    }
}
