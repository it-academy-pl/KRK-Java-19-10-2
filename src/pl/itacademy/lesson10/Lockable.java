package pl.itacademy.lesson10;

public interface Lockable {
  static final boolean LOCKED = false;

  void lock();

  void unlock();
}
