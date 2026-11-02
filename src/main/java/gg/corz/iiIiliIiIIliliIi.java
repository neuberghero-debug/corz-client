package gg.corz;

import java.util.Locale;

public final class iiIiliIiIIliliIi {
   private int illIIiiIIi;
   private iiIiIlIiIIliIlIi lIlIIiiIIi;
   public static final int ilIIIiiIIi = 16;
   public static final int IlIIIiiIIi = 40;
   private int iIlIIiiIIi;
   public static final int IiIIIiiIIi = 20;
   private final IlliIIlllliIIl iiIIIiiIIi;
   public static final double iIIIIiiIIi = 0.02;
   private int IllIIiiIIi;
   private boolean lilIIiiIIi;
   private int lllIIiiIIi;
   public static final int llIIIiiIIi = 4;
   private int IilIIiiIIi;
   public static final double lIIIIiiIIi = 1.0;
   public static final int liIIIiiIIi = 2;
   private iliIllIiiIll IIlIIiiIIi = iliIllIiiIll.iliiIIIiIiiiIIIi;

   public int Ililllililil(int tick) {
      return this.iIlIIiiIIi == Integer.MIN_VALUE ? 0 : tick - this.iIlIIiiIIi;
   }

   public boolean IlIlllIlilIl() {
      return this.IIlIIiiIIi == iliIllIiiIll.llIIlIIiilIIlIIi || this.IIlIIiiIIi == iliIllIiiIll.IiIIlIIiliIIlIIi;
   }

   public String Iiilliiliiil(int tick) {
      return String.format(
         Locale.ROOT,
         IIIilIIiiIIi<"IIIilIIiiIIi","9MM/K5+s3fZFFUl9garPwOmwVO8pc7oDUee83RXUAC8M4SfrdEgaeN758i9FynRkIZxcfB/EBk33o24mAYtVcOzbfp2/1syQyyvsXstfO64hnGY0uOUIRp3VTgMjPnDYerJg1f98nf0EYhlHhHjF">(),
         this.IIlIIiiIIi,
         this.lllIIiiIIi,
         2,
         this.illIIiiIIi,
         this.Ililllililil(tick),
         this.IilIIiiIIi,
         this.lilIIiiIIi,
         this.lIlIIiiIIi
      );
   }

   public int Illlllllilll() {
      return this.lllIIiiIIi;
   }

   public iliIllIiiIll iliIiiliiiii() {
      return this.IIlIIiiIIi;
   }

   public iiIiliIiIIliliIi(IlliIIlllliIIl cert) {
      this.lIlIIiiIIi = iiIiIlIiIIliIlIi.iliilIIIIi;
      this.iIlIIiiIIi = Integer.MIN_VALUE;
      this.IllIIiiIIi = Integer.MIN_VALUE;
      this.iiIIIiiIIi = cert;
      if (cert == null || !cert.IliIlllilIi()) {
         this.IIlIIiiIIi = iliIllIiiIll.IiIIlIIiliIIlIIi;
         this.lIlIIiiIIi = iiIiIlIiIIliIlIi.IiiilIIIIi;
      }
   }

   public iiIiIlIiIIliIlIi IIIllIIliIIl() {
      return this.lIlIIiiIIi;
   }

   public int Iilllilliill() {
      return this.illIIiiIIi;
   }

   public lliIillliliIilll IilliliilIIi(iiIiIlIiIIliIlIi why, String note) {
      return this.lIiiIiIlilli(why, note);
   }

   public boolean IiIlliIliiIl() {
      return this.IIlIIiiIIi == iliIllIiiIll.llIIlIIiilIIlIIi;
   }

   private lliIillliliIilll lIiiIiIlilli(iiIiIlIiIIliIlIi note, String why) {
      this.IIlIIiiIIi = iliIllIiiIll.IiIIlIIiliIIlIIi;
      this.lIlIIiiIIi = note;
      return new lliIillliliIilll(false, false, false, this.IIlIIiiIIi, why);
   }

