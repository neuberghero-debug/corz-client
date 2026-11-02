package gg.corz;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1661;
import net.minecraft.class_1747;
import net.minecraft.class_1799;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_2350.class_2351;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

public final class liliIliiiliIli {
   private static final int liIIllIIIl = 64;
   private static final double iiIIllIIIl = 20.25;
   private IIlIIIIilIlIIIIi lllIllIIIl;
   private class_2338 illIllIIIl;
   private class_2338 IilIllIIIl;
   private final class_310 IIlIllIIIl;
   private final LinkedHashSet<class_2338> IllIllIIIl;
   private final IliIIlIllliIIlIl iIlIllIIIl = new IliIIlIllliIIlIl();
   private int IIiIllIIIl;
   private final iilIiiIiIIiIiiIi lIlIllIIIl;
   private int iilIllIIIl;
   private int lilIllIIIl;

   public boolean Iilllilliill(class_1937 w, class_2338 pos) {
      if (w != null && pos != null && this.IIlIllIIIl.field_1761 != null && this.IIlIllIIIl.field_1724 != null) {
         class_746 var3 = this.IIlIllIIIl.field_1724;
         class_239 var4 = this.IIlIllIIIl.field_1765;
         if (var4 instanceof class_3965 var5
            && var4.method_17783() == class_240.field_1332
            && var5.method_17777().method_10093(var5.method_17780()).equals(pos)) {
            class_1269 var6 = this.IIlIllIIIl.field_1761.method_2896(var3, class_1268.field_5808, var5);
            if (var6.method_23665()) {
               var3.method_6104(class_1268.field_5808);
            }

            this.lIlIllIIIl.iIiliiiIIi = 4;
            this.IilliliilIIi(pos);
            return true;
         }

         class_243 var7 = IIillIiliIil(w, var3, pos);
         if (var7 != null) {
            this.iIlIllIIIl.IilliliilIIi(var3, var7, 32.0F);
         }

         return false;
      } else {
         return false;
      }
   }

   public void iIlIlllllill() {
      this.IllIllIIIl.clear();
   }

   private static class_243 IIillIiliIil(class_1937 p, class_746 w, class_2338 pos) {
      long var26 = -1706771608808943830L;
      long var28 = 6065538733823010055L;
      class_243 var3 = w.method_33571();
      class_243 var4 = null;
      double var5 = 20.25;
      class_2350[] var7 = class_2350.values();
      var26 ^= ((long)var7.length << 32 ^ var26) & -1L << 32;

      for (long var31 = var26 ^ (0L ^ var26) & -1L >>> 32; (int)var31 < (int)(var31 >>> 32); var31 ^= (var31 ^ var31 + (long)1) & -1L >>> 32) {
         class_2350 var10 = var7[(int)var31];
         class_2338 var11 = pos.method_10093(var10);
         class_2680 var12 = p.method_8320(var11);
         if (!var12.method_26215() && var12.method_26227().method_15769() && var12.method_26216()) {
            class_2350 var13 = var10.method_10153();
            double var14 = (double)var11.method_10263() + 0.5 + (double)var13.method_10148() * 0.5;
            double var16 = (double)var11.method_10260() + 0.5 + (double)var13.method_10165() * 0.5;
            double var18 = var13.method_10166() == class_2351.field_11052
               ? (double)var11.method_10264() + 0.5 + (double)var13.method_10164() * 0.5
               : (double)var11.method_10264() + 0.5;
            class_243 var20 = new class_243(var14, var18, var16);
            double var21 = var3.method_1025(var20);
            if (!(var21 > var5)) {
               class_3965 var23 = p.method_17742(new class_3959(var3, var20, class_3960.field_17558, class_242.field_1348, w));
               if (var23 != null && var23.method_17783() == class_240.field_1332) {
                  var28 ^= ((long)var23.method_17777().equals(var11) << 32 ^ var28) & -1L << 32;
                  var28 ^= ((long)var23.method_17777().method_10093(var23.method_17780()).equals(pos) ^ var28) & -1L >>> 32;
                  if ((int)(var28 >>> 32) == 0 && (int)var28 == 0) {
                     continue;
                  }
               }

               var5 = var21;
               var4 = var20;
            }
         }
      }

      return var4;
   }

   public liliIliiiliIli(class_310 mc, iilIiiIiIIiIiiIi input) {
      this.IllIllIIIl = new LinkedHashSet<>();
      this.lllIllIIIl = IIlIIIIilIlIIIIi.iililiIiil;
      this.IIlIllIIIl = mc;
      this.lIlIllIIIl = input;
   }

   public static int iliIiiliiiii(class_746 p) {
      long var6 = 1314787182942012715L;
      class_1661 var1 = p.method_31548();

      for (long var8 = var6 ^ (0L ^ var6) & -1L << 32; (int)(var8 >>> 32) < 9; var8 += 4294967296L) {
         class_1799 var3 = var1.method_5438((int)(var8 >>> 32));
         if (!var3.method_7960() && var3.method_7909() instanceof class_1747 var4 && var4.method_7711().method_9564().method_26216()) {
            return (int)(var8 >>> 32);
         }
      }

      return -1;
   }

   private static boolean Illlllllilll(class_746 p, class_2338 cell) {
      return p.method_5829().field_1322 >= (double)cell.method_10264() + 1.0 - 0.02;
   }

