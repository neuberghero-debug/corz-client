package gg.corz;

import java.util.HashMap;

public final class iIIllIliIlIllIli {
   private int liIiIIllIi;
   private int iIIiIIllIi;
   private int iiIiIIllIi;
   private int ilIiIIllIi;
   public static final int IIliIIllIi = 4096;
   private final HashMap<Long, Boolean> lIIiIIllIi = new HashMap<>();
   private int IiIiIIllIi;
   private int IlIiIIllIi;
   private int llIiIIllIi;

   public static long IliIlllilIi(long cell, long feet, long localFingerprint) {
      long var6 = cell * -7046029254386353131L ^ feet;
      return (var6 ^ localFingerprint) * 1099511628211L;
   }

   public void Iiilliiliiil() {
      this.lIIiIIllIi.clear();
   }

   public int IlIlllIlilIl() {
      return this.IlIiIIllIi;
   }

   public void lIiiIiIlilli() {
      this.IiIiIIllIi++;
   }

   public int Iilllilliill() {
      return this.liIiIIllIi;
   }

   public void iliIiiliiiii() {
      this.liIiIIllIi++;
   }

   public int IiIlliIliiIl() {
      return this.llIiIIllIi;
   }

   public int Illlllllilll() {
      return this.IiIiIIllIi;
   }

   public int IIIllIIliIIl() {
      return this.iIIiIIllIi;
   }

   public int IIlllIlliIll() {
      return this.ilIiIIllIi;
   }

   public void iIlIlllllill(long feet, long localFingerprint, long seals, boolean cell) {
      if (this.lIIiIIllIi.size() > 4096) {
         this.lIIiIIllIi.clear();
      }

      this.lIIiIIllIi.put(IliIlllilIi(feet, localFingerprint, seals), cell);
      this.iIIiIIllIi++;
      if (cell) {
         this.llIiIIllIi++;
      } else {
         this.IlIiIIllIi++;
      }
   }

   public int IIillIiliIil() {
      return this.iiIiIIllIi;
   }

   public String Ililllililil() {
      return IIIilIIiiIIi<"IIIilIIiiIIi","3/nwMrx9cB71tpgH8DRs9ifAd2SHVQqxrqVvzZo3h/jBub/daL4RFDVYv39emQ==">()
         + this.iIIiIIllIi
         + IIIilIIiiIIi<"IIIilIIiiIIi","9mn+xGU9UNTKvQpbkyya3xwXuNwHWvzbnF7sGBlOX3NMe+EWk8know==">()
         + this.IlIiIIllIi
         + IIIilIIiiIIi<"IIIilIIiiIIi","BQwHZcySYvUsg0Y5MHmCYnNRn7+BQDAcvlOUFAk89KV788WDdrQN+YDIMW0=">()
         + this.llIiIIllIi
         + IIIilIIiiIIi<"IIIilIIiiIIi","e1lKBsnRNal63mTcoC+OoQC+4W1hu2Ooh7DfeirqtGG1HpDNy1y2MAeE0BhLQgs8VA==">()
         + this.ilIiIIllIi
         + IIIilIIiiIIi<"IIIilIIiiIIi","F+lZo9qFedwpA91mxnCN5qqrPY1ZyAmTwOb/f6Javu50lqkc0uJCvz1rPM3Q2y+93w==">()
         + this.IiIiIIllIi
         + IIIilIIiiIIi<"IIIilIIiiIIi","Lf1fqaF985f3Bwam7PS6xGc1CN+/xcyatq6VCofvrsRT97SLAnoltA/D3/TtIgCTYp0=">()
         + this.liIiIIllIi;
   }

   public void IilliliilIIi() {
      this.ilIiIIllIi++;
   }

   public Boolean liiiIIllIl(long feet, long localFingerprint, long cell) {
      Boolean var7 = this.lIIiIIllIi.get(IliIlllilIi(feet, localFingerprint, cell));
      if (var7 != null) {
         this.iiIiIIllIi++;
      }

      return var7;
   }
}
