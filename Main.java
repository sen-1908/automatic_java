package levetechLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();

        // ログインページを開く
        driver.get("https://id.jobcan.jp/users/sign_in");

        // メールアドレスの入力フォーム
        WebElement mail_form = driver.findElement(By.xpath("入力フォームのxpath"));
        // パスワードの入力フォーム
        WebElement password_form = driver.findElement(By.xpath("入力フォームのxpath"));
        // ログインボタン
        WebElement login_button = driver.findElement(By.xpath("\"入力フォームのxpath\""));
        //勤怠ボタン


        mail_form.clear();
        password_form.clear();

        // メールアドレスを入力
        mail_form.sendKeys("メアド");
        // パスワードを入力
        password_form.sendKeys("パスワード");
        // ログインボタンをクリック
        login_button.click();


        //勤怠ログインフォームに以降
        driver.get("");
        WebElement push_start = driver.findElement(By.xpath(""));

        // 予想の送信ボタンをクリック
        push_start.click();

        driver.quit();
    }
}