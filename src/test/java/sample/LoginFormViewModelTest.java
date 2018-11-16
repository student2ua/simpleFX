package sample;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoginFormViewModelTest {
    @Test
    public void test(){
        LoginFormViewModel viewModel=new LoginFormViewModel();
        assertTrue(viewModel.isLoginButtonDisabled());
        viewModel.setLoginStr("testUser");
        assertTrue(viewModel.isLoginButtonDisabled());
        viewModel.setPassStr("passOfTestUser");
        assertFalse(viewModel.isLoginButtonDisabled());
    }

}