package gg.corz;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BooleanSupplier;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1304;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1893;
import net.minecraft.class_310;
import net.minecraft.class_746;
import net.minecraft.class_1269.class_9860;
import net.minecraft.class_1269.class_9861;

public final class illllliIilllli {
   public static final int IillIiIIIl = 50;
   private iIIIliIiIlIIliIi IlilIiIIIl;
   public static final int IIllIiIIIl = 20;
   private float lIIiIiIIIl;
   public static final int IiIlIiIIIl = 4;
   private static final class_1304[] iillIiIIIl = new class_1304[]{class_1304.field_6169, class_1304.field_6174, class_1304.field_6172, class_1304.field_6166};
   public static final double illlIiIIIl = 2.0;
   private long IiilIiIIIl = Long.MIN_VALUE;
   private long iiilIiIIIl = Long.MIN_VALUE;
   private BooleanSupplier llilIiIIIl;
   private long IIIiIiIIIl = Long.MIN_VALUE;
   private final iilllIiIIillIi IIilIiIIIl;
   private final illillIlIilillIl lIilIiIIIl;
   public static final float lIllIiIIIl = 82.0F;
   private int liilIiIIIl;
   public static final float IlllIiIIIl = 75.0F;
   public static final int liIlIiIIIl = 32;
   public static final double llllIiIIIl = 8.0;
   public static final int lillIiIIIl = 60;
   public static final int iiIlIiIIIl = 40;
   private boolean ililIiIIIl;
   public static final float iIllIiIIIl = 88.0F;
   private final lIlIiIIliIlIiIIl iIilIiIIIl;

   private void IlIlllIlilIl(long tick, boolean rest) {
      this.ililIiIIIl = false;
      this.liilIiIIIl = 0;
      this.IiilIiIIIl = Long.MIN_VALUE;
      if (rest) {
         this.IIIiIiIIIl = tick + 20L;
      }
   }

   public void lIiiIiIlilli() {
      if (this.ililIiIIIl) {
         this.IlIlllIlilIl(IIllIIlilIllIIli.IlIlllIlilIl(), false);
      }
   }

   boolean IiIlliIliiIl(IIllIIllIllIIl s) {
      if (s.Iliilliiilii()) {
         return false;
      } else if (this.llilIiIIIl != null && this.llilIiIIIl.getAsBoolean()) {
         return true;
      } else if (s.IIiilIiiiIii() >= 12.0) {
         return true;
      } else {
         IlillIllllillIll var2 = s.IlIlllIlilIl().illIlIilIl();
         return var2 != null && var2.liiiIIllIl() != iiIIiilIIlIiil.IliIliIlilliIliIli && var2.iIlIlllllill() == 0 && s.IIiilIiiiIii() >= 8.0;
      }
   }

   public void IliIlllilIi(iIIIliIiIlIIliIi kit) {
      this.IlilIiIIIl = kit;
   }

   public void IIIllIIliIIl() {
      this.ililIiIIIl = false;
      this.IiilIiIIIl = Long.MIN_VALUE;
      this.liilIiIIIl = 0;
      this.iiilIiIIIl = Long.MIN_VALUE;
      this.IIIiIiIIIl = Long.MIN_VALUE;
   }

