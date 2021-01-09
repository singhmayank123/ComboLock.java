
public abstract class IComboLock{

	private boolean locked = false;
	public int []lockedCombo = new int[3];
    /* Byte is using as combo numbers aren't much large, so save your memory */
	abstract public void setCombo(int num1, int num2, int num3);

	public boolean isLocked(){
		return locked;
	}

	abstract public void unlock(int num1, int num2, int num3);

	public void setLocked(boolean lock){
		locked = lock;
	}
}

