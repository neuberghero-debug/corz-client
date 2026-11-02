package gg.corz;

import com.corz.client.mixins.AccessorKeyBinding;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1309;
import net.minecraft.class_1511;
import net.minecraft.class_1542;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2824;
import net.minecraft.class_2846;
import net.minecraft.class_2868;
import net.minecraft.class_2885;
import net.minecraft.class_2886;
import net.minecraft.class_304;
import net.minecraft.class_332;
import net.minecraft.class_3675;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import net.minecraft.class_4588;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_9334;
import net.minecraft.class_1269.class_9860;
import net.minecraft.class_1269.class_9861;
import net.minecraft.class_2846.class_2847;
import net.minecraft.class_3675.class_306;
import net.minecraft.class_3675.class_307;
import org.joml.Matrix4f;
import org.lwjgl.glfw.GLFW;

public class iiIIiiIlIIlIiiIl extends ilIllIiIll implements liliIiliiliIil {
   private static final long lllilIIlll = 100L;
   private class_638 IIIiiIIlll;
   private boolean illliIIlll;
   private static final double iililIIlll = 1.9;
   private iiIIilllIIlIilll lIIiiIIlll;
   private static final int iiiilIIlll = 50;
   private final lIIiIiiIIiIi iIiIiIIlll;
   private static final int llIIiIIlll = 11075839;
   private static final double IiIilIIlll = 110.0;
   private class_1309 lliIiIIlll;
   private final lliliIIiililiIIi lIlIiIIlll = new lliliIIiililiIIi(
      IliIlllilIi<"IliIlllilIi","UMZTo91r/grSWnas0ap9DdSZHG4xHSLWTxqDCjNgvvQ=">(),
      IliIlllilIi<"IliIlllilIi","iXkXYOBC/y2v40PhRAtZywDGatoC6s7nggWP8zMcsZ8Q+KMBIMumwtHQJ3tyGZPWcKhCRy9+QqOC7vRoQH65dFkckOC8IXHnmziLxHifMR3hGrPusaBiM+ZMyWxrILrSnkGuWhkAMn5T6COD/jWk0makxpieK40M72XhtVTAOSz8JJi5jA3genn/XvbzvUOEDCytuQOiUGGnop+vS8GTdtCx6NmDYdtY">(),
      IliIlllilIi<"IliIlllilIi","Ku1cqaXK/9jDGAsyrieyp8nHnzyfMg6Nt/63uolc2hY8gg==">(),
      IliIlllilIi<"IliIlllilIi","Ku1cqaXK/9jDGAsyrieyp8nHnzyfMg6Nt/63uolc2hY8gg==">(),
      IliIlllilIi<"IliIlllilIi","hqGQVv47FD9sAb6l8V43O5PH/D7Fnkc6NSiYo0jLZy4=">()
   );
   private static final int liIilIIlll = 3;
   private int iiiIiIIlll;
   private class_2338 liiliIIlll;
   private static final double liiilIIlll = 10.0;
   private final iilliIlIIiliIl lllIiIIlll;
   private long IiiliIIlll;
   private long IIIliIIlll;
   private iiilililIIIiilil IlIiiIIlll;
   private int lliliIIlll;
   private static final long iIiilIIlll = 100L;
   private static final int lIIIiIIlll = 16711680;
   private long lllliIIlll;
   private static final long IllilIIlll = 150L;
   private static final double IiIIiIIlll = 20.0;
   private static final int IlIIiIIlll = 16722175;
   private long ilIiiIIlll;
   private static final double ilIilIIlll = 60.0;
   private static final int IIlilIIlll = 2;
   private long iiIiiIIlll;
   private class_2338 IiIiiIIlll;
   private long llIiiIIlll;
   private static final int illilIIlll = 10;
   private float liIliIIlll;
   private String IiiIiIIlll;
   private class_2338 IliliIIlll;
   static final int IIlIiIIlll = 3;
   private static final int IililIIlll = 10;
   private long IlIliIIlll;
   private long iIiliIIlll;
   private final iiIiiilIIliiil illIiIIlll;
   private static final long IliilIIlll = 1200L;
   private static final int iIlilIIlll = 1;
   private int IllliIIlll;
   private long IIliiIIlll;
   private int IiIliIIlll;
   private long llIliIIlll;
   private Object iIIiiIIlll;
   private static final double iliilIIlll = 4.0;
   private float lIIliIIlll;
   private long iliIiIIlll;
   private String iIliiIIlll;
   private final IIIIlilllIIIlill iIlIiIIlll = new IIIIlilllIIIlill(
      IliIlllilIi<"IliIlllilIi","YbnqI5BUOwBDcfDs1t3pv+Z+Dx1MOcxfxZxOmVUQOltH">(),
      IliIlllilIi<"IliIlllilIi","buYS/M207icHopZpmIr+Ssd4nTC4jP+gIYSN2+VYsRWfSwu05GdAMWnr4dP9Wz3lscvWNcGYmPJnFFzQiYMWI/jiN0P5lEKV7YP3E5Z3CcQ+4anXQw==">(),
      4.5,
      3.0,
      6.0,
      0.1
   );
   private int iilliIIlll;
   private static final int lIlilIIlll = 1;
   private static final double lililIIlll = 5.0;
   private float iiIliIIlll;
   private static final int IIIIiIIlll = 65535;
   private static final double[] ilIIiIIlll = new double[]{
      Double.longBitsToDouble(-1384383947224424869L ^ -3235363394073698725L),
      Double.longBitsToDouble(5469130776900161148L ^ 8360441737672019580L),
      Double.longBitsToDouble(-2385990069751635760L ^ -2230615882607353648L)
   };
   private final iiIiiilIIliiil lilIiIIlll;
   private double lIlliIIlll;
   private boolean IIlliIIlll;
   private float iIIliIIlll;
   private long ilIliIIlll;
   private static final long IiiilIIlll = 300000L;
   private boolean IilliIIlll;
   private class_746 lIiliIIlll;
   private long liIiiIIlll;
   static final int iiIIiIIlll = 9;
   private boolean iIlliIIlll;
   private long iiiliIIlll;
   private boolean liiIiIIlll;
   private IIiiilIilIiiilIi IliIiIIlll;
   private final iiIiiilIIliiil lIiIiIIlll;
   private int lilliIIlll;
   private static final int iiIilIIlll = 20;
   private static final int iIIIiIIlll = 255;
   private static final double liIIiIIlll = 1.0;
   private final iiIiiilIIliiil iilIiIIlll;
   private final iiIiiilIIliiil IIiIiIIlll;
   private int lIliiIIlll;
   private static final int llIilIIlll = 70;
   private static final double lliilIIlll = 8.0;
   private static final long lIiilIIlll = 150L;
   private static final long IIiilIIlll = 50L;
   private int IIiliIIlll;
   private final iilliIlIIiliIl IilIiIIlll;
   private int ililiIIlll;
   private final IIIIlilllIIIlill IllIiIIlll = new IIIIlilllIIIlill(
      IliIlllilIi<"IliIlllilIi","hY0d41BaASkb/xa1lBvN7GVoiKcq1nW7A8DO5hvxZeMl8Z8whA==">(),
      IliIlllilIi<"IliIlllilIi","lfRgVP7ey3vPAsCo21d64+oweJU3eGlcMtcr9DYdtCOttZWjGPETn1x+RUpDutYnkRWSdcrtK56nH/szbMamm3Z2VAj/wi4+TnjrMAbiq77tQ0HtQ442Asv3Xom8g5bqJeOW4Q2tFWeB">(),
      4.5,
      1.0,
      10.0,
      0.5
   );

   static class_2338 iiiilIIIIi(boolean forcedBase, class_2338 cell, class_2338 build) {
      return forcedBase && cell != null && build != null && build.equals(cell.method_10084()) ? build : cell;
   }

   private void iIliiIllii(class_3965 tick, class_2338 yaw, long crystalBase, long now, float hit, float pitch) {
      this.llliiillii(tick, yaw, crystalBase, now, hit, pitch, false);
   }

   private float[] illIIlIilIIl(float fromYaw, float settle, float toPitch, float fromPitch, boolean toYaw) {
      return this.lIIiiIIlll == null
         ? liiIIliliiiIIlil.IIlilIliiIli(fromYaw, settle, toPitch, fromPitch, this.IllIiIIlll.Iilllilliill(), liliIliiliIl(), IilIIilllilIIill.iIlIlllllill())
         : this.lIIiiIIlll.IliIlllilIi(fromYaw, settle, toPitch, fromPitch, toYaw);
   }

   public void IIIillIIil(illlllIillll event) {
      if (this.lIIiiIIlll != null && !this.IliIlllilIi()) {
         this.IIiilIiiiIii(event);
      }
   }

   private void iIIliIlIli(
      IIiiilIilIiiilIi tick, class_3965 now, boolean hit, boolean switchTo, class_243 crystal, float eye, float yaw, long pitch, long a, int mayAct
   ) {
      boolean var13 = this.IiIliliIli();
      if (!var13 && this.lIlliIIlll > 1.9) {
         float[] var16 = lllIliIlillIliIl.iIlllIllll(crystal, eye, yaw, now.method_17777(), hit ? null : tick.IlIlllIlilIl(), IilIIilllilIIill.iIlIlllllill());
         if (var16 == null) {
            float[] var17 = ilIiiIiIii.Ililllililil(crystal, lllIliIlillIliIl.illilIilil(now.method_17777(), now.method_17780()));
            var16 = this.illIIlIilIIl(eye, yaw, var17[0], var17[1], true);
         }

         this.llIIIlilIIIl(var16[0], var16[1], pitch);
      } else {
         boolean var14 = hit
            || !iliilliIiiilli.lIiiIiIlilli(now.method_17777())
               && !iliilliIiiilli.Iiilliiliiil(tick.iliIiiliiiii(), iliilliIiiilli.IIillIiliIil())
               && !iliilliIiiilli.IiIiliIiiiIi(now.method_17777());
         if (switchTo
            && this.iIiIiIIlll.Ililllililil(pitch)
            && (var13 || !this.iIiIiIIlll.Iiilliiliiil(eye, yaw, a))
            && (hit ? lllIliIlillIliIl.IIIllIIliIIl(tick.iliIiiliiiii()) : lllIliIlillIliIl.IlIillIiilIi(tick.iliIiiliiiii()))
            && var14
            && this.IllIIllllIIl(tick)
            && this.llIliilIli(mayAct)) {
            boolean var15 = !tick.Iiilliiliiil();
            this.llliiillii(now, hit ? tick.iliIiiliiiii() : null, pitch, a, eye, yaw, var13);
            if (!hit) {
               this.iIiIiIIlll.Iilililiiili(tick.iliIiiliiiii().method_10063(), pitch);
               tick.IlIillIiilIi(pitch);
            } else if (var15) {
               tick.IlIillIiilIi(pitch);
            }
         }

         this.llIIIlilIIIl(eye, yaw, pitch);
      }
   }

   private void liiiiiiiii(long now) {
      this.IlIliIIlll = now;
      this.llIliIIlll = IIiiIllIiiIl();
   }

   private void iliiiIiiii(long tick) {
      this.IliIiIIlll = null;
      this.liiiiiiiii(iIiiIlIliiIl());
      if (this.lIIiiIIlll == null && !this.liiIiIIlll && this.IIIliIIlll >= tick - 1L) {
         this.liiIiIIlll = true;
         this.iiiIiIIlll = 0;
      }
   }