   public void IilliliilIIi(class_2338 pos) {
      class_2338 var2 = pos.method_10062();
      this.IllIllIIIl.remove(var2);
      this.IllIllIIIl.add(var2);

      while (this.IllIllIIIl.size() > 64) {
         Iterator var3 = this.IllIllIIIl.iterator();
         var3.next();
         var3.remove();
      }
   }

   public int lIiiIiIlilli() {
      return this.IIiIllIIIl;
   }

   public static boolean IIIllIIliIIl(class_746 p) {
      return p != null && iliIiiliiiii(p) >= 0;
   }

   public boolean IlIlllIlilIl(class_746 pos, class_2338 reach, double p) {
      long var8 = 2607828196592091289L;
      class_638 var5 = this.IIlIllIIIl.field_1687;
      if (var5 == null || this.IIlIllIIIl.field_1761 == null) {
         return false;
      } else if (!var5.method_8320(reach).method_45474()) {
         return false;
      } else {
         var8 ^= ((long)iliIiiliiiii(pos) << 32 ^ var8) & -1L << 32;
         if ((int)(var8 >>> 32) < 0) {
            return false;
         } else {
            class_1661 var7 = pos.method_31548();
            if (var7.method_67532() != (int)(var8 >>> 32)) {
               var7.method_61496((int)(var8 >>> 32));
            }

            if (this.iilIllIIIl > 0) {
               this.iilIllIIIl--;
               return true;
            } else if (this.Iilllilliill(var5, reach)) {
               this.iilIllIIIl = 2;
               return true;
            } else {
               return false;
            }
         }
      }
   }

   public void IliIlllilIi() {
      this.lllIllIIIl = IIlIIIIilIlIIIIi.iililiIiil;
      this.illIllIIIl = null;
      this.iilIllIIIl = 0;
      this.IIiIllIIIl = 0;
      this.IilIllIIIl = null;
      this.lilIllIIIl = 0;
   }

   public boolean IiIlliIliiIl(class_746 jumpOut, boolean[] p) {
      long var7 = 1405108039168753776L;
      class_638 var3 = this.IIlIllIIIl.field_1687;
      if (var3 != null && this.IIlIllIIIl.field_1761 != null) {
         var7 ^= ((long)iliIiiliiiii(jumpOut) << 32 ^ var7) & -1L << 32;
         if ((int)(var7 >>> 32) < 0) {
            return false;
         } else if (this.lilIllIIIl >= 3) {
            this.lilIllIIIl = 0;
            return false;
         } else {
            class_1661 var5 = jumpOut.method_31548();
            if (var5.method_67532() != (int)(var7 >>> 32)) {
               var5.method_61496((int)(var7 >>> 32));
            }

            if (this.iilIllIIIl > 0) {
               this.iilIllIIIl--;
            }

            switch (this.lllIllIIIl) {
               case lIiiliIiil:
                  IIlllIlliIll(jumpOut);
                  if (jumpOut.method_24828() && this.iilIllIIIl == 0 && jumpOut.method_36455() >= 85.0F) {
                     this.illIllIIIl = jumpOut.method_24515();
                     p[0] = true;
                     this.lllIllIIIl = IIlIIIIilIlIIIIi.IIiiliIiil;
                  }
                  break;
               case iililiIiil:
                  if (this.illIllIIIl == null) {
                     this.lllIllIIIl = IIlIIIIilIlIIIIi.iililiIiil;
                  } else {
                     class_2338 var6 = new class_2338(jumpOut.method_31477(), this.illIllIIIl.method_10264(), jumpOut.method_31479());
                     IIlllIlliIll(jumpOut);
                     if (!var3.method_8320(var6).method_26215()) {
                        this.lllIllIIIl = IIlIIIIilIlIIIIi.lIiiliIiil;
                        this.IIiIllIIIl = 0;
                        this.IilIllIIIl = var6.method_10062();
                     } else if (jumpOut.method_24828()) {
                        this.IIiIllIIIl++;
                        this.lllIllIIIl = IIlIIIIilIlIIIIi.iililiIiil;
                        this.iilIllIIIl = 5;
                     } else if (this.iilIllIIIl == 0 && Illlllllilll(jumpOut, var6) && this.Iilllilliill(var3, var6)) {
                        this.iilIllIIIl = 4;
                     }
                  }
                  break;
               case IIiiliIiil:
                  if (jumpOut.method_24828()) {
                     this.lllIllIIIl = IIlIIIIilIlIIIIi.iIiiliIiil;
                     this.iilIllIIIl = 5;
                  }
                  break;
               case iIiiliIiil:
                  if (this.iilIllIIIl == 0) {
                     this.lilIllIIIl = this.IilIllIIIl != null && var3.method_8320(this.IilIllIIIl).method_26215() ? this.lilIllIIIl + 1 : 0;
                     this.IilIllIIIl = null;
                     this.lllIllIIIl = IIlIIIIilIlIIIIi.iililiIiil;
                     this.illIllIIIl = null;
                  }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   private static void IIlllIlliIll(class_746 p) {
      p.method_36457(Math.min(90.0F, p.method_36455() + 45.0F));
   }

   public Set<class_2338> liiiIIllIl() {
      return this.IllIllIIIl;
   }
}
