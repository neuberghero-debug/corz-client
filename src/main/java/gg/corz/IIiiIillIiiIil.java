package gg.corz;

import java.util.Random;
import java.util.function.Predicate;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1819;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2269;
import net.minecraft.class_2272;
import net.minecraft.class_2312;
import net.minecraft.class_2323;
import net.minecraft.class_2328;
import net.minecraft.class_2338;
import net.minecraft.class_2349;
import net.minecraft.class_2350;
import net.minecraft.class_2362;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_2401;
import net.minecraft.class_2428;
import net.minecraft.class_243;
import net.minecraft.class_2457;
import net.minecraft.class_2533;
import net.minecraft.class_2561;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2885;
import net.minecraft.class_3532;
import net.minecraft.class_3675;
import net.minecraft.class_3959;
import net.minecraft.class_3962;
import net.minecraft.class_3965;
import net.minecraft.class_4969;
import net.minecraft.class_5545;
import net.minecraft.class_9334;
import net.minecraft.class_2350.class_2351;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import org.lwjgl.glfw.GLFW;

public class IIiiIillIiiIil extends ilIllIiIll implements liliIiliiliIil {
   private class_3965 lIililiIiiIililiIi;
   private iiIiIIliIIliIIli iiiiiliIiIIIIIiiIi;
   private static final double lIlIiliIiiIlIiliIi = 0.1;
   private class_3965 ilililiIiIiililiIi;
   private boolean lIliiliIiiIliiliIi;
   private int lliiiliIiiliiiliIi;
   private boolean liiIIiiIiiiiIIiiIi;
   private static final double IiIIiliIiliIIiliIi = 5.0;
   private final iiIiiilIIliiil IiiIiliIiliiIiliIi;
   private boolean IiiiiliIiliiiiliIi;
   private boolean iliIIiiIiIiiIIiiIi;
   private static final double IllIiliIilllIiliIi = 1.0;
   private class_2338 IlliiliIillliiliIi;
   private boolean IilIIiiIililIIiiIi;
   private final iiIiiilIIliiil liIliliIiiiIliliIi;
   private class_3965 liililiIiiiililiIi;
   private int liIIIiiIiiiIIIiiIi;
   private int IIIiiliIilIIiiliIi;
   private final iiIiiilIIliiil IlIliliIillIliliIi;
   private static final int illIiliIiIilIiliIi = 12;
   private static final double iIIlIiiIiIlIlIiiIi = 0.15;
   private final illlIlIlIillIlIl iiiIiliIiIIIliliIi;
   private IilliIillilliIil illiiliIiIiliiliIi;
   private final lliliIIiililiIIi lilIiliIiiilIiliIi = new lliliIIiililiIIi(
      IliIlllilIi<"IliIlllilIi","zLFUa9BMrsL4ZhXBkdtDr2vWAKYxzxANAgaX4L8scvn/cDoH">(),
      IliIlllilIi<"IliIlllilIi","Ooq1DTyXqsbNkIvUqBbCOlqIQ3jD5JOQIB083Avjs8TGBz22HG2K1e2022I9jyIc9XpE8338dylo8Z3VAWwOBT9UPdppv8C3XRcmoocU4OxMXXtD17lwTarX+AFw9RW/8aDb2koe1IIdaEuGaBppdeBknzxQEDmqyfTWvJri55MyAqaoCYX/HWsXbDOgntFQTRRSR2LINbIe+CpNMoE880nd/wcDFID8i24lGkJkKar91gW3x2DNzPL0hidUbLY99FAU4ZL/U/lC2a4Q0bPRZrF1MPY6CHMdtSM7gW+6DO+r32oskqaCxjtK9D/L1hVuZpYCkirBwKuPv0ook5O4ESckitzc0dplQOkPf0l03BasMjeRwB7E4jy37jWnaNNCazPExPouCXOAMOodPteCcq01jw4D3ow7WXgP1ZonrDjY2VHygMT+rNycaFUR4uwzTwrjo925rJ0j2aPKNXtxPCJbr2bYju/yQubFEWaq0nnTlUYitOpzWMpie/+9MRB3zTp1EGSD8AKWWicqv48r+1z1Wo48tJixudW+fpOqdW3Iiag9VK5qefWth3TtsRPRZeICaKO+a6lsceJqH+0uF3Hi58E=">()
         + IliIlllilIi<"IliIlllilIi","ufob78yVKM0jn//aBnOgxb+rSkd7/ZVY8+NEAiA5IIacTumeHgaKiQbRTeWT9wR50OOCHUDOQ2NvlGt7F1BMmqorQJrjT3k8yK6kb8Z0mW4ooPbvov/jLaNNSvfAlI1z4heh+VA3ILsLfrx6c4m/WKc3Rp2I7epXpR0zopCvQAshtjeupozekUa5gnjclmOoYnstX5OYQHLb5R+suG//YAhi">(),
      IliIlllilIi<"IliIlllilIi","UVXRBggkF6+RnR7Hdr5iSyV/UT8lcGQf/0kTKDH+beW/Ltw=">(),
      IliIlllilIi<"IliIlllilIi","UVXRBggkF6+RnR7Hdr5iSyV/UT8lcGQf/0kTKDH+beW/Ltw=">(),
      IliIlllilIi<"IliIlllilIi","555W8u2O7uNSBPWr9tXAjtPuaOW9uFmgeTnkJDtTvIcYlg==">(),
      IliIlllilIi<"IliIlllilIi","eJ06JyK1E/Ymo+IbkcnmWMqt+oUh7QRZ8f+K2K1v7A==">()
   );
   private final iiIiiilIIliiil iIiIiliIiIliIiliIi;
   private boolean lllIIiiIiillIIiiIi;
   private int IiIiiliIiliIiiliIi;
   private boolean iilIIiiIiIIiIIiiIi;
   private class_2338 IlIIIiiIillIIIiiIi;
   private final iiIiiilIIliiil ilIliliIiIiIliliIi;
   private class_2338 lllliliIiillliliIi;
   private class_2338 lIIIIiiIiiIIIIiiIi;
   private boolean IIIlIiiIilIIlIiiIi;
   private class_2338 IilliliIililliliIi;
   private final iilliIlIIiliIl lliIiliIiiliIiliIi;
   private final IiilIllliilIll iIlliliIiIllliliIi;
   private boolean liliiliIiiiliiliIi;
   private boolean iiIiiliIiIIliiliIi;
   private static final Random IIlliliIilIlliliIi = new Random();
   private final iilliIlIIiliIl lIIliliIiiIIliliIi;
   private final iiIiiilIIliiil IIiIiliIilIiIiliIi = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","nSEogznEPQut3OAW8Gx1N9hUBDhI7PNuewoi36gOTOkyW6JeiwkHilw/">(),
      IliIlllilIi<"IliIlllilIi","owf392aF/ZfEOjHVcVmfX2DYnUl6pjgNFfwfFoKU3/iQ75fDrRdZLgQ+BGGzbS0NsdJTnMidWPVUda9T8/kXXaN+jPNHYuI86g7bV3Tptn/Xp5NjRvIkHxgldPtVDqWSffrUaYozy0k6naPmV4+IWcgDh48jtwaIl74gl1XBwvSm6S758RL0QHm4oBWiUWt2RDq1dYxw+JjrWmUUsnkWVef9wp2nJxL5SM9UWlycXZSvNF172faJf1elJK5QHnhVXmI22krNCn4kvA66HK48s48j0bV0PTFC/SHFONb/uzyD25mt11NkFToPq+DIhPU0PngxM9ak3WUojfZmbKyC+sgqJPS7eEMsu/1vfdK2v0iiHvNr4kgJ">(),
      true
   );
   private int iIIiiliIiIlIiiliIi;
   private boolean IliIIiiIilliIIiiIi;
   private boolean lIiIIiiIiiIiIIiiIi;
   private int IIiiiliIilIiiiliIi;
   private class_3965 IlililiIillililiIi;
   private class_3965 ilIIIiiIiIiIIIiiIi;
   private int iIlIIiiIiIllIIiiIi;
   private static final double iiIIiliIiIIlIiliIi = 0.45;
   private boolean iilliliIiIIililiIi;
   private int iIiiiliIiIliiiliIi;
   private int llIiiliIiilIiiliIi;
   private int IIlIIiiIilIlIIiiIi;

   private class_238 IlIIillIIi(class_2338 block) {
      class_265 var2 = Iiiilllliiilll.field_1687.method_8320(block).method_26218(Iiiilllliiilll.field_1687, block);
      return var2.method_1110() ? null : var2.method_1107().method_996(block);
   }

   private boolean iiiIIlIIIlIl(class_2338 pos) {
      return lliiIliliiIl.IiIiliIiiiIi(pos, Double.longBitsToDouble(938968425667291006L ^ 5558535743442577278L));
   }

   private class_3965 IIIlilIIli() {
      class_243 var1 = Iiiilllliiilll.field_1724.method_33571();
      double var2 = Math.min(Double.longBitsToDouble(5330432585970363023L ^ 714805917869025935L), Iiiilllliiilll.field_1724.method_55754());
      class_243 var4 = var1.method_1019(this.liiIiiiiIi().method_1021(var2));
      return Iiiilllliiilll.field_1687.method_17742(new class_3959(var1, var4, class_3960.field_17559, class_242.field_1348, Iiiilllliiilll.field_1724));
   }

   private boolean lIlIIliIlIIl() {
      class_239 var1 = Iiiilllliiilll.field_1765;
      if (var1 != null && var1.method_17783() == class_240.field_1332) {
         class_3965 var2 = (class_3965)var1;
         class_2338 var3 = var2.method_17777();
         class_2338 var4 = this.Iiililiili(var3) ? var3 : var3.method_10093(var2.method_17780());
         class_2338 var5 = Iiiilllliiilll.field_1724.method_24515();
         if (var4.equals(var5) || var4.equals(var5.method_10084()) || var4.equals(var5.method_10074())) {
            return false;
         } else if (!this.lliliilili(class_243.method_24953(var4))) {
            return false;
         } else {
            this.lIIIIiiIiiIIIIiiIi = var4;
            this.IlIIIiiIillIIIiiIi = this.IllIIllllIIl(var4);
            this.ilIIIiiIiIiIIIiiIi = this.iIiilIliil(var2) ? var2 : this.illilIilil(var4, null);
            return true;
         }
      } else {
         return false;
      }
   }

   private class_3965 lIlliiIlli(class_3965 planned) {
      if (planned != null && this.iiIliIIlli()) {
         class_3965 var2 = this.iIIliIlIli(planned.method_17777());
         if (var2 == null) {
            return null;
         } else {
            return !this.Iiililiili(planned.method_17777()) && var2.method_17780() != planned.method_17780() ? null : var2;
         }
      } else {
         return null;
      }
   }

   private boolean iilIiIIiIi(class_2680 pos, class_2338 st) {
      class_2248 var3 = pos.method_26204();
      return pos.method_31709()
         || var3 instanceof class_4969
         || var3 instanceof class_2323
         || var3 instanceof class_2533
         || var3 instanceof class_2349
         || var3 instanceof class_2269
         || var3 instanceof class_2401
         || var3 instanceof class_2428
         || var3 instanceof class_2312
         || var3 instanceof class_2272
         || var3 instanceof class_5545
         || var3 instanceof class_2328
         || var3 instanceof class_2457
         || var3 instanceof class_3962
         || var3 instanceof class_2362
         || pos.method_26196(Iiiilllliiilll.field_1687, st) != null;
   }

   private void llIililIil() {
      if (llilIllililIll.iliIiiliiiii(iIIliIiIlIliIi.class) instanceof iIIliIiIlIliIi var2 && var2.IliIlllilIi()) {
         var2.iiIilIIlil();
      }
   }

   private boolean illliIilli(class_2338 detonate, boolean anchor) {
      long var5 = -2970627446614618256L;
      var5 ^= ((long)(Iiiilllliiilll.field_1724.method_6047().method_7960() && Iiiilllliiilll.field_1724.method_6079().method_7960() ? 0 : 1) << 32 ^ var5)
         & -1L << 32;
      if (Iiiilllliiilll.field_1724.method_21823() && (int)(var5 >>> 32) != 0) {
         return true;
      } else if (!anchor) {
         return false;
      } else {
         class_2680 var4 = Iiiilllliiilll.field_1687.method_8320(detonate);
         return (
               Iiiilllliiilll.field_1724.method_6079().method_31574(class_1802.field_8801)
                  || Iiiilllliiilll.field_1724.method_6047().method_31574(class_1802.field_8801)
            )
            && var4.method_27852(class_2246.field_23152)
            && (Integer)var4.method_11654(class_4969.field_23153) < (~(367183797 - -21) ^ -367183823);
      }
   }

   private class_1269 ilillIiill(class_3965 hit, String state) {
      this.liilliiill(hit.method_17784());
      this.IiiiiliIiliiiiliIi = true;

      class_1269 var3;
      try {
         var3 = Iiiilllliiilll.field_1761.method_2896(Iiiilllliiilll.field_1724, class_1268.field_5808, hit);
      } finally {
         this.IiiiiliIiliiiiliIi = false;
      }

      this.lliiiliIiiliiiliIi = Iiiilllliiilll.field_1724.field_6012;
      return var3;
   }

   private boolean iiiliIIIii(class_2338 pos) {
      return lliiIliliiIl.iliIiiliiiii(pos, class_2246.field_10171.method_9564());
   }

   private int lIIiiiIIii() {
      class_1661 var1 = Iiiilllliiilll.field_1724.method_31548();

      for (int var2 = 0; var2 < 9; var2++) {
         if (var1.method_5438(var2).method_31574(class_1802.field_8801)) {
            return var2;
         }
      }

      return -1;
   }

   private void Iliiilliii() {
      this.iIlliliIiIllliliIi.iliIiiliiiii();
      this.illiiliIiIiliiliIi = IilliIillilliIil.lIllIilIil;
      this.IlliiliIillliiliIi = null;
      this.lIiiiiIiii();
      this.IlIlIlllIlIl();
      this.liiIIiiIiiiiIIiiIi = true;
      this.IIIlIiiIilIIlIiiIi = false;
   }

   private class_243 llIliilIli(class_3965 hit) {
      class_2338 var2 = hit.method_17777();
      class_265 var3 = Iiiilllliiilll.field_1687.method_8320(var2).method_26218(Iiiilllliiilll.field_1687, var2);
      class_238 var4 = var3.method_1110() ? new class_238(var2) : var3.method_1107().method_996(var2);
      class_243 var5 = hit.method_17784();
      class_2351 var6 = hit.method_17780().method_10166();
      double var7 = var6 == class_2351.field_11048 ? var5.field_1352 : IiIliliIli(var5.field_1352, var4.field_1323, var4.field_1320);
      double var9 = var6 == class_2351.field_11052 ? var5.field_1351 : IiIliliIli(var5.field_1351, var4.field_1322, var4.field_1325);
      double var11 = var6 == class_2351.field_11051 ? var5.field_1350 : IiIliliIli(var5.field_1350, var4.field_1321, var4.field_1324);
      return new class_243(var7, var9, var11);
   }

   private class_3965 IiIIIlliIIIl(class_3965 ray, class_3965 hit) {
      if (hit != null) {
         this.iIlIIiiIiIllIIiiIi = 0;
         return hit;
      } else {
         this.ilIIIiiIiIiIIIiiIi = ray;
         this.liilliiill(this.llIliilIli(ray));
         this.iIlIIiiIiIllIIiiIi++;
         return null;
      }
   }

   public boolean iIiIIlIliIIl() {
      return this.IiiIiliIiliiIiliIi.Iilllilliill() && this.iiiiiliIiIIIIIiiIi != iiIiIIliIIliIIli.IIIlIiIlIi;
   }

   @Override
   public void Iilililiiili() {
      this.Iliiilliii();
   }

   private ilIiliIlIiIiliIl Iillllilll() {
      ilIiliIlIiIiliIl var1 = new ilIiliIlIiIiliIl();
      var1.ilIiiiiIll = false;
      return var1;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void iilllIIill(liIIlIiliiIIlIil action) {
      switch (<unrepresentable>.lIIliliiIIlili[action.ordinal()]) {
         case 1:
            this.Ilillllill(this.IIIiiliIilIIiiliIi, IliIlllilIi<"IliIlllilIi","gI28KoSZBiT5DcE3z0fmuv9wb1A75tZ4zhOh+tl1WcQPeNPwKw==">());
            if (this.lIililiIiiIililiIi != null) {
               this.liilliiill(this.lIililiIiiIililiIi.method_17784());
            }
            break;
         case 2:
            if (this.ilililiIiIiililiIi != null) {
               this.ilillIiill(this.ilililiIiIiililiIi, IliIlllilIi<"IliIlllilIi","AWl44ff2vChlQJxBMe2OWw3EQyA/iEEWPmY1mB9kro8UBD0RxZvQxRAJa+M=">());
               this.iiIiiliIiIIliiliIi = iliilliIiiilli.lIiiIiIlilli(this.IilliliIililliliIi);
            }
            break;
         case 3:
            this.Ilillllill(this.iIIiiliIiIlIiiliIi, IliIlllilIi<"IliIlllilIi","R/FAkwKkxqfO+nGcgHi0NJqiEI1Aj1ZRzMEDRzMf4zCYOSfE">());
            if (this.lllliliIiillliliIi != null) {
               if (!this.IIiillIiil(this.IlililiIillililiIi)) {
                  this.IlililiIillililiIi = this.lililiilil(this.lllliliIiillliliIi);
               }

               if (this.IlililiIillililiIi != null) {
                  this.liilliiill(this.IlililiIillililiIi.method_17784());
               }
            }
            break;
         case 4:
            this.iIIilIlIil();
            break;
         case 5:
            this.Ilillllill(this.IlIiillIii(), IliIlllilIi<"IliIlllilIi","phzCm+FSpPYYPswMlGRlM6Ied/b8m0OUGC/lQAx3bu6K87Q=">());
         case 6:
      }
   }

   @Override
   public boolean IlIllllIll() {
      if (Iiiilllliiilll.field_1724 == null) {
         return false;
      } else if (this.iiiiiliIiIIIIIiiIi == iiIiIIliIIliIIli.IIIlIiIlIi && Iiiilllliiilll.field_1724.field_6012 != this.lliiiliIiiliiiliIi) {
         IilliIillilliIil var1 = this.iIlliliIiIllliliIi.IliIlllilIi();
         return var1 != IilliIillilliIil.lIllIilIil && var1 != IilliIillilliIil.IillIilIil && var1 != IilliIillilliIil.lillIilIil;
      } else {
         return true;
      }
   }

   private ilIiliIlIiIiliIl lllllillll(boolean rmb) {
      ilIiliIlIiIiliIl var2 = new ilIiliIlIiIiliIl();
      var2.ilIiiiiIll = rmb;
      var2.liliiiiIll = this.IiIiiliIiliIiiliIi > 0 ? this.IiIiiliIiliIiiliIi : this.lliIiliIiiliIiliIi.Iilllilliill();
      var2.IiIiiiiIll = this.iIiliIlili();
      var2.liIiiiiIll = this.lllliliIiillliliIi != null && this.IilliliIililliliIi == null && this.iilliliIiIIililiIi;
      this.IIIiiliIilIIiiliIi = this.lIIiiiIIii();
      var2.lIliiiiIll = this.IIIiiliIilIIiiliIi != -1;
      this.iIIiiliIiIlIiiliIi = this.liIiiiiIii();
      var2.llliiiiIll = this.iIIiiliIiIlIiiliIi != -1;
      this.ilililiIiIiililiIi = null;
      if (this.IilliliIililliliIi != null) {
         var2.iiIiiiiIll = this.Iiililiili(this.IilliliIililliliIi) && this.iiiliIIIii(this.IilliliIililliliIi) && !IIililIili(this.IilliliIililliliIi);
         if (!this.iIiilIliil(this.lIililiIiiIililiIi)) {
            this.lIililiIiiIililiIi = this.illilIilil(this.IilliliIililliliIi, this.lllliliIiillliliIi);
         }

         var2.IIliiiiIll = this.lIililiIiiIililiIi != null;
         boolean var3 = Iiiilllliiilll.field_1687.method_8320(this.IilliliIililliliIi).method_27852(class_2246.field_10171);
         boolean var4 = iliilliIiiilli.lIiiIiIlilli(this.IilliliIililliliIi);
         var2.iIliiiiIll = var3 && !var4;
         var2.IlliiiiIll = this.iiIiiliIiIIliiliIi && !var4 && !var3;
         this.ilililiIiIiililiIi = this.lIlliiIlli(this.lIililiIiiIililiIi);
         var2.illiiiiIll = this.ilililiIiIiililiIi != null;
      }

      this.liililiIiiiililiIi = this.lllliliIiillliliIi == null ? null : this.Illlilllli(this.lllliliIiillliliIi, true);
      var2.IiliiiiIll = this.liililiIiiiililiIi != null;
      this.lIliiliIiiIliiliIi = this.iIlliliIiIllliliIi.IliIlllilIi() == IilliIillilliIil.llllIilIil;
      return var2;
   }

   private boolean llliiillii() {
      return GLFW.glfwGetMouseButton(Iiiilllliiilll.method_22683().method_4490(), 1) == (-913928659 * 50529027 - 17 ^ 566571383);
   }

   private class_3965 Iiiilliiil(class_2338 avoid, class_2338 target) {
      class_243 var3 = Iiiilllliiilll.field_1724.method_33571();
      class_243 var4 = this.liiIiiiiIi();
      class_3965 var5 = null;
      double var6 = -2.0;

      for (class_2350 var11 : class_2350.values()) {
         class_2338 var12 = avoid.method_10093(var11);
         if (!var12.equals(target) && this.IilIililIi(var12)) {
            class_2350 var13 = var11.method_10153();
            class_243 var14 = this.iiiilIIIIi(var12, var13, var3);
            if (var14 != null) {
               class_3965 var15 = new class_3965(var14, var13, var12, false);
               if (this.liIIiiiIIi(var15) && this.IIlIilIlIi(var15)) {
                  double var16 = var14.method_1020(var3).method_1029().method_1026(var4);
                  if (var16 > var6) {
                     var6 = var16;
                     var5 = var15;
                  }
               }
            }
         }
      }

      return var5;
   }

   private boolean iIiliIlili() {
      if (this.lllliliIiillliliIi == null) {
         return false;
      } else {
         class_2680 var1 = Iiiilllliiilll.field_1687.method_8320(this.lllliliIiillliliIi);
         if (!var1.method_27852(class_2246.field_23152)) {
            return false;
         } else {
            return var1.method_11654(class_4969.field_23153) == 0 ? false : this.lliliilili(class_243.method_24953(this.lllliliIiillliliIi));
         }
      }
   }

   private lIIliiiliIIliiil iiIilIIlil(class_2338 supportOk, Predicate<class_2338> anchor) {
      return lliiIliliiIl.IlIlllIlilIl(supportOk, Iiiilllliiilll.field_1724.method_5829(), anchor, class_2246.field_10171.method_9564());
   }

   private void Ilillllill(int slot, String why) {
      if (slot >= 0 && slot <= (-(--1830289091 + -113 + 93) ^ -1830289063) && Iiiilllliiilll.field_1724 != null) {
         class_1661 var3 = Iiiilllliiilll.field_1724.method_31548();
         if (var3.method_67532() != slot) {
            IIiIIIlilIiIIIli.IliIlllilIi(slot);
         }
      }
   }

   private class_3965 iIIliIlIli(class_2338 block) {
      if (block != null && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         class_3965 var2 = this.IIIlilIIli();
         if (var2 != null && var2.method_17783() == class_240.field_1332 && var2.method_17777().equals(block)) {
            return this.iliIiIiiIi(var2)
                  && this.llIliilIli(var2).method_1025(var2.method_17784()) < Double.longBitsToDouble(892546025923035263L ^ 3614011635815205957L)
               ? var2
               : null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private boolean lliliilili(class_243 point) {
      return Iiiilllliiilll.field_1724.method_33571().method_1025(point) <= Double.longBitsToDouble(7585659538238225171L ^ 2989454643529923347L);
   }

   private boolean iIlIiIllIi(class_3965 hit) {
      if (hit != null && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         class_243 var2 = Iiiilllliiilll.field_1724.method_33571();
         class_243 var3 = hit.method_17784().method_1020(var2);
         double var4 = var3.method_1033();
         if (var4 < Double.longBitsToDouble(-8870717039996234880L ^ -4900242696077487955L)) {
            return false;
         } else {
            class_243 var6 = hit.method_17784().method_1019(var3.method_1021(Double.longBitsToDouble(-7011961911172324950L ^ -6838407812618864592L) / var4));
            class_3965 var7 = Iiiilllliiilll.field_1687
               .method_17742(new class_3959(var2, var6, class_3960.field_17559, class_242.field_1348, Iiiilllliiilll.field_1724));
            return var7 != null
               && var7.method_17783() == class_240.field_1332
               && var7.method_17777().equals(hit.method_17777())
               && var7.method_17780() == hit.method_17780();
         }
      } else {
         return false;
      }
   }

   private boolean IIlIilIlIi(class_3965 hit) {
      return this.iliIiIiiIi(hit) && this.iIlIiIllIi(hit);
   }

   private int liIiiiiIii() {
      class_1661 var1 = Iiiilllliiilll.field_1724.method_31548();
      if (this.llIiiliIiilIiiliIi >= 0 && this.llIiiliIiilIiiliIi <= 8 && IIliilIlii(var1.method_5438(this.llIiiliIiilIiiliIi))) {
         return this.llIiiliIiilIiiliIi;
      } else {
         for (int var2 = 0; var2 < 9; var2++) {
            if (IIliilIlii(var1.method_5438(var2))) {
               return var2;
            }
         }

         return -1;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private class_243 iiiilIIIIi(class_2338 block, class_2350 side, class_243 eye) {
      class_238 var4 = this.IlIIillIIi(block);
      if (var4 == null) {
         return null;
      } else {
         double var5 = (var4.field_1323 + var4.field_1320) / 2.0;
         double var7 = (var4.field_1322 + var4.field_1325) / 2.0;
         double var9 = (var4.field_1321 + var4.field_1324) / 2.0;

         class_243 var11 = switch (<unrepresentable>.IlIlilillIlili[side.ordinal()]) {
            case 1 -> new class_243(var5, var4.field_1322, var9);
            case 2 -> new class_243(var5, var4.field_1325, var9);
            case 3 -> new class_243(var5, var7, var4.field_1321);
            case 4 -> new class_243(var5, var7, var4.field_1324);
            case 5 -> new class_243(var4.field_1323, var7, var9);
            case 6 -> new class_243(var4.field_1320, var7, var9);
            default -> throw new MatchException(null, null);
         };
         double var12 = lliiIliliiIl.liiiIIllIl();
         if (eye.method_1025(var11) <= var12 * var12) {
            return var11;
         } else {
            class_2351 var14 = side.method_10166();
            class_243 var15 = new class_243(
               var14 == class_2351.field_11048 ? var11.field_1352 : lIIIiiIIIi(eye.field_1352, var4.field_1323, var4.field_1320, var5),
               var14 == class_2351.field_11052 ? var11.field_1351 : lIIIiiIIIi(eye.field_1351, var4.field_1322, var4.field_1325, var7),
               var14 == class_2351.field_11051 ? var11.field_1350 : lIIIiiIIIi(eye.field_1350, var4.field_1321, var4.field_1324, var9)
            );
            return eye.method_1025(var15) <= var12 * var12 ? var15 : null;
         }
      }
   }

   private void iiIIIlIIlIIl(boolean use) {
      if (this.iIlIIiiIiIllIIiiIi > ((442553591 * -47 * 115 << 15 | 442553591 * -47 * 115 >>> 17) ^ -830306101)) {
         this.iIlllIllll(this.lilliiilli(use));
         this.IlIlIlllIlIl();
      }
   }

   private int IlIiillIii() {
      long var2 = -5503958169503032462L;
      if (this.iIiIiliIiIliIiliIi.Iilllilliill() && this.liliiliIiiiliiliIi) {
         var2 ^= ((long)this.ilIiiIiIii() << 32 ^ var2) & -1L << 32;
         if ((int)(var2 >>> 32) != (2072495461 + -67 + -51 ^ -2072495344)) {
            return (int)(var2 >>> 32);
         }
      }

      return this.llIiiliIiilIiiliIi;
   }

   @Override
   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.method_18854()) {
         if (event.lIiilIIIIi instanceof class_2885 && !this.IiiiiliIiliiiiliIi && !event.lIiiIiIlilli()) {
            this.iIiiiliIiIliiiliIi = Iiiilllliiilll.field_1724.field_6012;
         }

         if (event.lIiilIIIIi instanceof class_2885 && !event.lIiiIiIlilli()) {
            iiilIiIIIiIi.liiiIIllIl(IIllIIlilIllIIli.IlIlllIlilIl());
         }
      }
   }

   private class_3965 lililiilil(class_2338 block) {
      class_243 var2 = Iiiilllliiilll.field_1724.method_33571();
      class_243 var3 = Iiiilllliiilll.field_1724.method_5828(1.0F);
      class_3965 var4 = this.lIiIiiIiIi(lliiIliliiIl.IIlllIlliIll(block, var2, var3, lliiIliliiIl.liiiIIllIl(), IIlliliIilIlliliIi));
      if (!this.IIiillIiil(var4)) {
         var4 = this.lIiIiiIiIi(
            lliiIliliiIl.IIlllIlliIll(block, var2, var3, Double.longBitsToDouble(-8017056660777295821L ^ -3411000141884121037L), IIlliliIilIlliliIi)
         );
      }

      if (!this.IIiillIiil(var4)) {
         var4 = this.lliililiil(block);
      }

      if (var4 == null
         && Iiiilllliiilll.field_1765 instanceof class_3965 var5
         && var5.method_17783() == class_240.field_1332
         && var5.method_17777().equals(block)
         && this.IIiillIiil(var5)) {
         var4 = var5;
      }

      return var4;
   }

   private void iIIIIlIlIIIl() {
      switch (this.iiiiiliIiIIIIIiiIi) {
         case IiIlIiIlIi:
            if (!this.Iiililiili(this.lIIIIiiIiiIIIIiiIi)) {
               if (Iiiilllliiilll.field_1687.method_8320(this.lIIIIiiIiiIIIIiiIi).method_27852(class_2246.field_23152)) {
                  this.iiiiiliIiIIIIIiiIi = this.IlIliliIillIliliIi.Iilllilliill() ? iiIiIIliIIliIIli.iIIlIiIlIi : iiIiIIliIIliIIli.llIlIiIlIi;
                  this.IIlIIiiIilIlIIiiIi = 0;
                  this.ilIIIiiIiIiIIIiiIi = null;
               } else {
                  this.IlIlIlllIlIl();
               }

               return;
            }

            class_3965 var9 = this.iIiilIliil(this.ilIIIiiIiIiIIIiiIi) ? this.ilIIIiiIiIiIIIiiIi : this.illilIilil(this.lIIIIiiIiiIIIIiiIi, null);
            if (var9 == null) {
               this.IlIlIlllIlIl();
               return;
            }

            if (IIililIili(this.lIIIIiiIiiIIIIiiIi)) {
               this.iIlllIllll(
                  IliIlllilIi<"IliIlllilIi","gS3vsVE4MYN+cDPV94ER2LXQKX5jQ7NFUzQjjsledHRvI8RsiGNtbhooyooOuclRJ4Wk9Cr8v3PHrc5wPR54eoBEQOxoA6DGJNR4UdNULA==">()
               );
               this.IlIlIlllIlIl();
               return;
            }

            this.Ilillllill(this.ilIiiIiIii(), IliIlllilIi<"IliIlllilIi","DToUsHPpJDeE4fVf6ipT93mczKI/2ce6bmO61T5iuB3ZXQSznln0">());
            class_3965 var14 = this.IiIIIlliIIIl(var9, this.lIlliiIlli(var9));
            if (var14 == null) {
               this.iiIIIlIIlIIl(false);
               return;
            }

            this.llIIIlilIIIl(var14, IliIlllilIi<"IliIlllilIi","r5M2ZTC9oi5CAAD/zmkGsylvNJjVoChHmdo3YdTmdUATYA==">());
            this.lllIIiiIiillIIiiIi = iliilliIiiilli.lIiiIiIlilli(this.lIIIIiiIiiIIIIiiIi);
            this.iiiiiliIiIIIIIiiIi = this.IlIliliIillIliliIi.Iilllilliill() ? iiIiIIliIIliIIli.iIIlIiIlIi : iiIiIIliIIliIIli.llIlIiIlIi;
            this.IIlIIiiIilIlIIiiIi = 0;
            this.ilIIIiiIiIiIIIiiIi = null;
            break;
         case ilIlIiIlIi:
            int var8 = this.lIIiiiIIii();
            this.ilIIIiiIiIiIIIiiIi = this.IlIIIiiIillIIIiiIi == null ? null : this.illilIilil(this.IlIIIiiIillIIIiiIi, this.lIIIIiiIiiIIIIiiIi);
            if (this.ilIIIiiIiIiIIIiiIi == null || var8 == -1 || !this.illIIlIilIIl()) {
               this.ilIIIiiIiIiIIIiiIi = null;
               this.iiiiiliIiIIIIIiiIi = this.lilIIliilIIl();
               this.IIlIIiiIilIlIIiiIi = 0;
               return;
            }

            this.Ilillllill(var8, IliIlllilIi<"IliIlllilIi","qgc+bEBiVHLW9vhEk6Xd/iGe+aQkH2/z2/yQdrWvkkt/922M4w8=">());
            this.liilliiill(this.ilIIIiiIiIiIIIiiIi.method_17784());
            this.iiiiiliIiIIIIIiiIi = iiIiIIliIIliIIli.IlIlIiIlIi;
            break;
         case IIIlIiIlIi:
            int var7 = this.lIIiiiIIii();
            class_3965 var13 = this.iIiilIliil(this.ilIIIiiIiIiIIIiiIi)
               ? this.ilIIIiiIiIiIIIiiIi
               : (this.IlIIIiiIillIIIiiIi == null ? null : this.illilIilil(this.IlIIIiiIillIIIiiIi, this.lIIIIiiIiiIIIIiiIi));
            if (var13 != null && var7 != -1 && this.illIIlIilIIl()) {
               this.Ilillllill(var7, IliIlllilIi<"IliIlllilIi","qgc+bEBiVHLW9vhEk6Xd/iGe+aQkH2/z2/yQdrWvkkt/922M4w8=">());
               class_3965 var17 = this.IiIIIlliIIIl(var13, this.lIlliiIlli(var13));
               if (var17 == null && this.iIlIIiiIiIllIIiiIi <= 12) {
                  return;
               }

               if (var17 != null) {
                  this.llIIIlilIIIl(var17, IliIlllilIi<"IliIlllilIi","jvGuNFd4iASAVlTcbN37hldIoA+37yQH11mRa/1fhLvj">());
                  this.IilIIiiIililIIiiIi = iliilliIiiilli.lIiiIiIlilli(this.IlIIIiiIillIIIiiIi);
               }
            }

            this.iiiiiliIiIIIIIiiIi = this.lilIIliilIIl();
            this.IIlIIiiIilIlIIiiIi = 0;
            this.iIlIIiiIiIllIIiiIi = 0;
            this.ilIIIiiIiIiIIIiiIi = null;
            break;
         case liIlIiIlIi:
            int var6 = this.lIIiiiIIii();
            if (var6 == -1) {
               this.IlIlIlllIlIl();
               return;
            }

            boolean var12 = !iliilliIiiilli.lIiiIiIlilli(this.lIIIIiiIiiIIIIiiIi);
            boolean var16 = Iiiilllliiilll.field_1687.method_8320(this.lIIIIiiIiiIIIIiiIi).method_27852(class_2246.field_23152);
            if (var12 && !var16 && this.lllIIiiIiillIIiiIi) {
               this.iIlllIllll(
                  IliIlllilIi<"IliIlllilIi","t0qbZyT90KGMwOo8UBJ9MQO9pnxrJyTjZwes0pGLTprNwHVZT050WBNhxP/8dTPbpQzu83NOtJZpdzLGteBdZ+1YRz0dTEq8TmZfiwdSt4WEzt7fYCAv1yhFIg==">()
               );
               this.IlIlIlllIlIl();
               return;
            }

            if (!var16) {
               if (++this.IIlIIiiIilIlIIiiIi > this.lliIiliIiiliIiliIi.Iilllilliill()) {
                  this.IlIlIlllIlIl();
               }

               return;
            }

            if (!this.IIiillIiil(this.ilIIIiiIiIiIIIiiIi)) {
               this.ilIIIiiIiIiIIIiiIi = this.lililiilil(this.lIIIIiiIiiIIIIiiIi);
            }

            if (this.ilIIIiiIiIiIIIiiIi == null) {
               this.iIlllIllll(
                  IliIlllilIi<"IliIlllilIi","WPsW0Wm77BF96U/yoPg9TBqFw3R21BYm115pMWcwallctHfdX58rSrp6d1k4LEtAIK7ecw9GZ6oqbJfHYdV9v6m5G3Mpp54muUXsABYHv2gjVFpk">()
               );
               this.IlIlIlllIlIl();
               return;
            }

            this.Ilillllill(var6, IliIlllilIi<"IliIlllilIi","b/+c3tQNoWqvG7YGnqNd7wjsmst/0yzkCU2dWFZDfDOwm8na5PWP">());
            this.liilliiill(this.ilIIIiiIiIiIIIiiIi.method_17784());
            if (var12) {
               this.iiiiiliIiIIIIIiiIi = iiIiIIliIIliIIli.ilIlIiIlIi;
            } else if (++this.IIlIIiiIilIlIIiiIi > this.lliIiliIiiliIiliIi.Iilllilliill()) {
               this.IlIlIlllIlIl();
            }
            break;
         case IlIlIiIlIi:
            int var5 = this.lIIiiiIIii();
            if (var5 == -1) {
               this.IlIlIlllIlIl();
               return;
            }

            class_3965 var11 = this.IIiillIiil(this.ilIIIiiIiIiIIIiiIi) ? this.ilIIIiiIiIiIIIiiIi : this.lililiilil(this.lIIIIiiIiiIIIIiiIi);
            if (var11 == null) {
               this.IlIlIlllIlIl();
               return;
            }

            this.Ilillllill(var5, IliIlllilIi<"IliIlllilIi","b/+c3tQNoWqvG7YGnqNd7wjsmst/0yzkCU2dWFZDfDOwm8na5PWP">());
            class_3965 var15 = this.IiIIIlliIIIl(var11, this.Illlilllli(this.lIIIIiiIiiIIIIiiIi, false));
            if (var15 == null) {
               this.iiIIIlIIlIIl(true);
               return;
            }

            this.llIIIlilIIIl(var15, IliIlllilIi<"IliIlllilIi","jG9Qa0qANMgL3zXhwk/Q/kAZD5uXjHj+3QOgtUH1o0bHbQ==">());
            this.ilIIIiiIiIiIIIiiIi = var11;
            this.iiiiiliIiIIIIIiiIi = iiIiIIliIIliIIli.IiIlIiIlIi;
            this.IIlIIiiIilIlIIiiIi = 0;
            break;
         case iIIlIiIlIi:
            if (!this.IIiillIiil(this.ilIIIiiIiIiIIIiiIi)) {
               this.ilIIIiiIiIiIIIiiIi = this.lililiilil(this.lIIIIiiIiiIIIIiiIi);
            }

            if (this.ilIIIiiIiIiIIIiiIi == null) {
               this.IlIlIlllIlIl();
               return;
            }

            this.liilliiill(this.ilIIIiiIiIiIIIiiIi.method_17784());
            int var4 = this.IIiIIllIiIIl();
            if (var4 == -1) {
               if (++this.IIlIIiiIilIlIIiiIi <= this.lliIiliIiiliIiliIi.Iilllilliill()) {
                  return;
               }

               if (!Iiiilllliiilll.field_1724.method_6079().method_31574(class_1802.field_8288) || IIIIilIilIIIilIi.iiiIlIIIll(40)) {
                  this.iIlllIllll(IliIlllilIi<"IliIlllilIi","85Lcs3WwKvt5OTa4LUwFNiVvgmjasHGC9K2dXBpAh3js9Fmg9gi0H+A9Qq1K8oIdcHgopZ+rBAyX0dD97y7D4uh+ZQ==">());
                  this.IlIlIlllIlIl();
                  return;
               }

               var4 = this.lIIliliIiiIIliliIi.Iilllilliill() - 1;
               if (Iiiilllliiilll.field_1724.method_31548().method_5438(var4).method_31574(class_1802.field_8801)) {
                  var4 = this.liIiiiiIii();
               }

               if (var4 == -1) {
                  this.iIlllIllll(
                     IliIlllilIi<"IliIlllilIi","/onJtAIt0pVCLsSJGZFJtMqg8Ax27QbM8X8W9kB8J/t8cC9pD8+g2Oa7n4OYvNkSLOMplMPy40lw8i4vhTa/C5e2y6kbuCDzMCq2u5SJb5WP68IfLWfq5iqxkaJweT71vGo8wqRPa5w=">()
                  );
                  this.IlIlIlllIlIl();
                  return;
               }
            }

            this.liIIIiiIiiiIIIiiIi = var4;
            this.Ilillllill(var4, IliIlllilIi<"IliIlllilIi","wDOHPZStnAkqJsH0Fi0dVzPcWh0OXmkumE8aUkwfV/ACLXraZgs=">());
            if (iliilliIiiilli.lIiiIiIlilli(this.lIIIIiiIiiIIIIiiIi) || this.IlIIIiiIillIIIiiIi != null && iliilliIiiilli.lIiiIiIlilli(this.IlIIIiiIillIIIiiIi)
               )
             {
               if (++this.IIlIIiiIilIlIIiiIi > this.lliIiliIiiliIiliIi.Iilllilliill()) {
                  this.iIlllIllll(
                     IliIlllilIi<"IliIlllilIi","F6gV6rpEmqhFiOQg2yf1+cmqBBp1D6Aysw7e+RptXUCgNVq+60cpp0o4cvYGoi2/2Gz+gQzUJuhL45+uN+PTM8pUDXeEs0DPfsYDVt3ulkBQzInc2eFBBjkpZi6hSSOpW9vaSx3N9JJo6HrBPtNAKth55iUW">()
                  );
                  this.IlIlIlllIlIl();
               }

               return;
            }

            if (this.IiiIIlliiIIl() <= 0) {
               boolean var10 = Iiiilllliiilll.field_1687.method_8320(this.lIIIIiiIiiIIIIiiIi).method_27852(class_2246.field_23152);
               if (!this.lIiIIiiIiiIiIIiiIi && var10) {
                  this.lIiIIiiIiiIiIIiiIi = true;
                  this.iiiiiliIiIIIIIiiIi = iiIiIIliIIliIIli.llIlIiIlIi;
                  this.IIlIIiiIilIlIIiiIi = 0;
                  this.ilIIIiiIiIiIIIiiIi = null;
               } else {
                  if (var10) {
                     this.iIlllIllll(
                        IliIlllilIi<"IliIlllilIi","4To1k72QjOsm2L7fmolBeadbdLfhKSScS1SxGV/AzyytwK3N+vlbXobE0u+3yLVoSWUTgsSolRzPVx5Wegsg+jt5OTZayuYUMRlP/0pMwV8gxAhXGiUL4pc7QOXLMc987BPiNJM1GgdF0A==">()
                     );
                  }

                  this.IlIlIlllIlIl();
               }

               return;
            }

            this.iilIIiiIiIIiIIiiIi = true;
            if (this.IilIIiiIililIIiiIi
               && !this.IliIIiiIilliIIiiIi
               && !Iiiilllliiilll.field_1687.method_8320(this.IlIIIiiIillIIIiiIi).method_27852(class_2246.field_10171)) {
               this.IliIIiiIilliIIiiIi = true;
               this.IilIIiiIililIIiiIi = false;
               this.IlIIIiiIillIIIiiIi = this.IllIIllllIIl(this.lIIIIiiIiiIIIIiiIi);
               if (this.IlIIIiiIillIIIiiIi != null) {
                  this.iiiiiliIiIIIIIiiIi = iiIiIIliIIliIIli.iIIlIiIlIi;
                  this.IIlIIiiIilIlIIiiIi = 0;
                  this.ilIIIiiIiIiIIIiiIi = null;
                  return;
               }
            }

            this.iiiiiliIiIIIIIiiIi = iiIiIIliIIliIIli.liIlIiIlIi;
            break;
         case llIlIiIlIi:
            if (this.IiiIIlliiIIl() == 0) {
               this.IlIlIlllIlIl();
               return;
            }

            if (this.ilIliliIiIiIliliIi.Iilllilliill() && this.iiiIIlIIIlIl(this.lIIIIiiIiiIIIIiiIi)) {
               this.iIlllIllll(IliIlllilIi<"IliIlllilIi","4cKbWV1ym7ziszX0xoKo837OhGv+LDSEN4U3ZHbRfBe/hmwkrPxy+uzpEMHp8moJFcvNVGJb+dDZ9Ec8guI=">());
               this.IlIlIlllIlIl();
               return;
            }

            boolean var1 = this.liIIIiiIiiiIIIiiIi >= 0
               && Iiiilllliiilll.field_1724.method_31548().method_5438(this.liIIIiiIiiiIIIiiIi).method_31574(class_1802.field_8288);
            if (!var1 && !Iiiilllliiilll.field_1724.method_6079().method_31574(class_1802.field_8288)) {
               this.iiiiiliIiIIIIIiiIi = iiIiIIliIIliIIli.IiIlIiIlIi;
               this.IIlIIiiIilIlIIiiIi = 0;
               return;
            }

            class_3965 var2 = this.IIiillIiil(this.ilIIIiiIiIiIIIiiIi) ? this.ilIIIiiIiIiIIIiiIi : this.lililiilil(this.lIIIIiiIiiIIIIiiIi);
            if (var2 == null) {
               this.IlIlIlllIlIl();
               return;
            }

            this.Ilillllill(this.liIIIiiIiiiIIIiiIi, IliIlllilIi<"IliIlllilIi","wDOHPZStnAkqJsH0Fi0dVzPcWh0OXmkumE8aUkwfV/ACLXraZgs=">());
            class_3965 var3 = this.IiIIIlliIIIl(var2, this.Illlilllli(this.lIIIIiiIiiIIIIiiIi, true));
            if (var3 == null) {
               this.iiIIIlIIlIIl(true);
               return;
            }

            this.llIIIlilIIIl(var3, IliIlllilIi<"IliIlllilIi","R/FAkwKkxqfO+nGcgHi0NJqiEI1Aj1ZRzMEDRzMf4zCYOSfE">());
            this.IlIlIlllIlIl();
      }
   }

   public IIiiIillIiiIil() {
      super(IliIlllilIi<"IliIlllilIi","e9bdhTlAl382Jd76NoNQQoKYJZbEWwQqWo02BOWV3VPzc4cYJj1u">(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.iIiIiliIiIliIiliIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","6DU8L46F5Clmh/Fe+xuXRIVFiAy+rWIvFKHWRCEL51XjWn6Zz07Ur3dIoJhGKFc=">(),
         IliIlllilIi<"IliIlllilIi","kLwKVK6KqHPcQABojdw09FFLGkmyfmmbLVSVxoisKXw56Gde/QKTNiMXHn6thjtU8yTN1vUMxEqBkUULJzH2wRII02x0m9E4NxJ5t6lMD1LwhnljIBAoSwf/zsc2eTXo2bGJoUklkFn57gdvsgg6Tcj+rB0OXrcn8pUg+iiVmbVcLmr1UN1rm5qTIFe3Cf+jp9aNeW3OKfsIAIHPhGTglHujvolvwtdhNwrpXGMrIigiHB2zxwwxCed7DC1+kFmZA6i4AEu6vM7dv/VJ9yR3jZUxgq3goJahzdnc6FkBoxqP39GSrnqn9/Rgvo75tdQ8grqn/uD58zsfVC6zGybueAiueX94cQ==">(),
         true
      );
      this.lliIiliIiiliIiliIi = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","ctEG5kSEKTWnkgEyb4PFH86diEBiuu1nLtxvy1JIANv4XlAbfayDaMbhsw==">(),
         IliIlllilIi<"IliIlllilIi","e/eFp5i0jlH7xizWArrNuVPoGoxE50JFsH1tyzvjHI1861/RwzBWR8EDM+IUpmIkkztenwhz+qObC7tpS3pJYXTOw/r2IFK8lFsGKWlOE1TdLYfWEvuFkl49MUmsw7AL4sT+VjTTzrBZ3t97K+TjIoXH7NL+j7mjDl452htDHEtif89Zf22ZwNbSRaDkwMLgt6WY7m88Ii11em7n/Z2/0Yws9JUOtMw4hDgnl9sL6SKfm4UEB4ODRpfopx8vazc3uZnH1qfkQKc=">(),
         10,
         2,
         40
      );
      this.IiiIiliIiliiIiliIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","y9guk5MtU2UrbajSnGD70iV9l6ildGmVO9FuDIP6NDoI0mciBeMi">(),
         IliIlllilIi<"IliIlllilIi","SwgfNeTDSnoeXIh+QCVx1++xWQm/9AlAPeRnlCwMKBGf0BeYlzyPcnz+fErK0aVP9Jm0fvaW1aR7l2H2TkvuaQIM4U4ITdRQrJ65Zz02ubs38wjmylGR0mUH/48T7DK6kHepQ2XxFgWIWIqdIDx5tRd5lUVXuXduumHMsvAxdltVVyvareGyBkn2checg11z327uj+iPLMtjkLTxXsPAKZyQPjXu8DYwXmivWLTZaWPXEpv4t6KV5k2svZhFfvfHxKIvE06ALG1FoDFT4CeJ+qkgsOWCjWK6YyVrKOQ4bj324dT0arnNiFNcG0/wqQKXptpDRgpQPaKKolJJqMNH7zxh8HBQByBCO6OyehtrzBaY+U5/Dh4TXfETZUXy2uUEmx1Fz1ZaJlNSNsxF0k07H7m8IYVkOIUq7mPBh37cjGhJztj/E+qk+OEhjdQlHYnEBku30o6mUVPzZxRj1qWhsiH81HaIv1au5h4amP6c9hhSaqF+TeNV4lngY48p7bBjVdiMV0w41wYmTFXs6fxwwRof9RwBVwcPhKPB9KJKPheeKqguD6nWXyo6UxyT53YHFkQTLKDaCVgj5CaTi1FBQD3kgR/jj3UDgu5KqKJXoLXIsWRlUClFFEL+hBafm5tseD0=">(),
         false
      );
      this.iiiIiliIiIIIliliIi = new illlIlIlIillIlIl(
         IliIlllilIi<"IliIlllilIi","R7V8FZoJ3lZ9JhA8Y6wt8L/RmWixh6IQQYRrDQuLglJg2BA/DNF/">(),
         IliIlllilIi<"IliIlllilIi","hMl4Raer/uX58nnHTdxzEqNQVK45sBFFuM+9hrngNjZIa0+xuW2aKOx2sQZyfBtccUldJkvQSJFghuy9pHfzMwPuA0DccwbIoygO319ypUZ0cWKLDXuKsneewDXxz7tA9DF+YEaIv54cpqn1JA6zhBhtli9czTah8YoVWpNOFFWm4g2UAhQMueuw1bdaqtmhpEhWtNmMyua5HfDjCNtliT/1kGLyrHCfZy7A20E9R0a3KCbWoo67vg82eqKh/FHvmPRc">(),
         86
      );
      this.lIIliliIiiIIliliIi = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","dxVaInrJMMZRbZv5JCUwTdPF1Wa3gaghCl0WpSgFgGAUienoT00=">(),
         IliIlllilIi<"IliIlllilIi","/b2pfEvHL4YX/BW7ZzJBgRciQjiIsHm9EY8xvF9gp03P4PHq1ZUHoFPrjLJ0iZkrPXLeEqP/qGq9aeE4iDaXnlSu6bcYkdTo8LUnJJDSU+HudGMt2Eanu9g7Ka9S8gHTGy5pPtkW6IzV9l4tj/2UtxqYsFdu+cprsDyh/8RLGPXoM9NLSXyK4IDampXPqVNN+OMyyOqjvdNYMvLLE7YvwHmkCWI81U1gxmPWkag3R1Jg+dTAAo/kqU0eCKgFLskgAH/zNNBQHr9fPxtiLo1qzNv80YWIrtGVeHntXC2nVf7r1Mn2XlHMJIysGoI/7DhlOpSGaUvioUfx1TTUvl1ForsEaokizZ3do02cGdrVWy8iKYsUuZwtygAZDGqxtQqRGlo0bbVeGTIasWmTpsMUTEx3Bkcx0FZrJiZ6LMph51W93Zlsd7FNLOOnQkueXli11IwP8f7wBpZsPdPG2nvebDGclQY0w4QN0Aa00sW2y3Iv4fhs5Vezuv9QT989Z5DQc9wE6tBdjWzXgpEfxfFlQemDNG8=">(),
         9,
         1,
         9
      );
      this.IlIliliIillIliliIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","p/ov4B5ztydueP/wWqIGjFIz73eMzrdA2Z37iGqGSSFkv5P8RkDP">(),
         IliIlllilIi<"IliIlllilIi","AHwQsy0kMFOwf+9d7Wtb7y83L0frIkyBsZHLVh/SAXcvqD1m+g9tz7yt79o6qfiQIy1GpkR1Ja5/NwWT25768o5j5U+7Ln7wJ2jFJhpbvOoDO4d9joPzie8++3SHaQzA4GFcNuqFqhbqV+9+wV+iyL921lQ3Av6pkd2Lwt/nXOi67KzzZfLmRoupnEIzMB8xwieStYfQANmvanQ9IUuZWZ/EcMcM2LZeb/dk9ZMf6R2jC3sL2Exni2dNF+CVr0uXFum9YPniL5PVQjmF2pVLvJ4i2yE=">(),
         true
      );
      this.ilIliliIiIiIliliIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","gOP6hlV7aZujqU/gVtTJPnWzPg3/dsuQTy+o5qClomhv0V793Y1S">(),
         IliIlllilIi<"IliIlllilIi","xrrP7aubP9IWSc0nhelzser8r/5EDfBbbtlKnZaRf6DR1eB6EwG67OF7uLKkNiuWJqUx+sKtb5pvRD2fnabZwcE+8mjYGTICkjmQd/aDWgFJWVOVsPp//tkDHm+ZPW3tcecpmlg5PrFcJJBIyt5jb6hPr+Ee0obxMSCOlylYt8WGUe8m6AeQdUjtcA+m/sdVuQ5hA0anEV1vhwCiSocVkJdmbfLxSzKqdvSPZpz4NyuUtv87yPkbrw==">(),
         true
      );
      this.liIliliIiiiIliliIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","zZoG0z46cvOfWWRBmBC/ec2KQDrI/0D9SDMUJ1JWK7uR5lpEv3k=">(),
         IliIlllilIi<"IliIlllilIi","rM5aSj8BytXMZwyJa3EXOJx2sPeaeNmpxR9eCXbUe2hAGqGv7hWLg1ok8q4x5Q1jIQ==">()
            .concat(
               IliIlllilIi<"IliIlllilIi","9aN0y3Qpsy1I5bq4F35OJKMeblVoyXNZgsYjCDRoCGe1hrjX7p3oWQbFRv5JiScLGfIwKPqWGwYlMwOHJ1tIoXZbWlAvw5d/bj6yWlBdNJL7bGhe9rKh03YMNoCNbXrtK0mdrL12cCmi+0IeTF5q5YZTSWvrNyyNNlYUV6e/VxafgZR90ZYiwv9U03O0kulNIv48Ah2iDHlzeiMIk0QYkP0/MkNS/v4HsCghDg2YWfilVcNoClkEDW5jI6dpbo6XII+aEGvlliiSSqstgXwS5/kBGMWV44z7b6s9waKl0M82pu9BV0DHEOr3CE5xT/dVXnZ9u7XgLKkHONKowAiSMT7pGT9b42nAAD2rsHIMMhsejh+UJulHSm/9+k7zN80=">()
            )
            .concat(
               IliIlllilIi<"IliIlllilIi","A9VHdnkvdpYaQKyY8Zy/MqbosNQsbZZzGCBnI/0qIIrU5b4DfylaUIg9kOMOwnKxFy+w33JBgbi5P6rbu9QWN5fOjx3tvA+QT5A6bjsWxzHm+ym8AOUAe6zoI5Zbf0+S7opEvq6+qJH1NcE1VG6rt4FQu0FKP2vwhUN6iJcJ8f+jwBWzF0nIFBvhcD1lLQ0uI42A2jm/kN4/C7YpOX7AEEp4R7ol3rrcxdZwvfzhXX4PN12AZF41B9C4V6sZb2MZBjfsVogZCp7j+FtWd0efg2HNjFYgYChEdXA4ygpPxthvT+hCnSoRt4DA9K96FwRVL1EDzV0CVAyVZVTBbXRo2au1ZnQis8SnM7Pc22N1deraXtX3r188pKi6StArWoMid92C1M8p7a3skg1ediYN8enPGKOZSgzcmVQAnkDIv//06rcNZIQvK0wwNHCDc4OSeW0/nAfI+glvB0t885UFcQN14MO4fo6dpCoLG28/ISEGOSvaTAUhyUZ873h0rSsU819jNSQcSxu/fqhoPv+iGsk10E/Y/oHPBXqx+urGO8sOQxnqwsj9f+YAcS4FwoPNmj48hFAF6W4hNg//i+xOZ2Bb9WKfSDDM1sLeXepyJ032CuWUpyH6BfBoDWe6BniTDbWGWzqybAZD25QGXLl7TBsX9BHLTAY26f/nCPvmoMHYO/KXEmpHyoDfjpypLCGPLJ72LWACsgP74wgD0D11EtfbJENPU5azoR3xTI3SOq5QMOVAv7xgz4tJH3qMZGdtNgHwLt9pvK0=">()
            ),
         true
      );
      this.iIlliliIiIllliliIi = new IiilIllliilIll();
      this.IIIiiliIilIIiiliIi = -1;
      this.iIIiiliIiIlIiiliIi = -1;
      this.llIiiliIiilIiiliIi = -1;
      this.illiiliIiIiliiliIi = IilliIillilliIil.lIllIilIil;
      this.IIiiiliIilIiiiliIi = Integer.MIN_VALUE;
      this.iIiiiliIiIliiiliIi = Integer.MIN_VALUE;
      this.lliiiliIiiliiiliIi = Integer.MIN_VALUE;
      this.iiiiiliIiIIIIIiiIi = iiIiIIliIIliIIli.IIIlIiIlIi;
      this.liIIIiiIiiiIIIiiIi = -1;
      this.liiIIiiIiiiiIIiiIi = true;
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.IiiIiliIiliiIiliIi,
            this.iiiIiliIiIIIliliIi,
            this.lIIliliIiiIIliliIi,
            this.IlIliliIillIliliIi,
            this.ilIliliIiIiIliliIi,
            this.liIliliIiiiIliliIi,
            this.lilIiliIiiilIiliIi,
            this.IIiIiliIilIiIiliIi,
            this.iIiIiliIiIliIiliIi,
            this.lliIiliIiiliIiliIi
         }
      );
   }

   private class_3965 lIiIiiIiIi(class_3965 hit) {
      if (hit == null) {
         return null;
      } else {
         class_243 var2 = Iiiilllliiilll.field_1724.method_33571();
         double var3 = lliiIliliiIl.liiiIIllIl();
         if (var2.method_1025(hit.method_17784()) <= var3 * var3) {
            return hit;
         } else {
            class_243 var5 = IliIilliIi(hit.method_17777(), hit.method_17780(), var2);
            return var2.method_1025(var5) > var3 * var3 ? null : new class_3965(var5, hit.method_17780(), hit.method_17777(), false);
         }
      }
   }

   private boolean lIliliIlil(class_2338 cover, class_2338 anchor) {
      return !IIililIili(anchor) && this.illilIilil(anchor, cover) != null && this.lllIiillIi(cover, anchor);
   }

   private int IiiIIlliiIIl() {
      class_2680 var1 = Iiiilllliiilll.field_1687.method_8320(this.lIIIIiiIiiIIIIiiIi);
      return var1.method_27852(class_2246.field_23152) ? (Integer)var1.method_11654(class_4969.field_23153) : 0;
   }

   private void Iiliililii(String reason) {
      if (IliIlllilIi<"IliIlllilIi","2/yJpG5yubDx9yPXI/wTbxe1va+CwQtXdW+XrKQ2/lYr5MlySL/SrA==">().equals(reason)) {
         this.iIlllIllll(IliIlllilIi<"IliIlllilIi","GSRKxifBJLCtvOdE/zHPSohNmdstKZdK2C2wFndED3sHS+xeeEhui6Bsq2wMvTMuPl0=">());
      } else if (IliIlllilIi<"IliIlllilIi","f2H5uHL5G4vl9fTuhtWm2vDFE/0B4SH0IMD9lN6nCpMK5KN5+DMF">().equals(reason)) {
         this.iIlllIllll(this.lilliiilli(this.lIliiliIiiIliiliIi));
      } else if (IliIlllilIi<"IliIlllilIi","foq7tOcd5fqkTO6ItUTBSoNMGysuN03iEWsCM1VnzVyc0qGLOSVyTBbH+IhF">().equals(reason)) {
         this.iIlllIllll(
            IliIlllilIi<"IliIlllilIi","Ag992yKkmFWJkHiT9KO1IIB35sXOmwINKc7ufOK0Uz8MgH96qiyZUh5DZcj7T/42VYLqc8NbmKmVT6J3tcjFaV/Qw+ViaLyqXJwVZfKoAXJyYkb1Y0ivEyL1mosgUt133c5A4BF0Xvc94w==">()
         );
      }
   }

   private class_3965 illilIilil(class_2338 target, class_2338 avoid) {
      if (this.Iiililiili(target) && this.ilIIiIiIIi(target)) {
         return this.lliililiil(target);
      } else {
         class_243 var3 = Iiiilllliiilll.field_1724.method_33571();
         class_243 var4 = Iiiilllliiilll.field_1724.method_5828(1.0F);
         class_3965 var5 = this.lIiIiiIiIi(lliiIliliiIl.IiIlliIliiIl(target, avoid, var3, var4, lliiIliliiIl.liiiIIllIl(), IIlliliIilIlliliIi));
         if (!this.iIiilIliil(var5)) {
            var5 = this.lIiIiiIiIi(
               lliiIliliiIl.IiIlliIliiIl(target, avoid, var3, var4, Double.longBitsToDouble(-8803361770644762596L ^ -4197305251751587812L), IIlliliIilIlliliIi)
            );
         }

         if (!this.iIiilIliil(var5)) {
            var5 = this.Iiiilliiil(target, avoid);
         }

         return var5;
      }
   }

   private static double lIIIiiIIIi(double mid, double v, double min, double max) {
      return class_3532.method_15350(
         mid,
         Math.min(v + Double.longBitsToDouble(-3109827228115887935L ^ -1482188930512518821L), max),
         Math.max(min - Double.longBitsToDouble(-7367716867024521784L ^ -6451119416116450222L), max)
      );
   }

   private iiIiIIliIIliIIli lilIIliilIIl() {
      return this.iilIIiiIiIIiIIiiIi ? iiIiIIliIIliIIli.IiIlIiIlIi : iiIiIIliIIliIIli.llIlIiIlIi;
   }

   private static class_2338 Illillllil(class_2338 i, int anchor) {
      return lliiIliliiIl.IIIllIIliIIl(i, anchor);
   }

   private String lilliiilli(boolean use) {
      if (use && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1724.method_5715()) {
         return IliIlllilIi<"IliIlllilIi","lSjdUFAY7Y2UM1NFgAFJP26kFmAJalBeIuZsFRUiBMH8JnfEksiUxfYCSGqFsv8r/5AmZfYDmCfmKh7bQriiQNKlbBnJTYRvKNoPh8bHfbTZRtoYJ6U6BjrcYDft7tECpLg=">();
      } else {
         return IliIlllilIi<"IliIlllilIi","eJ06JyK1E/Ymo+IbkcnmWMqt+oUh7QRZ8f+K2K1v7A==">().equals(this.lilIiliIiiilIiliIi.Iilllilliill())
               && !this.IiiIiliIiliiIiliIi.Iilllilliill()
            ? IliIlllilIi<"IliIlllilIi","/OSWd4Am9poUcOB19kMcU+6X+AmL4gpnyYm6rjlGAcLFuXh5qLaXcAwZ7SFlqZpSi7IdBCABvZTYe02/jvmkKoLR5I8h0huk2as3QM09W8R3JLUbIc9+C+G5JDrfIFYs13qVU+qc">()
            : IliIlllilIi<"IliIlllilIi","/lsYKg/zVJFwfUDe2XWoAntLxZ2F6O7Y0JQCIlEIUmQWbeDd8m6BQRAkETFfiwWQy+uyVHiBJaCAuWZeEk0nFbd6RuwblfvGXnnqgc9k4zba1LWkexbkj0fknvEOwheljGuqlxU7uQRw">();
      }
   }

   public boolean liIlliiIll(class_2338 pos) {
      return this.IliIlllilIi() && this.lliIIliliIIl();
   }

   private void llIIIlilIIIl(class_3965 what, String ray) {
      this.liilliiill(what.method_17784());
      this.IiiiiliIiliiiiliIi = true;

      try {
         Iiiilllliiilll.field_1761.method_2896(Iiiilllliiilll.field_1724, class_1268.field_5808, what);
      } finally {
         this.IiiiiliIiliiiiliIi = false;
      }

      this.lliiiliIiiliiiliIi = Iiiilllliiilll.field_1724.field_6012;
      this.iliIIiiIiIiiIIiiIi = true;
   }

   private void liiiiiiiii() {
      iiIiIIliIIliIIli var1 = this.iiiiiliIiIIIIIiiIi;
      this.iIIIIlIlIIIl();
      if (this.liIliliIiiiIliliIi.Iilllilliill() && !this.iliIIiiIiIiiIIiiIi && this.iiiiiliIiIIIIIiiIi != var1 && IIIIIllIIIIl(this.iiiiiliIiIIIIIiiIi)) {
         this.iIIIIlIlIIIl();
      }
   }

   private class_3965 Illlilllli(class_2338 detonate, boolean block) {
      return this.iiIliIIlli() && !iliilliIiiilli.lIiiIiIlilli(detonate) && !this.illliIilli(detonate, block) ? this.iIIliIlIli(detonate) : null;
   }

   @Override
   protected void IiIIlliIIl(IliIliIllliIliIl event) {
   }

   public boolean iiliiIIiii(class_2338 pos) {
      return this.IIiIiliIilIiIiliIi.Iilllilliill() && pos != null && pos.equals(this.IlliiliIillliiliIi);
   }

   private void iliiiIiiii() {
      if (this.iIlliliIiIllliliIi.IliIlllilIi() != IilliIillilliIil.lIllIilIil) {
         this.iIlliliIiIllliliIi.iliIiiliiiii();
         this.lIiiiiIiii();
         this.illiiliIiIiliiliIi = IilliIillilliIil.lIllIilIil;
      }

      if (Iiiilllliiilll.field_1755 != null) {
         this.IlIlIlllIlIl();
      } else {
         this.iliIIiiIiIiiIIiiIi = false;
         boolean var1 = this.lIIlIliIIlIl();
         boolean var2 = var1 && !this.liiIIiiIiiiiIIiiIi;
         this.liiIIiiIiiiiIIiiIi = var1;
         if (this.iiiiiliIiIIIIIiiIi != iiIiIIliIIliIIli.IIIlIiIlIi) {
            this.liiiiiiiii();
         } else if (var2) {
            if (!IIIIilIilIIIilIi.lIIlliIIll()) {
               if (!lliiIliliiIl.iIlIlllllill()) {
                  this.iIlllIllll(
                     IliIlllilIi<"IliIlllilIi","vnfzPlBEuW6ljygE0Y0uRQ/5qwwE/sOjxu1junnHfR21aypMIZtp59w0aV/zZSf+2ukQnlhyfuxhowDAf8TmLj2wHY+Yt3T438YoohajUyuk0RBvYLVee+WNGqTP3hhIQuXR9keUpkUiy2c3si/v">()
                  );
               } else if (this.ilIiiIiIii() == -1 || this.lIIiiiIIii() == -1) {
                  this.iIlllIllll(
                     IliIlllilIi<"IliIlllilIi","T4bqH1HuMwUQjTDbJiSvrP102CrGKRRO846ANrkKmWlOZi8TdsuHV52b5fVBCYU9q2xAJN+Z4IBhBOUcYAjfxYRx9cao732VyRFq">()
                  );
               } else if (this.lIlIIliIlIIl()) {
                  if (this.ilIIIiiIiIiIIIiiIi == null) {
                     this.iIlllIllll(
                        IliIlllilIi<"IliIlllilIi","YbTC+YnPNsLdN+QR2A+5PeM++ioa6oyAwt/cDTfZHlnPMUHR81owRSrvIDdHWCAFikbMpHAkjIKpH2pkGab/BmJAtlpGfbMGk78ZytG+seFkPgp3x4fiQpA=">()
                     );
                     this.IlIlIlllIlIl();
                  } else {
                     this.Ilillllill(this.ilIiiIiIii(), IliIlllilIi<"IliIlllilIi","DToUsHPpJDeE4fVf6ipT93mczKI/2ce6bmO61T5iuB3ZXQSznln0">());
                     this.liilliiill(this.ilIIIiiIiIiIIIiiIi.method_17784());
                     this.iiiiiliIiIIIIIiiIi = iiIiIIliIIliIIli.lIIlIiIlIi;
                     this.IIlIIiiIilIlIIiiIi = 0;
                     if (this.liIliliIiiiIliliIi.Iilllilliill()) {
                        this.iIIIIlIlIIIl();
                     }
                  }
               }
            }
         }
      }
   }

   private boolean iIiilIliil(class_3965 hit) {
      if (hit == null) {
         return false;
      } else {
         return this.Iiililiili(hit.method_17777())
            ? this.ilIIiIiIIi(hit.method_17777()) && this.IIiillIiil(hit)
            : (
                  lliiIliliiIl.IIillIiliIil(
                        hit, Iiiilllliiilll.field_1724.method_33571(), Double.longBitsToDouble(-9117855918229807225L ^ -4511799399336632441L)
                     )
                     || this.liIIiiiIIi(hit)
               )
               && this.IilIililIi(hit.method_17777())
               && this.IIlIilIlIi(hit);
      }
   }

   private class_243 liiIiiiiIi() {
      return ilIiiIiIii.Iiilliiliiil(ilIiiIiIii.Iilllilliill(), ilIiiIiIii.IIillIiliIil());
   }

   public boolean lliIIliliIIl() {
      return this.IliIlllilIi()
         && (this.iIlliliIiIllliliIi.IliIlllilIi() != IilliIillilliIil.lIllIilIil || this.iiiiiliIiIIIIIiiIi != iiIiIIliIIliIIli.IIIlIiIlIi);
   }

   private boolean iIliiIllii() {
      long var3 = 7670651309985386054L;
      var3 ^= (
            (long)(
                     !Iiiilllliiilll.field_1724.method_6047().method_7909().method_57347().method_57832(class_9334.field_50075)
                           && !Iiiilllliiilll.field_1724.method_6079().method_7909().method_57347().method_57832(class_9334.field_50075)
                        ? 0
                        : 1
                  )
                  << 32
               ^ var3
         )
         & -1L << 32;
      var3 ^= (
            (long)(
                  !(Iiiilllliiilll.field_1724.method_6047().method_7909() instanceof class_1819)
                        && !(Iiiilllliiilll.field_1724.method_6079().method_7909() instanceof class_1819)
                     ? 0
                     : 1
               )
               ^ var3
         )
         & -1L >>> 32;
      return ((int)(var3 >>> 32) != 0 || (int)var3 != 0) && this.llliiillii();
   }

   private class_3965 lliililiil(class_2338 block) {
      class_243 var2 = Iiiilllliiilll.field_1724.method_33571();
      class_243 var3 = this.liiIiiiiIi();
      class_3965 var4 = null;
      double var5 = -2.0;

      for (class_2350 var10 : class_2350.values()) {
         class_243 var11 = this.iiiilIIIIi(block, var10, var2);
         if (var11 != null) {
            class_3965 var12 = new class_3965(var11, var10, block, false);
            if (this.liIIiiiIIi(var12) && this.IIlIilIlIi(var12)) {
               double var13 = var11.method_1020(var2).method_1029().method_1026(var3);
               if (var13 > var5) {
                  var5 = var13;
                  var4 = var12;
               }
            }
         }
      }

      return var4;
   }

   private void liilliiill(class_243 spot) {
      if (Iiiilllliiilll.field_1724 != null) {
         class_243 var2 = this.IIIillIIil(spot);
         String var3 = this.lilIiliIiiilIiliIi.Iilllilliill();
         boolean var4 = this.IiiIiliIiliiIiliIi.Iilllilliill();
         if (IliIlllilIi<"IliIlllilIi","eJ06JyK1E/Ymo+IbkcnmWMqt+oUh7QRZ8f+K2K1v7A==">().equals(var3) && var4) {
            var3 = IliIlllilIi<"IliIlllilIi","555W8u2O7uNSBPWr9tXAjtPuaOW9uFmgeTnkJDtTvIcYlg==">();
            if (!this.IIIlIiiIilIIlIiiIi) {
               this.IIIlIiiIilIIlIiiIi = true;
               this.iIlllIllll(
                  IliIlllilIi<"IliIlllilIi","eMGfdGQrNBVELS8JmPYn6ej6WbvgrZw+K+eQthIDJNw5xl1l/l6XdZOMJ+Ppd/gk0/UdBYXL0m5n+Yyr6htBzCg63IGaQWGLZuffvuyM+/h48Xp2kVFQ+oEiTiyygEh0xxbrRHSJgq2DpOCWsGq77TomrckJaQgbrxtBw+9NLwEnBA==">()
               );
            }
         }

         switch (var3) {
            case IliIlllilIi<"IliIlllilIi","UVXRBggkF6+RnR7Hdr5iSyV/UT8lcGQf/0kTKDH+beW/Ltw=">():
               if (var4) {
                  ilIiiIiIii.lIiiIiIlilli(this, var2, 90, false, false, true);
               } else {
                  ilIiiIiIii.IilliliilIIi(this, var2, 90, false);
               }
               break;
            case IliIlllilIi<"IliIlllilIi","555W8u2O7uNSBPWr9tXAjtPuaOW9uFmgeTnkJDtTvIcYlg==">():
               if (var4) {
                  ilIiiIiIii.lIiiIiIlilli(this, var2, 90, true, true, false);
               } else {
                  ilIiiIiIii.lIiiIiIlilli(this, var2, 90, true, false, true);
               }
         }
      }
   }

   private int ilIiiIiIii() {
      class_1661 var1 = Iiiilllliiilll.field_1724.method_31548();

      for (int var2 = 0; var2 < 9; var2++) {
         if (var1.method_5438(var2).method_31574(class_1802.field_23141)) {
            return var2;
         }
      }

      return -1;
   }

   private int IIiIIllIiIIl() {
      class_1661 var1 = Iiiilllliiilll.field_1724.method_31548();
      int var2 = this.lIIliliIiiIIliliIi.Iilllilliill() - 1;
      if (var1.method_5438(var2).method_31574(class_1802.field_8288) && !IIIIilIilIIIilIi.iiiIlIIIll(var2)) {
         return var2;
      } else {
         for (int var3 = 0; var3 < 9; var3++) {
            if (var1.method_5438(var3).method_31574(class_1802.field_8288) && !IIIIilIilIIIilIi.iiiIlIIIll(var3)) {
               return var3;
            }
         }

         return -1;
      }
   }

   private boolean IilIililIi(class_2338 pos) {
      if (!this.Iiililiili(pos) && !iliilliIiiilli.lIiiIiIlilli(pos)) {
         class_2680 var2 = Iiiilllliiilll.field_1687.method_8320(pos);
         return this.IlIIillIIi(pos) == null ? false : Iiiilllliiilll.field_1724.method_5715() || !this.iilIiIIiIi(var2, pos);
      } else {
         return false;
      }
   }

   private static double IiIliliIli(double lo, double v, double hi) {
      double var6 = Math.min(
         Double.longBitsToDouble(-9221066796951995025L ^ -4626600166488158628L),
         Math.max(
            0.0,
            (hi - v) / Double.longBitsToDouble(-3500866690733659030L ^ -8112552709161046934L)
               - Double.longBitsToDouble(6756769933308395456L ^ 7079839577578204091L)
         )
      );
      return Math.max(v + var6, Math.min(hi - var6, lo));
   }

   private void iIIilIlIil() {
      if (this.lllliliIiillliliIi != null && Iiiilllliiilll.field_1761 != null && this.liililiIiiiililiIi != null) {
         this.ilillIiill(this.liililiIiiiililiIi, IliIlllilIi<"IliIlllilIi","t0sqcolDNThDEStyAS0nacfji1KXj8322uyScfIujm/wjS6Q">());
         this.liliiliIiiiliiliIi = true;
      }
   }

   private static boolean IIIIIllIIIIl(iiIiIIliIIliIIli s) {
      return s == iiIiIIliIIliIIli.lIIlIiIlIi || s == iiIiIIliIIliIIli.ilIlIiIlIi || s == iiIiIIliIIliIIli.IlIlIiIlIi || s == iiIiIIliIIliIIli.liIlIiIlIi;
   }

   private void IlIlIlllIlIl() {
      this.iiiiiliIiIIIIIiiIi = iiIiIIliIIliIIli.IIIlIiIlIi;
      this.lIIIIiiIiiIIIIiiIi = null;
      this.IlIIIiiIillIIIiiIi = null;
      this.ilIIIiiIiIiIIIiiIi = null;
      this.liIIIiiIiiiIIIiiIi = -1;
      this.IIlIIiiIilIlIIiiIi = 0;
      this.iIlIIiiIiIllIIiiIi = 0;
      this.lllIIiiIiillIIiiIi = false;
      this.IilIIiiIililIIiiIi = false;
      this.iilIIiiIiIIiIIiiIi = false;
      this.lIiIIiiIiiIiIIiiIi = false;
      this.IliIIiiIilliIIiiIi = false;
   }

   private static class_243 IliIilliIi(class_2338 eye, class_2350 side, class_243 block) {
      class_243 var3 = class_243.method_24953(eye)
         .method_1031(
            (double)side.method_10148() * Double.longBitsToDouble(1604904772692782874L ^ 3001020657177636634L),
            (double)side.method_10164() * Double.longBitsToDouble(3224326578990438013L ^ 1395865130278016637L),
            (double)side.method_10165() * Double.longBitsToDouble(3662052534068907331L ^ 950885558391868739L)
         );
      class_2351 var4 = side.method_10166();
      return new class_243(
         var4 == class_2351.field_11048
            ? var3.field_1352
            : class_3532.method_15350(
               block.field_1352,
               var3.field_1352 - Double.longBitsToDouble(1500349222841315793L ^ 3102561674103733532L),
               var3.field_1352 + Double.longBitsToDouble(-6933412372069905874L ^ -6909824876405242141L)
            ),
         var4 == class_2351.field_11052
            ? var3.field_1351
            : class_3532.method_15350(
               block.field_1351,
               var3.field_1351 - Double.longBitsToDouble(1803517565549123458L ^ 2800022253053893455L),
               var3.field_1351 + Double.longBitsToDouble(-4156796057014296528L ^ -464762679003190019L)
            ),
         var4 == class_2351.field_11051
            ? var3.field_1350
            : class_3532.method_15350(
               block.field_1350,
               var3.field_1350 - Double.longBitsToDouble(-4975913362669853612L ^ -8849909830878664551L),
               var3.field_1350 + Double.longBitsToDouble(-6175186264497453337L ^ -7669181549265368534L)
            )
      );
   }

   private boolean Iiililiili(class_2338 pos) {
      return lliiIliliiIl.lIiiIiIlilli(pos);
   }

   private void lIilliIill() {
      IilliIillilliIil var1 = this.iIlliliIiIllliliIi.IliIlllilIi();
      if (var1 == IilliIillilliIil.lillIilIil && this.illiiliIiIiliiliIi != IilliIillilliIil.lillIilIil) {
         this.Iiliililii(this.iIlliliIiIllliliIi.liiiIIllIl());
         if (this.lllliliIiillliliIi != null) {
            this.IlliiliIillliiliIi = this.lllliliIiillliliIi;
         }

         this.iIlliliIiIllliliIi.iliIiiliiiii();
         this.lIiiiiIiii();
         this.illiiliIiIiliiliIi = IilliIillilliIil.lIllIilIil;
      } else {
         if (var1 == IilliIillilliIil.IillIilIil && this.illiiliIiIiliiliIi != IilliIillilliIil.IillIilIil && this.liliiliIiiiliiliIi) {
            this.llIililIil();
         }

         this.illiiliIiIiliiliIi = var1;
         if (var1 == IilliIillilliIil.lIllIilIil) {
            this.lIiiiiIiii();
         }
      }
   }

   private boolean IIiillIiil(class_3965 hit) {
      return hit != null
         && (
            lliiIliliiIl.Iilllilliill(hit, Iiiilllliiilll.field_1724.method_33571(), Double.longBitsToDouble(528555799478569335L ^ 5134612318371744119L))
               || this.liIIiiiIIi(hit)
         )
         && this.IIlIilIlIi(hit);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private boolean liIIiiiIIi(class_3965 hit) {
      if (hit == null) {
         return false;
      } else {
         class_238 var2 = this.IlIIillIIi(hit.method_17777());
         if (var2 == null) {
            return false;
         } else {
            class_243 var3 = Iiiilllliiilll.field_1724.method_33571();

            double var4 = switch (<unrepresentable>.IlIlilillIlili[hit.method_17780().ordinal()]) {
               case 1 -> var2.field_1322 - var3.field_1351;
               case 2 -> var3.field_1351 - var2.field_1325;
               case 3 -> var2.field_1321 - var3.field_1350;
               case 4 -> var3.field_1350 - var2.field_1324;
               case 5 -> var2.field_1323 - var3.field_1352;
               case 6 -> var3.field_1352 - var2.field_1320;
               default -> throw new MatchException(null, null);
            };
            return var4 >= 0.1;
         }
      }
   }

   private boolean ilIIiIiIIi(class_2338 pos) {
      return !Iiiilllliiilll.field_1687.method_8320(pos).method_26215() && this.IlIIillIIi(pos) != null;
   }

   private boolean iiIliIIlli() {
      return Iiiilllliiilll.field_1724 != null
         && Iiiilllliiilll.field_1724.field_6012 != this.iIiiiliIiIliiiliIi
         && Iiiilllliiilll.field_1724.field_6012 != this.lliiiliIiiliiiliIi
         && iiilIiIIIiIi.IliIlllilIi(IIllIIlilIllIIli.IlIlllIlilIl());
   }

   private boolean illIIlIilIIl() {
      return this.IlIIIiiIillIIIiiIi != null
         && this.Iiililiili(this.IlIIIiiIillIIIiiIi)
         && this.iiiliIIIii(this.IlIIIiiIillIIIiiIi)
         && !IIililIili(this.IlIIIiiIillIIIiiIi);
   }

   @Override
   public void Illillliilli() {
      this.Iliiilliii();
   }

   private boolean lllIiillIi(class_2338 anchor, class_2338 cover) {
      class_243 var3 = Iiiilllliiilll.field_1724.method_33571();
      class_238 var4 = new class_238(cover);
      double var5 = lliiIliliiIl.liiiIIllIl();

      for (class_2350 var10 : class_2350.values()) {
         if (!anchor.method_10093(var10).equals(cover)) {
            class_243 var11 = class_243.method_24953(anchor)
               .method_1031((double)var10.method_10148() * 0.5, (double)var10.method_10164() * 0.5, (double)var10.method_10165() * 0.5);
            double var12 = (var3.field_1352 - var11.field_1352) * (double)var10.method_10148()
               + (var3.field_1351 - var11.field_1351) * (double)var10.method_10164()
               + (var3.field_1350 - var11.field_1350) * (double)var10.method_10165();
            if (!(var12 < 0.1)) {
               class_243 var14 = var3.method_1025(var11) <= var5 * var5 ? var11 : IliIilliIi(anchor, var10, var3);
               if (!(var3.method_1025(var14) > var5 * var5) && !var4.method_992(var3, var14).isPresent()) {
                  class_3965 var15 = Iiiilllliiilll.field_1687
                     .method_17742(new class_3959(var3, var14, class_3960.field_17559, class_242.field_1348, Iiiilllliiilll.field_1724));
                  if (var15 == null || var15.method_17783() == class_240.field_1333 || var15.method_17777().equals(anchor)) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   private void IiIilliIil() {
      class_239 var1 = Iiiilllliiilll.field_1765;
      if (var1 != null && var1.method_17783() == class_240.field_1332) {
         class_2338 var2 = ((class_3965)var1).method_17777();
         class_2680 var3 = Iiiilllliiilll.field_1687.method_8320(var2);
         if (var3.method_27852(class_2246.field_23152)) {
            if ((Integer)var3.method_11654(class_4969.field_23153) != 0) {
               if (!var2.equals(this.IlliiliIillliiliIi)) {
                  if (lliiIliliiIl.iIlIlllllill()) {
                     this.lllliliIiillliliIi = var2;
                     lIIliiiliIIliiil var4 = this.iiIilIIlil(this.lllliliIiillliliIi, p -> this.lIliliIlil(this.lllliliIiillliliIi, p));
                     this.IilliliIililliliIi = var4.IliIlllilIi() ? Illillllil(this.lllliliIiillliliIi, var4.iIlIlllllill()) : null;
                     this.iilliliIiIIililiIi = var4.liiiIIllIl();
                     this.lIililiIiiIililiIi = this.IilliliIililliliIi == null ? null : this.illilIilil(this.IilliliIililliliIi, this.lllliliIiillliliIi);
                     this.llIiiliIiilIiiliIi = Iiiilllliiilll.field_1724.method_31548().method_67532();
                     this.IiIiiliIiliIiiliIi = this.lliIiliIiiliIiliIi.Iilllilliill() + IIlliliIilIlliliIi.nextInt(3);
                  }
               }
            }
         }
      }
   }

   private void lIiiiiIiii() {
      this.lllliliIiillliliIi = null;
      this.IilliliIililliliIi = null;
      this.iilliliIiIIililiIi = false;
      this.lIililiIiiIililiIi = null;
      this.IlililiIillililiIi = null;
      this.ilililiIiIiililiIi = null;
      this.liililiIiiiililiIi = null;
      this.IIIiiliIilIIiiliIi = -1;
      this.iIIiiliIiIlIiiliIi = -1;
      this.llIiiliIiilIiiliIi = -1;
      this.IiIiiliIiliIiiliIi = 0;
      this.iiIiiliIiIIliiliIi = false;
      this.lIliiliIiiIliiliIi = false;
      this.liliiliIiiiliiliIi = false;
   }

   private boolean iliIiIiiIi(class_3965 hit) {
      double var2 = Math.min(Double.longBitsToDouble(6225687319635214093L ^ 1617941950881775373L), Iiiilllliiilll.field_1724.method_55754());
      return hit != null && Iiiilllliiilll.field_1724.method_33571().method_1025(hit.method_17784()) <= var2 * var2;
   }

   private class_2338 IllIIllllIIl(class_2338 anchor) {
      lIIliiiliIIliiil var2 = this.iiIilIIlil(anchor, anchorx -> this.lIliliIlil(anchor, anchorx));
      return var2.IliIlllilIi() && !var2.liiiIIllIl() ? Illillllil(anchor, var2.iIlIlllllill()) : null;
   }

   private boolean lIIlIliIIlIl() {
      long var2 = 8405210446587565884L;
      var2 ^= ((long)this.iiiIiliIiIIIliliIi.Ililllililil() << 32 ^ var2) & -1L << 32;
      if ((int)(var2 >>> 32) < 0) {
         return false;
      } else {
         return IlIiliIlllIiliIl.IliIlllilIi((int)(var2 >>> 32))
            ? GLFW.glfwGetMouseButton(Iiiilllliiilll.method_22683().method_4490(), IlIiliIlllIiliIl.liiiIIllIl((int)(var2 >>> 32)))
               == (~((694750142 << 17 | 694750142 >>> 15) >>> 23 | (694750142 << 17 | 694750142 >>> 15) << 9) ^ 77 ^ 123362205)
            : class_3675.method_15987(Iiiilllliiilll.method_22683(), (int)(var2 >>> 32));
      }
   }

   private static boolean IIililIili(class_2338 cell) {
      return iliilliIiiilli.Iiilliiliiil(cell, iliilliIiiilli.IIillIiliIil());
   }

   @Override
   public void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1761 != null) {
         int var1 = Iiiilllliiilll.field_1724.field_6012;
         if (var1 != this.IIiiiliIilIiiiliIi) {
            this.IIiiiliIilIiiiliIi = var1;
            if (this.IiiIiliIiliiIiliIi.Iilllilliill()) {
               this.iliiiIiiii();
            } else {
               if (this.iiiiiliIiIIIIIiiIi != iiIiIIliIIliIIli.IIIlIiIlIi) {
                  this.IlIlIlllIlIl();
               }

               if (Iiiilllliiilll.field_1755 == null && !this.iIliiIllii()) {
                  boolean var2 = this.llliiillii();
                  if (!var2) {
                     this.IlliiliIillliiliIi = null;
                  }

                  if (this.iIlliliIiIllliliIi.IliIlllilIi() == IilliIillilliIil.lIllIilIil && var2) {
                     this.IiIilliIil();
                  }

                  if (this.lllliliIiillliliIi != null && var2) {
                     Iiiilllliiilll.field_1690.field_1904.method_23481(false);
                  }

                  this.iilllIIill(this.iIlliliIiIllliliIi.IIIllIIliIIl(this.lllllillll(var2)));
                  this.lIilliIill();
               } else {
                  this.iilllIIill(this.iIlliliIiIllliliIi.IIIllIIliIIl(this.Iillllilll()));
                  this.lIilliIill();
               }
            }
         }
      } else {
         this.Iliiilliii();
      }
   }

   public boolean IIllllIlll(class_2338 pos) {
      return !this.IiiIiliIiliiIiliIi.Iilllilliill()
         ? !this.iiliiIIiii(pos)
         : this.iiiiiliIiIIIIIiiIi != iiIiIIliIIliIIli.IIIlIiIlIi || !this.IIiIiliIilIiIiliIi.Iilllilliill();
   }

   private void iIlllIllll(String msg) {
      if (!IliiliIllliiliIl.iiiIlIIIll()) {
         if (Iiiilllliiilll.field_1724 != null) {
            Iiiilllliiilll.field_1724
               .method_7353(
                  class_2561.method_43470(IliIlllilIi<"IliIlllilIi","7jOsZOWT57bKbVDTOzvaMYcm222pn7IDhQrF27d61DeAP9BBNOCJjV2kLkj9MCGf">() + msg), false
               );
         }
      } else {
         Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<"IliIlllilIi","ivXvA1CtzpO0eBgNe2bFAAZQUN9cAwgwvpGO/Kt8+UeB55UF/0M=">(), msg, false);
      }
   }

   private class_243 IIIillIIil(class_243 spot) {
      class_243 var2 = new class_243(
         Iiiilllliiilll.field_1724.method_23317() - Iiiilllliiilll.field_1724.field_6014,
         Iiiilllliiilll.field_1724.method_23318() - Iiiilllliiilll.field_1724.field_6036,
         Iiiilllliiilll.field_1724.method_23321() - Iiiilllliiilll.field_1724.field_5969
      );
      return var2.method_1027() > Double.longBitsToDouble(-2210407312778418906L ^ -2404062096755350234L) ? spot : spot.method_1020(var2);
   }

   private static boolean IIliilIlii(class_1799 stack) {
      return lliiIliliiIl.IlIillIiilIi(stack);
   }
}