   public boolean IilliliilIIi() {
      long var11 = 6140742898359189094L;
      class_310 var1 = class_310.method_1551();
      class_746 var2 = var1.field_1724;
      if (var2 != null && var1.field_1761 != null) {
         long var3 = IIllIIlilIllIIli.IlIlllIlilIl();
         if (var3 < this.IIIiIiIIIl) {
            return false;
         } else {
            if (!this.ililIiIIIl) {
               this.ililIiIIIl = true;
               this.IiilIiIIIl = var3;
               this.liilIiIIIl = 0;
               this.lIIiIiIIIl = 82.0F + ThreadLocalRandom.current().nextFloat() * 6.0F;
            }

            if (this.liilIiIIIl < 32 && var3 - this.IiilIiIIIl < 40L) {
               var11 ^= ((long)this.iIilIiIIIl.IilliliilIIi(st -> st.method_31574(class_1802.field_8287), false) << 32 ^ var11) & -1L << 32;
               if ((int)(var11 >>> 32) < 0) {
                  this.IlIlllIlilIl(var3, true);
                  return false;
               } else {
                  this.IIilIiIIIl
                     .IIlllIlliIll(IiilIiIiliilIiIi.IiIllIiIIi, this.IIilIiIIIl.IilliliilIIi(), this.lIIiIiIIIl, IIIliIilIIliIi.illIIiliiIilIIilii, 50);
                  if (!this.iIilIiIIIl.lIiiIiIlilli((int)(var11 >>> 32), false)) {
                     return false;
                  } else if (this.iiilIiIIIl != Long.MIN_VALUE && var3 - this.iiilIiIIIl < 4L) {
                     return false;
                  } else if (this.IIilIiIIIl.lIiiIiIlilli() < 75.0F) {
                     return false;
                  } else if (this.lIilIiIIIl.iIlIlllllill() && this.lIilIiIIIl.IiIlliIliiIl()) {
                     class_1799 var6 = var2.method_31548().method_5438((int)(var11 >>> 32));
                     if (var6.method_31574(class_1802.field_8287) && !var2.method_7357().method_7904(var6)) {
                        class_1269 var7;
                        try (IlIIiiIillIIiiIi var8 = this.lIilIiIIIl.IIlllIlliIll()) {
                           var7 = var1.field_1761.method_2919(var2, class_1268.field_5808);
                        }

                        if (var7 instanceof class_9860 var15 && var15.comp_2909() == class_9861.field_52427) {
                           var2.method_6104(class_1268.field_5808);
                        }

                        this.iiilIiIIIl = var3;
                        this.liilIiIIIl++;
                        return true;
                     } else {
                        return false;
                     }
                  } else {
                     return false;
                  }
               }
            } else {
               this.IlIlllIlilIl(var3, true);
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private static double IIlllIlliIll(class_746 p) {
      long var10 = -1857889264340676784L;
      double var1 = Double.NaN;
      class_1304[] var3 = iillIiIIIl;
      var10 ^= ((long)var3.length << 32 ^ var10) & -1L << 32;

      for (long var13 = var10 ^ (0L ^ var10) & -1L >>> 32; (int)var13 < (int)(var13 >>> 32); var13 ^= (var13 ^ var13 + (long)1) & -1L >>> 32) {
         class_1304 var6 = var3[(int)var13];
         class_1799 var7 = p.method_6118(var6);
         if (!var7.method_7960() && var7.method_7963() && lIlllIliIlllIl.lIiiIiIlilli(var7, class_1893.field_9101) > 0) {
            double var8 = iIliilIlIlliilIl.IilliliilIIi(var7);
            var1 = Double.isNaN(var1) ? var8 : Math.min(var1, var8);
         }
      }

      return var1;
   }

   public IilliIIllilliIIl iIlIlllllill(IIllIIllIllIIl s) {
      long var9 = 8415165457736236547L;
      class_310 var2 = class_310.method_1551();
      class_746 var3 = var2.field_1724;
      if (var3 != null && s != null && s.IlIlllIlilIl() != null) {
         long var4 = IIllIIlilIllIIli.IlIlllIlilIl();
         if (!this.IiIlliIliiIl(s)) {
            if (this.ililIiIIIl) {
               this.IlIlllIlilIl(var4, false);
            }

            return IilliIIllilliIIl.IliIlllilIi(
               iIlIIIIiIllIIIIi.iIIIiiIiil, IIillIiliIil<"IIillIiliIil","XHeRG61wDn7TDJNl+n/dzOYU1SSZ5FO2igNyRI9ftOTYNYpYwHU=">()
            );
         } else if (s.IlIlllIlilIl().iiIIlIIlIl()) {
            return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.iIIIiiIiil, IIillIiliIil<"IIillIiliIil","RDYLhu+hm+QQwL6UpjH/7sF5jnIGnc+fTwuK6p61HUmOyw==">());
         } else if (var4 < this.IIIiIiIIIl) {
            return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.iIIIiiIiil, IIillIiliIil<"IIillIiliIil","viN09QF/8mXHu8l/809uaib7HEdilYI8ULeWH5aaC1o=">());
         } else {
            double var6 = IIlllIlliIll(var3);
            if (Double.isNaN(var6)) {
               return IilliIIllilliIIl.IliIlllilIi(
                  iIlIIIIiIllIIIIi.iIIIiiIiil, IIillIiliIil<"IIillIiliIil","DPTXHrJWSk304uLNq5tqFyEashsNGUUcyvaDJz1rNdflA4TCMA8=">()
               );
            } else {
               var9 ^= ((long)(this.ililIiIIIl ? (var6 < 0.9 ? 1 : 0) : (var6 < 0.35 ? 1 : 0)) << 32 ^ var9) & -1L << 32;
               if ((int)(var9 >>> 32) == 0) {
                  if (this.ililIiIIIl) {
                     this.IlIlllIlilIl(var4, false);
                  }

                  return IilliIIllilliIIl.IliIlllilIi(
                     iIlIIIIiIllIIIIi.iIIIiiIiil, IIillIiliIil<"IIillIiliIil","OsQDGrtOfrX4xNK77FiefmwwDWcJE5Ht8EScHWsx/Cko7hV3">()
                  );
               } else if (this.iIilIiIIIl.IilliliilIIi(st -> st.method_31574(class_1802.field_8287), false) >= 0) {
                  return new IilliIIllilliIIl(
                     iIlIIIIiIllIIIIi.iIIIiiIiil,
                     true,
                     2.0,
                     this.ililIiIIIl ? 0 : 2,
                     false,
                     false,
                     this.ililIiIIIl
                        ? IIillIiliIil<"IIillIiliIil","JEr5XeBUXacQMGD5Euw+kdlIrWDt00cR2w2bMprzBAIJ1Xk=">()
                        : IIillIiliIil<"IIillIiliIil","HWT13QE/rS6QX5e5aH6zAGFSYnkXfF7lYTGac4l88gk=">()
                  );
               } else if (this.IlilIiIIIl != null && s.IlIlllIlilIl().Iilililiiili() > 0) {
                  this.IlilIiIIIl.IliIlllilIi(lIliliiIlili.IIllIllIllIllIllIl, var4 + 60L);
                  return IilliIIllilliIIl.IliIlllilIi(
                     iIlIIIIiIllIIIIi.iIIIiiIiil, IIillIiliIil<"IIillIiliIil","OaZnVY2aAoGz20GgmsAmYU1G86Zu225ztMk1lPysmt3Z">()
                  );
               } else {
                  return IilliIIllilliIIl.IliIlllilIi(
                     iIlIIIIiIllIIIIi.iIIIiiIiil, IIillIiliIil<"IIillIiliIil","Wg/U7EHxo2gc77Y3BLM2QCLDDeq4YLqmtn7+BSLQ5b0R1npePhc=">()
                  );
               }
            }
         }
      } else {
         return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.iIIIiiIiil, IIillIiliIil<"IIillIiliIil","oLuZL+F5vdot7jMGlHl/nOv9yi5xgZDDUCasYtdEUrkXmJtBCA==">());
      }
   }

   public boolean iliIiiliiiii() {
      return this.ililIiIIIl;
   }

   public void liiiIIllIl(BooleanSupplier quiet) {
      this.llilIiIIIl = quiet;
   }

   public illllliIilllli(iilllIiIIillIi slots, illillIlIilillIl gates, lIlIiIIliIlIiIIl aim) {
      this.lIIiIiIIIl = 85.0F;
      this.IIilIiIIIl = slots;
      this.lIilIiIIIl = gates;
      this.iIilIiIIIl = aim;
   }
}