   private void iiIilIIlil(long now, long tick) {
      class_746 var5 = Iiiilllliiilll.field_1724;
      if ((this.lIIiiIIlll != null || !this.IIililIili()) && !var5.method_6115() && !lliliilili()) {
         if (this.lIIiiIIlll == null && this.iilIiIIlll.Iilllilliill() && this.ililIlIiilIl(tick)) {
            this.Iliiilliii(now, IliIlllilIi<"IliIlllilIi","/1VwriELDbrziWqPHq4v2++EVoFLXyFA7xklQvCeJaE=">());
         } else {
            boolean var6 = IilIIililIIi.lIiiIiIlilli(class_1802.field_8301) >= 0;
            if (!var6 && this.lIIiiIIlll == null) {
               this.Iliiilliii(now, IliIlllilIi<"IliIlllilIi","eTWVD6Sdd1gPbDcIh7Nj+QiJLL/NS4iN90orgM+rEl+aP7L13AQ5">());
            } else if (!lllIliIlillIliIl.IiIiliIiiiIi()) {
               this.Iliiilliii(now, IliIlllilIi<"IliIlllilIi","vsPZc68/oFw3gqQhUWvkXvbqJEae3bse/tkBmo5nnk0QP8up">());
            } else {
               class_1309 var7 = this.lIIiiIIlll == null ? this.iiliiIIiii() : this.lilIIliilIIl();
               if (var7 == null) {
                  this.Iliiilliii(now, IliIlllilIi<"IliIlllilIi","5X4ZK9TYlIFTMEDmNmJ5WSkkPRUCzn4RVoopcM1rQ5i48EAq9A==">());
               } else {
                  if (var7 != this.lliIiIIlll) {
                     this.lliIiIIlll = var7;
                     if (this.IliIiIIlll != null) {
                        this.iliiiIiiii(now);
                     }
                  }

                  this.iliIiIIlll = tick;
                  boolean var8 = this.ililiIIlll == var7.method_5628() && now - this.IiiliIIlll <= 1L;
                  iIIlIIiIlIlIIi var9 = lllIliIlillIliIl.iIIilIlIil(var7, this.IIiIIllIiIIl(), var8, this.lIIiiIIlll != null);
                  ilIIllIiIiIIllIi var10 = this.lIIiiIIlll != null && this.IlIiiIIlll != null ? this.IlIiiIIlll.Iiilliiliiil() : null;
                  if (var10 != null) {
                     this.lIliliIlil(var10, var7, var10.IIIllIIliIIl() != null ? var10.IIIllIIliIIl() : var9, now, tick, var6);
                  } else {
                     if (this.IliIiIIlll != null && !this.IlIIillIIi(this.IliIiIIlll, var7, var9, now, tick)) {
                        this.iliiiIiiii(now);
                     }

                     if (this.IliIiIIlll == null) {
                        if (this.lIIiiIIlll == null && tick - this.IlIliIIlll < this.llIliIIlll || now < this.ilIliIIlll) {
                           this.IiIliIIlll++;
                           this.iIIIIlIlIIIl(now);
                           return;
                        }

                        iiIllIIlIIlllIIl var11 = Ililiiillliliiil.IliIlllilIi(
                           this.IiIIIlliIIIl(var7, var9, now, tick, this.lIIiiIIlll == null ? null : this.IlIiiIIlll)
                        );
                        if (var11.IliIlllilIi() == null) {
                           this.ilIliIIlll = now + (long)(this.lIIiiIIlll != null ? 1 : 2);
                           this.Iliiilliii(now, var11.liiiIIllIl());
                           return;
                        }

                        this.IliIiIIlll = var11.IliIlllilIi();
                        this.liiIiIIlll = false;
                     }

                     if (!var6 && !this.lliililiil(this.IliIiIIlll, tick)) {
                        this.Iliiilliii(now, IliIlllilIi<"IliIlllilIi","eTWVD6Sdd1gPbDcIh7Nj+QiJLL/NS4iN90orgM+rEl+aP7L13AQ5">());
                     } else {
                        this.IiiIiIIlll = null;
                        this.IiIliIIlll = 0;
                        this.ilIIiIiIIi(this.IliIiIIlll, now, tick);
                     }
                  }
               }
            }
         }
      } else {
         this.IIIIIllIIIIl(now, false);
         this.liiiiiiiii(tick);
         this.IiiIiIIlll = IliIlllilIi<"IliIlllilIi","W4o7ARnl+7A/+bOamT3LMu24aT3xNQiU27Dcpkun+slihg==">();
         this.IiIliIIlll++;
      }
   }

   private static boolean iiiliIIIii(class_746 player) {
      return ilIiiIiIii.IlIlllIlilIl()
         ? true
         : player.method_36454() != iIiIlillIliIlill.ilillIiill() || player.method_36455() != iIiIlillIliIlill.liilliiill();
   }

   private boolean lIiiiiIiii(class_1309 viewYaw, double entity, class_243 eye, float maxRange) {
      return liiIIIlliiiIIIll.IliIlllilIi(viewYaw, lilllliiilllli.iiIiIiIIIl)
         && liiIIIlliiiIIIll.IIIllIIliIIl(viewYaw) <= entity
         && lllIliIlillIliIl.Illillliilli(eye, viewYaw.method_73189(), maxRange, Double.longBitsToDouble(8648287043433765432L ^ 4056304273376123448L));
   }

   private boolean Illillllil(IIiiilIilIiiilIi now, class_2338 build, boolean picked, class_1309 cell, long a, long trust, boolean tick) {
      long var13 = 1313886033339812596L;
      if (now.Illlllllilll() != cell.method_5628() || !now.iliIiiliiiii().equals(build)) {
         return false;
      } else if (picked && now.lIiiIiIlilli() != IlliIlillliIli.IiiiIlIIIl) {
         return false;
      } else if (a - now.Iilllilliill() > (4582787830878996337L ^ 4582787830878996325L)) {
         return false;
      } else {
         long var10 = build.method_10063();
         if (now.lIiiIiIlilli() == IlliIlillliIli.IiiiIlIIIl) {
            var13 ^= ((long)Iiiilllliiilll.field_1687.method_8320(build).method_27852(class_2246.field_10540) << 32 ^ var13) & -1L << 32;
            if (!now.Iiilliiliiil()) {
               if ((int)(var13 >>> 32) == 0) {
                  return true;
               }
            } else {
               if ((int)(var13 >>> 32) == 0) {
                  this.iIiIiIIlll.IIIIllIIIl(var10, trust);
                  return false;
               }

               if (!this.iIiIiIIlll.Iiiiliiiiiii(var10, a, this.lIIIiiIIIi(tick))) {
                  return true;
               }
            }

            now.IiIiliIiiiIi(a);
         }

         if (now.lIiiIiIlilli() == IlliIlillliIli.iliiIlIIIl) {
            class_1511 var12 = now.IiIlliIliiIl();
            if (var12 != null && var12.method_5805() && !var12.method_31481()) {
               return true;
            }

            if (!lllIliIlillIliIl.IliIlllilIi(build)) {
               return false;
            }

            now.IiIiliIiiiIi(a);
         }

         if (!lllIliIlillIliIl.IliIlllilIi(build)) {
            return false;
         } else {
            class_1511 var15 = lllIliIlillIliIl.IIlllIlliIll(build);
            if (var15 != null) {
               now.IIlilIliiIli(var15, a);
            }

            return true;
         }
      }
   }

   private boolean liilIliiilIl(class_1542 now, long item) {
      return this.liiliIIlll != null && item - this.iiiliIIlll <= (6784663088994235949L ^ 6784663088993936845L)
         ? now.method_5649(
               (double)this.liiliIIlll.method_10263() + Double.longBitsToDouble(-4094771060568363216L ^ -518912956436189392L),
               (double)this.liiliIIlll.method_10264() + Double.longBitsToDouble(-5728752487446853595L ^ -8097645891443734491L),
               (double)this.liiliIIlll.method_10260() + Double.longBitsToDouble(-4032470066749566133L ^ -582712752183766197L)
            )
            <= Double.longBitsToDouble(-8744118610487705510L ^ -4107381319133069222L)
         : false;
   }

   private void IlilIlllilIl() {
      this.IilliIIlll = false;
      this.lilliIIlll = -(-1216494876 >>> 1 | -1216494876 << 31) ^ 608247438;
      this.iilliIIlll = (-1124745965 * 1601513229 >>> 13 | -1124745965 * 1601513229 << 19) * 119 ^ -1470093331;
      this.IIiliIIlll = -1;
   }

   private boolean llIliilIli(int slot) {
      long var4 = 237436142043799151L;
      if (slot < 0) {
         return true;
      } else if (!this.IiIliliIli()) {
         return false;
      } else {
         this.IilliIIlll = true;

         try {
            var4 ^= ((long)this.lIIiiIIlll.IIIllIIliIIl(slot) << 32 ^ var4) & -1L << 32;
         } finally {
            this.IilliIIlll = false;
         }

         return (boolean)((int)(var4 >>> 32));
      }
   }

