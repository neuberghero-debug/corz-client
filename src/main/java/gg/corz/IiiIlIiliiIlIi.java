package gg.corz;

import java.util.Locale;

public record IiiIlIiliiIlIi(
   String kind,
   int expected,
   double cost,
   long representative,
   String alternativeOwner,
   long alternativeMissionId,
   long alternativeAssetId,
   long alternativeRegion
) {
   private final long iilIllIiiIIiIllIii;
   private final int ilIIllIiiIiIIllIii;
   private final String IlIIllIiillIIllIii;
   private final long IIlIllIiilIlIllIii;
   private final double liIIllIiiiiIIllIii;
   private final long lllIllIiiillIllIii;
   private final String iIlIllIiiIllIllIii;
   private final long IilIllIiililIllIii;

   public double iliIiiliiiii() {
      return this.liIIllIiiiiIIllIii;
   }

   public String IlIlllIlilIl() {
      return this.iIlIllIiiIllIllIii;
   }

   public boolean IliIlllilIi(Illillillllillil intent) {
      return this.IlIIllIiillIIllIii.equals(Iilllilliill<"Iilllilliill","GJo28b8MX0DH40iJXQomtG+zTPrmcpYmvMlpMmipC0niFSNmlKKBvQ==">())
         && this.IilIllIiililIllIii != 0L
         && this.lllIllIiiillIllIii != 0L
         && this.iIlIllIiiIllIllIii.equals(intent.lIiiIiIlilli().name())
         && this.lllIllIiiillIllIii == intent.iliIiiliiiii();
   }

   public long IIIllIIliIIl() {
      return this.IIlIllIiilIlIllIii;
   }

   public long IIlllIlliIll() {
      return this.IilIllIiililIllIii;
   }

   public String iIlIlllllill() {
      return this.IlIIllIiillIIllIii
         + Iilllilliill<"Iilllilliill","BLzi34u4EFORZA6b3UaPxYVEXq82JI9l2b+VNk+XajBapksI7cw=">()
         + this.ilIIllIiiIiIIllIii
         + Iilllilliill<"Iilllilliill","xP8/W+E85FM7GFvSg+pZV9w+Ja6oLUc1lu205Xnah6UdLg==">()
         + String.format(Locale.ROOT, Iilllilliill<"Iilllilliill","QvAUmGvTQGS8RFKDLU0wsy0LPDZjVUElOy4STtjc8RU=">(), this.liIIllIiiiiIIllIii)
         + Iilllilliill<"Iilllilliill","iAEt77MSaJuVB0fopBGkTKjasC+YKaJSAg3/lL8hmZXk">()
         + String.format(Locale.ROOT, Iilllilliill<"Iilllilliill","f/0hMdD1tNi2Bm0Wy915/pw8qkWmMfE98moq2SlqViA=">(), this.liiiIIllIl())
         + Iilllilliill<"Iilllilliill","zT9l+QHkrZ00xguYUfje8J7qOqdm3gWxkQVnqdLdXfCSB+Xz/Tw1RoioYLXHKKVNtXE=">()
         + this.lllIllIiiillIllIii
         + Iilllilliill<"Iilllilliill","cqvgj/HlIpizr8ZiJaUOJm8tq1wzFmiCpEqw/WEeoe/AINdCcUT8eXij8BO/xgtC">()
         + this.IilIllIiililIllIii
         + Iilllilliill<"Iilllilliill","CoDXjUhWYt1/K3EgWDozN3F41dFZWR5ZZCi6c7mK5pJpNXxvCsG1L5reMfhHHw==">()
         + this.iIlIllIiiIllIllIii
         + Iilllilliill<"Iilllilliill","xGEB7ZZ9jYa8gU5mUNW6Sw0j6x4SL2CZskB5nRKpGeGEUePNUF0r9Lvv6ssR5VU=">()
         + this.iilIllIiiIIiIllIii
         + Iilllilliill<"Iilllilliill","vxCFudM3dfcQ5vzFWfjfUmio8uqisciJhKeLfZo=">();
   }

   public String IilliliilIIi() {
      return this.IlIIllIiillIIllIii;
   }

   public double liiiIIllIl() {
      return this.ilIIllIiiIiIIllIii <= 0 ? 0.0 : (double)this.ilIIllIiiIiIIllIii / (1.0 + Math.max(0.0, this.liIIllIiiiiIIllIii));
   }

   public IiiIlIiliiIlIi(
      String kind,
      int expected,
      double cost,
      long representative,
      String alternativeOwner,
      long alternativeMissionId,
      long alternativeAssetId,
      long alternativeRegion
   ) {
      this.IlIIllIiillIIllIii = kind;
      this.ilIIllIiiIiIIllIii = expected;
      this.liIIllIiiiiIIllIii = cost;
      this.IIlIllIiilIlIllIii = representative;
      this.iIlIllIiiIllIllIii = alternativeOwner;
      this.lllIllIiiillIllIii = alternativeMissionId;
      this.IilIllIiililIllIii = alternativeAssetId;
      this.iilIllIiiIIiIllIii = alternativeRegion;
   }

   public long Illlllllilll() {
      return this.iilIllIiiIIiIllIii;
   }

   public long IiIlliIliiIl() {
      return this.lllIllIiiillIllIii;
   }

   public int lIiiIiIlilli() {
      return this.ilIIllIiiIiIIllIii;
   }

   public IiiIlIiliiIlIi(String representative, int expected, double kind, long cost) {
      this(representative, expected, kind, cost, Iilllilliill<"Iilllilliill","r/KNXPZACnPx/pSzgDMyJhdL6zKKRHpYVVxplddL6PT1lcNtSS8=">(), 0L, 0L, 0L);
   }
}