   public lliIillliliIilll IliIlllilIi(IIlIilIllIlIilIl s) {
      if (this.iIlIIiiIIi == Integer.MIN_VALUE) {
         this.iIlIIiiIIi = s.IliIlllilIi();
         this.IllIIiiIIi = s.IliIlllilIi();
      }

      if (this.IIlIIiiIIi == iliIllIiiIll.llIIlIIiilIIlIIi || this.IIlIIiiIIi == iliIllIiiIll.IiIIlIIiliIIlIIi) {
         return new lliIillliliIilll(
            false,
            false,
            false,
            this.IIlIIiiIIi,
            this.IIlIIiiIIi == iliIllIiiIll.IiIIlIIiliIIlIIi
               ? this.lIlIIiiIIi.name()
               : IIIilIIiiIIi<"IIIilIIiiIIi","srfRcCB9tK86ZprqOZoZKIBFSzDTj3PTxKUIUa25+ZOnmlPv">()
         );
      } else if (s.IIlllIlliIll()) {
         this.IIlIIiiIIi = iliIllIiiIll.llIIlIIiilIIlIIi;
         return new lliIillliliIilll(
            false, false, false, this.IIlIIiiIIi, IIIilIIiiIIi<"IIIilIIiiIIi","5a7MYO4qUs6q8e+kMUcBQksnYuSeH9ZBg3iwIF8qLi6IVJLhCNN1XrAmUQ==">()
         );
      } else if (!s.lIiiIiIlilli()) {
         return this.lIiiIiIlilli(
            iiIiIlIiIIliIlIi.llIIiIIIIi, IIIilIIiiIIi<"IIIilIIiiIIi","AyG14yOTANZ3FDXX7VBDOaqAQeA/63m5VIJ65njPeJxvQ4vsrTDmWXs9/MhS3Jt3">()
         );
      } else {
         switch (this.IIlIIiiIIi) {
            case llIIlIIiilIIlIIi:
               if (s.IliIlllilIi() - this.IllIIiiIIi > 40) {
                  return this.lIiiIiIlilli(
                     iiIiIlIiIIliIlIi.liiilIIIIi, IIIilIIiiIIi<"IIIilIIiiIIi","lc9IeEngrC5JtxKs/L0A7VPjFVek3RpIoUwtgGfn4+hy0w6Y32fva4nGKipoNbEVd2wv">()
                  );
               } else if (s.IilliliilIIi() > 0.02) {
                  return new lliIillliliIilll(
                     false,
                     false,
                     s.Illlllllilll(),
                     this.IIlIIiiIIi,
                     s.Illlllllilll()
                        ? IIIilIIiiIIi<"IIIilIIiiIIi","DZ6NU2yaJ3EWVFfclX/mj4sfNe35LiYZRakdHBcIqhYLdKxZJUI/zlyfs2mZ+FCgFIk=">()
                        : IIIilIIiiIIi<"IIIilIIiiIIi","K7+qWtrfzVlZn/hsD3snuIMdUwOC98Qh5kIYYrsRCZPcNimnpVt8YDrHL90jv2NulPVyzmB+Dkt2RO3lcg==">()
                  );
               } else if (!s.IIIllIIliIIl()) {
                  return new lliIillliliIilll(
                     false,
                     false,
                     false,
                     this.IIlIIiiIIi,
                     IIIilIIiiIIi<"IIIilIIiiIIi","4BdVbL4tPz6I1e7pBIoqIHyZzz23zGRRMGU+S7sUF3ToDhuX3F3FNIouOmmAbAChe9pBH1FUvl0=">()
                  );
               } else {
                  if (!s.iIlIlllllill()) {
                     return new lliIillliliIilll(
                        false, false, false, this.IIlIIiiIIi, IIIilIIiiIIi<"IIIilIIiiIIi","cbskC24r5jNh10MsaXxOUDlSWbhtVdFEndXniCXXNCJ2NyPmqE5r/ArvLLjVfA==">()
                     );
                  }

                  this.lllIIiiIIi++;
                  this.IIlIIiiIIi = iliIllIiiIll.liiiIIIiiiiiIIIi;
                  this.IllIIiiIIi = s.IliIlllilIi();
                  this.IilIIiiIIi = 0;
                  this.lilIIiiIIi = false;
                  return new lliIillliliIilll(
                     true,
                     false,
                     false,
                     this.IIlIIiiIIi,
                     IIIilIIiiIIi<"IIIilIIiiIIi","8dRtO7IPSfl9DU79RPzFH9ouSK7yCZ3lBv5QccRLbrno2dlu">()
                        + this.lllIIiiIIi
                        + IIIilIIiiIIi<"IIIilIIiiIIi","XS+NfgWgOWuY2rQjmmgEHq6gNGpRO2d4ctOfmuo=">()
                        + 2
                  );
               }
            case iliiIIIiIiiiIIIi:
               if (!s.iIlIlllllill()) {
                  this.IIlIIiiIIi = iliIllIiiIll.IIIIlIIilIIIlIIi;
                  this.IllIIiiIIi = s.IliIlllilIi();
                  return this.liiiIIllIl(s);
               } else {
                  if (s.IliIlllilIi() - this.IllIIiiIIi > 4) {
                     return this.lIiiIiIlilli(
                        iiIiIlIiIIliIlIi.IIIIiIIIIi,
                        IIIilIIiiIIi<"IIIilIIiiIIi","Nmk+FQVde6Y33YMfErwZ4kIXbxqcolBXODFpbvdzDgoeJ23zG6IyhDkEeMrnu9mb7WNCn+WrRzBdPJUX76HlnvKqF7UPUUxOQscE">()
                     );
                  }

                  return new lliIillliliIilll(
                     false, false, false, this.IIlIIiiIIi, IIIilIIiiIIi<"IIIilIIiiIIi","nhfSjzCEFpzDfpbN9LC5AAdTQYtxfHJaJGJSJNctA9dYeo2kbo0hxU8QIg==">()
                  );
               }
            case IIIIlIIilIIIlIIi:
               return this.liiiIIllIl(s);
            case liiiIIIiiiiiIIIi:
               if (s.IliIlllilIi() - this.IllIIiiIIi > 20) {
                  return this.lIiiIiIlilli(
                     iiIiIlIiIIliIlIi.IlIIiIIIIi,
                     IIIilIIiiIIi<"IIIilIIiiIIi","NTt0Pam+TxRX24hDUdBKmSz3SD95sGYAYUsiTD2C6AFXhXAPwdYJCJxRf45he632Nu1defX3ZkRfPLjZ8ngSZjHIVI5E">()
                  );
               }

               return new lliIillliliIilll(
                  false, false, false, this.IIlIIiiIIi, IIIilIIiiIIi<"IIIilIIiiIIi","Oks3NzgutRVpvCI+4E5iX0hn22+1qzNWf3nc6kyMKS7GUZiO/1RC6iv8uT+Vv7VMj+o=">()
               );
            default:
               return new lliIillliliIilll(false, false, false, this.IIlIIiiIIi, this.lIlIIiiIIi.name());
         }
      }
   }

