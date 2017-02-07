/**
 * @author 作者 :lidj
 * @version 创建时间：2017年2月7日 下午5:57:45
 * 类说明
 */
public abstract interface Subject {
	
	public void addWatcher(Watcher watcher);

    public void removeWatcher(Watcher watcher);

    public void notifyWatchers(String str);

}
