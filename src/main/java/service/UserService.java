package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import beans.Stu;
import mapper.StuMapper;

@Service
public class UserService {

	private StuMapper stuMapper;
	

	public UserService() {
		super();
	}

	@Autowired
	public UserService(StuMapper stuMapper ) {
		
		this.stuMapper = stuMapper;
		
	}

	
	public Stu getStuById(int stu_id) {
		Stu stu = stuMapper.getStuById(stu_id);
		if (stu != null)
			return stu;
		else
			return null;
	}

	/**
	 * 登陆检测
	 * 
	 * @param uphone：用户登录电话
	 * @param upassword：用户登录密码
	 * @return：是否登录成功
	 */
	public boolean loginCheck(int stu_id, String stu_pwd) {
		if (stuMapper.getStuById(stu_id).getStu_pwd().equals(stu_pwd))
			return true;
		else
			return false;
	}

	/**
	 * 判断该电话是否已经被注册
	 * 
	 * @param uphone：待检测电话
	 * @return：是否已经注册
	 */
	public boolean isIdExit(int stu_id) {
		if (stuMapper.getStuById(stu_id)!= null)
			return true;
		else
			return false;
	}
//
//	/**
//	 * 用户注册
//	 * 
//	 * @param userinfo：用户注册信息
//	 * @return：是否注册成功
//	 */
//	@Transactional
//	public boolean addUserinfo(Stu stu) {
//		int cnt = stuMapper.addStu(stu);
//		if (cnt > 0) {
//			int cnt2 = stuMapper.addUserlogin(userlogin);
//			if (cnt2 > 0)
//				return true;
//			else
//				return false;
//		} else
//			return false;
//	}
//
//	/**
//	 * 添加用户收货地址
//	 * 
//	 * @param useraddr：用户地址信息
//	 * @return：是否添加成功
//	 */
//	@Transactional
//	public boolean addUseraddr(Useraddr useraddr) {
//		int cnt = useraddrMapper.addUseraddr(useraddr);
//		if (cnt > 0)
//			return true;
//		else
//			return false;
//	}
//
	/**
	 * 更新学生信息
	 * 
	 * @param userinfo：学生信息
	 * @return：是否更新成功
	 */
	@Transactional
	public boolean changepwd(int stu_id,String stu_pwd) {
		int cnt = stuMapper.updateStulogin(stu_id, stu_pwd);
		if (cnt > 0)
			return true;
		else
			return false;
	}
//
//	/**
//	 * 更新用户登录信息
//	 * 
//	 * @param userlogin：用户登录信息
//	 * @return：是否更新成功
//	 */
//	@Transactional
//	public boolean updateUserlogin(Userlogin userlogin) {
//		int cnt = userloginMapper.updateUserlogin(userlogin);
//		if (cnt > 0)
//			return true;
//		else
//			return false;
//	}
//
//	/**
//	 * 修改用户地址信息
//	 * 
//	 * @param useraddr：用户地址信息
//	 * @return：是否修改成功
//	 */
//	@Transactional
//	public boolean updateUseraddr(Useraddr useraddr) {
//		int cnt = useraddrMapper.updateUseraddr(useraddr);
//		if (cnt > 0)
//			return true;
//		else
//			return false;
//	}
//
//	/**
//	 * 获取所有图书列表
//	 * 
//	 * @return：所有的图书列表
//	 */
//	public List<Book> getAllbook() {
//		List<Book> booklist = new ArrayList<>();
//		List<Bookinfo> bookinfolist = bookinfoMapper.getAllBookinfo();
//		if (bookinfolist != null) {
//			for (int i = 0; i < bookinfolist.size(); i++) {
//				String bauthor = bookinfolist.get(i).getBauthor();
//				String bintro = bookinfolist.get(i).getBintro();
//				String bisbn = bookinfolist.get(i).getBisbn();
//				String bname = bookinfolist.get(i).getBname();
//				double bprice = bookinfolist.get(i).getBprice();
//				String bpublisher = bookinfolist.get(i).getBpublisher();
//				List<Bookphoto> bookphotolist = bookphotoMapper.getAllBookphotoByBisbn(bisbn);
//				Book book = new Book(bisbn, bname, bpublisher, bprice, bintro, bauthor, bookphotolist);
//				booklist.add(book);
//			}
//			return booklist;
//		} else
//			return null;
//	}
//
//	/**
//	 * 获取该图书的详细信息
//	 * 
//	 * @param isbn：图书的ISBN
//	 * @return：图书的详细信息
//	 */
//	public Book getBookByISBN(String isbn) {
//		Bookinfo bookinfo = bookinfoMapper.getBookinfo(isbn);
//		List<Bookphoto> bookphotolist = bookphotoMapper.getAllBookphotoByBisbn(isbn);
//		String bname = bookinfo.getBname();
//		String bauthor = bookinfo.getBauthor();
//		String bintro = bookinfo.getBintro();
//		double bprice = bookinfo.getBprice();
//		String bpublisher = bookinfo.getBpublisher();
//		Book book = new Book(isbn, bname, bpublisher, bprice, bintro, bauthor, bookphotolist);
//		return book;
//	}
//
//	/**
//	 * 根据搜索内容查询所有数据库信息
//	 * 
//	 * @param text：查询内容
//	 * @return：图书信息列表
//	 */
//	public List<Book> getBookSearch(String text) {
//		System.out.println("text"+text);
//		List<Bookinfo> bookinfolist = bookinfoMapper.getBookinfoSearch(text);
//		List<Book> booklist = new ArrayList<>();
//		if (bookinfolist != null) {
//			for (int i = 0; i < bookinfolist.size(); i++) {
//				Book book = getBookByISBN(bookinfolist.get(i).getBisbn());
//				booklist.add(book);
//			}
//			return booklist;
//		} else
//			return null;
//	}
//
//	/**
//	 * 用户购买图书
//	 * 
//	 * @param purchase：购买图书信息
//	 * @return：是否购买成功
//	 */
//	@Transactional
//	public boolean addPurchase(Purchase purchase) {
//		int cnt = purchaseMapper.addPurchase(purchase);
//		if (cnt > 0)
//			return true;
//		else
//			return false;
//	}
//
//	/**
//	 * 根据书的ISBN查看商家是谁
//	 * 
//	 * @param bisbn：书的ISBN
//	 * @return：商家信息
//	 */
//	public Sellerinfo getBookSellerinfo(String bisbn) {
//		Sellerinfo sellerinfo = saddbMapper.getSellerinfoByISBN(bisbn);
//		if (sellerinfo != null)
//			return sellerinfo;
//		else
//			return null;
//	}
//
//	/**
//	 * 通过用户电话获取当前用户所有的地址信息
//	 * 
//	 * @param uphone：用户电话
//	 * @return用户地址信息列表
//	 */
//	public List<Useraddr> getAllUserAddr(String uphone) {
//		List<Useraddr> addrlist = useraddrMapper.getAllUseraddr(uphone);
//		if (addrlist != null)
//			return addrlist;
//		else
//			return null;
//	}
//
//	/**
//	 * 根据地址的ID获取该地址的详细信息
//	 * 
//	 * @param id：地址ID
//	 * @return：该地址的详细信息
//	 */
//	public String getUserAddById(int id) {
//		Useraddr addr = useraddrMapper.getUseraddrById(id);
//		if (addr != null)
//			return addr.getUaddress();
//		else
//			return null;
//	}
//
//	/**
//	 * 根据用户电话获取所有订单信息
//	 * 
//	 * @param uphone：用户电话
//	 * @return：订单信息列表
//	 */
//	public List<Purchase> getAllPurchase(String uphone) {
//		List<Purchase> purchaselist = purchaseMapper.getAllPurchaseByUphone(uphone);
//		if (purchaselist != null)
//			return purchaselist;
//		else
//			return null;
//	}
//
//	/**
//	 * 根据订单编号获取订单相信信息
//	 * 
//	 * @param id：订单编号
//	 * @return：订单详细信息
//	 */
//	public Purchase getPurchaseById(int id) {
//		Purchase purchase = purchaseMapper.getPurchaseByid(id);
//		if (purchase != null)
//			return purchase;
//		else
//			return null;
//	}
}