   private lliIillliliIilll iIlIlllllill(IIlIilIllIlIilIl why, String s) {
      if (this.lllIIiiIIi >= 2) {
         return this.lIiiIiIlilli(
            iiIiIlIiIIliIlIi.iIIIiIIIIi, s + IIIilIIiiIIi<"IIIilIIiiIIi","BQru+OoDeVcHR3c6kHmFritQYzbOsUJo9Xt1Oo0UzMUTaxgZdT4dLkZUPnO+5SrCmA==">()
         );
      } else {
         this.IIlIIiiIIi = iliIllIiiIll.iliiIIIiIiiiIIIi;
         this.IllIIiiIIi = why.IliIlllilIi();
         return new lliIillliliIilll(
            false,
            false,
            false,
            this.IIlIIiiIIi,
            IIIilIIiiIIi<"IIIilIIiiIIi","4jW81AkYed85x10Q8Gqh/ZtnzJaV5Jy54Ld25cv5RdJvxPam">()
               + this.lllIIiiIIi
               + IIIilIIiiIIi<"IIIilIIiiIIi","dga+ZdOYBa2bNib1aGuWsrj1nkbCfhWv93a5RshwTenoLobpaQ==">()
               + s
               + IIIilIIiiIIi<"IIIilIIiiIIi","2hg1JD2k31Agoe/MMWlVAIjtwp1+qnVmzoZhsLcZR4/FyFoCM9i3OvtSlhkl8pO9+DM=">()
         );
      }
   }

