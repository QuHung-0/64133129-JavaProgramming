package BLL;

import DAL.NhanVienDAL;
import Model_DTO.NhanVienDTO;

public class NhanVienBLL {
	private NhanVienDAL nvDAL;

	public NhanVienBLL() {
		nvDAL = new NhanVienDAL();
	}

	public boolean ThemMoi(NhanVienDTO nv) {
		return nvDAL.AddNew(nv);
	}

	public boolean checkLogin(String tenDN, String matKhau) {
		return nvDAL.Login(tenDN, matKhau);
	}
}
