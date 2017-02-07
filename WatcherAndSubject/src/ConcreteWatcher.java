/**
 * @author 作者 :lidj
 * @version 创建时间：2017年2月7日 下午6:01:33
 * 类说明
 */

// 具体观察者，实现抽象观察者角色所要求的更新接口，已是本身状态与主题状态相协调
public class ConcreteWatcher implements Watcher {

	@Override
	public void update(String str) {
		// TODO Auto-generated method stub
        System.out.println(str);
	}

}