   public IlliIIlllliIIl IIillIiliIil() {
      return this.iiIIIiiIIi;
   }

   public boolean IIlllIlliIll() {
      return this.IIlIIiiIIi == iliIllIiiIll.IiIIlIIiliIIlIIi;
   }

   private lliIillliliIilll liiiIIllIl(IIlIilIllIlIilIl s) {
      this.IilIIiiIIi++;
      if (s.iliIiiliiiii()) {
         this.lilIIiiIIi = true;
      }

      if (s.iliIiiliiiii() && s.IlIlllIlilIl() && s.IiIlliIliiIl()) {
         this.illIIiiIIi++;
         this.IIlIIiiIIi = iliIllIiiIll.iIIIlIIiIlIIlIIi;
         this.IllIIiiIIi = s.IliIlllilIi();
         return new lliIillliliIilll(
            false, true, false, this.IIlIIiiIIi, IIIilIIiiIIi<"IIIilIIiiIIi","HmOEN/RM38F2kK9h8ukI4TMHCH5MLX3rvyazPHTtefndHO+5nHe3qE/qsR2hAGGfcgisRpUvL/Db">()
         );
      } else if (s.iIlIlllllill() && this.IilIIiiIIi > 1) {
         return this.iIlIlllllill(
            s,
            this.lilIIiiIIi
               ? IIIilIIiiIIi<"IIIilIIiiIIi","c809zqP1J4J3gSCDt/xLmx44dSX4ZPJdf6v1ng5RZkDyY9fRCUloE1M/DW+OAIHQFRFRTc6hGILUFHrxmg==">()
               : IIIilIIiiIIi<"IIIilIIiiIIi","HRY1MLlzTNOrPPbZ56OSc2hPdIMpwmfyYdj/uWgwrfdzZTTDBdUH3n+rSTxObYny5iw=">()
         );
      } else {
         return this.IilIIiiIIi > 16
            ? this.iIlIlllllill(s, IIIilIIiiIIi<"IIIilIIiiIIi","5ASkbyQKWv+rATLVJ+yMy2Jr/aEnpB+VzbpFzDc/8J/bi/dT7wBp/JW4efAf+24ElHHvrMe/hg==">())
            : new lliIillliliIilll(
               false,
               false,
               false,
               this.IIlIIiiIIi,
               s.iliIiiliiiii()
                  ? IIIilIIiiIIi<"IIIilIIiiIIi","NDrdkjGcsbouYF9xSk+D6XI2ig0TLE/0CnfMfDwwQKJ2+1Gi3vZkALTi89WrJ38ZF/CvVeMBG9wj06tdk0Y7bIX6GWXM">()
                  : IIIilIIiiIIi<"IIIilIIiiIIi","w+lj6Mkb0+0OygmBAR4dB6zmDpEO3NCNTrrlKP27pbRNcQ==">()
            );
      }
   }
}
