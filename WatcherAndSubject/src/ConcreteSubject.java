import java.util.ArrayList;
import java.util.List;

/**
 * @author 作者 :lidj
 * @version 创建时间：2017年2月7日 下午6:00:23
 * 类说明
 */
public class ConcreteSubject implements Subject {
	
	// 存放观察者
    private List<Watcher> list = new ArrayList<Watcher>();

	@Override
	public void addWatcher(Watcher watcher) {
		// TODO Auto-generated method stub
		list.add(watcher);

	}

	@Override
	public void removeWatcher(Watcher watcher) {
		// TODO Auto-generated method stub
		list.remove(watcher);

	}

	@Override
	public void notifyWatchers(String str) {
		// TODO Auto-generated method stub
		// 自动调用实际上是主题进行调用的
        for (Watcher watcher : list)
        {
            watcher.update(str);
        }

	}

}
