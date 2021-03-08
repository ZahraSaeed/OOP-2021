package com.company;

public class L3AS1Runner {
    public static void main(String[] args) {
        Marks m_1 = new Marks();
        System.out.println(m_1.CalculateSum());
        Marks m_2 = new Marks(85,78,66);
        System.out.println(m_2.CalculateSum());
    }
}
