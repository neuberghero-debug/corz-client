package gg.corz;

import java.util.Locale;

public final class illillilIilillil {
   private int IIillIIlil;
   private int lIlilIIlil;
   private int IilllIIlil;
   private int IIlilIIlil;
   private long IllilIIlil;
   private int IlillIIlil;
   private int lllllIIlil;
   private int lIlllIIlil;
   private double IlIilIIlil = Double.NaN;
   private int lIIilIIlil;
   private int iIlllIIlil;
   public static final double IIlllIIlil = 999.9;
   private boolean iIlilIIlil;
   private int llillIIlil;
   private int lIillIIlil;
   private int iilllIIlil;
   private double iiillIIlil;
   private int IiillIIlil;
   private int liillIIlil;
   private int IIIilIIlil;
   private double ilIilIIlil;
   public static final int iiIllIIlil = 6;
   private int lilllIIlil;
   private int IiIilIIlil;
   private int ilillIIlil;
   private int llIilIIlil;
   private int IllllIIlil;
   private int liIilIIlil;
   private int iIillIIlil;
   private int iIIilIIlil;
   private int lllilIIlil;
   private int illllIIlil;

   public void IIillIiliIil(float hp) {
      if (Float.isFinite(hp)) {
         this.iiillIIlil = this.iiillIIlil + (double)Math.max(0.0F, hp);
         this.IIIilIIlil++;
      }
   }

   public void Iiilliiliiil() {
      this.llIilIIlil++;
   }

   public illillilIilillil() {
      this.IllilIIlil = Long.MIN_VALUE;
   }

   private static String IiIIlliIIl(double sum, int n) {
      return iiIIlIIlIl(n <= 0 ? 0.0 : sum / (double)n);
   }

   private void llIIlilIIl() {
      if (this.lIlilIIlil >= 2) {
         this.IllllIIlil++;
      }

      this.lllllIIlil = Math.max(this.lllllIIlil, this.lIlilIIlil);
      this.lIlilIIlil = 0;
      this.IIlilIIlil = 0;
   }

   public void IilliliilIIi(boolean tick, long targetAirborne) {
      this.illllIIlil++;
      if (tick && this.iIlilIIlil) {
         this.lIlilIIlil++;
         this.lllllIIlil = Math.max(this.lllllIIlil, this.lIlilIIlil);
      } else {
         this.IllilIIlil = targetAirborne;
         this.lllilIIlil = 0;
      }
   }

   public void lIiiIiIlilli(boolean nowAirborne) {
      long var3 = 25306536890963409L;
      if (!nowAirborne) {
         if (this.iIlilIIlil) {
            this.llIIlilIIl();
         }

         this.iIlilIIlil = false;
         if (this.IllilIIlil != Long.MIN_VALUE && ++this.lllilIIlil > 6) {
            this.IllilIIlil = Long.MIN_VALUE;
         }
      } else {
         if (!this.iIlilIIlil) {
            this.IIlilIIlil = 0;
            var3 ^= ((long)(this.IllilIIlil != Long.MIN_VALUE && this.lllilIIlil <= 6 ? 1 : 0) << 32 ^ var3) & -1L << 32;
            this.lIlilIIlil = (int)(var3 >>> 32) != 0 ? 1 : 0;
            this.IllilIIlil = Long.MIN_VALUE;
            this.lllllIIlil = Math.max(this.lllllIIlil, this.lIlilIIlil);
         }

         this.iIlilIIlil = true;
         this.IIlilIIlil++;
      }
   }

   public void IiIlliIliiIl() {
      this.iIillIIlil++;
   }

   public void iliIiiliiiii(boolean aggro, boolean landedNear) {
      if (aggro) {
         this.lilllIIlil++;
      } else {
         this.IilllIIlil++;
      }

      if (landedNear) {
         this.iilllIIlil++;
      }
   }

   public int IIlilIliiIli() {
      return this.IllllIIlil + (this.iIlilIIlil && this.lIlilIIlil >= 2 ? 1 : 0);
   }

   public int IiIiliIiiiIi() {
      return this.lIlllIIlil;
   }

   public void IlIillIiilIi() {
      this.liIilIIlil++;
   }

   public int Illillliilli() {
      return this.IIillIIlil;
   }

   public int Iliilliiilii() {
      return this.liillIIlil;
   }

   public int IIiilIiiiIii() {
      return this.iIIilIIlil;
   }

   public void IlIlllIlilIl() {
      this.lIillIIlil++;
   }

