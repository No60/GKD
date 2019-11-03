package cn.edu.tongji.sse.twitch.gkd.model;

import cn.edu.tongji.sse.twitch.gkd.bean.User;
import cn.edu.tongji.sse.twitch.gkd.presenter.IUserLoginPresenter;

public class UserModelImpl implements IUserModel {
    private IUserLoginPresenter mIUserLoginPresenter;

    public UserModelImpl(IUserLoginPresenter IUserLoginPresenter){
        mIUserLoginPresenter = IUserLoginPresenter;
    }

    @Override
    public void login(final String username, final String password,final IUserModel.OnLoginListener listener){
        new Thread(){
            @Override
            public void run(){
                try{
                    Thread.sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                if("twitch".equals(username)&&"123..".equals(password)){
                    User user=new User();
                    user.setUsername(username);
                    user.setPassword(password);
                    listener.loginSuccess();
                }else{
                    listener.loginFailed();
                }
            }
        }.start();
    }
}