   private void IiIilliIil(IiIiIlIiliIiIlIi event) {
      long var5 = 3482002746283045800L;
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.method_18854()) {
         class_2596 var2 = event.lIiilIIIIi;
         if (var2 instanceof class_2868 var3) {
            this.IIiliIIlll = var3.method_12442();
            if (!this.IilliIIlll && !event.lIiiIiIlilli()) {
               this.lilliIIlll = Iiiilllliiilll.field_1724.field_6012;
            }
         } else {
            byte var10000;
            label60: {
               label47:
               if (!(var2 instanceof class_2824) && !(var2 instanceof class_2885) && !(var2 instanceof class_2886)) {
                  if (var2 instanceof class_2846 var4 && var4.method_12363() != class_2847.field_12969) {
                     break label47;
                  }

                  var10000 = 0;
                  break label60;
               }

               var10000 = 1;
            }

            var5 ^= ((long)var10000 << 32 ^ var5) & -1L << 32;
            if ((int)(var5 >>> 32) != 0 && !this.IilliIIlll && !event.lIiiIiIlilli()) {
               this.iilliIIlll = Iiiilllliiilll.field_1724.field_6012;
            }

            if (var2 instanceof class_2824 var7 && IIIliiIilIIliiIi.IliIlllilIi(var7)) {
               this.ililiIIlll = IIIliiIilIIliiIi.liiiIIllIl(var7);
               this.IiiliIIlll = IIllIIlilIllIIli.IlIlllIlilIl();
            }
         }
      }
   }

   private boolean IlIIillIIi(IIiiilIilIiiilIi a, class_1309 picked, iIIlIIiIlIlIIi predicted, long now, long tick) {
      if (a.Illlllllilll() != picked.method_5628()) {
         return false;
      } else if (now - a.Iilllilliill() > 20L) {
         return false;
      } else {
         class_243 var8 = Iiiilllliiilll.field_1724.method_33571();
         if (!lllIliIlillIliIl.Illillliilli(var8, lllIliIlillIliIl.liiiIIllIl(a.iliIiiliiiii()), this.iIiIIlIliIIl(), this.lliIIliliIIl())) {
            return false;
         } else {
            long var9 = a.iliIiiliiiii().method_10063();
            if (a.lIiiIiIlilli() == IlliIlillliIli.IiiiIlIIIl) {
               boolean var11 = Iiiilllliiilll.field_1687.method_8320(a.iliIiiliiiii()).method_27852(class_2246.field_10540);
               if (this.iIiIiIIlll.iIIIlIlIIl(var9, tick)) {
                  return false;
               }

               if (!a.Iiilliiliiil()) {
                  if (!var11) {
                     return lllIliIlillIliIl.IlIlllIlilIl()
                        && lllIliIlillIliIl.IIillIiliIil(a.IIIllIIliIIl(), a.IlIlllIlilIl())
                        && lllIliIlillIliIl.IlIillIiilIi(a.iliIiiliiiii());
                  }
               } else {
                  if (!var11) {
                     this.iIiIiIIlll.IIIIllIIIl(var9, tick);
                     return false;
                  }

                  if (!this.iIiIiIIlll.Iiiiliiiiiii(var9, now, this.IiIliliIli() ? 1 : this.illiIlIiliIl())) {
                     return true;
                  }
               }

               a.IiIiliIiiiIi(now);
            }

            if (a.lIiiIiIlilli() == IlliIlillliIli.iliiIlIIIl) {
               class_1511 var15 = a.IiIlliIliiIl();
               if (var15 != null && var15.method_5805() && !var15.method_31481()) {
                  if (this.iIiIiIIlll.IIlilIliiIli(var15.method_5628(), tick)) {
                     return false;
                  }

                  if (this.lIIiiIIlll == null) {
                     return lllIliIlillIliIl.lilIliilIl(var15.method_73189(), null, this.illIiIIlll.Iilllilliill(), this.IlliIlllliIl());
                  }

                  double var19 = Ililiiillliliiil.IilliliilIIi(this.IiIIIlliIIIl(picked, predicted, now, tick, this.IlIiiIIlll), var15);
                  if (Double.isNaN(var19)) {
                     return false;
                  }

                  a.IIillIiliIil(var19);
                  return true;
               }

               if (!lllIliIlillIliIl.IliIlllilIi(a.iliIiiliiiii())) {
                  return false;
               }

               a.IiIiliIiiiIi(now);
            }

            if (!lllIliIlillIliIl.IliIlllilIi(a.iliIiiliiiii())) {
               return false;
            } else {
               class_1511 var16 = lllIliIlillIliIl.IIlllIlliIll(a.iliIiiliiiii());
               if (var16 != null) {
                  if (this.iIiIiIIlll.IIlilIliiIli(var16.method_5628(), tick)) {
                     return false;
                  } else {
                     if (this.lIIiiIIlll == null) {
                        if (!lllIliIlillIliIl.lilIliilIl(var16.method_73189(), null, this.illIiIIlll.Iilllilliill(), this.IlliIlllliIl())) {
                           return false;
                        }
                     } else {
                        double var18 = Ililiiillliliiil.IilliliilIIi(this.IiIIIlliIIIl(picked, predicted, now, tick, this.IlIiiIIlll), var16);
                        if (Double.isNaN(var18)) {
                           return false;
                        }

                        a.IIillIiliIil(var18);
                     }

                     a.IIlilIliiIli(var16, now);
                     return true;
                  }
               } else if (this.iIiIiIIlll.IiIlliIliiIl(var9, tick)) {
                  return true;
               } else if (lllIliIlillIliIl.IIIllIIliIIl(a.iliIiiliiiii()) && lllIliIlillIliIl.IiIlliIliiIl(a.iliIiiliiiii())) {
                  if (predicted.liiiIIllIl().method_994(lllIliIlillIliIl.iIlIlllllill(a.iliIiiliiiii()))) {
                     return false;
                  } else if (this.lIIiiIIlll != null) {
                     IillIiillillIiil var17 = this.IiIIIlliIIIl(picked, predicted, now, tick, this.IlIiiIIlll);
                     double var20 = Ililiiillliliiil.iIlIlllllill(this.iliIiIiiIi(a.iliIiiliiiii(), now) ? IIIlilIIli(var17) : var17, a.iliIiiliiiii(), null);
                     if (Double.isNaN(var20)) {
                        return false;
                     } else {
                        a.IIillIiliIil(var20);
                        return true;
                     }
                  } else {
                     class_243 var12 = lllIliIlillIliIl.liiiIIllIl(a.iliIiiliiiii());
                     double var13 = lllIliIlillIliIl.lIliliIlil(predicted, picked, var12, null);
                     if (var13 < this.lIliIliIliIl()) {
                        return false;
                     } else {
                        a.IIillIiliIil(var13);
                        return lllIliIlillIliIl.lilIliilIl(var12, null, this.illIiIIlll.Iilllilliill(), this.IlliIlllliIl());
                     }
                  }
               } else {
                  return false;
               }
            }
         }
      }
   }

   static boolean Iiiilliiil(IlliIlillliIli pendingPlace, boolean kind) {
      return pendingPlace == IlliIlillliIli.iliiIlIIIl || pendingPlace == IlliIlillliIli.lliiIlIIIl && kind;
   }

   private void lIlliiIlli(class_1511 mayAct, boolean now, long crystal, long tick) {
      long var8 = -5434867894292746050L;
      this.IliliIIlll = lllIliIlillIliIl.iliIiiliiiii(mayAct);
      var8 ^= (
            (long)(
                     lllIliIlillIliIl.IiIiliIiiiIi()
                           && !this.iIiIiIIlll.IIlilIliiIli(mayAct.method_5628(), tick)
                           && lllIliIlillIliIl.lilIliilIl(mayAct.method_73189(), null, this.illIiIIlll.Iilllilliill(), this.IlliIlllliIl())
                        ? 1
                        : 0
                  )
                  << 32
               ^ var8
         )
         & -1L << 32;
      this.lliliIIlll = (int)(var8 >>> 32) != 0 ? (1901712354 ^ -7) + 77 ^ -1901669481 : -226236515 ^ -111 ^ 226695180;
      if ((int)(var8 >>> 32) != 0 && now && this.iIiIiIIlll.Illillliilli(mayAct.method_5628(), crystal, this.illiIlIiliIl(), tick)) {
         this.Iiliililii(mayAct, crystal, tick);
      }
   }

   @Override
   protected void IIiilIiiiIii(illlllIillll event) {
      if (this.IIiIiIIlll.Iilllilliill() && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         Matrix4f var2 = iIiiIIilIliiIIil.IIillIiliIil();
         if (this.iiIiIlIIliIl()) {
            if (this.IliliIIlll != null && this.lilliiilli()) {
               this.iIIiIlIlIiIl(var2, this.IliliIIlll, this.lliliIIlll);
            }
         } else {
            IIiiilIilIiiilIi var3 = this.IliIiIIlll;
            if (var3 != null) {
               int var4 = switch (var3.lIiiIiIlilli()) {
                  case iliiIlIIIl -> 16711680;
                  case IiiiIlIIIl -> 255;
                  default -> 65535;
               };
               this.iIIiIlIlIiIl(var2, var3.iliIiiliiiii(), var4);
            }

            class_1309 var6 = this.lliIiIIlll;
            if (var6 != null && var6.method_5805() && !var6.method_31481() && iIiiIlIliiIl() - this.iliIiIIlll <= 1200L) {
               boolean var5 = var3 != null && var3.lIiiIiIlilli() == IlliIlillliIli.iliiIlIIIl;
               this.llIiIlilIiIl(var2, var6, event.liiiiIIiiiiiiIIi, var5 ? 11075839 : 16722175);
            }
         }
      }
   }

   private boolean liIIiiiIIi(float[] look) {
      float[] var2 = this.lIIiiIIlll.IlIlllIlilIl(look[0], look[1]);
      return var2 != null && var2.length >= (~(-939435430 ^ -63) ^ -939435418) && Float.isFinite(var2[0]) && Float.isFinite(var2[1]);
   }

   static boolean liiIiiiiIi(class_2338 broken, class_2338 brokeAt, long base, long tick) {
      return broken != null
         && broken.equals(brokeAt)
         && base != (-6103507985573304358L ^ 3119864051281471450L)
         && tick >= base
         && tick - base <= (194838609452729278L ^ 194838609452729277L);
   }

   private void Illlilllli(class_3965 pitch, class_2338 hit, boolean mayAct, float yaw, float base, long tick, long now) {
      long var11 = 7448412591385470893L;
      this.IliliIIlll = hit;
      if (lllIliIlillIliIl.IIIllIIliIIl(hit) && lllIliIlillIliIl.IiIlliIliiIl(hit)) {
         var11 ^= ((long)lllIliIlillIliIl.lilIliilIl(lllIliIlillIliIl.liiiIIllIl(hit), null, this.illIiIIlll.Iilllilliill(), this.IlliIlllliIl()) << 32 ^ var11)
            & -1L << 32;
         this.lliliIIlll = (int)(var11 >>> 32) != 0
            ? (
                  (
                           (1691845639 * -619094385 << 19 | 1691845639 * -619094385 >>> 13) >>> 29
                              | (1691845639 * -619094385 << 19 | 1691845639 * -619094385 >>> 13) << 3
                        )
                        << 3
                     | (
                           (1691845639 * -619094385 << 19 | 1691845639 * -619094385 >>> 13) >>> 29
                              | (1691845639 * -619094385 << 19 | 1691845639 * -619094385 >>> 13) << 3
                        )
                        >>> 29
               )
               ^ -760092836
            : -825037931 - -105 ^ -21 ^ 835851285;
         if ((int)(var11 >>> 32) != 0 && mayAct) {
            if (this.iIiIiIIlll.Iiiiliiiiiii(hit.method_10063(), tick, this.illiIlIiliIl())) {
               if (!this.iIiIiIIlll.IiIlliIliiIl(hit.method_10063(), now) && now >= this.iIiliIIlll) {
                  if (this.iIiIiIIlll.Ililllililil(tick) && !this.iIiIiIIlll.Iiilliiliiil(yaw, base, now)) {
                     if (Iiiilllliiilll.field_1724.method_6047().method_31574(class_1802.field_8301)) {
                        this.iIliiIllii(pitch, hit, tick, now, yaw, base);
                     }
                  }
               }
            }
         }
      } else {
         this.lliliIIlll = (1594074262 * 85 ^ -31) * 1631000239 ^ -1160531935;
      }
   }

   private static double liliIliiliIl() {
      return Double.longBitsToDouble(-4155940683056999682L ^ -452591125401165363L)
         + ThreadLocalRandom.current().nextDouble() * Double.longBitsToDouble(1400773157117645858L ^ 3221121503656765201L);
   }

   private double lIliIliIliIl() {
      return (double)this.lllIiIIlll.Iilllilliill() / Double.longBitsToDouble(5679977202584426868L ^ 1047743510857161076L);
   }

   private void illliIilli(class_3965 mayAct, boolean hit, float yaw, float tick, long pitch, long now) {
      long var13 = -2195134090419856128L;
      class_2338 var9 = mayAct.method_17777();
      if (lllIliIlillIliIl.IlIlllIlilIl()) {
         if (!Iiiilllliiilll.field_1687.method_8320(var9).method_45474() && lllIliIlillIliIl.Iilllilliill(var9, mayAct.method_17780())) {
            class_2338 var10 = var9.method_10093(mayAct.method_17780());
            if (!this.iIiIiIIlll.iIIIlIlIIl(var10.method_10063(), now) && lllIliIlillIliIl.IlIillIiilIi(var10)) {
               var13 ^= ((long)IilIIililIIi.lIiiIiIlilli(class_1802.field_8281) << 32 ^ var13) & -1L << 32;
               if ((int)(var13 >>> 32) >= 0) {
                  this.IliliIIlll = var10;
                  var13 ^= (
                        (long)lllIliIlillIliIl.lilIliilIl(lllIliIlillIliIl.liiiIIllIl(var10), var10, this.illIiIIlll.Iilllilliill(), this.IlliIlllliIl())
                           ^ var13
                     )
                     & -1L >>> 32;
                  this.lliliIIlll = (int)var13 != 0 ? ~-820725350 * 1332920885 ^ -267903978 : 1910288697 * 1227133513 * -17 * -53 ^ -1690330171;
                  if ((int)var13 != 0 && hit && this.liIlIliiIlIl(pitch)) {
                     if (this.iIiIiIIlll.Ililllililil(pitch) && !this.iIiIiIIlll.Iiilliiliiil(yaw, tick, now)) {
                        this.IIllIllIllIl((int)(var13 >>> 32), pitch);
                        this.illliIIlll = true;
                        this.iIliiIllii(mayAct, null, pitch, now, yaw, tick);
                        this.iIiIiIIlll.Iilililiiili(var10.method_10063(), pitch);
                     }
                  }
               }
            }
         }
      }
   }

   private boolean ililIlIiilIl(long now) {
      class_238 var3 = Iiiilllliiilll.field_1724.method_5829().method_1009(8.0, 4.0, 8.0);

      for (class_1542 var5 : Iiiilllliiilll.field_1687.method_8390(class_1542.class, var3, e -> e.method_5805() && !e.method_31481())) {
         if (!this.liilIliiilIl(var5, now) && IIIiIllIIiIl(var5.method_6983())) {
            return true;
         }
      }

      return false;
   }

   private static boolean lliliilili() {
      if (llilIllililIll.iliIiiliiiii(iIIliIiIlIliIi.class) instanceof iIIliIiIlIliIi var0 && var0.liIlliiIll()) {
         return true;
      }

      return Iiililiili();
   }

   public class_2338 liilliiill() {
      return this.IiIiiIIlll;
   }

   private static boolean IIIiIllIIiIl(class_1799 stack) {
      class_1792 var1 = stack.method_7909();
      return var1 != class_1802.field_8288 && var1 != class_1802.field_8301 && var1 != class_1802.field_8868
         ? var1.method_57347().method_57832(class_9334.field_54196) || var1.method_57347().method_57832(class_9334.field_50077)
         : true;
   }

   private int IiIiIlliIiIl() {
      int var1 = 0;

      for (int var2 = 0; var2 < 9; var2++) {
         class_1799 var3 = Iiiilllliiilll.field_1724.method_31548().method_5438(var2);
         if (var3.method_31574(class_1802.field_8301)) {
            var1 += var3.method_7947();
         }
      }

      return var1;
   }

   @Override
   protected void iIIIlIlIIl() {
      if (this.lIIiiIIlll == null) {
         this.llIililIil(true);
      }
   }

   private void iIIIIlIlIIIl(long tick) {
      if (this.lIIiiIIlll != null) {
         this.liiIiIIlll = false;
      } else if (this.liiIiIIlll) {
         if (this.IIIliIIlll != tick) {
            float var3 = ilIiiIiIii.Iilllilliill();
            float var4 = ilIiiIiIii.IIillIiliIil();
            float var5 = Iiiilllliiilll.field_1724.method_36454();
            float var6 = Iiiilllliiilll.field_1724.method_36455();
            float var7 = IilIIilllilIIill.iIlIlllllill();
            double var8 = liiIIliliiiIIlil.Iilllilliill(var3, var4, var5, var6);
            if (this.iiiIiIIlll++ < 10 && !(var8 <= Math.max(0.5, (double)var7 * 2.0)) && !(var8 > 150.0)) {
               float[] var10 = liiIIliliiiIIlil.IIlilIliiIli(var3, var4, var5, var6, 5.0, liliIliiliIl(), var7);
               this.llIIIlilIIIl(var10[0], var10[1], tick);
            } else {
               this.liiIiIIlll = false;
            }
         }
      }
   }

   private static double lIiIiiIiIi(class_243 yaw, float pitch, float eye, class_243 point) {
      float[] var4 = ilIiiIiIii.Ililllililil(yaw, point);
      return liiIIliliiiIIlil.Iilllilliill(pitch, eye, var4[0], var4[1]);
   }

   private boolean IilIililIi(class_2338 base, class_243 pitch, float yaw, float eye) {
      class_243 var5 = Iiiilllliiilll.field_1724.method_5631(eye, yaw);
      if (!(var5.field_1351 < Double.longBitsToDouble(103303125018861348L ^ 103303125018861348L))) {
         return false;
      } else {
         double var6 = ((double)base.method_10264() + 1.0 - pitch.field_1351) / var5.field_1351;
         if (var6 > Double.longBitsToDouble(5831391549580321489L ^ 5831391549580321489L)
            && !(var6 > Double.longBitsToDouble(9153653629196254877L ^ 4546901572955449095L))) {
            class_243 var8 = pitch.method_1019(var5.method_1021(var6));
            return var8.field_1352 >= (double)base.method_10263()
               && var8.field_1352 <= (double)base.method_10263() + 1.0
               && var8.field_1350 >= (double)base.method_10260()
               && var8.field_1350 <= (double)base.method_10260() + 1.0
               && lllIliIlillIliIl.IiIIlliIIl(pitch, var8);
         } else {
            return false;
         }
      }
   }

   private void iillIlIIilIl() {
      if (this.iIlliIIlll) {
         IilIIililIIi.iIlIlllllill();
      }

      this.iIlliIIlll = false;
      this.IllliIIlll = -1;
      this.illliIIlll = false;
   }

   private void Iiliililii(class_1511 now, long tick, long crystal) {
      this.IilliIIlll = true;

      try {
         Iiiilllliiilll.field_1761.method_2918(Iiiilllliiilll.field_1724, now);
      } finally {
         this.IilliIIlll = false;
      }

      Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
      this.iIiIiIIlll.IIIilIIiiIIi(now.method_5628(), tick);
      this.iIiIiIIlll.IIlllIlliIll(lllIliIlillIliIl.iliIiiliiiii(now).method_10063());
      this.iIiliIIlll = crystal + ThreadLocalRandom.current().nextLong(-1376244594808191369L ^ -1376244594808191470L);
      this.ilIiiIIlll = tick;
      this.IiIiiIIlll = lllIliIlillIliIl.iliIiiliiiii(now).method_10062();
      this.liIiiIIlll = tick;
   }

   private void ilIIiIiIIi(IIiiilIilIiiilIi now, long tick, long a) {
      class_746 var6 = Iiiilllliiilll.field_1724;
      class_243 var7 = var6.method_33571();
      float var8 = ilIiiIiIii.Iilllilliill();
      float var9 = ilIiiIiIii.IIillIiliIil();
      boolean var10 = now.lIiiIiIlilli() == IlliIlillliIli.IiiiIlIIIl && !now.Iiilliiliiil();
      int var11 = this.lIIiiIIlll != null && now.lIiiIiIlilli() == IlliIlillliIli.iliiIlIIIl
         ? var6.method_31548().method_67532()
         : IilIIililIIi.lIiiIiIlilli(var10 ? class_1802.field_8281 : class_1802.field_8301);
      if (var11 < 0 && this.lIIiiIIlll != null && this.lliililiil(now, a)) {
         var11 = var6.method_31548().method_67532();
      }

      if (var11 < 0) {
         this.Iliiilliii(
            tick,
            var10
               ? IliIlllilIi<"IliIlllilIi","oPmhgLQZcfP9PQSXn2OWYWctyF0DYUii3cGJToIVo8VXb+nMkpzN">()
               : IliIlllilIi<"IliIlllilIi","eTWVD6Sdd1gPbDcIh7Nj+QiJLL/NS4iN90orgM+rEl+aP7L13AQ5">()
         );
      } else {
         boolean var12 = this.IiIliliIli();
         boolean var13 = var6.method_31548().method_67532() == var11;
         if (!var13 && !var12) {
            if (this.lIIiiIIlll != null) {
               this.iiiIIlIIIlIl(var11, tick);
            } else if (this.liIlIliiIlIl(tick)) {
               this.IIllIllIllIl(var11, tick);
               var13 = true;
            }
         }

         int var14 = var13 ? -1 : var11;
         boolean var15 = (var13 || var12) && this.lIlIIliIlIIl(tick) && this.IIliilIlii();
         class_239 var16 = lllIliIlillIliIl.Iilililiiili(var7, var8, var9);
         Predicate var18 = null;
         class_243 var17;
         switch (now.lIiiIiIlilli()) {
            case iliiIlIIIl:
               class_1511 var26 = now.IiIlliIliiIl();
               if (var16 instanceof class_3966 var29 && var29.method_17782() == var26) {
                  if (var15 && this.iIiIiIIlll.Illillliilli(var26.method_5628(), tick, this.illiIlIiliIl(), a)) {
                     if (this.IllIIllllIIl(now)) {
                        if (this.llIliilIli(var14)) {
                           boolean var31 = this.iIiIiIIlll.IlIillIiilIi(var26.method_5628()) == 0;
                           this.Iiliililii(var26, tick, a);
                           if (var31) {
                              now.Ililllililil(tick);
                           }
                        }
                     } else {
                        this.iiIiiIIlll = tick;
                     }
                  }

                  this.llIIIlilIIIl(var8, var9, tick);
                  return;
               }

               var17 = lllIliIlillIliIl.Iiiiliiiiiii(var26.method_5829(), var26, var7, var8, var9, 3.0);
               var18 = r -> {
                  if (r instanceof class_3966 var2 && var2.method_17782() == var26) {
                     return true;
                  }

                  return false;
               };
               if (var12) {
                  var17 = this.IIlIilIlIi(now.iliIiiliiiii(), var26, var7, var8, var9, var17);
               }
               break;
            case lliiIlIIIl:
               if (this.iIiIiIIlll.IiIlliIliiIl(now.iliIiiliiiii().method_10063(), a)) {
                  class_238 var24 = lllIliIlillIliIl.IilliliilIIi(now.iliIiiliiiii());
                  if (lllIliIlillIliIl.iIIIlIlIIl(var24, var7, var8, var9, 3.0)) {
                     this.llIIIlilIIIl(var8, var9, tick);
                     return;
                  }

                  var17 = lllIliIlillIliIl.Iiiiliiiiiii(var24, null, var7, var8, var9, 3.0);
                  if (var12) {
                     var17 = this.IIlIilIlIi(now.iliIiiliiiii(), null, var7, var8, var9, var17);
                  }
               } else {
                  class_3965 var25 = lllIliIlillIliIl.IIiilIiiiIii(var16, now.iliIiiliiiii(), null, var7, 4.4);
                  if (var25 != null) {
                     this.iIIliIlIli(now, var25, true, var15, var7, var8, var9, tick, a, var14);
                     return;
                  }

                  class_3965 var28 = lllIliIlillIliIl.Iliilliiilii(now.iliIiiliiiii(), this.IiiIIlliiIIl(), null, var7, var8, var9, 4.4);
                  var17 = var28 == null ? null : var28.method_17784();
                  var18 = r -> lllIliIlillIliIl.IIiilIiiiIii(
                           r, now.iliIiiliiiii(), null, var7, Double.longBitsToDouble(3319853248753496726L ^ 7927432008907189004L)
                        )
                        != null;
                  if (var12) {
                     var17 = this.IIlIilIlIi(now.iliIiiliiiii(), null, var7, var8, var9, var17);
                  }
               }
               break;
            default:
               if (now.Iiilliiliiil()) {
                  if (lllIliIlillIliIl.IIiilIiiiIii(var16, now.iliIiiliiiii(), null, var7, 4.4) != null) {
                     this.llIIIlilIIIl(var8, var9, tick);
                     return;
                  }

                  class_3965 var19 = lllIliIlillIliIl.Iliilliiilii(now.iliIiiliiiii(), this.IiiIIlliiIIl(), null, var7, var8, var9, 4.4);
                  var17 = var19 == null ? null : var19.method_17784();
                  var18 = r -> lllIliIlillIliIl.IIiilIiiiIii(
                           r, now.iliIiiliiiii(), null, var7, Double.longBitsToDouble(3535931597232145794L ^ 8143562094793694232L)
                        )
                        != null;
                  if (var12) {
                     var17 = this.IIlIilIlIi(now.iliIiiliiiii(), null, var7, var8, var9, var17);
                  }
               } else {
                  class_3965 var23 = lllIliIlillIliIl.IIiilIiiiIii(var16, now.IIIllIIliIIl(), now.IlIlllIlilIl(), var7, 4.4);
                  if (var23 != null) {
                     this.iIIliIlIli(now, var23, false, var15, var7, var8, var9, tick, a, var14);
                     return;
                  }

                  class_3965 var20 = lllIliIlillIliIl.Iliilliiilii(
                     now.IIIllIIliIIl(), new class_2350[]{now.IlIlllIlilIl()}, now.IlIlllIlilIl(), var7, var8, var9, 4.4
                  );
                  var17 = var20 == null ? null : var20.method_17784();
                  var18 = r -> lllIliIlillIliIl.IIiilIiiiIii(
                           r, now.IIIllIIliIIl(), now.IlIlllIlilIl(), var7, Double.longBitsToDouble(-1775129624420727260L ^ -6391486813147963458L)
                        )
                        != null;
               }
         }

         if (var17 == null) {
            this.Iliiilliii(tick, IliIlllilIi<"IliIlllilIi","fjBHNkpmp3zoJXZlXB2V7spykCH04W5TbSxLEKftHrhWVa5WcvsGNA==">());
         } else {
            float[] var27 = ilIiiIiIii.Ililllililil(var7, var17);
            float var30 = IilIIilllilIIill.iIlIlllllill();
            float[] var21 = var18 != null && lllIliIlillIliIl.Iillllilll(var8, var9, var27, var30)
               ? lllIliIlillIliIl.lllllillll(var7, var8, var9, var30, var18)
               : null;
            if (var21 != null) {
               var27 = var21;
            }

            if (!var12 || !this.liIIiiiIIi(var27)) {
               float[] var22 = this.illIIlIilIIl(var8, var9, var27[0], var27[1], false);
               this.llIIIlilIIIl(var22[0], var22[1], tick);
            }
         }
      }
   }

   public void iIlllIllll(Object owner) {
      if (owner != null && owner == this.iIIiiIIlll) {
         this.iillIlIIilIl();
         this.lIilIliIilIl();
         this.iIIilIlIil();
         this.lIIiiIIlll = null;
         this.iIIiiIIlll = null;
         this.IlIiiIIlll = null;
         this.iIiIiIIlll.iliIiiliiiii(-5237922241962928689L ^ -5237922241962928601L);
      }
   }

   public IillIiillillIiil Ilillllill(iiilililIIIiilil o) {
      long var7 = 1923016330581162958L;
      if (o != null && o.liiiIIllIl() != null && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         long var2 = IIllIIlilIllIIli.IlIlllIlilIl();
         class_1309 var4 = o.liiiIIllIl();
         var7 ^= ((long)(this.ililiIIlll == var4.method_5628() && var2 - this.IiiliIIlll <= (7385784961813161668L ^ 7385784961813161669L) ? 1 : 0) << 32 ^ var7)
            & -1L << 32;
         iIIlIIiIlIlIIi var6 = lllIliIlillIliIl.iIIilIlIil(var4, Math.max(1, o.IIIllIIliIIl()), (boolean)((int)(var7 >>> 32)), true);
         return this.IiIIIlliIIIl(var4, var6, var2, iIiiIlIliiIl(), o);
      } else {
         return null;
      }
   }

   private void IlIlIlllIlIl() {
      for (long var2 : this.iIiIiIIlll.Illlllllilll()) {
         if (lllIliIlillIliIl.IIlllIlliIll(class_2338.method_10092(var2)) != null) {
            this.iIiIiIIlll.IIlllIlliIll(var2);
         }
      }
   }

   @Override
   public boolean lIIlliIIll() {
      return this.lIIiiIIlll == null && this.liIlliiIll();
   }

   private void llliiillii(class_3965 fast, class_2338 crystalBase, long yaw, long hit, float pitch, float now, boolean tick) {
      this.IilliIIlll = true;

      class_1269 var10;
      try {
         var10 = Iiiilllliiilll.field_1761.method_2896(Iiiilllliiilll.field_1724, class_1268.field_5808, fast);
      } finally {
         this.IilliIIlll = false;
      }

      if (var10 instanceof class_9860 var11 && var11.comp_2909() == class_9861.field_52427) {
         Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
      }

      if (crystalBase != null) {
         this.iIiIiIIlll.iIlIlllllill(crystalBase.method_10063(), hit, yaw, pitch, now, tick);
      } else {
         this.iIiIiIIlll.lIiiIiIlilli(hit, yaw, pitch, now, tick);
      }

      this.llIiiIIlll = yaw;
      this.liIiiIIlll = yaw;
   }

   public boolean lllllillll() {
      return this.lIIiiIIlll != null;
   }

   private boolean lIIiiiIIii(long tick) {
      return this.IIIliIIlll != tick - 1L
         ? false
         : liiIIliliiiIIlil.IIillIiliIil(ilIiiIiIii.Iilllilliill(), ilIiiIiIii.IIillIiliIil(), this.lIIliIIlll, this.iIIliIIlll);
   }

   public IlliIlllllliIlll ilillIiill() {
      long var6 = 1385675143966772782L;
      IIiiilIilIiiilIi var1 = this.IliIiIIlll;
      long var2 = IIllIIlilIllIIli.IlIlllIlilIl();
      class_1511 var4 = var1 == null ? null : var1.IiIlliIliiIl();
      var6 ^= ((long)(var1 != null ? var1.Illlllllilll() : (this.lliIiIIlll != null ? this.lliIiIIlll.method_5628() : -1)) << 32 ^ var6) & -1L << 32;
      return new IlliIlllllliIlll(
         this.lIIiiIIlll != null,
         this.IiiIiIIlll,
         var1 == null ? null : var1.lIiiIiIlilli(),
         var1 == null ? null : var1.iliIiiliiiii(),
         var4 == null ? -1 : var4.method_5628(),
         var1 == null ? 0.0 : var1.IIlllIlliIll(),
         (int)(var6 >>> 32),
         this.iiIiiIIlll == var2,
         this.llIiiIIlll,
         this.ilIiiIIlll,
         this.liIiiIIlll,
         this.IIliiIIlll == var2 ? this.lIliiIIlll : -1,
         this.iIliiIIlll
      );
   }

   private class_243 iIlIiIllIi(class_2338 crystal, class_1511 eye, class_243 maxSteps, float pitch, float yaw, int base) {
      double var7 = (double)crystal.method_10264() + 1.0;
      if (!(maxSteps.field_1351 > var7)) {
         return null;
      } else {
         int var9 = ilIIiIIlll.length * ilIIiIIlll.length;
         class_243[] var10 = new class_243[var9];
         float[][] var11 = new float[var9][];
         double[] var12 = new double[var9];
         int var13 = 0;
         double var14 = 19.360000000000003;

         for (double var19 : ilIIiIIlll) {
            for (double var24 : ilIIiIIlll) {
               class_243 var26 = new class_243((double)crystal.method_10263() + var19, var7, (double)crystal.method_10260() + var24);
               if (!(maxSteps.method_1025(var26) > var14)) {
                  float[] var27 = ilIiiIiIii.Ililllililil(maxSteps, var26);
                  double var28 = liiIIliliiiIIlil.Iilllilliill(pitch, yaw, var27[0], var27[1]);
                  if (IliIilliIi(var28) <= base) {
                     var10[var13] = var26;
                     var11[var13] = var27;
                     var12[var13] = var28;
                     var13++;
                  }
               }
            }
         }

         for (int var30 = 0; var30 < var13; var30++) {
            int var31 = -1;

            for (int var32 = 0; var32 < var13; var32++) {
               if (var10[var32] != null && (var31 < 0 || var12[var32] < var12[var31])) {
                  var31 = var32;
               }
            }

            class_243 var33 = var10[var31];
            var10[var31] = null;
            if (this.lllIiillIi(crystal, eye, maxSteps, var11[var31][0], var11[var31][1])) {
               return var33;
            }
         }

         return null;
      }
   }

   private boolean IlIiillIii() {
      return this.lilliIIlll == Iiiilllliiilll.field_1724.field_6012;
   }

   private boolean lIlIIliIlIIl(long tick) {
      return this.lIIiiIIlll == null ? this.lIIiiiIIii(tick) : this.lIIiiIIlll.iIlIlllllill();
   }

   public void iilllIIill(IiIiIlIiliIiIlIi event) {
      if (!this.IliIlllilIi()) {
         this.IiIilliIil(event);
      }
   }

   private void iIllIlIlllIl(long tick) {
      long var4 = -3917399478341729559L;
      if (this.iIlliIIlll) {
         var4 ^= (
               (long)(
                        this.iiIiIlIIliIl()
                           ? (!this.lilliiilli() ? 1 : 0)
                           : (
                              this.IliIiIIlll == null && this.IiIliIIlll >= ((~-573505790 + 5 << 25 | ~-573505790 + 5 >>> 7) * -1191041351 ^ 1767914360)
                                 ? 1
                                 : 0
                           )
                     )
                     << 32
                  ^ var4
            )
            & -1L << 32;
         if ((int)(var4 >>> 32) != 0) {
            this.llllIlilllIl(tick);
         }
      }
   }

   private float IlliIlllliIl() {
      return (float)this.IilIiIIlll.Iilllilliill();
   }

   private boolean lilliiilli() {
      return !iIiliIlili(Iiiilllliiilll.field_1690.field_1904)
         ? false
         : this.illliIIlll || Iiiilllliiilll.field_1724.method_6047().method_31574(class_1802.field_8301);
   }

   private boolean ilIiiIiIii() {
      return this.iilliIIlll == Iiiilllliiilll.field_1724.field_6012;
   }

   private class_1309 lilIIliilIIl() {
      class_1309 var1 = this.IlIiiIIlll == null ? null : this.IlIiiIIlll.liiiIIllIl();
      return var1 != null && var1.method_5805() && !var1.method_31481() ? var1 : null;
   }

   private boolean iiIiIlIIliIl() {
      return this.lIIiiIIlll == null && IliIlllilIi<"IliIlllilIi","Ku1cqaXK/9jDGAsyrieyp8nHnzyfMg6Nt/63uolc2hY8gg==">().equals(this.lIlIiIIlll.Iilllilliill());
   }

   private void lIilIliIilIl() {
      this.IliIiIIlll = null;
      this.lliIiIIlll = null;
      this.IiiIiIIlll = null;
      this.liiIiIIlll = false;
      this.iiiIiIIlll = 0;
      this.IiIliIIlll = 0;
      this.IlIliIIlll = iIiiIlIliiIl();
      this.llIliIIlll = IIiiIllIiiIl();
      this.ilIliIIlll = 0L;
      this.IIlliIIlll = false;
      this.lIlliIIlll = 0.0;
      this.iIiliIIlll = 0L;
      this.IliliIIlll = null;
      this.iIiIiIIlll.IliIlllilIi();
   }

   private void ilIlIlIiIlIl(long tick, long now) {
      for (long var6 : this.iIiIiIIlll.IIiilIiiiIii()) {
         if (tick - this.iIiIiIIlll.Iliilliiilii(var6) >= 1L
            && !Iiiilllliiilll.field_1687.method_8320(class_2338.method_10092(var6)).method_27852(class_2246.field_10540)) {
            this.iIiIiIIlll.IIIIllIIIl(var6, now);
         }
      }
   }

   private IIiiilIilIiiilIi iIiilIliil(class_2338 face, boolean trust, class_1309 cell, long tick, boolean support, class_2338 picked, class_2350 build) {
      long var16 = -1397989648801311395L;
      var16 ^= ((long)cell.method_5628() << 32 ^ var16) & -1L << 32;
      if (trust) {
         if (picked != null && build != null) {
            return IIiiilIilIiiilIi.IilliliilIIi(face, 0.0, tick, (int)(var16 >>> 32), picked, build);
         } else {
            if (!lllIliIlillIliIl.Illlllllilll(face.method_10074())) {
               ilIIiiiIiIIiii var18 = lllIliIlillIliIl.Iiilliiliiil(
                  face,
                  Iiiilllliiilll.field_1724.method_33571(),
                  ilIiiIiIii.Iilllilliill(),
                  ilIiiIiIii.IIillIiliIil(),
                  Double.longBitsToDouble(8752134089942039134L ^ 4135511773636551620L)
               );
               if (var18 != null) {
                  return IIiiilIilIiiilIi.IilliliilIIi(face, 0.0, tick, (int)(var16 >>> 32), var18.IliIlllilIi(), var18.liiiIIllIl());
               }
            }

            return IIiiilIilIiiilIi.iIlIlllllill(face, 0.0, tick, (int)(var16 >>> 32));
         }
      } else {
         class_1511 var10 = lllIliIlillIliIl.IIlllIlliIll(face);
         if (var10 != null) {
            return IIiiilIilIiiilIi.liiiIIllIl(var10, 0.0, tick, (int)(var16 >>> 32));
         } else {
            long var11 = face.method_10063();
            long var13 = this.iIiIiIIlll.Iliilliiilii(var11);
            if (var13 != (1754217893049021398L ^ -7469154143805754410L) && !this.iIiIiIIlll.Iiiiliiiiiii(var11, tick, this.lIIIiiIIIi(support))) {
               IIiiilIilIiiilIi var15 = IIiiilIilIiiilIi.iIlIlllllill(face, 0.0, tick, (int)(var16 >>> 32));
               var15.IlIillIiilIi(var13);
               var15.Ililllililil(tick);
               return var15;
            } else {
               return IIiiilIilIiiilIi.IliIlllilIi(face, 0.0, tick, (int)(var16 >>> 32));
            }
         }
      }
   }

   public iiIIiiIlIIlIiiIl() {
      super(IliIlllilIi<"IliIlllilIi","F2dwlsxy2IbcfjMGs3hOMo83/+tXT5uxJJtzRQXJEMToINVcLLqNNg==">(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.lllIiIIlll = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","2LoDwovzCEACZwUot+BDZCh4225BXMhiUF/mkBi9eg0ab1gE0CJru8r0">(),
         IliIlllilIi<"IliIlllilIi","uxCaFJVavdHlNpXfwLF+kPp6+LlsedImJY71JE1biGWIAzYTL3GGgv/Xak/+a/RnoSRhfjdpw9sbsjr/rSVg0oZ6axB7/mcbFnGlW9KaokHLWVkUIsaSRcYUEpA3kwxSWZCLsaGs2GTGtMh+qDbFkzkRtwVE7ceeIKi3+aAMDQU42lU5Ywddgo66">(),
         50,
         0,
         100,
         5
      );
      this.illIiIIlll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","QAorQDA9AzORI9E0uQjId6Za5dsVrMguW1mLpEnsqEjmWVjrjIG/3g==">(),
         IliIlllilIi<"IliIlllilIi","SQmf2wVzvrBUrUoKdQaE+3FbxkEdowweIATZVxiaM6oEr3SbiSdD+FdAYGCkCHgIc3TbWdoahnqF5iYv0FGstmrC9wGqGB/Rv/vYiNUYeg==">(),
         true
      );
      this.IilIiIIlll = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","V7rHpvZr180EkHFXI7tuiGOCo0MCm3NyS++JL5tSEULsrqPOTC+fzUHNyA==">(),
         IliIlllilIi<"IliIlllilIi","kmnfJJPZ2Bu5Vv+0UDWG2AfHHfmG6lUNk7f2KBhrQR6dWQheHecEpcMgQ1d+C3X+6Xm8zwRun12We2wD1P8NKdLaBNPsf9BVvt9mA8wc/jSZk0o2mRj3MwZfvXe2yflEidOmaw==">(),
         16,
         0,
         20,
         1
      );
      this.lilIiIIlll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","45huDqE7U6h54vbF2tqlTPZHB9zqHW1rw4qLDpB/HgiLxMkdylimSd8=">(),
         IliIlllilIi<"IliIlllilIi","uD9govB94MfsodXxyAsvWtBzODybXjy9r9r+iNnT2Lr+an7QY/z1+AKicKhCak/EutZ24svuKuHgZI3sLWT3zbw7a+mCJoiHKA58M9kw4V8dvf4WlEVZ+D67Vu/cc0J8">(),
         false
      );
      this.iilIiIIlll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","N4gYvPIK11Png6awrHC2xMLrZggbcjN3rLB8+SX756oL5CAIHzIDLQ==">(),
         IliIlllilIi<"IliIlllilIi","35hsqsN8unN8KPUgk6GHgkiiFlPn1CooiAMmjDWkBjaBbjxs7HCV0gReJ4ElMZoukAejaTHiEBM1Y5Zr80Xjckry9JdIu8Z9MeCf7j27YoONslKDSWLkc1SjD/+1nyEZt0KMmyhbNX8clSgvj/ZNTWT0J+WH5Cs/vySOh4K6GRt4t4SZpBLCXR63H6qNgE7k6f41">(),
         false
      );
      this.IIiIiIIlll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","OYHVQc0UDohO/ik/LeBBkyvlDPBJtZz0P0G7AN30/nTZyLp8sX4Z">(),
         IliIlllilIi<"IliIlllilIi","5a3o9Pj0F+SQHSSBe/siIE+IH50To08GlpwlzWXcSTng9jmxgepNqm7BQaLhSONzBJYrUyNy+FfQAEFmlxncQt63zxz3Tjq5X1EHaXDEainuzS+p">(),
         true
      );
      this.lIiIiIIlll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","tShjCA1Ne4pjPGzsI4Ej+VEcXCtr0e3UAxFzk04oFfwkMYyVF3xZmhQ=">(),
         IliIlllilIi<"IliIlllilIi","ew8hqbQyrvmvhgX1jEJk/X1dL+6EMcMSQunsRQkGV78KMJ6gr46JJtN2dsOIEuCdMuyACFyaAmB3Uwv0XfohkBlo76TsCeOngebiMxfdCoq7MtaLPkVL7GzvmIvPABl+VY0IdNceLA==">(),
         true
      );
      this.iIiIiIIlll = new lIIiIiiIIiIi();
      this.IIIliIIlll = -4611686018427387904L;
      this.IllliIIlll = -1;
      this.lllliIIlll = -4611686018427387904L;
      this.lilliIIlll = Integer.MIN_VALUE;
      this.iilliIIlll = Integer.MIN_VALUE;
      this.IIiliIIlll = -1;
      this.lliliIIlll = 65535;
      this.ililiIIlll = -1;
      this.IiiliIIlll = -4611686018427387904L;
      this.llIiiIIlll = Long.MIN_VALUE;
      this.ilIiiIIlll = Long.MIN_VALUE;
      this.liIiiIIlll = Long.MIN_VALUE;
      this.iiIiiIIlll = Long.MIN_VALUE;
      this.IIliiIIlll = Long.MIN_VALUE;
      this.lIliiIIlll = -1;
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.lIlIiIIlll,
            this.iIlIiIIlll,
            this.IllIiIIlll,
            this.lllIiIIlll,
            this.illIiIIlll,
            this.IilIiIIlll,
            this.lilIiIIlll,
            this.iilIiIIlll,
            this.IIiIiIIlll,
            this.lIiIiIIlll
         }
      );
   }

   private IillIiillillIiil IiIIIlliIIIl(class_1309 o, iIIlIIiIlIlIIi picked, long tick, long predicted, iiilililIIIiilil now) {
      return now == null
         ? new IillIiillillIiil(
            o,
            picked,
            this.lIliIliIliIl(),
            this.illIiIIlll.Iilllilliill(),
            this.IlliIlllliIl(),
            this.lilIiIIlll.Iilllilliill(),
            IilIIililIIi.lIiiIiIlilli(class_1802.field_8281) >= 0,
            this.iIiIiIIlll,
            predicted,
            tick,
            this.illiIlIiliIl(),
            ilIiiIiIii.Iilllilliill(),
            ilIiiIiIii.IIillIiliIil(),
            iIiIlillIliIlill.ilillIiill()
         )
         : new IillIiillillIiil(
            o,
            picked,
            0.0,
            true,
            now.IilliliilIIi(),
            now.iliIiiliiiii(),
            IilIIililIIi.lIiiIiIlilli(class_1802.field_8281) >= 0,
            this.iIiIiIIlll,
            predicted,
            tick,
            this.illiIlIiliIl(),
            ilIiiIiIii.Iilllilliill(),
            ilIiiIiIii.IIillIiliIil(),
            Iiiilllliiilll.field_1724.method_36454(),
            now.iIlIlllllill(),
            now.IiIlliIliiIl(),
            now.IlIlllIlilIl(),
            now.IIlllIlliIll(),
            now.Illlllllilll(),
            now.Iilllilliill(),
            now.IIillIiliIil(),
            now.lIiiIiIlilli(),
            now.Ililllililil()
         );
   }

   private boolean liIlIliiIlIl(long tick) {
      if (this.lllliIIlll == tick || IIIIilIilIIIilIi.lIIlliIIll()) {
         return false;
      } else {
         return !this.IlIiillIii() && !this.liIiiiiIii() ? this.iIlliIIlll || !IilIIililIIi.IilliliilIIi() : false;
      }
   }

   static IillIiillillIiil IIIlilIIli(IillIiillillIiil r) {
      return r != null && r.IiIiliIiiiIi() != null && r.IiIiliIiiiIi().lliIliliIl() ? r.liiiIIllIl(r.IiIiliIiiiIi().IlIlllIlilIl(false)) : r;
   }

   @Override
   public boolean iiiIlIIIll() {
      return this.lIIiiIIlll == null && this.liIlliiIll();
   }

   private class_2350[] IiiIIlliiIIl() {
      return this.lIIiiIIlll != null
            && this.IlIiiIIlll != null
            && this.IlIiiIIlll.Iiilliiliiil() != null
            && this.IlIiiIIlll.Iiilliiliiil().iIlIlllllill() != null
         ? new class_2350[]{this.IlIiiIIlll.Iiilliiliiil().iIlIlllllill()}
         : lllIliIlillIliIl.IiliiliIll;
   }

   private int IIiIIllIiIIl() {
      return this.lIIiiIIlll != null && this.IlIiiIIlll != null ? Math.max(1, this.IlIiiIIlll.IIIllIIliIIl()) : 3;
   }

   private class_1309 iiliiIIiii() {
      double var1 = this.iIlIiIIlll.Iilllilliill();
      float var3 = iIiIlillIliIlill.ilillIiill();
      class_243 var4 = Iiiilllliiilll.field_1724.method_33571();
      if (this.lliIiIIlll != null && this.lIiiiiIiii(this.lliIiIIlll, var1, var4, var3)) {
         return this.lliIiIIlll;
      } else {
         class_1309 var5 = null;
         double var6 = Double.MAX_VALUE;

         for (class_1309 var9 : liiIIIlliiiIIIll.Iilllilliill(var1, lilllliiilllli.iiIiIiIIIl)) {
            if (lllIliIlillIliIl.Illillliilli(var4, var9.method_73189(), var3, 60.0)) {
               double var10 = liiIIIlliiiIIIll.IIIllIIliIIl(var9);
               if (var10 < var6) {
                  var6 = var10;
                  var5 = var9;
               }
            }
         }

         return var5;
      }
   }

   private void lIliliIlil(ilIIllIiIiIIllIi crystals, class_1309 predicted, iIIlIIiIlIlIIi picked, long now, long dir, boolean tick) {
      class_2338 var9 = crystals.liiiIIllIl();
      class_2338 var10 = crystals.IliIlllilIi();
      boolean var11 = var9 != null && !lllIliIlillIliIl.IliIlllilIi(var9);
      if (!var11 && var9 != null && var10 != null && var10.equals(var9.method_10084()) && !lllIliIlillIliIl.IliIlllilIi(var10)) {
         var9 = var10;
         var11 = true;
      }

      class_2338 var12 = var11 ? var9 : var10;
      if (var12 == null) {
         this.Iliiilliii(now, IliIlllilIi<"IliIlllilIi","RkoPQpaEOW66psUL/Jtkgd5jbCL44mBffhK3+sUDV+fuU1W50Z4=">());
         this.iIliiIIlll = IliIlllilIi<"IliIlllilIi","yAQeV/VrHETTWRdCIgu6XNeqY6j6ub+ViT7aJyp/lz0=">();
      } else {
         boolean var13 = crystals.iliIiiliiiii();
         if (this.IliIiIIlll != null && !this.Illillllil(this.IliIiIIlll, var12, var11, predicted, now, dir, var13)) {
            this.iliiiIiiii(now);
         }

         boolean var14 = crystals.IlIlllIlilIl() != null
            && crystals.IiIlliIliiIl() != null
            && crystals.IlIlllIlilIl().method_10093(crystals.IiIlliIliiIl()).equals(var12);
         class_2338 var15 = var14 ? crystals.IlIlllIlilIl() : null;
         class_2350 var16 = var14 ? crystals.IiIlliIliiIl() : null;
         if (this.IliIiIIlll != null && var11 && !IIiillIiil(this.IliIiIIlll, var15, var16)) {
            this.iliiiIiiii(now);
         }

         if (this.IliIiIIlll == null) {
            this.IliIiIIlll = this.iIiilIliil(var12, var11, predicted, now, var13, var15, var16);
         }

         this.liiIiIIlll = false;
         class_1511 var17 = !crystals.IilliliilIIi() && this.illilIilil(this.IliIiIIlll, dir)
            ? Ililiiillliliiil.iliIiiliiiii(this.IiIIIlliIIIl(predicted, picked, now, dir, this.IlIiiIIlll), var12)
            : null;
         if (var17 != null) {
            this.IliIiIIlll = IIiiilIilIiiilIi.liiiIIllIl(var17, 0.0, now, predicted.method_5628());
         }

         if (!tick && !this.lliililiil(this.IliIiIIlll, dir)) {
            this.Iliiilliii(now, IliIlllilIi<"IliIlllilIi","eTWVD6Sdd1gPbDcIh7Nj+QiJLL/NS4iN90orgM+rEl+aP7L13AQ5">());
            this.iIliiIIlll = IliIlllilIi<"IliIlllilIi","eTWVD6Sdd1gPbDcIh7Nj+QiJLL/NS4iN90orgM+rEl+aP7L13AQ5">();
         } else {
            IlliIlillliIli var18 = this.IliIiIIlll.lIiiIiIlilli() == IlliIlillliIli.IiiiIlIIIl && this.IliIiIIlll.Iiilliiliiil()
               ? IlliIlillliIli.lliiIlIIIl
               : this.IliIiIIlll.lIiiIiIlilli();
            iIlIIlilIllIIlil var19 = Ililiiillliliiil.lIiiIiIlilli(
               this.iiIIIlIIlIIl(predicted, picked, now, dir, this.IlIiiIIlll, this.IliIiIIlll),
               var18,
               this.IliIiIIlll.iliIiiliiiii(),
               iiiilIIIIi(var11, var12, var10),
               this.IliIiIIlll.IiIlliIliiIl(),
               this.IiiIIlliiIIl()
            );
            if (!var19.IliIlllilIi()) {
               this.iIliiIIlll = var19.liiiIIllIl();
               this.IiiIiIIlll = IliIlllilIi<"IliIlllilIi","KQBT3hARcO3RS08hAWYCpbgHt7NYLgx8gnNFJx2bJu7h/A==">() + var19.liiiIIllIl();
               this.iliiiIiiii(now);
               this.llIIIlilIIIl(ilIiiIiIii.Iilllilliill(), ilIiiIiIii.IIillIiliIil(), now);
            } else {
               this.IliIiIIlll.IIillIiliIil(var19.iliIiiliiiii());
               if (this.IliIiIIlll.lIiiIiIlilli() == IlliIlillliIli.iliiIlIIIl && crystals.IilliliilIIi()) {
                  this.IliIiIIlll.Ililllililil(now);
               }

               this.iIliiIIlll = IliIlllilIi<"IliIlllilIi","j3X4+5fSgWykM15q3RmJ/tGxV7mDR8VDXxIurIR7">();
               this.IiiIiIIlll = null;
               this.IiIliIIlll = 0;
               this.ilIIiIiIIi(this.IliIiIIlll, now, dir);
               if (this.IliIiIIlll == null) {
                  this.iIliiIIlll = IliIlllilIi<"IliIlllilIi","fjBHNkpmp3zoJXZlXB2V7spykCH04W5TbSxLEKftHrhWVa5WcvsGNA==">().equals(this.IiiIiIIlll)
                     ? IliIlllilIi<"IliIlllilIi","LcY82YnGBTcwTNlDCccsdZVq4zPNCZVYBAynDol5YA==">()
                     : (this.IiiIiIIlll == null ? IliIlllilIi<"IliIlllilIi","yAQeV/VrHETTWRdCIgu6XNeqY6j6ub+ViT7aJyp/lz0=">() : this.IiiIiIIlll);
               }
            }
         }
      }
   }

   private boolean lllIiillIi(class_2338 pitch, class_1511 eye, class_243 base, float yaw, float crystal) {
      if (!lllIliIlillIliIl.iIIIlIlIIl(
         lllIliIlillIliIl.IilliliilIIi(pitch), base, yaw, crystal, Double.longBitsToDouble(5172303637165572590L ^ 562869418551869934L)
      )) {
         return false;
      } else {
         class_239 var6 = lllIliIlillIliIl.Iilililiiili(base, yaw, crystal);
         if (eye == null) {
            return lllIliIlillIliIl.IIiilIiiiIii(
                  var6, pitch, class_2350.field_11036, base, Double.longBitsToDouble(7407291577933484697L ^ 2799662166744910595L)
               )
               != null;
         } else {
            if (var6 instanceof class_3966 var7 && var7.method_17782() == eye && this.IilIililIi(pitch, base, yaw, crystal)) {
               return true;
            }

            return false;
         }
      }
   }

   private void lIIlIliIIlIl() {
      float var1 = ilIiiIiIii.Iilllilliill();
      float var2 = ilIiiIiIii.IIillIiliIil();
      if (this.IIlliIIlll) {
         double var3 = Math.abs(liiIIliliiiIIlil.Illlllllilll((double)var1 - (double)this.liIliIIlll));
         double var5 = Math.abs((double)var2 - (double)this.iiIliIIlll);
         if (var3 > Double.longBitsToDouble(-5944957469917482868L ^ -7897780687294483551L)
            || var5 > Double.longBitsToDouble(-3494180286625980340L ^ -1110107173693676703L)) {
            this.lIlliIIlll = var3;
         }
      }

      this.liIliIIlll = var1;
      this.iiIliIIlll = var2;
      this.IIlliIIlll = true;
   }

   private boolean IiIliliIli() {
      return this.lIIiiIIlll != null && this.lIIiiIIlll.iliIiiliiiii();
   }

   @Override
   public boolean IlIllllIll() {
      return this.lIIiiIIlll == null && this.liIlliiIll();
   }

   private int illiIlIiliIl() {
      return liiIIliliiiIIlil.IIiilIiiiIii(illIllilIilIllil.IiIlliIliiIl());
   }

   static long iIiiIlIliiIl() {
      return IIIiillllIIiilll.IliIlllilIi();
   }

   private boolean llllIlilllIl(long tick) {
      if (!this.iIlliIIlll) {
         return true;
      } else if (this.lllliIIlll != tick && !IIllIIlilIllIIli.IiIlliIliiIl() && !IIllIIlilIllIIli.IliIlllilIi() && !IIIIilIilIIIilIi.lIIlliIIll()) {
         if (Iiiilllliiilll.field_1724.method_31548().method_67532() == this.IllliIIlll) {
            if (this.IlIiillIii() || this.liIiiiiIii()) {
               return false;
            }

            IilIIililIIi.liiiIIllIl();
            this.lllliIIlll = tick;
         } else {
            IilIIililIIi.iIlIlllllill();
         }

         this.iIlliIIlll = false;
         this.IllliIIlll = -1;
         this.illliIIlll = false;
         return true;
      } else {
         return false;
      }
   }

   private boolean IllIIllllIIl(IIiiilIilIiiilIi a) {
      return this.lIIiiIIlll == null || this.lIIiiIIlll.IilliliilIIi(a);
   }

   private int lIIIiiIIIi(boolean trust) {
      if (this.IiIliliIli()) {
         return 1;
      } else {
         return trust ? 2 : this.illiIlIiliIl();
      }
   }

   @Override
   protected void Iilililiiili() {
      if (this.lIIiiIIlll == null) {
         this.IillIllillIl();
         this.lIilIliIilIl();
      }
   }

   private void llIiIlilIiIl(Matrix4f tickDelta, class_1309 matrix, float rgb, int entity) {
      class_243 var5 = matrix.method_30950(rgb);
      double var6 = matrix instanceof class_1657 ? 0.7 : Math.max(0.3, (double)matrix.method_17681());
      float var8 = iIiiIIilIliiIIil.Iiilliiliiil(var5.field_1351);
      float var9 = iIiiIIilIliiIIil.Iiilliiliiil(var5.field_1351 + (double)matrix.method_17682());
      int var10 = 838860800 | entity;
      int var11 = entity;
      class_4588 var12 = iIiiIIilIliiIIil.IilliliilIIi();

      for (int var13 = 0; var13 < 50; var13++) {
         double var14 = (Math.PI * 2) * (double)var13 / 50.0;
         double var16 = (Math.PI * 2) * (double)(var13 + 1) / 50.0;
         float var18 = iIiiIIilIliiIIil.Ililllililil(var5.field_1352 + Math.cos(var14) * var6);
         float var19 = iIiiIIilIliiIIil.IIIilIIiiIIi(var5.field_1350 + Math.sin(var14) * var6);
         float var20 = iIiiIIilIliiIIil.Ililllililil(var5.field_1352 + Math.cos(var16) * var6);
         float var21 = iIiiIIilIliiIIil.IIIilIIiiIIi(var5.field_1350 + Math.sin(var16) * var6);
         iIiiIIilIliiIIil.IlIlllIlilIl(
            var12, tickDelta, var18, var8, var19, var10, var20, var8, var21, var10, var20, var9, var21, var11, var18, var9, var19, var11
         );
      }
   }

   @Override
   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      this.IiIilliIil(event);
   }

   private void IillIllillIl() {
      if (this.iIlliIIlll && Iiiilllliiilll.field_1724 != null && IilIIililIIi.IilliliilIIi()) {
         if (Iiiilllliiilll.field_1724.method_31548().method_67532() == this.IllliIIlll) {
            IilIIililIIi.liiiIIllIl();
         } else {
            IilIIililIIi.iIlIlllllill();
         }
      }

      this.iIlliIIlll = false;
      this.IllliIIlll = -1;
      this.illliIIlll = false;
   }

   static boolean IIiillIiil(IIiiilIilIiiilIi a, class_2338 face, class_2350 support) {
      return a != null && a.lIiiIiIlilli() == IlliIlillliIli.IiiiIlIIIl && !a.Iiilliiliiil() && face != null && support != null
         ? face.equals(a.IIIllIIliIIl()) && support == a.IlIlllIlilIl()
         : true;
   }

   private static boolean Iiililiili() {
      if (llilIllililIll.iliIiiliiiii(IIiiIillIiiIil.class) instanceof IIiiIillIiiIil var0 && var0.IliIlllilIi() && var0.iIiIIlIliIIl()) {
         return true;
      }

      return false;
   }

   private boolean liIiiiiIii() {
      return this.IIiliIIlll >= 0 && Iiiilllliiilll.field_1724.method_31548().method_67532() != this.IIiliIIlll;
   }

   private void llIililIil(boolean useTick) {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1761 != null) {
         long var2 = IIllIIlilIllIIli.IlIlllIlilIl();
         long var4 = iIiiIlIliiIl();
         if (Iiiilllliiilll.field_1687 != this.IIIiiIIlll) {
            this.IIIiiIIlll = Iiiilllliiilll.field_1687;
            this.iillIlIIilIl();
            this.lIilIliIilIl();
            this.IlilIlllilIl();
         }

         if (Iiiilllliiilll.field_1724 != this.lIiliIIlll) {
            this.lIiliIIlll = Iiiilllliiilll.field_1724;
            this.lilliIIlll = Integer.MIN_VALUE;
            this.iilliIIlll = Integer.MIN_VALUE;
         }

         this.lIIlIliIIlIl();
         if (Iiiilllliiilll.field_1724.method_29504()) {
            this.liiliIIlll = Iiiilllliiilll.field_1724.method_24515();
            this.iiiliIIlll = var4;
         }

         this.iIiIiIIlll.Iilllilliill(var4, var2);
         this.IlIlIlllIlIl();
         this.ilIlIlIiIlIl(var2, var4);
         if (this.iIlliIIlll && !IilIIililIIi.IilliliilIIi()) {
            this.iIlliIIlll = false;
            this.IllliIIlll = -1;
            this.illliIIlll = false;
         }

         if (Iiiilllliiilll.field_1755 != null || Iiiilllliiilll.field_1724.method_29504() || lilIliIiiilIliIi.iiiIlIIIll()) {
            this.IIIIIllIIIIl(var2, false);
            this.liiiiiiiii(var4);
            this.IliliIIlll = null;
         } else if (!useTick) {
            this.IiIliIIlll++;
         } else {
            if (this.iiIiIlIIliIl()) {
               if (this.IliIiIIlll != null) {
                  this.iliiiIiiii(var2);
               }

               this.liiiiiiiii(var4);
               this.iIIIIlIlIIIl(var2);
               this.iiIliIIlli(var2, var4);
            } else {
               this.IliliIIlll = null;
               this.iiIilIIlil(var2, var4);
            }

            this.iIllIlIlllIl(var2);
         }
      }
   }

   private void IIIIIllIIIIl(long tick, boolean smooth) {
      if (this.IliIiIIlll != null) {
         this.iliiiIiiii(tick);
      }

      if (!smooth) {
         this.liiIiIIlll = false;
      }
   }

   private void iiIliIIlli(long now, long tick) {
      this.IliliIIlll = null;
      if (this.lilliiilli()) {
         class_746 var5 = Iiiilllliiilll.field_1724;
         if (!this.liiIiIIlll && !var5.method_6115() && !iiiliIIIii(var5) && !Iiililiili()) {
            if (!this.iilIiIIlll.Iilllilliill() || !this.ililIlIiilIl(tick)) {
               if (this.illliIIlll) {
                  if (!this.llllIlilllIl(now)) {
                     return;
                  }

                  if (!var5.method_6047().method_31574(class_1802.field_8301)) {
                     return;
                  }
               }

               class_243 var6 = var5.method_33571();
               float var7 = var5.method_36454();
               float var8 = var5.method_36455();
               class_239 var9 = lllIliIlillIliIl.Iilililiiili(var6, var7, var8);
               boolean var10 = this.IIliilIlii();
               if (var9 instanceof class_3966 var14) {
                  if (var14.method_17782() instanceof class_1511 var15) {
                     this.lIlliiIlli(var15, var10, now, tick);
                  }
               } else if (var9 instanceof class_3965 var11) {
                  class_2338 var12 = var11.method_17777();
                  if (lllIliIlillIliIl.IliIlllilIi(var12)) {
                     this.Illlilllli(var11, var12, var10, var7, var8, now, tick);
                  } else if (this.lilIiIIlll.Iilllilliill()) {
                     this.illliIilli(var11, var10, var7, var8, now, tick);
                  }
               }
            }
         }
      }
   }

   private boolean illilIilil(IIiiilIilIiiilIi a, long now) {
      return a != null && this.IlIiiIIlll != null && this.IlIiiIIlll.iIlIlllllill() != null && this.IlIiiIIlll.iIlIlllllill().Illlllllilll()
         ? lililiilil(
            a.lIiiIiIlilli(),
            a.Iiilliiliiil(),
            a.lIiiIiIlilli() == IlliIlillliIli.lliiIlIIIl && this.iIiIiIIlll.IiIlliIliiIl(a.iliIiiliiiii().method_10063(), now)
         )
         : false;
   }

   public IlliIlllllliIlll Iillllilll(iiilililIIIiilil useTick, boolean newOrder) {
      if (this.lIIiiIIlll != null
         && useTick != null
         && Iiiilllliiilll.field_1724 != null
         && Iiiilllliiilll.field_1687 != null
         && Iiiilllliiilll.field_1761 != null) {
         this.IlIiiIIlll = useTick;
         this.iIliiIIlll = null;
         this.iIiIiIIlll
            .iliIiiliiiii(
               this.IiIliliIli()
                  ? Math.max(
                     -7068912748932974812L ^ -7068912748932974670L,
                     2L * (long)illIllilIilIllil.IiIlliIliiIl() + (-9206443543067426403L ^ -9206443543067426311L)
                  )
                  : -4896135794028561731L ^ -4896135794028562091L
            );
         this.llIililIil(newOrder);
         return this.ilillIiill();
      } else {
         return this.ilillIiill();
      }
   }

   private float iIiIIlIliIIl() {
      return this.lIIiiIIlll == null ? iIiIlillIliIlill.ilillIiill() : Iiiilllliiilll.field_1724.method_36454();
   }

   private void iiiIIlIIIlIl(int slot, long tick) {
      this.lIliiIIlll = slot;
      this.IIliiIIlll = tick;
      this.lIIiiIIlll.lIiiIiIlilli(slot);
   }

   public boolean liIlliiIll() {
      if ((this.IliIlllilIi() || this.lIIiiIIlll != null)
         && Iiiilllliiilll.field_1724 != null
         && Iiiilllliiilll.field_1690 != null
         && !lilIliIiiilIliIi.iiiIlIIIll()) {
         if (this.liiIiIIlll) {
            return true;
         } else {
            return this.iiIiIlIIliIl() ? this.lilliiilli() : this.IliIiIIlll != null;
         }
      } else {
         return false;
      }
   }

   private static long IIiiIllIiiIl() {
      return (-3237464473487036873L ^ -3237464473487036923L) + ThreadLocalRandom.current().nextLong(-1591631241550348786L ^ -1591631241550348693L);
   }

   private void iIIilIlIil() {
      this.llIiiIIlll = 7735549562498222922L ^ -1487822474356552886L;
      this.ilIiiIIlll = 3736081764308756615L ^ -5487290272546019193L;
      this.IiIiiIIlll = null;
      this.liIiiIIlll = -4043744815800013786L ^ 5179627221054762022L;
      this.iiIiiIIlll = 335726380172686525L ^ -8887645656682089283L;
      this.IIliiIIlll = 2685797613459187595L ^ -6537574423395588213L;
      this.lIliiIIlll = -1;
      this.iIliiIIlll = null;
   }

   private boolean IIliilIlii() {
      if (IIllIIlilIllIIli.IliIlllilIi() || IIIIilIilIIIilIi.lIIlliIIll() || Iiiilllliiilll.field_1724.method_6115()) {
         return false;
      } else if (this.ilIiiIiIii()) {
         return false;
      } else if (Iiiilllliiilll.field_1761.method_2923()) {
         this.IilliIIlll = true;

         try {
            Iiiilllliiilll.field_1761.method_2925();
         } finally {
            this.IilliIIlll = false;
         }

         return false;
      } else {
         return true;
      }
   }

   private void Iliiilliii(long tick, String why) {
      this.IiiIiIIlll = why;
      if (this.IliIiIIlll != null) {
         this.iliiiIiiii(tick);
      }

      this.liiiiiiiii(iIiiIlIliiIl());
      this.IiIliIIlll++;
      this.iIIIIlIlIIIl(tick);
   }

   private void iIIiIlIlIiIl(Matrix4f rgb, class_2338 pos, int matrix) {
      float var4 = iIiiIIilIliiIIil.Ililllililil((double)pos.method_10263());
      float var5 = iIiiIIilIliiIIil.Iiilliiliiil((double)pos.method_10264());
      float var6 = iIiiIIilIliiIIil.IIIilIIiiIIi((double)pos.method_10260());
      float var7 = (float)(matrix >> 16 & 0xFF) / 255.0F;
      float var8 = (float)(matrix >> 8 & 0xFF) / 255.0F;
      float var9 = (float)(matrix & 0xFF) / 255.0F;
      iIiiIIilIliiIIil.IIlilIliiIli(rgb, var4, var5, var6, var4 + 1.0F, var5 + 1.0F, var6 + 1.0F, var7, var8, var9, 0.12F);
      iIiiIIilIliiIIil.iIIIlIlIIl(rgb, var4, var5, var6, var4 + 1.0F, var5 + 1.0F, var6 + 1.0F, -1073741824 | matrix, 1.5F);
   }

   private static boolean iIiliIlili(class_304 binding) {
      if (Iiiilllliiilll.field_1755 == null && Iiiilllliiilll.method_1569()) {
         class_306 var1 = ((AccessorKeyBinding)binding).getBoundKey();
         long var2 = Iiiilllliiilll.method_22683().method_4490();
         if (var1.method_1442() == class_307.field_1672) {
            return GLFW.glfwGetMouseButton(var2, var1.method_1444())
               == (((-909766770 >>> 17 | -909766770 << 15) << 3 | (-909766770 >>> 17 | -909766770 << 15) >>> 29) ^ 1044064025);
         } else {
            return var1.method_1442() != class_307.field_1668
               ? false
               : var1.method_1444() != class_3675.field_16237.method_1444()
                  && GLFW.glfwGetKey(var2, var1.method_1444()) == ((~-1795133009 - -103) * -1483715975 - -79 ^ 435903183);
         }
      } else {
         return false;
      }
   }

   static int IliIilliIi(double deg) {
      if (Double.isNaN(deg) || Double.isInfinite(deg)) {
         return 9;
      } else {
         return !(deg > 1.0) ? 0 : (int)Math.min(9.0, Math.ceil(deg / 20.0));
      }
   }

   private double lliIIliliIIl() {
      return this.lIIiiIIlll != null && this.IlIiiIIlll != null && this.IlIiiIIlll.iIlIlllllill() != null
         ? this.IlIiiIIlll.iIlIlllllill().Ililllililil()
         : Double.longBitsToDouble(-7408209681041712927L ^ -2780057376476751647L);
   }

   private IillIiillillIiil iiIIIlIIlIIl(class_1309 tick, iIIlIIiIlIlIIi now, long predicted, long picked, iiilililIIIiilil a, IIiiilIilIiiilIi o) {
      IillIiillillIiil var9 = this.IiIIIlliIIIl(tick, now, predicted, picked, a);
      return o != null && o.lIiiIiIlilli() == IlliIlillliIli.IiiiIlIIIl ? var9.IliIlllilIi(new ilIIiiiIiIIiii(o.IIIllIIliIIl(), o.IlIlllIlilIl())) : var9;
   }

   public lIIiIiiIIiIi lIilliIill() {
      return this.iIiIiIIlll;
   }

   private boolean lliililiil(IIiiilIilIiiilIi a, long now) {
      return a != null
         && Iiiilliiil(a.lIiiIiIlilli(), a.lIiiIiIlilli() == IlliIlillliIli.lliiIlIIIl && this.iIiIiIIlll.IiIlliIliiIl(a.iliIiiliiiii().method_10063(), now));
   }

   @Override
   protected void Illillliilli() {
      if (this.lIIiiIIlll == null) {
         this.lIilIliIilIl();
         this.IlilIlllilIl();
         this.IIIiiIIlll = Iiiilllliiilll.field_1687;
         this.lIiliIIlll = Iiiilllliiilll.field_1724;
      }
   }

   private boolean IIililIili() {
      class_304 var1 = Iiiilllliiilll.field_1690.field_1904;
      return var1.method_1434() || ((AccessorKeyBinding)var1).corzGetTimesPressed() > 0 || iIiliIlili(var1);
   }

   private void llIIIlilIIIl(float pitch, float tick, long yaw) {
      if (this.lIIiiIIlll != null) {
         this.lIIiiIIlll.liiiIIllIl(pitch, tick);
      } else {
         ilIiiIiIii.liiiIIllIl(this, pitch, tick, (1656070807 - -87 << 23 | 1656070807 - -87 >>> 9) ^ 1999723159, true, true);
      }

      this.IIIliIIlll = yaw;
      this.lIIliIIlll = pitch;
      this.iIIliIIlll = tick;
   }

   private boolean iliIiIiiIi(class_2338 tick, long base) {
      return this.IiIliliIli() && liiIiiiiIi(tick, this.IiIiiIIlll, this.ilIiiIIlll, base);
   }

   private class_243 IIlIilIlIi(class_2338 crystal, class_1511 eye, class_243 pitch, float fallback, float yaw, class_243 base) {
      long var9 = -3562573399377132902L;
      if (crystal != null && this.iilIiIIiIi()) {
         var9 ^= ((long)(base == null ? -47194761 - -59 ^ -47194693 : IliIilliIi(lIiIiiIiIi(pitch, fallback, yaw, base))) << 32 ^ var9) & -1L << 32;
         class_243 var8 = this.iIlIiIllIi(crystal, eye, pitch, fallback, yaw, (int)(var9 >>> 32));
         return var8 != null ? var8 : base;
      } else {
         return base;
      }
   }

   private void IIllIllIllIl(int slot, long tick) {
      IilIIililIIi.IliIlllilIi(slot);
      this.iIlliIIlll = true;
      this.IllliIIlll = slot;
      this.lllliIIlll = tick;
   }

   private boolean iilIiIIiIi() {
      for (class_2350 var4 : this.IiiIIlliiIIl()) {
         if (var4 == class_2350.field_11036) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean ilIllIiIll() {
      return this.lIIiiIIlll == null && this.liIlliiIll();
   }

   public boolean IIllllIlll(Object owner, iiIIilllIIlIilll newDriver) {
      if (owner != null && newDriver != null && (this.iIIiiIIlll == null || this.iIIiiIIlll == owner)) {
         if (this.iIIiiIIlll == owner) {
            this.lIIiiIIlll = newDriver;
            return true;
         } else {
            this.iillIlIIilIl();
            this.lIilIliIilIl();
            if (!this.IliIlllilIi()) {
               this.IlilIlllilIl();
               this.IIIiiIIlll = Iiiilllliiilll.field_1687;
               this.lIiliIIlll = Iiiilllliiilll.field_1724;
            }

            this.iIIilIlIil();
            this.iIIiiIIlll = owner;
            this.lIIiiIIlll = newDriver;
            this.IlIiiIIlll = null;
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   protected void Iliilliiilii(lIiIlliiIiIlli event) {
      if (this.lIiIiIIlll.Iilllilliill() && Iiiilllliiilll.field_1724 != null && event.IIiIilIIIl != null) {
         class_332 var2 = event.IIiIilIIIl;
         int var3 = this.IiIiIlliIiIl();
         boolean var4 = this.liIlliiIll();
         int var5 = var4 ? -5635841 : (var3 >= 32 ? -16597446 : (var3 >= 16 ? -1774 : -60396));
         String var6 = String.valueOf(var3);
         String var7 = !var4 && !this.iiIiIlIIliIl() && this.IiiIiIIlll != null
            ? IliIlllilIi<"IliIlllilIi","qOQ5i6fNv5SkpDlVS3YUcK7motLNXQzw1rhHEh2w">()
               + this.IiiIiIIlll
               + IliIlllilIi<"IliIlllilIi","KL88X285DR3BfK1UUdxEN2ysU+Aq88KqKKt6aW4=">()
            : "";
         int var8 = Iiiilllliiilll.field_1772.method_1727(var6 + var7);
         int var9 = var2.method_51421() / 2 - var8 / 2;
         int var10 = var2.method_51443() / 2 + 10;
         var2.method_25303(Iiiilllliiilll.field_1772, var6, var9, var10, var5);
         if (!var7.isEmpty()) {
            var2.method_25303(Iiiilllliiilll.field_1772, var7, var9 + Iiiilllliiilll.field_1772.method_1727(var6), var10, -43691);
         }
      }
   }

   static boolean lililiilil(IlliIlillliIli pendingPlace, boolean kind, boolean attempted) {
      return pendingPlace == IlliIlillliIli.lliiIlIIIl ? !attempted : pendingPlace == IlliIlillliIli.IiiiIlIIIl && !kind;
   }
}
