package gg.corz;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_10707;
import net.minecraft.class_12392;
import net.minecraft.class_1282;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2824;
import net.minecraft.class_2846;
import net.minecraft.class_2885;
import net.minecraft.class_2886;
import net.minecraft.class_3966;
import net.minecraft.class_746;
import net.minecraft.class_9334;
import net.minecraft.class_9362;
import net.minecraft.class_9836;
import net.minecraft.class_10707.class_10708;
import net.minecraft.class_239.class_240;
import net.minecraft.class_2846.class_2847;

public class IIlliiIllIlliiIl extends ilIllIiIll implements ilIIIiiIiIIIii {
   private static final double IliIllIlll = 11.5;
   private boolean iiIlllIlll;
   private float llllllIlll;
   private static final float lIiIllIlll = 0.5F;
   private long lIllllIlll;
   private boolean IillllIlll;
   private static final float iIiIllIlll = 0.9F;
   private boolean liIlllIlll;
   private final iIililIlIlililIl IiIlllIlll;
   private final iiIiiilIIliiil lIIlllIlll;
   private final iiIiiilIIliiil llIlllIlll;
   private final iiIiiilIIliiil iIIlllIlll;
   private long iillllIlll;
   private final iiIiiilIIliiil IiiIllIlll;
   private boolean illlllIlll;
   private final iIiiIiilIliiIiil ilIlllIlll;
   private static final lilllliiilllli lliIllIlll = lilllliiilllli.IIliIiIIIl.IliIlllilIi(false);
   private int lillllIlll;
   private final iiIiiilIIliiil liiIllIlll;
   private final lliliIIiililiIIi iliIllIlll = new lliliIIiililiIIi(
      IliIlllilIi<"IliIlllilIi","xOcRVyBBe6tjmk+IkFlpzx413tHOcEOz6K76uyowA1YASWk=">(),
      IliIlllilIi<"IliIlllilIi","g9FO/ZddbtrbWo7+leGJlkspq6NWhG7HOAlVA9xTdn3lOtHrv+LNRCDFnd+WdywPO2AR+TB0FEGdP7VIGTTv4iG416o9R8FsltB1EXnpfn6PVzLbNg==">(),
      IliIlllilIi<"IliIlllilIi","JgSQGj5EuehWcjdUeMBlgWqHQS0NHQ5vVW3Bslpp5XI7mZ0=">(),
      IliIlllilIi<"IliIlllilIi","JgSQGj5EuehWcjdUeMBlgWqHQS0NHQ5vVW3Bslpp5XI7mZ0=">(),
      IliIlllilIi<"IliIlllilIi","mKHLpBQfrlCI2Hl2XtMiu3vj7vap7CKH2ZoRuiFdKpTGx4gQjSH4uJNy">(),
      IliIlllilIi<"IliIlllilIi","IudXaX3CLSSFLNd8IVCXl3OXK+baPTZ83K97olKSXGU=">()
   );
   private final iiIiiilIIliiil IlIlllIlll;
   private int iIllllIlll;
   private final Iiiliillliiliill IIIlllIlll;
   private float IlllllIlll;
   private final Iiiliillliiliill iiiIllIlll;

   private boolean Iillllilll(class_1309 e) {
      return this.iIIlllIlll.Iilllilliill() && this.llIililIil(e);
   }

   @Override
   protected void lilIliilIl(IiiIlllliiIlll event) {
      if (event.liiiIIllIl() == ((849407967 * -678152731 << 5 | 849407967 * -678152731 >>> 27) ^ 829927283) && Iiiilllliiilll.field_1690 != null) {
         if (IillIIIllillIIIl.iIlIlllllill(Iiiilllliiilll.field_1690.field_1886, event.IliIlllilIi())) {
            this.iiiIlIIIll();
         }
      }
   }

   private lilllliiilllli iilllIIill() {
      String var1 = this.iliIllIlll.Iilllilliill();

      return switch (var1) {
         case IliIlllilIi<"IliIlllilIi","mKHLpBQfrlCI2Hl2XtMiu3vj7vap7CKH2ZoRuiFdKpTGx4gQjSH4uJNy">() -> lilllliiilllli.IIliIiIIIl;
         case IliIlllilIi<"IliIlllilIi","IudXaX3CLSSFLNd8IVCXl3OXK+baPTZ83K97olKSXGU=">() -> lliIllIlll;
         default -> lilllliiilllli.iiIiIiIIIl;
      };
   }