   public String iIIIlIlIIl(String state, String arm, String learn) {
      StringBuilder var4 = new StringBuilder(256);
      var4.append(IllIllllIl<"IllIllllIl","T7IOPWOOCTqVqznv9E3gRCn+X6LvYppUNlcSmOVFUYiqjQ==">())
         .append(lIlIliIlIl(state) ? IllIllllIl<"IllIllllIl","ProTfcn/18S70V5yJ8F+LhzK2RKbO3KCFzczpSdD4ME=">() : state.trim());
      var4.append(IllIllllIl<"IllIllllIl","5wCjvpqaMssYvZp0Zwm+tMPV0zgz/ZHCIRUpvTK//Dk7">())
         .append(lIlIliIlIl(arm) ? IllIllllIl<"IllIllllIl","iqrOsUQjPM2I0AvuSJ+AIStN2YcvR6/Gm00XpmM=">() : arm.trim());
      var4.append(IllIllllIl<"IllIllllIl","oukaIStfh9mHI6OeyWRMULeu/GkJFXD052pSWeXLv+ii">()).append(this.Iiiiliiiiiii());
      var4.append(IllIllllIl<"IllIllllIl","8qhos4b6qEN5hxDn/lWGZs2lA66KRXMQdkMVRliCIAM=">()).append(this.lIlllIIlil);
      var4.append(IllIllllIl<"IllIllllIl","+0qD4AwcupmPsMOzosoahcwFPo0R005mDnQVoKckDQMW">()).append(this.iIlllIIlil);
      var4.append(IllIllllIl<"IllIllllIl","aRLAL2HtKVRKPS+gdIkJkFBsPlbkY9AZK9gIKjPqVDE=">()).append(this.IIlilIliiIli());
      var4.append(IllIllllIl<"IllIllllIl","zDTqkMYbX1Inbk+GFzML2Z6Z86VI3XEQVvumFLT3nL4zmQ==">()).append(this.lllllIIlil);
      var4.append(IllIllllIl<"IllIllllIl","2mZ7bj4BzYUht9LkjOlSigycGkZJz629/qF6a/GwWSw=">()).append(this.illllIIlil);
      var4.append(IllIllllIl<"IllIllllIl","tqs3feb53wstLmHGtcHVCbNLC6KfDgqMxnVCp9hWGgk=">()).append(this.IilllIIlil);
      var4.append(IllIllllIl<"IllIllllIl","7uVllWNzQBzslHrXe/R6PNXX1DVoI1vCMJxR0PXXRWI=">()).append(this.lilllIIlil);
      var4.append(IllIllllIl<"IllIllllIl","FWSQWUryrkgRoyt/ixDFQ7P/XzaBIiQErcVhTVEAPJY=">()).append(this.iilllIIlil);
      var4.append(IllIllllIl<"IllIllllIl","5xdF8bBo7GDanTZSucGvdkSXxYcZQpVCnfgG60YROPI=">()).append(this.IIillIIlil);
      var4.append(IllIllllIl<"IllIllllIl","aiqeEAZt4BwIw0jDztyZEB3wAbWt4xwChBdr3wKYACny">()).append(this.lIillIIlil);
      var4.append(IllIllllIl<"IllIllllIl","E0oPUk+T7KUgPtFvcMKHj0tkbR+vvh6+kTzvjrDHKoU=">()).append(this.iIillIIlil);
      var4.append(IllIllllIl<"IllIllllIl","Ce5EjKEoEiJe2bCKdWsEl6bu3TPtll7KSP5IELJFUCuY">()).append(this.IlillIIlil);
      var4.append(IllIllllIl<"IllIllllIl","7pPFKy3RLGG0PlaOG83rppF93q0YPWolJwqdWvflkg8=">()).append(this.llillIIlil);
      var4.append(IllIllllIl<"IllIllllIl","svlTU6PvmhoYMGuSiBkEs9j3EN9pFDHBVfKF9eLojaS9">()).append(this.ilillIIlil);
      var4.append(IllIllllIl<"IllIllllIl","0ke8cs5OvS1JGHkmKcP99OO+cyI/NsIJ2RFeua3uFPE=">()).append(this.IiillIIlil);
      var4.append(IllIllllIl<"IllIllllIl","FcBbinGj/8ChMmPAqUMtJP9dKssvoJtPE5vf9QrvPrM7Xg==">()).append(this.liillIIlil);
      var4.append(IllIllllIl<"IllIllllIl","N4q90+Bg7a6Vl8BaYE60bfmP0zt6mDozyVKBgyV0zkBC">()).append(IiIIlliIIl(this.iiillIIlil, this.IIIilIIlil));
      var4.append(IllIllllIl<"IllIllllIl","7OHLAuopzAcqrgqvjMrDwTeJz6YQXVAcEuNONTUNdkzO">()).append(this.lIIilIIlil);
      var4.append(IllIllllIl<"IllIllllIl","K5uUae2TEPOmA9BCgouL+PW7EPMyD3tH2PquFPWttJORQlhp">()).append(this.iIIilIIlil);
      var4.append(IllIllllIl<"IllIllllIl","xSOG6G8bMKNgS/QTjwYRrTIsLv8RA+pOEFPB4RxBlsxk3Vgc">())
         .append(Double.isNaN(this.IlIilIIlil) ? IllIllllIl<"IllIllllIl","iqrOsUQjPM2I0AvuSJ+AIStN2YcvR6/Gm00XpmM=">() : iiIIlIIlIl(this.IlIilIIlil));
      var4.append(IllIllllIl<"IllIllllIl","2CyzwOt0KyzqYvd3hjRxLt4OSQfBsxgx6TroQyCVTyZCmEc=">()).append(this.llIilIIlil);
      var4.append(IllIllllIl<"IllIllllIl","bFhBOkkEskp3M3VWkWXnmqyiMo3Hzb1TKMhiRye9WGoM">()).append(IiIIlliIIl(this.ilIilIIlil, this.IiIilIIlil));
      var4.append(IllIllllIl<"IllIllllIl","akZ5oXBKPcxiWuhNg2sWSP4rRBikTarCb5Fv8br10rE=">()).append(this.liIilIIlil);
      var4.append(IllIllllIl<"IllIllllIl","1hpcljDlcVGIbzerl7rWiMqcwwhf7VnS2k9I4ksakY6wILs=">())
         .append(lIlIliIlIl(learn) ? IllIllllIl<"IllIllllIl","iqrOsUQjPM2I0AvuSJ+AIStN2YcvR6/Gm00XpmM=">() : learn.trim());
      return var4.toString();
   }

