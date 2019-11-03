package cn.edu.tongji.sse.twitch.gkd.view;

public interface IUserLoginView {
    String getUserName();
    String getPassword();
    void clearUserName();
    void clearPassword();
    void showLoading();
    void hideLoading();
    void toMainActivity();
    void showFailedError();
}