   @Override
   public int liIlliiIll() {
      return ~(610037429 * -97 + 93) ^ -955911228;
   }

   @Override
   protected void Illillliilli() {
      this.lililiilil();
   }

   private void iiIilIIlil(class_746 player, long now) {
      long var7 = 5452175052827373460L;
      var7 ^= ((long)player.field_6235 << 32 ^ var7) & -1L << 32;
      if ((int)(var7 >>> 32) > this.iIllllIlll) {
         class_1282 var5 = player.method_6081();
         class_1297 var6 = var5 == null ? null : var5.method_5529();
         if (var6 != null && var6 != player) {
            this.IiIlllIlll.IliIlllilIi(var6.method_5628(), now);
         }
      }

      this.iIllllIlll = (int)(var7 >>> 32);
   }

   private boolean iIIilIlIil(class_1309 target) {
      return lliillliliilll.IilliliilIIi(Iiiilllliiilll.field_1724.method_6047()) || iIIiIlIiIlIiIlIi.iIlIlllllill(target);
   }

   private boolean lIilliIill(class_1309 target) {
      long var3 = 5065259597488963180L;
      if (!this.Ilillllill()) {
         return false;
      } else {
         var3 ^= ((long)this.liilliiill(target) << 32 ^ var3) & -1L << 32;
         return this.lIIlllIlll.Iilllilliill() && (int)(var3 >>> 32) == 0 && !this.ilillIiill()
            ? false
            : (int)(var3 >>> 32) != 0 || Iiiilllliiilll.field_1724.method_7261(0.5F - this.llllllIlll) >= 1.0F;
      }
   }

   @Override
   protected void IllIllllIl(IiiiIIIlliiiIIIl event) {
      if (event.liiiIIllIl() == (-(~1351194245) * -373475417 ^ 805698411) && Iiiilllliiilll.field_1690 != null) {
         if (IillIIIllillIIIl.liiiIIllIl(Iiiilllliiilll.field_1690.field_1886, event.IliIlllilIi())) {
            this.iiiIlIIIll();
         }
      }
   }

   @Override
   protected void Iilililiiili() {
      this.lililiilil();
   }

   private float Illillllil() {
      return ilIIIillIiIIIill.lIiiIiIlilli(this.iiiIllIlll.Iilllilliill(), this.iiiIllIlll.Ililllililil(), ThreadLocalRandom.current().nextDouble());
   }

   @Override
   protected void iIIIlIlIIl() {
      class_746 var1 = Iiiilllliiilll.field_1724;
      if (var1 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1761 != null && Iiiilllliiilll.field_1690 != null) {
         long var2 = System.nanoTime() / 1000000L;
         long var4 = IIllIIlilIllIIli.IlIlllIlilIl();
         this.iiIilIIlil(var1, var2);
         this.lIliliIlil(var1);
         if (!class_9362.method_58659(var1)) {
            this.illlllIlll = false;
         }

         if (this.iiIlllIlll && var4 > this.lIllllIlll + 1L) {
            this.iiIlllIlll = false;
         }

         boolean var6 = IillIIIllillIIIl.IliIlllilIi(Iiiilllliiilll.field_1690.field_1886);
         if (this.liIlllIlll && !var6) {
            this.liIlllIlll = false;
            if (this.IiiIllIlll.Iilllilliill()) {
               this.IiIlllIlll.IilliliilIIi();
            }
         } else if (!this.liIlllIlll && var6 && Iiiilllliiilll.field_1755 == null) {
            this.liIlllIlll = true;
         }

         if (!this.IlIlllIlll.Iilllilliill()) {
            this.IiIlllIlll.IilliliilIIi();
         }

         if (!this.IlIllllIll(true)) {
            this.ilIlllIlll.liiiIIllIl();
         } else {
            class_1309 var7 = this.IiIilliIil();
            if (var7 != null && this.lllllillll(var7)) {
               if (!this.IlIlllIlll.Iilllilliill() || this.IiIlllIlll.liiiIIllIl(var7.method_5628(), var2)) {
                  if (this.ilIlllIlll.IliIlllilIi(var7.method_5628(), var2, this::illilIilil)) {
                     if (!this.ilIllIiIll(var1) && this.lIilliIill(var7)) {
                        if (IIllIIlilIllIIli.IIlllIlliIll(this)) {
                           this.lillllIlll = var7.method_5628();
                           this.iillllIlll = var4;
                        }
                     }
                  }
               }
            } else {
               this.ilIlllIlll.liiiIIllIl();
               this.IiIlllIlll.iIlIlllllill(var2);
            }
         }
      } else {
         this.lililiilil();
      }
   }

