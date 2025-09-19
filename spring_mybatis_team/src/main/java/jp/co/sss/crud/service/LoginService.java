package jp.co.sss.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.sss.crud.form.LoginForm;
import jp.co.sss.crud.mapper.EmployeeMapper;

/**
 * ログイン処理
 */
@Service
public class LoginService {

	@Autowired
	private EmployeeMapper mapper;

	/**
	 * ログイン処理
	 * 
	 * mapper#findByEmpIdAndEmpPassメソッドを呼び出し、DBから該当社員を取得する。
	 * 取得した社員オブジェクトがnullの場合はログイン失敗、そうでない場合はログイン成功としてLoginResultのメソッドを呼び出す。
	 * 
	 * @return LoginResult ログイン失敗時はLoginResult.failLogin,ログイン成功時はLoginResult.succeedLoginを呼び出す。
	 */
	public LoginResult execute(LoginForm loginForm) {
		return null;

	}

}
