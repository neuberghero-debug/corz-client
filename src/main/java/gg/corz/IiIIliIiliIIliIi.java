package gg.corz;

import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1661;
import net.minecraft.class_1802;
import net.minecraft.class_239;
import net.minecraft.class_3966;
import net.minecraft.class_746;
import net.minecraft.class_9362;
import net.minecraft.class_239.class_240;

public class IiIIliIiliIIliIi extends ilIllIiIll implements ilIIIiiIiIIIii {
   private long liiIIliIIi;
   private static final float lilIIliIIi = 0.0F;
   private int IiiIIliIIi;
   static final int lllIIliIIi = 10;
   private final iiIiiilIIliiil iIiIIliIIi;
   static final int IilIIliIIi = 8;
   private final iiIiiilIIliiil IIiIIliIIi = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","WiyMg4a7c7JsqjlQECpKkVx9nl6zvROU3lLaGxLIAuLNMVDOEI0iaA==">(),
      IliIlllilIi<"IliIlllilIi","simEFPRPmijDtpZTzGt1jhIbyF7cvaJDjz/orN75oj3AOHuMjCAZ41DxoI18KPZfaj8xlcRfYjXiK8fj7TVkXmG9Xt7LA7fKd4+OUVZ/7JMbrhgS/FjgKsiGvemTbpkyMGZDenaCqbOrqPsohY21ljLOyYDzHmLMjtTtigHKtw7O9J5Jl6Fh/YYJ9Wx6Fs8ldPBF2UDHSI4vqvQyBLrRVGKGi3RvkQpWGqCOjpRbyHjBcrpd7w==">(),
      true
   );
   private int iliIIliIIi;
   private final iiIiiilIIliiil lIiIIliIIi = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","/WwMPrFtOuiht8KC5+2AKAZTucr3u62faz6izerxyM9YFmPW4tZp">(),
      IliIlllilIi<"IliIlllilIi","TcCca37U4ZbBzi+Du5DELM1Yqo4UFvsFihVSiqazkBf7LHzpL+60JHYHi6Y3kRckw1AWDgpbplKlC4nNcjcK1k9yvWaqStYUD7+EMSygrO5Cvs0M0N6nuf0TS9WTCxDoYhKJzsdPhn4w/IE26XCNLqMl3XMKNQ==">(),
      true
   );
   static final int illIIliIIi = 24;
   private static final int iilIIliIIi = -1;
   private int IliIIliIIi;
   private long lliIIliIIi;

   static boolean lIliliIlil(int useTicks) {
      return useTicks >= (767776903 + -71 + 5 + 121 ^ 767776948);
   }

   private void iiiIlIIIll(class_746 p) {
      long var3 = -1905995046952044578L;
      if (p.method_6115() && p.method_6030().method_31574(class_1802.field_8547)) {
         var3 ^= ((long)p.method_6048() << 32 ^ var3) & -1L << 32;
         if (lIliliIlil((int)(var3 >>> 32))) {
            Iiiilllliiilll.field_1761.method_2897(p);
            Iiiilllliiilll.field_1690.field_1904.method_23481(false);
         }
      }
   }

   public IiIIliIiliIIliIi() {
      super(IliIlllilIi<"IliIlllilIi","YhRYRJjcljFFdD/oIhizali4bN1GX0b3YLzYeYdCP9wBd18vR+S3g7fR">(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.iIiIIliIIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","MFWPzb3I3hCJ/bXQLRaJx6KtidzASSbZyfBh/hMmKyX2vEpKvyo3uw==">(),
         IliIlllilIi<"IliIlllilIi","RcrrPjoEMH8EirYWY0kjRcr+V7owKUA5hKGd0dx8/mgeMbpjC7AgcCojbM6LCD38DHnEw0lzn47LAQ4DOuiYaZqStSGrbVMcHc0SlmtYTUQKAPUABbyxrMHs1G/phqEjpa2lzLr7pJt3eQjwXHMqRgqtrEG6sfshymWYvYrexvA=">(),
         true
      );
      this.IliIIliIIi = -1;
      this.IiiIIliIIi = -1;
      this.liiIIliIIi = -1L;
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IIiIIliIIi, this.lIiIIliIIi, this.iIiIIliIIi});
   }

   private static boolean Iillllilll(class_746 p) {
      return !p.method_24828()
         && !p.method_6101()
         && !p.method_5799()
         && !p.method_5771()
         && !p.method_5765()
         && !p.method_6128()
         && !p.method_31549().field_7479;
   }

   private void llIililIil() {
      this.iIIilIlIil();
      this.lliIIliIIi = 0L;
      this.IiiIIliIIi = -1;
      this.liiIIliIIi = -1L;
   }

   static boolean IiIilliIil(float progress) {
      return progress >= 1.0F;
   }

   @Override
   protected void Iilililiiili() {
      this.llIililIil();
   }

   private static boolean IIIillIIil(class_746 p) {
      if (!class_9362.method_58659(p)) {
         return false;
      } else {
         for (int var1 = 0; var1 < class_1661.method_7368(); var1++) {
            if (p.method_31548().method_5438(var1).method_7909() instanceof class_9362) {
               return true;
            }
         }

         return false;
      }
   }

   private void iIIilIlIil() {
      this.IliIIliIIi = -1;
      this.iliIIliIIi = 0;
   }

   static boolean Illillllil(long tick, long heldSince) {
      return tick - heldSince > (6642452160204590764L ^ 6642452160204590772L);
   }

   private boolean lIilliIill() {
      return Iiiilllliiilll.field_1771 > 0
         || IIllIIlilIllIIli.IliIlllilIi()
         || IIllIIlilIllIIli.iliIiiliiiii()
         || IIllIIlilIllIIli.IIillIiliIil()
         || IIIIilIilIIIilIi.lIIlliIIll()
         || IilIIililIIi.IilliliilIIi();
   }

   @Override
   public iilllIllIIillIll IIllllIlll(Object target, class_1297 presser) {
      long var5 = 7550071874719327643L;
      class_746 var3 = Iiiilllliiilll.field_1724;
      if (var3 == null || !this.iIlllIllll() || !liilliiill(var3)) {
         return iilllIllIIillIll.ilIIIIilll;
      } else if (target != this) {
         if (target != null) {
            return iilllIllIIillIll.ilIIIIilll;
         } else if (presser == null) {
            return this.IIiIIliIIi.Iilllilliill() && this.Ilillllill() && !IiIilliIil(var3.method_7261(0.0F))
               ? iilllIllIIillIll.IiIIIIilll
               : iilllIllIIillIll.ilIIIIilll;
         } else {
            if (!(presser instanceof class_1309 var4) || !var4.method_5805() || IIIillIIil(var3)) {
               return iilllIllIIillIll.ilIIIIilll;
            }

            if (this.ilIllIiIll(var3)) {
               this.iIIilIlIil();
               return iilllIllIIillIll.ilIIIIilll;
            } else {
               this.IlIllllIll(var3, var4);
               return iilllIllIIillIll.IiIIIIilll;
            }
         }
      } else {
         var5 ^= (
               (long)(presser != null && presser.method_5628() == this.IiiIIliIIi && this.liiIIliIIi == IIllIIlilIllIIli.IlIlllIlilIl() ? 1 : 0) << 32 ^ var5
            )
            & -1L << 32;
         this.IiiIIliIIi = -1;
         return (int)(var5 >>> 32) != 0 ? iilllIllIIillIll.ilIIIIilll : iilllIllIIillIll.IiIIIIilll;
      }
   }

   private class_1309 ilillIiill() {
      if (Iiiilllliiilll.field_1765 instanceof class_3966 var2 && var2.method_17782() instanceof class_1309 var1) {
         return var1;
      }

      return null;
   }

   static boolean illilIilil(boolean critAllowed, boolean fallDistance, double waitedTicks, int airborne) {
      return critAllowed
         && fallDistance
         && waitedTicks <= Double.longBitsToDouble(3704256659936134978L ^ 3704256659936134978L)
         && airborne < ((564759688 * -107 >>> 29 | 564759688 * -107 << 3) ^ 1897011535);
   }

   private void lIIlliIIll(class_746 p) {
      long var2 = IIllIIlilIllIIli.IlIlllIlilIl();
      if (this.iIlllIllll() && liilliiill(p) && !p.method_6115() && Iiiilllliiilll.field_1755 == null && !Illillllil(var2, this.lliIIliIIi)) {
         class_1309 var4 = this.ilillIiill();
         if (var4 != null && var4.method_5628() == this.IliIIliIIi) {
            if (!var4.method_5805()) {
               this.iIIilIlIil();
            } else if (iiIilIIlil(this.IIiIIliIIi.Iilllilliill(), p.method_7261(0.0F))) {
               if (this.lllllillll(p)) {
                  this.iliIIliIIi++;
               } else if (!this.lIilliIill() && !IIllIIlilIllIIli.IiIlliIliiIl()) {
                  if (IIllIIlilIllIIli.IIlllIlliIll(this)) {
                     this.IiiIIliIIi = this.IliIIliIIi;
                     this.liiIIliIIi = var2;
                  }

                  this.iIIilIlIil();
               }
            }
         }
      } else {
         this.iIIilIlIil();
      }
   }

   @Override
   protected void iIIIlIlIIl() {
      class_746 var1 = Iiiilllliiilll.field_1724;
      if (var1 != null && Iiiilllliiilll.field_1761 != null && Iiiilllliiilll.field_1690 != null) {
         if (this.iIiIIliIIi.Iilllilliill()) {
            this.iiiIlIIIll(var1);
         }

         if (this.IliIIliIIi != -1) {
            this.lIIlliIIll(var1);
         }
      } else {
         this.llIililIil();
      }
   }

   private void IlIllllIll(class_746 target, class_1309 p) {
      long var3 = IIllIIlilIllIIli.IlIlllIlilIl();
      if (this.IliIIliIIi != p.method_5628()) {
         this.iliIIliIIi = 0;
      }

      this.IliIIliIIi = p.method_5628();
      this.lliIIliIIi = var3;
   }

   private boolean lllllillll(class_746 p) {
      return this.lIiIIliIIi.Iilllilliill() && illilIilil(Iillllilll(p), iilllIIill(p), p.field_6017, this.iliIIliIIi);
   }

   private boolean ilIllIiIll(class_746 p) {
      return iiIilIIlil(this.IIiIIliIIi.Iilllilliill(), p.method_7261(0.0F)) && !this.lllllillll(p);
   }

   static boolean iiIilIIlil(boolean progress, float meleeTiming) {
      return !progress || IiIilliIil(meleeTiming);
   }

   private boolean Ilillllill() {
      class_239 var1 = Iiiilllliiilll.field_1765;
      return var1 == null || var1.method_17783() == class_240.field_1333;
   }

   private static boolean liilliiill(class_746 p) {
      return p.method_6047().method_31574(class_1802.field_8547);
   }

   @Override
   protected void Illillliilli() {
      this.llIililIil();
   }

   private static boolean iilllIIill(class_746 p) {
      return !p.method_5624() && !p.method_74025() && !p.method_6059(class_1294.field_5906) && !p.method_6059(class_1294.field_5902);
   }

   private boolean iIlllIllll() {
      return this.IIiIIliIIi.Iilllilliill() || this.lIiIIliIIi.Iilllilliill();
   }
}