   private iilllIllIIillIll lIIlliIIll(class_1297 target) {
      long var5 = -2220020147359672311L;
      if (this.iiIlllIlll && this.IiiIllIlll.Iilllilliill() && this.liiIllIlll.Iilllilliill() && this.IlIllllIll(false)) {
         class_1309 var10000;
         label43: {
            var5 ^= (
                  (long)(target != null || Iiiilllliiilll.field_1765 != null && Iiiilllliiilll.field_1765.method_17783() != class_240.field_1333 ? 0 : 1) << 32
                     ^ var5
               )
               & -1L << 32;
            if (target instanceof class_1309 var4 && this.iIlllIllll(var4)) {
               var10000 = var4;
               break label43;
            }

            var10000 = null;
         }

         class_1309 var3 = var10000;
         var5 ^= ((long)(var3 != null && !this.Iillllilll(var3) && this.lIilliIill(var3) ? 1 : 0) ^ var5) & -1L >>> 32;
         return ilIIIillIiIIIill.IilliliilIIi((boolean)((int)(var5 >>> 32)), var3 != null, (boolean)((int)var5))
            ? iilllIllIIillIll.IiIIIIilll
            : iilllIllIIillIll.ilIIIIilll;
      } else {
         return iilllIllIIillIll.ilIIIIilll;
      }
   }

