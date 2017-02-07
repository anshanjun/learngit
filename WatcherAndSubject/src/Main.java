/**
 * @author 作者 :lidj
 * @version 创建时间：2017年2月7日 下午6:02:08
 * 类说明
 */
public class Main {
	
	public static void main(String[] args)
    {
        Subject girl=new ConcreteSubject();
        
        Watcher watcher1 = new ConcreteWatcher();
        Watcher watcher2 = new ConcreteWatcher();
        Watcher watcher3 = new ConcreteWatcher();
        
        girl.addWatcher(watcher1);
        girl.addWatcher(watcher2);
        girl.addWatcher(watcher3);
        
        girl.notifyWatchers("开心");
    }

}
