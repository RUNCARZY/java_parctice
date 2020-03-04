package basic.day20200304;

import java.util.ArrayList;

public class RedPackage {
    public static void main(String[] args) {
        // 创建群主和群成员列表
        TeamMaster master = new TeamMaster("King", 1000);
        ArrayList<TeamMember> members= new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            members.add(new TeamMember(String.format("Member%d", i), 0));
        }
        double money = 499;

        // 群主发红包
        ArrayList<Double> redPackage= master.sendRedPackage(money, 11);

        // 成员抢红包
        for (int i = 0; i < 10; i++) {
            members.get(i).getRedPackage(redPackage);
        }
        System.out.println(redPackage.size());
        System.out.println(master.account);
        for (int i = 0; i < members.size(); i++) {
            System.out.println(members.get(i).account);
        }

    }
}

// 用户类，群主和普通成员的父类
class User {
    double account;
    String userName;

    public User(String userName, double account) {
        this.account = account;
        this.userName = userName;
    }
}


// 群主类
class TeamMaster extends User {
    public TeamMaster(String userName, double account) {
        super(userName, account);
    }

    public ArrayList<Double> sendRedPackage(double totalAmount, int count) {
        // 发红包方法
        ArrayList<Double> redPackage = new ArrayList<>();
        double perMoney = totalAmount / count;
        this.account -= totalAmount;
        for (int i = 0; i < count; i++) {
            redPackage.add(perMoney);
        }
        return redPackage;
    }
}

// 普通成员类
class TeamMember extends User {
    public TeamMember(String userName, double discount) {
        super(userName, discount);
    }

    public void getRedPackage(ArrayList<Double> redPackage) {
        // 抢红包方法
        this.account += redPackage.remove(0);
        return;
    }
}