   public IIlliiIllIlliiIl() {
      super(IliIlllilIi<"IliIlllilIi","NfQn/vK6qT/hiy1ynbXmX9wYP5ZAqUYFfRU+kSK6j7VwH0c//Fp4">(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.IiiIllIlll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","ZaERBPnW+DwSwPo0Xq2dR5vVT8/WFUZC6pnSLY0JKep1dy24Vx9kzRDpvFdcgg==">(),
         IliIlllilIi<"IliIlllilIi","8QpDLQPKKCLgW3uJsGstvuOCDXwjndhqRiu89Aqlij3l1rbUArBaZvD90dC5rzGqPd6yri/ihPtg7xdEY0Ckp2aCJqJVAm7y73Y+MzR/V4UP/9xaE/ekLeatiDY+WKbjo55M3YERXSCEPHzvObYbDseQrSg+gO4wcsr7r5io5uPmbHrTdsyqG5dfyQ==">(),
         false
      );
      this.liiIllIlll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","jH2Wansw0GBy26E6v0Vl7H6H4fz808VBApC2DIhmTsNnIkGoQY46mHPN4Q0sszKn7MOj">(),
         IliIlllilIi<"IliIlllilIi","+y7J2HRuj0qSA28I/8CmJVnHY4eax2MJZVzouuOuyrtcJScK0BvdKbJYblOki54r80XQhnx5K9XIrfuhPsMhJ8MmTemqAKrHA6g85HAX/FWxuNjJ+xbDrOLdwZn7/oB9cFWIyjnIi2sDTWRGHZFvNcTXgfr1E7anJNIRpb7AzLlhg0xaDfXOxLb1/9pnBi41aKkTrU64">(),
         true
      );
      this.iiiIllIlll = new Iiiliillliiliill(
         IliIlllilIi<"IliIlllilIi","Ys3atXE/qwcC73XyDZavGrFHjMyPdcBpaEl+RjcLOsuHmK083egZ">(),
         IliIlllilIi<"IliIlllilIi","RHQFzdvtQE2qvW38ODhI8ABhqUcsCvMACmp1yJMxWcjrR5MqPBcaXZwOcmPAKfv/bVsQ/hhY5P4/ypzfDlYyrMRGGyrp0WzYbeET/qD+gpB56PTlILUtVgEjdgybr6KC9eOnVfA4xWtecnLp5GHOvxaXzzpVWNjG1mIb/6DZaUbcIAXwsonnNK+gt39TPLaKdJ0f3MpSbI7tvXVyZrStqouU+Gp2FeoSJccRiCImaPEju/KkY/AOWog9aAWNQyHwNR1X3aIv0aM=">(),
         0.0,
         0.0,
         -5.0,
         10.0,
         1.0
      );
      this.IIIlllIlll = new Iiiliillliiliill(
         IliIlllilIi<"IliIlllilIi","wKnZ3cDWKtjscgotdgZEVw5AydOODW+BtlR0mjoL+BWO8SB/XmIEUsLrBHk=">(),
         IliIlllilIi<"IliIlllilIi","IypUNy8O382VukwP7LeJ32cRw2rgiIA6tby5JcOrzkMWRCGMQymTK2dd8Jf24XQkJlyzvaZQdcZwPSU/BthLJyfAsjL2qxJx7EGi2odbVj1ZIWAp78RAoWe9pf0WrJuNGsGrK+QCA+6r05MTUlhQ+cAsXKyjjOxgBDvZurbxnDBe0jNJyJ8M/my5te7wxA==">(),
         0.0,
         0.0,
         0.0,
         200.0,
         10.0
      );
      this.lIIlllIlll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","mtgOt95J/hF/UAQzFJ+i6CE6OH7+oIetcO4ylCAXaWC1WNh5zA==">(),
         IliIlllilIi<"IliIlllilIi","PDIdKTXKnkUDceJi3N97RY7XMMvMEjSCruipI3HPna2d932iMTNpyWdiwwE+5w3Us+gKQJkVtwV1avtbPJ5nGcQfCwkXo80JADFvMsFUeq7kPpy6Xenz1yRJaMXy3lCoZGjFuQVBkdIs39vm38k=">(),
         false
      );
      this.iIIlllIlll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","sZsHeTNKenN0ZYHu1nOxzKOGixahj0Bhwvxh1heqcPGfDizWXPhe/Q==">(),
         IliIlllilIi<"IliIlllilIi","ilgyBQik9KE87ckEsxwzt42LemD0vH22thjB8m/LwAbcJdUSDMTo6cpc7bloDUvDVBSAdb2rBYwkEyS7mhzlHJIIwiFkcNQXSj3SRNW6qqt9/p21i3VMzFpQySjJgro1efedQ83Tznl2Fm3wA+W8Ks/CtfY2KBuCHHOdAkfogdx00gD/77sbJw==">(),
         false
      );
      this.IlIlllIlll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","E+o5iC6LO7fv62WXqYTi8kfqlZHdyCohQNhoPm1MNIJQhvKq3lla9hM1TK4=">(),
         IliIlllilIi<"IliIlllilIi","mBRg4+aXefggCtyRhQMxnOmvRIPixxguXhGt/2SAVLzWaiGIG5oImDE+3BBR+CRfVp7AUB1SNZ1AS3tTGCzqGYA3IDiYgaeA5WjHJ6BcjimxgzTDALJY0eHy2MiBvL74ezfe8BR1IDHN3wD1HRf01EqOduLhZAVMQvzLkeppr+5RytpkP9Mae+BMxMmYjz80qV0=">(),
         false
      );
      this.llIlllIlll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","VCaNPIp8scCG2l6Y34rgI0Y4okBvFP8bnk4O2U7LmTuwGxsuFRkWNw==">(),
         IliIlllilIi<"IliIlllilIi","JlL5iy3QC99jMaD+gg9wbmK6LC8v7EhbYvo1EAzvOVKGhGjvIA8SGzCnSs7nweXfMmr7azo1K87fpzBy2E2HkPRPI6yb9rAyZnC/p3HB6XJj+byoixkr0kzctw==">(),
         false
      );
      this.ilIlllIlll = new iIiiIiilIliiIiil();
      this.IiIlllIlll = new iIililIlIlililIl();
      this.lillllIlll = -1;
      this.iillllIlll = -1L;
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.iliIllIlll,
            this.IiiIllIlll,
            this.liiIllIlll,
            this.iiiIllIlll,
            this.IIIlllIlll,
            this.lIIlllIlll,
            this.iIIlllIlll,
            this.IlIlllIlll,
            this.llIlllIlll
         }
      );
   }

   private long illilIilil() {
      return (long)Math.round(
         ilIIIillIiIIIill.lIiiIiIlilli(this.IIIlllIlll.Iilllilliill(), this.IIIlllIlll.Ililllililil(), ThreadLocalRandom.current().nextDouble())
      );
   }

   private void lililiilil() {
      this.liIlllIlll = false;
      this.iiIlllIlll = false;
      this.lIllllIlll = 0L;
      this.ilIlllIlll.liiiIIllIl();
      this.IiIlllIlll.lIiiIiIlilli();
      this.iIllllIlll = 0;
      this.IlllllIlll = 0.0F;
      this.llllllIlll = this.Illillllil();
      this.illlllIlll = false;
      this.IillllIlll = false;
      this.lillllIlll = -1;
      this.iillllIlll = -1L;
   }

   private boolean IlIllllIll(boolean needActivation) {
      if (Iiiilllliiilll.field_1755 != null || Iiiilllliiilll.method_18506() != null || !Iiiilllliiilll.method_1569()) {
         return false;
      } else {
         return needActivation && this.IiiIllIlll.Iilllilliill() && !this.liIlllIlll
            ? false
            : !this.llIlllIlll.Iilllilliill() || lliillliliilll.IliIlllilIi(Iiiilllliiilll.field_1724.method_6047());
      }
   }

   @Override
   public iilllIllIIillIll IIllllIlll(Object target, class_1297 presser) {
      long var5 = -4760090311897115008L;
      if (Iiiilllliiilll.field_1724 == null) {
         return iilllIllIIillIll.ilIIIIilll;
      } else if (target == null) {
         return this.lIIlliIIll(presser);
      } else if (target != this) {
         return iilllIllIIillIll.ilIIIIilll;
      } else {
         var5 ^= (
               (long)(presser != null && presser.method_5628() == this.lillllIlll && this.iillllIlll == IIllIIlilIllIIli.IlIlllIlilIl() ? 1 : 0) << 32 ^ var5
            )
            & -1L << 32;
         this.lillllIlll = -1;
         if ((int)(var5 >>> 32) == 0 || !(presser instanceof class_1309 var4) || this.IillllIlll || Iiiilllliiilll.field_1724.method_6115()) {
            return iilllIllIIillIll.IiIIIIilll;
         }

         if (this.IlIllllIll(true) && this.lllllillll(var4) && this.lIilliIill(var4)) {
            return lIIIIIlliIIIIIll.IliIlllilIi(var4) ? iilllIllIIillIll.ilIIIIilll : iilllIllIIillIll.IiIIIIilll;
         } else {
            return iilllIllIIillIll.IiIIIIilll;
         }
      }
   }

   private boolean ilIllIiIll(class_746 player) {
      return player.method_6115()
         || this.IillllIlll
         || IIllIIlilIllIIli.IliIlllilIi()
         || IIllIIlilIllIIli.IiIlliIliiIl()
         || IIllIIlilIllIIli.iliIiiliiiii()
         || IIllIIlilIllIIli.IIillIiliIil()
         || IIIIilIilIIIilIi.lIIlliIIll()
         || IilIIililIIi.IilliliilIIi()
         || lIIIIIlliIIIIIll.lIiiIiIlilli();
   }

   private boolean IIIillIIil(class_1309 target) {
      return lliillliliilll.iIlIlllllill(Iiiilllliiilll.field_1724.method_6047()) || iIIiIlIiIlIiIlIi.IilliliilIIi(target);
   }

   private boolean ilillIiill() {
      long var3 = 8435813662089429046L;
      class_746 var1 = Iiiilllliiilll.field_1724;
      var3 ^= (
            (long)(
                     !var1.method_24828() && !var1.method_6101() && !var1.method_5799() && !var1.method_5771() && !var1.method_5765() && !var1.method_6128()
                        ? 1
                        : 0
                  )
                  << 32
               ^ var3
         )
         & -1L << 32;
      return (int)(var3 >>> 32) == 0
         ? true
         : var1.field_6017 > Double.longBitsToDouble(2457754070267166912L ^ 2457754070267166912L)
            && !var1.method_5624()
            && !var1.method_74025()
            && var1.method_7261(0.5F) > 0.9F;
   }

   @Override
   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      class_746 var2 = Iiiilllliiilll.field_1724;
      if (var2 != null && Iiiilllliiilll.method_18854() && !event.lIiiIiIlilli()) {
         class_2596 var3 = event.lIiilIIIIi;
         if (var3 instanceof class_9836) {
            this.IillllIlll = false;
         } else if (var3 instanceof class_2885 || var3 instanceof class_2886) {
            this.IillllIlll = true;
         } else if (var3 instanceof class_2846 var4) {
            if (var4.method_12363() == class_2847.field_12974) {
               this.IillllIlll = true;
            }
         } else if (var3 instanceof class_2824 var5) {
            if (!IIIliiIilIIliiIi.IliIlllilIi(var5)) {
               this.IillllIlll = true;
            } else if (class_9362.method_58659(var2) && lliillliliilll.iIlIlllllill(var2.method_6047())) {
               this.illlllIlll = true;
            }
         }
      }
   }

   private boolean Ilillllill() {
      class_746 var1 = Iiiilllliiilll.field_1724;
      if (Iiiilllliiilll.field_1771 <= 0 && !var1.method_3144()) {
         class_1799 var2 = var1.method_6047();
         if (var1.method_75202(var2, 0)) {
            return false;
         } else {
            class_12392 var3 = (class_12392)var2.method_58694(class_9334.field_64680);
            class_239 var4 = Iiiilllliiilll.field_1765;
            return var3 == null || var4 == null || var3.method_76736(var1, var4.method_17784());
         }
      } else {
         return false;
      }
   }

   private class_1309 IiIilliIil() {
      if (Iiiilllliiilll.field_1765 instanceof class_3966 var2 && var2.method_17782() instanceof class_1309 var1) {
         return var1;
      }

      return null;
   }

   private boolean lllllillll(class_1309 e) {
      return this.iIlllIllll(e) && !this.Iillllilll(e);
   }

   private boolean liilliiill(class_1309 target) {
      return !this.illlllIlll && class_9362.method_58659(Iiiilllliiilll.field_1724) ? this.IIIillIIil(target) : false;
   }

   private void lIliliIlil(class_746 player) {
      float var2 = player.method_7261(0.0F);
      if (var2 < this.IlllllIlll) {
         this.llllllIlll = this.Illillllil();
      }

      this.IlllllIlll = var2;
   }

   private boolean iIlllIllll(class_1309 e) {
      return liiIIIlliiiIIIll.IliIlllilIi(e, this.iilllIIill()) && e != Iiiilllliiilll.field_1724.method_5854();
   }

   private void iiiIlIIIll() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1755 == null && Iiiilllliiilll.method_18506() == null && !this.liIlllIlll) {
         this.liIlllIlll = true;
         if (this.IiiIllIlll.Iilllilliill() && this.liiIllIlll.Iilllilliill()) {
            this.iiIlllIlll = true;
            this.lIllllIlll = IIllIIlilIllIIli.IlIlllIlilIl();
         }
      }
   }

   private boolean llIililIil(class_1309 e) {
      if (e instanceof class_1657 && e.method_6115()) {
         class_10707 var2 = (class_10707)e.method_6030().method_58694(class_9334.field_56396);
         if (var2 == null) {
            return false;
         } else if (!ilIIIillIiIIIill.liiiIIllIl(e.method_6048(), ilIIIillIiIIIill.IliIlllilIi(illIllilIilIllil.IiIlliIliiIl()), var2.method_67197())) {
            return false;
         } else {
            double var3 = -1.0;

            for (class_10708 var6 : var2.comp_3588()) {
               var3 = Math.max(var3, (double)var6.comp_3638());
            }

            if (var3 < 0.0) {
               return false;
            } else {
               class_243 var8 = e.method_5631(0.0F, e.method_5791());
               class_243 var9 = Iiiilllliiilll.field_1724.method_73189();
               class_243 var7 = e.method_73189();
               return !ilIIIillIiIIIill.iIlIlllllill(
                     var8.field_1352, var8.field_1350, var9.field_1352 - var7.field_1352, var9.field_1350 - var7.field_1350, var3 + 11.5
                  )
                  ? false
                  : !this.iIIilIlIil(e);
            }
         }
      } else {
         return false;
      }
   }
}