   public void iIlIlllllill() {
      this.lIlllIIlil++;
   }

   public int Iilililiiili() {
      return this.IilllIIlil + this.lilllIIlil;
   }

   private static boolean lIlIliIlIl(String s) {
      return s == null || s.isBlank();
   }

   public int Iiiiliiiiiii() {
      return this.iIlilIIlil ? this.IIlilIIlil : 0;
   }

   public void IIlllIlliIll() {
      this.IlillIIlil++;
   }

   public void Iilllilliill(boolean withoutStart) {
      this.IiillIIlil++;
      if (withoutStart) {
         this.liillIIlil++;
      }
   }

   public void liiiIIllIl() {
      this.iIlllIIlil++;
   }

   public void Ililllililil(boolean minEnemyDistance, double unsafe) {
      this.lIIilIIlil++;
      if (minEnemyDistance) {
         this.iIIilIIlil++;
      }

      this.IlIilIIlil = Double.isNaN(unsafe) ? 0.0 : Math.min(999.9, Math.max(0.0, unsafe));
   }

   public int IIIIllIIIl() {
      return this.illllIIlil;
   }

   public void IIIilIIiiIIi(float hp) {
      if (Float.isFinite(hp)) {
         this.ilIilIIlil = this.ilIilIIlil + (double)Math.max(0.0F, hp);
         this.IiIilIIlil++;
      }
   }

   private static String iiIIlIIlIl(double v) {
      return String.format(Locale.ROOT, IllIllllIl<"IllIllllIl","xZVz7d6Vr4ftqQjKDHeo27c5nJFlKSJYs8r9Hped4PI=">(), v);
   }

   public void IliIlllilIi() {
      this.lIlllIIlil = 0;
      this.iIlllIIlil = 0;
      this.IllllIIlil = 0;
      this.lllllIIlil = 0;
      this.illllIIlil = 0;
      this.IilllIIlil = 0;
      this.lilllIIlil = 0;
      this.iilllIIlil = 0;
      this.IIillIIlil = 0;
      this.lIillIIlil = 0;
      this.iIillIIlil = 0;
      this.IlillIIlil = 0;
      this.llillIIlil = 0;
      this.ilillIIlil = 0;
      this.IiillIIlil = 0;
      this.liillIIlil = 0;
      this.iiillIIlil = 0.0;
      this.IIIilIIlil = 0;
      this.lIIilIIlil = 0;
      this.iIIilIIlil = 0;
      this.IlIilIIlil = Double.NaN;
      this.llIilIIlil = 0;
      this.ilIilIIlil = 0.0;
      this.IiIilIIlil = 0;
      this.liIilIIlil = 0;
      this.IIlilIIlil = 0;
      this.lIlilIIlil = 0;
      this.iIlilIIlil = false;
      this.IllilIIlil = Long.MIN_VALUE;
      this.lllilIIlil = 0;
   }

   public void Illlllllilll(boolean aborted) {
      this.llillIIlil++;
      if (aborted) {
         this.ilillIIlil++;
      }
   }

   public void IIIllIIliIIl() {
      this.IIillIIlil++;
   }
}
