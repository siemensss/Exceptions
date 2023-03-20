public class Main {
    public static void main(String[] args)  {
        String login = "java_skyprogo";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_9";
        System.out.println(authorization(login, password, confirmPassword));
    }

    public static boolean authorization(String login, String password, String confirmPassword)  {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException();
            }
            for (int i = 0; i < login.length(); i++) {
                char c = login.charAt(i);
                if(c < 48 || (c > 57 && c < 64) || (c > 90 && c < 95) || (c == 96) || c > 122){
                    throw new WrongLoginException();
                }
            }
            if (password.length() > 20) {
                throw new WrongPasswordException();
            }
            for (int i = 0; i < password.length(); i++) {
                char c = login.charAt(i);
                if(c < 48 || (c > 57 && c < 64) || (c > 90 && c < 95) || (c == 96) || c > 122){
                    throw new WrongLoginException();
                }
            }
            if (!password.equals(confirmPassword)){
                throw new WrongPasswordException();
            }
        } catch (WrongLoginException e) {
            System.out.println("Количество символов для логина превышает допустимое или в логине используется недопустимый символ");
            return false;
        } catch (WrongPasswordException e) {
            System.out.println("Пароли не совпадают или в пароле используется недопустимый символ или количество символов для логина превышает допустимое");
            return false;
        }
        finally {
            System.out.println("Попытка авторизации завершена");
        }
        return true;
    }


}