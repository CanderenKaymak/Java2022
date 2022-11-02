package day3.interfaceDemo;

public class Main {
    public static void main(String[] args) {
        // Senaryomuzda bir sirket ve calisanlari var. Bu calisanlarin bir kismi disaridan baska bir firmadan destek
        // veriyorlar, bir kismi sirketin calisanlari ve bir kismi da robot. Bu calisanlarin tamami sirket icin
        // calisma isini ortak olarak yaptiklarindan hepsi IWorkable interface'ini implement etti. ancak Robotlar
        // yemek yemedigi, maaslari olmadigi icin, ve Out Source calisanlarinda kendi gonderildikleri firma tarafindan
        // yemek ucretleri ve maaslari odendigi icin, IEatable ve IPayable interface'lerini implemente etmediler.
        // Sadece sirketin kendi calisanlari bu interface'leri implemente ettiler. Ve benzer bir sekilde Robotlar
        // IMaintainable interface'ini implemente ederken, diger calisanlarin bakim gerektiren bir durumlari
        // olmadigindan bu interface'i implemente etmediler.
    }
}
