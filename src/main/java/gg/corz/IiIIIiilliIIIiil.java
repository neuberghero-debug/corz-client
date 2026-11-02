package gg.corz;

import com.corz.client.mixins.AccessorClientPlayerInteractionManager;
import it.unimi.dsi.fastutil.ints.IntIterator;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import net.minecraft.class_1268;
import net.minecraft.class_1661;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2346;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_9334;
import net.minecraft.class_2338.class_2339;
import net.minecraft.class_2350.class_2351;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

public final class IiIIIiilliIIIiil {
   private Set<Long> lllIIillil;
   private final List<lllilIIlillilIIl> IIilIillil;
   private int illlIillil;
   private static final Set<class_1792> IIliilllil = Set.of(
      class_1802.field_8831,
      class_1802.field_8460,
      class_1802.field_28655,
      class_1802.field_8270,
      class_1802.field_8382,
      class_1802.field_20412,
      class_1802.field_29025,
      class_1802.field_20392,
      class_1802.field_23843,
      class_1802.field_20391,
      class_1802.field_28866,
      class_1802.field_8328,
      class_1802.field_20394,
      class_1802.field_20401,
      class_1802.field_20407,
      class_1802.field_27021,
      class_1802.field_20399,
      class_1802.field_20395,
      class_1802.field_20398,
      class_1802.field_20384,
      class_1802.field_28043
   );
   private int ilIlIillil;
   private final class_310 lIlIIillil;
   private boolean IliIIillil;
   private final class_2339 iiliIillil;
   private final LongOpenHashSet iiIiIillil;
   private int iilIIillil;
   private int lIiIIillil;
   private int IiliIillil;
   private static final int iiliilllil = 80;
   private static final float llIIIillil = 0.2F;
   private static final int liiiilllil = 6;
   private int lillIillil;
   private static final int IIIIIillil = 5;
   private class_2338 lliIIillil;
   private final IliiIlillliiIlil iIlIIillil;
   private class_2338 IlilIillil;
   private class_2338 iiilIillil;
   private static final double iiIIIillil = 2.6;
   private float iIllIillil;
   private double IlIiIillil;
   private class_2680 iillIillil;
   private int IiilIillil;
   private float iiIlIillil;
   private static final float Iiiiilllil = 0.22F;
   private int llIiIillil;
   private double iIliIillil;
   private int IIIiIillil;
   private class_2350 liiIIillil;
   private static final float liIIIillil = 32.0F;
   private final Random IllIIillil = new Random();
   private int iIiIIillil;
   private static final int Iliiilllil = 15;
   private static final int iIiiilllil = 3;
   private float IiIlIillil;
   private static final int liliilllil = 400;
   private static final int IIiiilllil = 80;
   private int IilIIillil;
   private static final int lIliilllil = 10;
   private float IlllIillil;
   private boolean iIilIillil;
   private static final float IiIIIillil = 72.0F;
   private int IlliIillil;
   private boolean iliIIillil;
   private int lilIIillil;
   private int lIliIillil;
   private static final float Illiilllil = 60.0F;
   private class_2338 IiIiIillil;
   private final Long2IntOpenHashMap lIIlIillil = new Long2IntOpenHashMap();
   private boolean ilIiIillil;
   private int llilIillil;
   private class_2338 IiiIIillil;
   private final Long2IntOpenHashMap iIIlIillil = new Long2IntOpenHashMap();
   private static final float iIIIIillil = 6.0F;
   private static final int lIiiilllil = 40;
   private static final int lliiilllil = 20;
   private class_2338 iiiIIillil;
   private static final float ilIIIillil = 0.12F;
   private static final int iliiilllil = 1200;
   private int liilIillil;
   private static final int llliilllil = 40;
   private static final int iIliilllil = 24;
   private int illiIillil;
   private int IillIillil;
   private boolean lIilIillil;
   private int lIIiIillil;
   private boolean llliIillil;
   private final class_2339 liliIillil;
   private boolean IIIlIillil;
   private float IIllIillil;
   private int IIiIIillil;
   private boolean lIllIillil;
   private int ililIillil;
   private final Long2IntOpenHashMap IlIlIillil = new Long2IntOpenHashMap();
   private float liIlIillil;
   private static final int illiilllil = 12;
   private int llIlIillil = Integer.MIN_VALUE;
   private static final class_2350[] IIlIIillil = class_2350.values();
   private static final int iiiiilllil = 1;
   private LongOpenHashSet illIIillil;
   private int liIiIillil;
   private int IIliIillil;
   private int iIIiIillil;
   private static final float IlIIIillil = 0.8F;
   private int llllIillil;
   private static final int lIIIIillil = 20;
   private static final int Iiliilllil = 60;

   private boolean IIllllIlll() {
      long var4 = -248626085129869491L;
      long var6 = -5538246859322747107L;
      var4 ^= ((long)this.lIlIIillil.field_1724.method_7344().method_7586() << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)Math.min(20, 15) ^ var4) & -1L >>> 32;
      if (!this.lIilIillil && (int)(var4 >>> 32) > 10) {
         return false;
      } else if (this.lIilIillil && (int)(var4 >>> 32) >= (int)var4) {
         this.lIilIillil = false;
         return false;
      } else {
         var6 ^= ((long)this.iIlllIllll() << 32 ^ var6) & -1L << 32;
         if ((int)(var6 >>> 32) < 0) {
            this.lIilIillil = false;
            return false;
         } else {
            this.lIilIillil = true;
            this.IIIIllIIIl();
            if (this.lIlIIillil.field_1724.method_31548().method_67532() != (int)(var6 >>> 32)) {
               this.lIlIIillil.field_1724.method_31548().method_61496((int)(var6 >>> 32));
            }

            this.lllllillll(this.lIlIIillil.field_1724.method_33571().method_1031(0.0, 4.0, 0.0));
            this.lIlIIillil.field_1690.field_1904.method_23481(true);
            return true;
         }
      }
   }

   private class_2338 IIlilIliiIli() {
      long var21 = 6531674555578171881L;
      long var23 = -2279797680258602066L;
      class_2338 var1 = this.Illillliilli(20);
      if (var1 != null) {
         return var1;
      } else {
         class_2338 var2 = this.Iilililiiili();
         if (var2 != null) {
            return var2;
         } else {
            class_2338 var3 = this.lIlIIillil.field_1724.method_24515();
            class_2338 var4 = null;
            double var5 = Double.MAX_VALUE;

            for (long var8 : this.lllIIillil) {
               long var25 = var21 ^ ((long)class_2338.method_10061(var8) << 32 ^ var21) & -1L << 32;
               var21 = var25 ^ ((long)class_2338.method_10071(var8) ^ var25) & -1L >>> 32;
               var23 ^= ((long)class_2338.method_10083(var8) << 32 ^ var23) & -1L << 32;
               double var13 = (double)((int)(var21 >>> 32) - var3.method_10263());
               double var15 = (double)((int)var21 - var3.method_10264());
               double var17 = (double)((int)(var23 >>> 32) - var3.method_10260());
               double var19 = var13 * var13 + var15 * var15 + var17 * var17;
               if (!(var19 >= var5)) {
                  this.liliIillil.method_10103((int)(var21 >>> 32), (int)var21, (int)(var23 >>> 32));
                  if (!this.iiIIlIIlIl(this.liliIillil)
                     && this.llIililIil(this.liliIillil)
                     && this.IiIilliIil(this.liliIillil)
                     && !this.illilIilil((int)(var21 >>> 32), (int)var21, (int)(var23 >>> 32))) {
                     var4 = class_2338.method_10092(var8);
                     var5 = var19;
                  }
               }
            }

            return var4;
         }
      }
   }

   private void lliIliliIl(class_2338 goal) {
      class_2338 var2 = this.lIlIIillil.field_1724.method_24515();
      this.iIilIillil = true;
      this.IlilIillil = goal;
      this.llilIillil = var2.method_10263();
      this.ililIillil = var2.method_10260();
      this.IiilIillil = var2.method_10264();
      this.liilIillil = var2.method_10264() - 1;
      this.iiilIillil = null;
      this.lIIiIillil = 0;
      this.iIIiIillil = 0;
      this.IlIiIillil = this.lIlIIillil.field_1724.method_23318();
      this.lliIIillil = null;
      this.IIIIllIIIl();
   }

   public boolean liiiIIllIl() {
      return this.lllIIillil != null && !this.lllIIillil.isEmpty();
   }

   private void ilIIiIiIIi() {
      this.lIlIIillil.field_1690.field_1894.method_23481(false);
      illIilIilIil.IliIlllilIi(this.lIlIIillil.field_1690.field_1867, false);
      illIilIilIil.IliIlllilIi(this.lIlIIillil.field_1690.field_1832, false);
      this.lIlIIillil.field_1690.field_1903.method_23481(false);
      this.lIlIIillil.field_1690.field_1904.method_23481(false);
   }

   private boolean iiIIlIIlIl(class_2338 pos) {
      long var2 = pos.method_10063();
      if (this.lIIlIillil.get(var2) > this.IlliIillil) {
         return true;
      } else {
         return this.iIIlIillil.get(var2) > this.IlliIillil ? true : this.lIlIliIlIl(pos);
      }
   }

   public void Iiilliiliiil() {
      long var9 = 8931515940713583632L;
      long var11 = -1332109626819049513L;
      if (this.lIlIIillil.field_1724 != null && this.lIlIIillil.field_1687 != null && this.lIlIIillil.field_1761 != null) {
         this.ilIIiIiIIi();
         this.lIllIillil = false;
         this.IIIlIillil = false;
         if (this.iIlIIillil.lIiiIiIlilli() && this.lIlIIillil.field_1755 != null) {
            this.IIIIllIIIl();
         } else if (this.liiiIIllIl() && !this.IliIIillil) {
            this.IlliIillil++;
            ((AccessorClientPlayerInteractionManager)this.lIlIIillil.field_1761).setBlockBreakingCooldown(0);
            this.IlIIillIIi();
            if (!this.iIlIIillil.IilliliilIIi() || !this.IIllllIlll()) {
               this.lIilIillil = false;
               if ((this.IlliIillil & 63) == 0) {
                  this.IllIllllIl();
               }

               this.llIIlilIIl();
               if (this.iIilIillil) {
                  this.iiiIlIIIll();
               } else {
                  if (this.lliIIillil != null && (!this.lililiilil(this.lliIIillil) || !this.llIililIil(this.lliIIillil) || !this.IiIilliIil(this.lliIIillil))) {
                     if (this.lIlIIillil.field_1687.method_8320(this.lliIIillil).method_26215()) {
                        this.iIIlIillil.put(this.lliIIillil.method_10063(), this.IlliIillil + 15);
                        if (this.iliIIillil && this.lliIIillil.equals(this.IiiIIillil)) {
                           this.iIIIlIlIIl(this.lliIIillil);
                        }
                     }

                     this.lliIIillil = null;
                     this.IIIIllIIIl();
                  }

                  if (this.lliIIillil == null) {
                     class_2338 var1 = null;
                     class_2338 var2 = this.Iilililiiili();
                     if (var2 != null && this.liilliiill(var2)) {
                        var1 = var2;
                     }

                     if (var1 == null) {
                        var1 = this.IiIiliIiiiIi();
                     }

                     if (var1 != null) {
                        this.IlIillIiilIi(var1);
                     }
                  }

                  var9 ^= ((long)(this.iliIIillil && this.lliIIillil != null && this.lliIIillil.equals(this.IiiIIillil) ? 1 : 0) << 32 ^ var9) & -1L << 32;
                  var9 ^= ((long)(!this.lIlIIillil.field_1724.method_24828() && (int)(var9 >>> 32) == 0 ? 0 : 1) ^ var9) & -1L >>> 32;
                  if (this.lliIIillil != null && this.liilliiill(this.lliIIillil) && (int)var9 != 0) {
                     this.iiiIIillil = null;
                     this.lIliIillil = 0;
                     this.lilIliilIl(this.lliIIillil);
                     float[] var3 = this.lllllillll(class_243.method_24953(this.lliIIillil));
                     if ((int)(var9 >>> 32) != 0) {
                        this.IIiilIiiiIii(this.lliIIillil, this.liiIIillil);
                        this.illlIillil = 0;
                        return;
                     }

                     class_3965 var4 = this.iilllIIill(this.lIlIIillil.field_1724.method_33571(), var3[0], var3[1], this.ilillIiill());
                     if (var4.method_17783() == class_240.field_1332 && var4.method_17777().equals(this.lliIIillil)) {
                        this.illlIillil = 0;
                        var11 ^= ((long)(!lIilliIill(var4, this.lliIIillil, 0.22F) && this.IillIillil < 6 ? 0 : 1) << 32 ^ var11) & -1L << 32;
                        if (++this.IillIillil >= 1 && this.IlliIillil >= this.llllIillil && (int)(var11 >>> 32) != 0) {
                           this.IIiilIiiiIii(this.lliIIillil, var4.method_17780());
                        }

                        return;
                     }

                     if (var4.method_17783() == class_240.field_1332 && this.IlllIillil < 6.0F) {
                        class_2338 var5 = var4.method_17777();
                        if (!var5.equals(this.lliIIillil)
                           && this.lililiilil(var5)
                           && this.llIililIil(var5)
                           && this.IiIilliIil(var5)
                           && !this.lIlIliIlIl(var5)
                           && !this.IIIillIIil(var5)) {
                           this.IlIillIiilIi(var5);
                           return;
                        }
                     }

                     this.IillIillil = 0;
                     if (!(this.IlllIillil < 6.0F) || ++this.illlIillil <= 3) {
                        return;
                     }

                     this.iiiilIIIIi(this.lliIIillil);
                     this.lliIIillil = null;
                  }

                  class_2338 var13 = this.lIlIIillil.field_1724.method_24515().method_10074();
                  class_2338 var14 = this.IIiIllIiIl();
                  if (!this.iliIIillil || this.IiiIIillil == null || !this.IiiIIillil.equals(var13) && !this.IiiIIillil.equals(var14)) {
                     this.IIIIllIIIl();
                  }

                  var11 ^= (
                        (long)(
                                 this.iiiIIillil != null
                                       && this.lililiilil(this.iiiIIillil)
                                       && this.llIililIil(this.iiiIIillil)
                                       && this.IiIilliIil(this.iiiIIillil)
                                       && !this.iiIIlIIlIl(this.iiiIIillil)
                                    ? 0
                                    : 1
                              )
                              << 32
                           ^ var11
                     )
                     & -1L << 32;
                  if ((int)(var11 >>> 32) != 0) {
                     class_2338 var6 = this.iiiIIillil;
                     this.iiiIIillil = this.IIlilIliiIli();
                     if (!Objects.equals(var6, this.iiiIIillil)) {
                        this.lIliIillil = 0;
                        this.iIliIillil = Double.MAX_VALUE;
                     }
                  }

                  if (this.iiiIIillil == null) {
                     this.lIIIiiIIIi();
                  } else {
                     if (this.IlliIillil - this.illiIillil > 40) {
                        double var15 = Math.sqrt(
                           this.lIlIIillil
                              .field_1724
                              .method_5649(
                                 (double)this.iiiIIillil.method_10263() + 0.5,
                                 (double)this.iiiIIillil.method_10264() + 0.5,
                                 (double)this.iiiIIillil.method_10260() + 0.5
                              )
                        );
                        String var8 = this.Iiiiliiiiiii()
                           ? ""
                           : liIIiiiIIi<"liIIiiiIIi","jffFs+pxcoVdtlyAJrNRy53q8UaUTtKfzd268odM6Z51Z0E9DMXYluSEOreFniu2754tcIEhxEqcD8U/">();
                        this.Iliilliiilii(
                           liIIiiiIIi<"liIIiiiIIi","M9q3C0SV4dGclezi8J63U4elZxe25RzwWrDhoZyhA9qgyWfHLKr0">()
                              + IiIIlliIIl(this.iiiIIillil)
                              + liIIiiiIIi<"liIIiiiIIi","dGUTzB34EFRM5MB7+GuAFPzav+XrAD4Xvl0mqt7ZzEzDdy9Rnw==">()
                              + String.format(liIIiiiIIi<"liIIiiiIIi","ZCCyU/U1ThFkYAQh6m3GIv+a2EYyQPfDolAVUrgfg4s=">(), var15)
                              + (
                                 this.lIlIIillil.field_1724.method_24828()
                                    ? ""
                                    : liIIiiiIIi<"liIIiiiIIi","JVeD85STQzNNuC6kn/Qv8e4KzSTHZqkkPhRPB1xvyrzguBR6GCbmVGve">()
                              )
                              + var8
                        );
                     }

                     this.IIIlIillil = true;
                     this.iIiIlIliIl(this.iiiIIillil);
                  }
               }
            }
         }
      }
   }

   private class_2338 Illillliilli(int radius) {
      long var23 = 1965380597851275409L;
      long var25 = 1638780797426793999L;
      long var27 = 2702187030288789481L;
      long var29 = 5238483165610058234L;
      long var31 = -5495353812413829558L;
      class_2338 var2 = this.lIlIIillil.field_1724.method_24515();
      var23 ^= ((long)Math.max(this.IilIIillil, var2.method_10263() - radius) << 32 ^ var23) & -1L << 32;
      var23 ^= ((long)Math.min(this.IIiIIillil, var2.method_10263() + radius) ^ var23) & -1L >>> 32;
      var25 ^= ((long)Math.max(this.lilIIillil, var2.method_10264() - radius) << 32 ^ var25) & -1L << 32;
      var25 ^= ((long)Math.min(this.lIiIIillil, var2.method_10264() + radius) ^ var25) & -1L >>> 32;
      var27 ^= ((long)Math.max(this.iilIIillil, var2.method_10260() - radius) << 32 ^ var27) & -1L << 32;
      var27 ^= ((long)Math.min(this.iIiIIillil, var2.method_10260() + radius) ^ var27) & -1L >>> 32;
      class_2338 var9 = null;
      double var10 = Double.MAX_VALUE;
      var29 ^= ((long)((int)var25) << 32 ^ var29) & -1L << 32;

      while ((int)(var29 >>> 32) >= (int)(var25 >>> 32)) {
         for (var29 ^= ((long)((int)(var23 >>> 32)) ^ var29) & -1L >>> 32; (int)var29 <= (int)var23; var29 ^= (var29 ^ var29 + (long)1) & -1L >>> 32) {
            for (var31 ^= ((long)((int)(var27 >>> 32)) << 32 ^ var31) & -1L << 32; (int)(var31 >>> 32) <= (int)var27; var31 += 4294967296L) {
               if (this.illIIillil.contains(class_2338.method_10064((int)var29, (int)(var29 >>> 32), (int)(var31 >>> 32)))) {
                  double var15 = (double)((int)var29 - var2.method_10263());
                  double var17 = (double)((int)(var29 >>> 32) - var2.method_10264());
                  double var19 = (double)((int)(var31 >>> 32) - var2.method_10260());
                  double var21 = var15 * var15 + var17 * var17 + var19 * var19;
                  if (!(var21 >= var10)) {
                     this.liliIillil.method_10103((int)var29, (int)(var29 >>> 32), (int)(var31 >>> 32));
                     if (!this.iiIIlIIlIl(this.liliIillil)
                        && this.llIililIil(this.liliIillil)
                        && this.IiIilliIil(this.liliIillil)
                        && !this.illilIilil((int)var29, (int)(var29 >>> 32), (int)(var31 >>> 32))) {
                        var9 = new class_2338((int)var29, (int)(var29 >>> 32), (int)(var31 >>> 32));
                        var10 = var21;
                     }
                  }
               }
            }
         }

         var29 += -4294967296L;
      }

      return var9;
   }

   public void IIillIiliIil() {
      this.lliIIillil = null;
      this.iliIIillil = false;
      this.IiiIIillil = null;
      this.liiIIillil = null;
      this.iiiIIillil = null;
      this.IIIlIillil = false;
      this.lIilIillil = false;
      this.lIliIillil = 0;
      this.llliIillil = false;
      this.iIilIillil = false;
      this.iiilIillil = null;
      this.IlilIillil = null;
      this.iiIiIillil.clear();
      this.liIiIillil = 0;
      this.iIliIillil = Double.MAX_VALUE;
      this.lIllIillil = false;
      this.llllIillil = 0;
      this.illlIillil = 0;
      this.IillIillil = 0;
      this.iillIillil = null;
      this.IIilIillil.clear();
      this.lIIlIillil.clear();
      this.iIIlIillil.clear();
      this.IlIlIillil.clear();
      this.llIlIillil = Integer.MIN_VALUE;
      this.ilIlIillil = -1000;
   }

   private int liIlliiIll() {
      long var4 = 3203628192067720505L;
      class_1661 var1 = this.lIlIIillil.field_1724.method_31548();

      for (long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < 9; var6 += 4294967296L) {
         class_1799 var3 = var1.method_5438((int)(var6 >>> 32));
         if (!var3.method_7960() && var3.method_7909() instanceof class_1747 && IIliilllil.contains(var3.method_7909())) {
            return (int)(var6 >>> 32);
         }
      }

      return -1;
   }

   public int lIiiIiIlilli() {
      return this.lilIIillil;
   }

   public int IlIlllIlilIl() {
      return this.lIiIIillil;
   }

   private void lIIIiiIIIi() {
      this.ilIIiIiIIi();
      if (!this.llliIillil) {
         if (this.llIlIillil != Integer.MIN_VALUE) {
            this.Iliilliiilii(
               liIIiiiIIi<"liIIiiiIIi","iQIQH40z2R+gpP0xdzfWdzukMqaWwK6O4GfTgr693f+cm1cO7Oj00wxrSeFPH+Xc+7x5IKP3VVk6vISb0+0QaLWgjS88mImndUdpvqPfa76KuvGY5eByRx4HcwWsH+aD4wCUk7L64Omgyw==">()
            );
         } else {
            this.llliIillil = true;
            this.IliIIillil = true;
            this.iIlIIillil.IIIllIIliIIl(0);
         }
      }
   }

   private boolean liilliiill(class_2338 pos) {
      class_243 var2 = this.lIlIIillil.field_1724.method_33571();
      return var2.method_1025(iIIilIlIil(var2, pos)) <= this.ilillIiill() * this.ilillIiill();
   }

   public int IilliliilIIi() {
      return this.IilIIillil;
   }

   private void Iliilliiilii(String msg) {
      if (this.IlliIillil - this.IiliIillil >= 60) {
         this.IiliIillil = this.IlliIillil;
         this.iIlIIillil.iliIiiliiiii(msg);
      }
   }

   private static String IiIIlliIIl(class_2338 p) {
      return liIIiiiIIi<"liIIiiiIIi","GhauhFEtAq5RJlfIPFjDCMDtcKOhwHvu/nBObrw=">()
         + p.method_10263()
         + liIIiiiIIi<"liIIiiiIIi","RMi6d8NBpG5I6COlIoAfpU2DJWzMOOBTLhtlu14=">()
         + p.method_10264()
         + liIIiiiIIi<"liIIiiiIIi","RMi6d8NBpG5I6COlIoAfpU2DJWzMOOBTLhtlu14=">()
         + p.method_10260()
         + liIIiiiIIi<"liIIiiiIIi","5saDmglDeJ770WBldlvAZaMKmSEGrMBOiWQZ6W4=">();
   }

   private void iIiilIliil(class_2338 target) {
      double var2 = this.lIlIIillil
         .field_1724
         .method_5649((double)target.method_10263() + 0.5, this.lIlIIillil.field_1724.method_23318(), (double)target.method_10260() + 0.5);
      if (var2 < this.iIliIillil - 0.01) {
         this.iIliIillil = var2;
         this.lIliIillil = 0;
      } else if (++this.lIliIillil > 40) {
         this.lliililiil(target);
      }
   }

   public class_2338 IIlllIlliIll() {
      return this.IiiIIillil != null ? this.IiiIIillil : this.lliIIillil;
   }

   private boolean Iiiilliiil(class_2338 target) {
      class_2350 var2 = class_2350.method_10150((double)ilIiiIiIii.Ililllililil(this.lIlIIillil.field_1724.method_33571(), class_243.method_24953(target))[0]);
      return this.iiIilIIlil(this.lIlIIillil.field_1724.method_24515().method_10093(var2).method_10084());
   }

   private boolean lIlIliIlIl(class_2338 pos) {
      return this.IlIlIillil.get(pos.method_10063()) > this.IlliIillil;
   }

   private float[] lllllillll(class_243 point) {
      float[] var2 = ilIiiIiIii.Ililllililil(this.lIlIIillil.field_1724.method_33571(), point);
      return this.Iillllilll(var2[0], var2[1]);
   }

   private class_2338 IiIiliIiiiIi() {
      long var32 = 1491630805539300652L;
      long var34 = -2308221986675602273L;
      long var36 = 969740597914311870L;
      long var30 = -124225396196973849L;
      class_2338 var1 = this.lIlIIillil.field_1724.method_24515();
      double var2 = this.ilillIiill();
      var30 ^= ((long)((int)Math.ceil(var2) + 1) << 32 ^ var30) & -1L << 32;
      class_243 var5 = this.lIlIIillil.field_1724.method_33571();
      class_2338 var6 = null;
      class_2338 var7 = null;
      double var8 = Double.MAX_VALUE;
      double var10 = Double.MAX_VALUE;

      for (long var39 = var30 ^ ((long)((int)(var30 >>> 32)) ^ var30) & -1L >>> 32;
         (int)var39 >= -((int)(var39 >>> 32));
         var39 ^= (var39 ^ var39 + (long)-1) & -1L >>> 32
      ) {
         var32 ^= ((long)(-((int)(var39 >>> 32))) << 32 ^ var32) & -1L << 32;

         while ((int)(var32 >>> 32) <= (int)(var39 >>> 32)) {
            for (var32 ^= ((long)(-((int)(var39 >>> 32))) ^ var32) & -1L >>> 32;
               (int)var32 <= (int)(var39 >>> 32);
               var32 ^= (var32 ^ var32 + (long)1) & -1L >>> 32
            ) {
               var34 ^= ((long)(var1.method_10263() + (int)(var32 >>> 32)) << 32 ^ var34) & -1L << 32;
               var34 ^= ((long)(var1.method_10264() + (int)var39) ^ var34) & -1L >>> 32;
               var36 ^= ((long)(var1.method_10260() + (int)var32) << 32 ^ var36) & -1L << 32;
               if ((int)(var34 >>> 32) >= this.IilIIillil
                  && (int)(var34 >>> 32) <= this.IIiIIillil
                  && (int)var34 >= this.lilIIillil
                  && (int)var34 <= this.lIiIIillil
                  && (int)(var36 >>> 32) >= this.iilIIillil
                  && (int)(var36 >>> 32) <= this.iIiIIillil
                  && this.illIIillil.contains(class_2338.method_10064((int)(var34 >>> 32), (int)var34, (int)(var36 >>> 32)))) {
                  double var18 = (double)((int)(var34 >>> 32)) + 0.5 - this.lIlIIillil.field_1724.method_23317();
                  double var20 = (double)((int)(var36 >>> 32)) + 0.5 - this.lIlIIillil.field_1724.method_23321();
                  if (!(var18 * var18 + var20 * var20 > 6.760000000000001)) {
                     double var22 = class_3532.method_15350(var5.field_1352, (double)((int)(var34 >>> 32)), (double)((int)(var34 >>> 32)) + 1.0)
                        - var5.field_1352;
                     double var24 = class_3532.method_15350(var5.field_1351, (double)((int)var34), (double)((int)var34) + 1.0) - var5.field_1351;
                     double var26 = class_3532.method_15350(var5.field_1350, (double)((int)(var36 >>> 32)), (double)((int)(var36 >>> 32)) + 1.0)
                        - var5.field_1350;
                     double var28 = var22 * var22 + var24 * var24 + var26 * var26;
                     if (!(var28 > var2 * var2)
                        && !(var28 >= ((int)var34 >= var1.method_10264() ? var8 : var10))
                        && (
                           (int)(var32 >>> 32) != 0
                              || (int)var32 != 0
                              || (int)var39 != 0
                                 && ((int)var39 != -1 || this.Illillllil(new class_2338((int)(var34 >>> 32), (int)var34 - 1, (int)(var36 >>> 32))))
                        )) {
                        this.liliIillil.method_10103((int)(var34 >>> 32), (int)var34, (int)(var36 >>> 32));
                        if (!this.iiIIlIIlIl(this.liliIillil)
                           && this.llIililIil(this.liliIillil)
                           && this.IiIilliIil(this.liliIillil)
                           && !this.illilIilil((int)(var34 >>> 32), (int)var34, (int)(var36 >>> 32))) {
                           if ((int)var34 >= var1.method_10264()) {
                              if (var28 < var8) {
                                 var6 = new class_2338((int)(var34 >>> 32), (int)var34, (int)(var36 >>> 32));
                                 var8 = var28;
                              }
                           } else if (var28 < var10) {
                              var7 = new class_2338((int)(var34 >>> 32), (int)var34, (int)(var36 >>> 32));
                              var10 = var28;
                           }
                        }
                     }
                  }
               }
            }

            var32 += 4294967296L;
         }
      }

      return var6 != null ? var6 : var7;
   }

   private void lilIliilIl(class_2338 target) {
      long var8 = 7310404999476469370L;
      class_1661 var2 = this.lIlIIillil.field_1724.method_31548();
      class_2680 var3 = this.lIlIIillil.field_1687.method_8320(target);
      float[] var4 = new float[class_1661.method_7368()];
      boolean[] var5 = new boolean[var4.length];

      for (var8 ^= (0L ^ var8) & -1L << 32; (int)(var8 >>> 32) < var4.length; var8 += 4294967296L) {
         class_1799 var7 = var2.method_5438((int)(var8 >>> 32));
         var4[(int)(var8 >>> 32)] = var7.method_7924(var3);
         var5[(int)(var8 >>> 32)] = var7.method_7951(var3);
      }

      var8 ^= ((long)IIiiIlilIiiIli.IliIlllilIi(var4, var5, var2.method_67532()) << 32 ^ var8) & -1L << 32;
      if ((int)(var8 >>> 32) != var2.method_67532()) {
         var2.method_61496((int)(var8 >>> 32));
      }
   }

   private void iiiIlIIIll() {
      long var16 = -151987182419467445L;
      long var18 = -8000723864040518942L;
      long var14 = 366780238753707243L;
      class_2338 var1 = this.lIlIIillil.field_1724.method_24515();
      var14 ^= ((long)this.lIlIIillil.field_1724.method_24828() << 32 ^ var14) & -1L << 32;
      if ((int)(var14 >>> 32) != 0 && this.iiilIillil == null) {
         if (var1.method_10263() != this.llilIillil || var1.method_10260() != this.ililIillil) {
            this.llilIillil = var1.method_10263();
            this.ililIillil = var1.method_10260();
            this.IiilIillil = var1.method_10264();
            this.liilIillil = var1.method_10264() - 1;
         }

         if (this.IlilIillil == null || !this.lililiilil(this.IlilIillil) || !this.llIililIil(this.IlilIillil)) {
            this.IiiIlliiIl();
            return;
         }

         var14 ^= ((long)(var1.method_10264() - this.IiilIillil >= 24 ? 1 : 0) ^ var14) & -1L >>> 32;
         class_2338 var4 = this.liilliiill(this.IlilIillil) && this.lIIlliIIll(this.IlilIillil) ? this.IlilIillil : this.IiIiliIiiiIi();
         if (var4 != null) {
            this.IiiIlliiIl();
            this.IlIillIiilIi(var4);
            return;
         }

         if ((int)var14 != 0) {
            this.iiiilIIIIi(this.IlilIillil);
            this.IiiIlliiIl();
            return;
         }
      }

      this.lIlIIillil.field_1690.field_1894.method_23481(false);
      illIilIilIil.IliIlllilIi(this.lIlIIillil.field_1690.field_1867, false);
      illIilIilIil.IliIlllilIi(this.lIlIIillil.field_1690.field_1832, false);
      this.lIlIIillil.field_1724.method_5728(false);
      class_2338 var3 = new class_2338(this.llilIillil, this.liilIillil, this.ililIillil);
      class_2338 var20 = var3.method_10084();
      class_243 var5 = new class_243((double)var3.method_10263() + 0.5, (double)var3.method_10264() + 1.0, (double)var3.method_10260() + 0.5);
      if (this.iiilIillil != null) {
         class_2680 var6 = this.lIlIIillil.field_1687.method_8320(this.iiilIillil);
         if (!var6.method_26215() && !var6.method_45474()) {
            this.iiIiIillil.add(this.iiilIillil.method_10063());
            this.liilIillil = this.iiilIillil.method_10264();
            this.iiilIillil = null;
         } else {
            if (this.IlliIillil - this.IIIiIillil <= 12) {
               this.lllllillll(var5);
               return;
            }

            this.iiilIillil = null;
         }

         var3 = new class_2338(this.llilIillil, this.liilIillil, this.ililIillil);
         var20 = var3.method_10084();
         var5 = new class_243((double)var3.method_10263() + 0.5, (double)var3.method_10264() + 1.0, (double)var3.method_10260() + 0.5);
      }

      double var21 = this.lIlIIillil.field_1724.method_23318();
      if (var21 > this.IlIiIillil + 0.05) {
         this.IlIiIillil = var21;
         this.iIIiIillil = 0;
      } else {
         this.iIIiIillil++;
      }

      if (++this.lIIiIillil > 400 || this.iIIiIillil > 60) {
         this.iiiilIIIIi(this.IlilIillil);
         this.IiiIlliiIl();
      } else if (this.iiIilIIlil(var1.method_10086(2))) {
         this.iiiilIIIIi(this.IlilIillil);
         this.IiiIlliiIl();
      } else {
         var16 ^= ((long)this.liIlliiIll() << 32 ^ var16) & -1L << 32;
         if ((int)(var16 >>> 32) < 0) {
            this.ilIIiIiIIi();
            this.iIlIIillil.IlIlllIlilIl(liIIiiiIIi<"liIIiiiIIi","br5kY9+CisAmEDK1PuS7cVu+CvLUeKdrlt7mutD2BJsKYO0/S4wKsMyVgQ==">());
            this.IiiIlliiIl();
         } else {
            if (this.lIlIIillil.field_1724.method_31548().method_67532() != (int)(var16 >>> 32)) {
               this.lIlIIillil.field_1724.method_31548().method_61496((int)(var16 >>> 32));
            }

            float[] var9 = this.lllllillll(var5);
            if ((int)(var14 >>> 32) != 0) {
               this.lIlIIillil.field_1690.field_1903.method_23481(true);
            }

            class_2680 var10 = this.lIlIIillil.field_1687.method_8320(var20);
            var16 ^= ((long)(this.lIlIIillil.field_1724.method_23318() >= (double)var20.method_10264() + 0.9 ? 1 : 0) ^ var16) & -1L >>> 32;
            var18 ^= ((long)(!var10.method_26215() && !var10.method_45474() ? 0 : 1) << 32 ^ var18) & -1L << 32;
            if ((int)var16 != 0 && (int)(var18 >>> 32) != 0 && this.iiIilIIlil(var3)) {
               class_3965 var13 = this.iilllIIill(this.lIlIIillil.field_1724.method_33571(), var9[0], var9[1], this.ilillIiill());
               if (var13.method_17783() == class_240.field_1332 && var13.method_17777().equals(var3) && var13.method_17780() == class_2350.field_11036) {
                  this.lIlIIillil.field_1761.method_2896(this.lIlIIillil.field_1724, class_1268.field_5808, var13);
                  this.lIlIIillil.field_1724.method_6104(class_1268.field_5808);
                  this.iiilIillil = var20;
                  this.IIIiIillil = this.IlliIillil;
               }
            }
         }
      }
   }

   public IiIIIiilliIIIiil(class_310 host, IliiIlillliiIlil mc) {
      this.ilIlIillil = -1000;
      this.IIilIillil = new ArrayList<>();
      this.llIiIillil = -1000;
      this.iiIiIillil = new LongOpenHashSet();
      this.IIliIillil = -100;
      this.iIliIillil = Double.MAX_VALUE;
      this.illiIillil = -1000;
      this.IiliIillil = -1000;
      this.liliIillil = new class_2339();
      this.iiliIillil = new class_2339();
      this.lIlIIillil = host;
      this.iIlIIillil = mc;
      this.lIIlIillil.defaultReturnValue(Integer.MIN_VALUE);
      this.iIIlIillil.defaultReturnValue(Integer.MIN_VALUE);
      this.IlIlIillil.defaultReturnValue(Integer.MIN_VALUE);
   }

   private void IIiilIiiiIii(class_2338 pos, class_2350 face) {
      if (this.lIlIIillil.field_1687.method_8320(pos).method_26215()) {
         this.IIIIllIIIl();
      } else {
         if (!pos.equals(this.IiiIIillil)) {
            this.IIIIllIIIl();
            this.liiIIillil = face;
            this.lillIillil = this.IlliIillil;
            this.iillIillil = this.lIlIIillil.field_1687.method_8320(pos);
         }

         if (this.lIlIIillil.field_1761.method_2902(pos, this.liiIIillil)) {
            this.lIlIIillil.field_1724.method_6104(class_1268.field_5808);
         }

         this.iliIIillil = true;
         this.IiiIIillil = pos;
         this.illiIillil = this.IlliIillil;
      }
   }

   private void lliililiil(class_2338 target) {
      if (target != null && target.method_10264() < this.lIlIIillil.field_1724.method_24515().method_10264() && !this.Iiiilliiil(target)) {
         this.IlIllllIll();
      } else {
         this.iiiilIIIIi(target);
      }

      this.lIliIillil = 0;
   }

   public int IIIllIIliIIl() {
      return this.IIiIIillil;
   }

   private boolean Iiiiliiiiiii() {
      long var5 = 1598560488503693565L;
      class_1661 var1 = this.lIlIIillil.field_1724.method_31548();
      class_2680 var2 = class_2246.field_10340.method_9564();

      for (long var7 = var5 ^ (0L ^ var5) & -1L << 32; (int)(var7 >>> 32) < 9; var7 += 4294967296L) {
         class_1799 var4 = var1.method_5438((int)(var7 >>> 32));
         if (!var4.method_7960() && var4.method_7924(var2) > 1.5F) {
            return true;
         }
      }

      return false;
   }

   private void IiiIlliiIl() {
      this.llIiIillil = this.IlliIillil;
      this.ilIiIillil = this.lIlIIillil.field_1724.method_24515().method_10264() > this.IiilIillil;
      this.IiIiIillil = this.IlilIillil;
      this.iIilIillil = false;
      this.iiilIillil = null;
      this.IlilIillil = null;
      this.ilIIiIiIIi();
   }

   public int iliIiiliiiii() {
      return this.iilIIillil;
   }

   private void IIIIllIIIl() {
      if (this.iliIIillil) {
         this.lIlIIillil.field_1761.method_2925();
         this.iliIIillil = false;
      }

      this.IiiIIillil = null;
   }

   private boolean lIIlliIIll(class_2338 p) {
      class_3965 var2 = this.lIlIIillil
         .field_1687
         .method_17742(
            new class_3959(
               this.lIlIIillil.field_1724.method_33571(), class_243.method_24953(p), class_3960.field_17558, class_242.field_1348, this.lIlIIillil.field_1724
            )
         );
      return var2.method_17783() == class_240.field_1332 && var2.method_17777().equals(p);
   }

   private boolean IiIilliIil(class_2338 pos) {
      long var7 = 8969245018782354714L;
      class_2350[] var2 = IIlIIillil;
      var7 ^= ((long)var2.length << 32 ^ var7) & -1L << 32;

      for (long var10 = var7 ^ (0L ^ var7) & -1L >>> 32; (int)var10 < (int)(var10 >>> 32); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
         class_2350 var5 = var2[(int)var10];
         class_2680 var6 = this.lIlIIillil.field_1687.method_8320(this.iiliIillil.method_25505(pos, var5));
         if (var6.method_26215() || var6.method_45474()) {
            return true;
         }
      }

      return false;
   }

   private boolean IIiillIiil(int y, int z, int x) {
      return y >= this.IilIIillil && y <= this.IIiIIillil && z >= this.lilIIillil && z <= this.lIiIIillil && x >= this.iilIIillil && x <= this.iIiIIillil
         ? this.illIIillil.contains(class_2338.method_10064(y, z, x))
         : false;
   }

   private boolean lililiilil(class_2338 p) {
      return this.IIiillIiil(p.method_10263(), p.method_10264(), p.method_10260());
   }

   public class_2338 Illlllllilll() {
      return this.IIIlIillil ? this.iiiIIillil : null;
   }

   private double ilillIiill() {
      return Math.min(this.iIlIIillil.IliIlllilIi(), this.lIlIIillil.field_1724.method_55754());
   }

   private static class_243 iIIilIlIil(class_243 pos, class_2338 eye) {
      return new class_243(
         class_3532.method_15350(pos.field_1352, (double)eye.method_10263(), (double)eye.method_10263() + 1.0),
         class_3532.method_15350(pos.field_1351, (double)eye.method_10264(), (double)eye.method_10264() + 1.0),
         class_3532.method_15350(pos.field_1350, (double)eye.method_10260(), (double)eye.method_10260() + 1.0)
      );
   }

   private class_2338 Iilililiiili() {
      long var7 = 4489689776817685030L;
      long var9 = 3528397089141401158L;
      long var11 = -2651162471010039482L;
      if (this.llIlIillil == Integer.MIN_VALUE) {
         return null;
      } else {
         var7 ^= ((long)this.llIlIillil << 32 ^ var7) & -1L << 32;
         class_2338 var2 = this.lIlIIillil.field_1724.method_24515();
         var7 ^= (1L ^ var7) & -1L >>> 32;
         var9 ^= ((long)this.IilIIillil << 32 ^ var9) & -1L << 32;

         while ((int)(var9 >>> 32) <= this.IIiIIillil) {
            for (var9 ^= (0L ^ var9) & -1L >>> 32; (int)var9 <= this.iIiIIillil - this.iilIIillil; var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
               var11 ^= ((long)((int)var7 != 0 ? this.iilIIillil + (int)var9 : this.iIiIIillil - (int)var9) << 32 ^ var11) & -1L << 32;
               if (this.IIiillIiil((int)(var9 >>> 32), (int)(var7 >>> 32), (int)(var11 >>> 32))) {
                  this.liliIillil.method_10103((int)(var9 >>> 32), (int)(var7 >>> 32), (int)(var11 >>> 32));
                  if (!this.iiIIlIIlIl(this.liliIillil)
                     && this.llIililIil(this.liliIillil)
                     && this.IiIilliIil(this.liliIillil)
                     && (
                        (int)(var9 >>> 32) != var2.method_10263()
                           || (int)(var11 >>> 32) != var2.method_10260()
                           || (int)(var7 >>> 32) != var2.method_10264() - 1
                           || this.Illillllil(new class_2338((int)(var9 >>> 32), (int)(var7 >>> 32) - 1, (int)(var11 >>> 32)))
                     )) {
                     return new class_2338((int)(var9 >>> 32), (int)(var7 >>> 32), (int)(var11 >>> 32));
                  }
               }
            }

            var7 ^= ((long)((int)var7 == 0 ? 1 : 0) ^ var7) & -1L >>> 32;
            var9 += 4294967296L;
         }

         return null;
      }
   }

   private boolean ilIllIiIll(class_2338 pos) {
      long var7 = 6540933921301769294L;
      class_2680 var2 = this.lIlIIillil.field_1687.method_8320(pos);
      if (!var2.method_26215() && !var2.method_45474()) {
         return false;
      } else {
         class_3965 var3 = lliiliIiiliiliIi.liiiIIllIl(pos);
         if (var3 == null) {
            return false;
         } else {
            var7 ^= ((long)this.liIlliiIll() << 32 ^ var7) & -1L << 32;
            if ((int)(var7 >>> 32) < 0) {
               return false;
            } else {
               if (this.lIlIIillil.field_1724.method_31548().method_67532() != (int)(var7 >>> 32)) {
                  this.lIlIIillil.field_1724.method_31548().method_61496((int)(var7 >>> 32));
               }

               this.IIIIllIIIl();
               float[] var5 = this.lllllillll(var3.method_17784());
               class_3965 var6 = this.iilllIIill(this.lIlIIillil.field_1724.method_33571(), var5[0], var5[1], this.ilillIiill());
               if (var6.method_17783() == class_240.field_1332
                  && var6.method_17777().equals(var3.method_17777())
                  && var6.method_17777().method_10093(var6.method_17780()).equals(pos)
                  && this.IlliIillil - this.IIliIillil >= 4) {
                  this.lIlIIillil.field_1761.method_2896(this.lIlIIillil.field_1724, class_1268.field_5808, var6);
                  this.lIlIIillil.field_1724.method_6104(class_1268.field_5808);
                  this.IIliIillil = this.IlliIillil;
                  this.iiIiIillil.add(pos.method_10063());
               }

               return true;
            }
         }
      }
   }

   public int IiIlliIliiIl() {
      return this.iIiIIillil;
   }

   private void IlIllllIll() {
      long var6 = -4814396298869807551L;
      class_2338 var1 = this.lIlIIillil.field_1724.method_24515();
      class_2338 var2 = this.IIiIllIiIl();
      if (var2 == null) {
         var2 = var1.method_10074();
      }

      if (this.iiIilIIlil(var2)) {
         if (!this.llIililIil(var2)) {
            this.iiiilIIIIi(this.iiiIIillil);
            return;
         }

         if (!this.lililiilil(var2) && !this.iiIiIillil.contains(var2.method_10063())) {
            this.iiiilIIIIi(this.iiiIIillil);
            return;
         }

         if (!this.Illillllil(var2.method_10074())) {
            this.IIIIllIIIl();
            if (!this.iIlIIillil.iIlIlllllill() || !this.ilIllIiIll(var2.method_10074())) {
               this.iiiilIIIIi(this.iiiIIillil);
            }

            return;
         }

         this.lilIliilIl(var2);
         float[] var3 = this.lllllillll(class_243.method_24953(var2));
         if (this.iliIIillil && var2.equals(this.IiiIIillil)) {
            this.IIiilIiiiIii(var2, this.liiIIillil);
            return;
         }

         class_3965 var4 = this.iilllIIill(this.lIlIIillil.field_1724.method_33571(), var3[0], var3[1], this.ilillIiill());
         if (var4.method_17783() == class_240.field_1332 && var4.method_17777().equals(var2)) {
            var6 ^= ((long)(!lIilliIill(var4, var2, 0.22F) && this.IillIillil < 6 ? 0 : 1) << 32 ^ var6) & -1L << 32;
            if (++this.IillIillil >= 1 && (int)(var6 >>> 32) != 0) {
               this.IIiilIiiiIii(var2, var4.method_17780());
            }
         } else {
            this.IillIillil = 0;
         }
      } else {
         this.IIIIllIIIl();
         if (!this.Illillllil(var2) && (!this.iIlIIillil.iIlIlllllill() || !this.ilIllIiIll(var2))) {
            this.iiiilIIIIi(this.iiiIIillil);
         }
      }
   }

   private void illIlIilIl(Long2IntOpenHashMap map) {
      IntIterator var2 = map.values().iterator();

      while (var2.hasNext()) {
         if (var2.nextInt() <= this.IlliIillil) {
            var2.remove();
         }
      }
   }

   private void iIiIlIliIl(class_2338 target) {
      long var13 = 6724504163552904848L;
      class_2338 var2 = this.lIlIIillil.field_1724.method_24515();
      double var3 = Math.hypot(
         (double)target.method_10263() + 0.5 - this.lIlIIillil.field_1724.method_23317(),
         (double)target.method_10260() + 0.5 - this.lIlIIillil.field_1724.method_23321()
      );
      var13 ^= ((long)(target.method_10264() - var2.method_10264()) << 32 ^ var13) & -1L << 32;
      if ((int)(var13 >>> 32) >= 2 && var3 <= 1.7) {
         if (!this.ilIiIillil && this.IlliIillil - this.llIiIillil < 40 && target.equals(this.IiIiIillil)) {
            this.iiiilIIIIi(target);
         } else {
            if (this.iIlIIillil.iIlIlllllill()) {
               this.lliIliliIl(target);
            } else {
               this.iiiilIIIIi(target);
            }
         }
      } else if ((int)(var13 >>> 32) <= -1 && var3 <= 1.5) {
         this.IlIllllIll();
      } else if ((int)(var13 >>> 32) <= -1 && this.iiIiIillil.contains(var2.method_10074().method_10063())) {
         this.IlIllllIll();
      } else if ((int)(var13 >>> 32) >= 2 && this.iiIiIillil.contains(var2.method_10074().method_10063())) {
         this.IlIllllIll();
      } else {
         class_243 var6 = this.lIlIIillil.field_1724.method_33571();
         float var7 = ilIiiIiIii.Ililllililil(var6, new class_243((double)target.method_10263() + 0.5, var6.field_1351, (double)target.method_10260() + 0.5))[0];
         class_2350 var8 = class_2350.method_10150((double)var7);
         class_2338 var9 = var2.method_10093(var8);
         class_2338 var10 = var9.method_10074();
         var13 ^= ((long)this.liIiIillil ^ var13) & -1L >>> 32;
         this.liIiIillil = 0;
         if (this.iiIilIIlil(var9) && !this.iiIilIIlil(var9.method_10084()) && !this.iiIilIIlil(var9.method_10086(2))) {
            float var16 = this.Ilillllill(target);
            if (var16 < 72.0F) {
               if (this.lIlIIillil.field_1724.method_24828()) {
                  this.lIlIIillil.field_1690.field_1903.method_23481(true);
               }

               this.lIlIIillil.field_1690.field_1894.method_23481(true);
            }

            this.iIiilIliil(target);
         } else if (!this.iiIilIIlil(var10)) {
            if (target.method_10264() <= var2.method_10264() && this.Illillllil(var10)) {
               float var15 = this.Ilillllill(target);
               if (var15 < 72.0F) {
                  this.lIlIIillil.field_1690.field_1894.method_23481(true);
               }

               this.iIiilIliil(target);
            } else {
               illIilIilIil.IliIlllilIi(this.lIlIIillil.field_1690.field_1832, true);
               if (this.iIlIIillil.iIlIlllllill() && this.ilIllIiIll(var10)) {
                  illIilIilIil.IliIlllilIi(this.lIlIIillil.field_1690.field_1832, true);
                  this.lIlIIillil.field_1690.field_1894.method_23481(true);
                  this.liIiIillil = (int)var13 + 1;
                  if (this.liIiIillil > 80) {
                     this.liIiIillil = 0;
                     if (target.method_10264() < var2.method_10264()) {
                        this.IlIllllIll();
                     } else {
                        this.iiiilIIIIi(target);
                     }
                  }
               } else if (target.method_10264() < var2.method_10264()) {
                  this.IlIllllIll();
               } else {
                  this.lliililiil(target);
               }
            }
         } else {
            float var12 = this.Ilillllill(target);
            if (this.lIliliIlil(var9, var8)) {
               illIilIilIil.IliIlllilIi(this.lIlIIillil.field_1690.field_1832, true);
            }

            if (var12 < 72.0F) {
               this.lIlIIillil.field_1690.field_1894.method_23481(true);
               if (this.iIlIIillil.liiiIIllIl() && var12 < 32.0F && !this.lIliliIlil(var9, var8) && this.lIlIIillil.field_1724.method_7344().method_7586() > 6) {
                  illIilIilIil.IliIlllilIi(this.lIlIIillil.field_1690.field_1867, true);
               }
            }

            this.iIiilIliil(target);
         }
      }
   }

   private int iIlllIllll() {
      long var4 = 7145746816017652522L;
      class_1661 var1 = this.lIlIIillil.field_1724.method_31548();

      for (long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < 9; var6 += 4294967296L) {
         class_1799 var3 = var1.method_5438((int)(var6 >>> 32));
         if (!var3.method_7960() && var3.method_7909().method_57347().method_57832(class_9334.field_50075)) {
            return (int)(var6 >>> 32);
         }
      }

      return -1;
   }

   private float Ilillllill(class_2338 target) {
      this.lllllillll(
         new class_243((double)target.method_10263() + 0.5, this.lIlIIillil.field_1724.method_33571().field_1351, (double)target.method_10260() + 0.5)
      );
      return this.iIllIillil;
   }

   private void iiiilIIIIi(class_2338 pos) {
      if (pos != null) {
         this.lIIlIillil.put(pos.method_10063(), this.IlliIillil + 80);
      }

      if (pos != null && pos.equals(this.iiiIIillil)) {
         this.iiiIIillil = null;
      }

      this.iIliIillil = Double.MAX_VALUE;
   }

   private static boolean lIilliIill(class_3965 pos, class_2338 look, double margin) {
      class_243 var4 = pos.method_17784();
      class_2351 var5 = pos.method_17780().method_10166();
      if (var5 != class_2351.field_11048) {
         double var6 = var4.field_1352 - (double)look.method_10263();
         if (var6 < margin || var6 > 1.0 - margin) {
            return false;
         }
      }

      if (var5 != class_2351.field_11052) {
         double var8 = var4.field_1351 - (double)look.method_10264();
         if (var8 < margin || var8 > 1.0 - margin) {
            return false;
         }
      }

      if (var5 != class_2351.field_11051) {
         double var9 = var4.field_1350 - (double)look.method_10260();
         if (var9 < margin || var9 > 1.0 - margin) {
            return false;
         }
      }

      return true;
   }

   public boolean Iilllilliill() {
      return this.iliIIillil;
   }

   private boolean Illillllil(class_2338 cell) {
      long var4 = -7941324539721196606L;

      for (long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) <= 5; var6 += 4294967296L) {
         class_2338 var3 = cell.method_10087((int)(var6 >>> 32));
         if (this.lIlIIillil.field_1687.method_8320(var3).method_26204() == class_2246.field_10164) {
            return false;
         }

         if (this.iiIilIIlil(var3)) {
            return true;
         }
      }

      return false;
   }

   private boolean iiIilIIlil(class_2338 pos) {
      class_2680 var2 = this.lIlIIillil.field_1687.method_8320(pos);
      return !var2.method_26215() && var2.method_26227().method_15769() ? !var2.method_26220(this.lIlIIillil.field_1687, pos).method_1110() : false;
   }

   private boolean lIliliIlil(class_2338 dir, class_2350 ahead) {
      class_2338 var3 = dir.method_10093(ahead);
      return this.iiIilIIlil(var3.method_10074()) ? false : !this.Illillllil(var3.method_10074());
   }

   private class_2338 IIiIllIiIl() {
      long var8 = 8192333360326953390L;
      long var10 = 5068079053949629704L;
      class_2338 var1 = this.lIlIIillil.field_1724.method_24515();
      class_2338 var2 = var1.method_10074();
      if (this.iiIilIIlil(var2)) {
         return var2;
      } else if (!this.lIlIIillil.field_1724.method_24828()) {
         return null;
      } else {
         class_238 var3 = this.lIlIIillil.field_1724.method_5829();
         var8 ^= ((long)(var1.method_10264() - 1) << 32 ^ var8) & -1L << 32;

         for (long var13 = var8 ^ ((long)((int)Math.floor(var3.field_1323)) ^ var8) & -1L >>> 32;
            (int)var13 <= (int)Math.floor(var3.field_1320);
            var13 ^= (var13 ^ var13 + (long)1) & -1L >>> 32
         ) {
            for (var10 ^= ((long)((int)Math.floor(var3.field_1321)) << 32 ^ var10) & -1L << 32;
               (int)(var10 >>> 32) <= (int)Math.floor(var3.field_1324);
               var10 += 4294967296L
            ) {
               class_2338 var7 = new class_2338((int)var13, (int)(var13 >>> 32), (int)(var10 >>> 32));
               if (this.iiIilIIlil(var7)) {
                  return var7;
               }
            }
         }

         return null;
      }
   }

   public void IliIlllilIi(Collection<class_2338> list) {
      long var7 = 2537454332812145214L;
      this.IliIIillil = false;
      this.llliIillil = false;
      this.llIlIillil = Integer.MIN_VALUE;
      this.ilIlIillil = -1000;
      HashSet var2 = new HashSet(Math.max(16, list.size() * 4 / 3));
      LongOpenHashSet var3 = new LongOpenHashSet(list.size());
      var7 ^= (4294967296L ^ var7) & -1L << 32;

      for (class_2338 var6 : list) {
         var2.add(var6.method_10063());
         var3.add(var6.method_10063());
         if ((int)(var7 >>> 32) != 0) {
            this.IilIIillil = this.IIiIIillil = var6.method_10263();
            this.lilIIillil = this.lIiIIillil = var6.method_10264();
            this.iilIIillil = this.iIiIIillil = var6.method_10260();
            var7 ^= (0L ^ var7) & -1L << 32;
         } else {
            this.IilIIillil = Math.min(this.IilIIillil, var6.method_10263());
            this.IIiIIillil = Math.max(this.IIiIIillil, var6.method_10263());
            this.lilIIillil = Math.min(this.lilIIillil, var6.method_10264());
            this.lIiIIillil = Math.max(this.lIiIIillil, var6.method_10264());
            this.iilIIillil = Math.min(this.iilIIillil, var6.method_10260());
            this.iIiIIillil = Math.max(this.iIiIIillil, var6.method_10260());
         }
      }

      this.lllIIillil = var2;
      this.illIIillil = var3;
      if (var2.isEmpty()) {
         this.IliIIillil = true;
      }
   }

   public void Ililllililil() {
      this.ilIIiIiIIi();
      if (this.lIlIIillil.field_1761 != null) {
         this.lIlIIillil.field_1761.method_2925();
      }

      this.lliIIillil = null;
      this.iliIIillil = false;
      this.IiiIIillil = null;
      this.lIilIillil = false;
      this.IIIlIillil = false;
      this.lIllIillil = false;
   }

   private float[] Iillllilll(float wantPitch, float wantYaw) {
      this.iiIlIillil = this.lIlIIillil.field_1724.method_36454();
      this.IIllIillil = this.lIlIIillil.field_1724.method_36455();
      this.lIllIillil = true;
      float var3 = 60.0F * (0.85F + this.IllIIillil.nextFloat() * 0.3F);
      float var4 = class_3532.method_15363(var3 / 150.0F, 0.08F, 0.9F);
      float var5 = lilllliillll.iIlIlllllill((long)this.IlliIillil, 0.2F, 0);
      float var6 = lilllliillll.iIlIlllllill((long)this.IlliIillil, 0.12F, 1);
      float var7 = lilllliillll.liiiIIllIl(this.iiIlIillil, wantPitch + var5, var4, var3, 0.8F);
      float var8 = class_3532.method_15363(lilllliillll.liiiIIllIl(this.IIllIillil, wantYaw + var6, var4, var3, 0.8F), -90.0F, 90.0F);
      this.lIlIIillil.field_1724.method_36456(var7);
      this.lIlIIillil.field_1724.method_36457(var8);
      this.IiIlIillil = var7;
      this.liIlIillil = var8;
      this.iIllIillil = Math.abs(class_3532.method_15393(wantPitch - var7));
      this.IlllIillil = (float)Math.hypot((double)class_3532.method_15393(wantPitch - var7), (double)(wantYaw - var8));
      return new float[]{var7, var8};
   }

   public boolean iIlIlllllill() {
      return this.IliIIillil;
   }

   private boolean illilIilil(int y, int x, int z) {
      if (!this.iiIiIillil.isEmpty() && this.iiIiIillil.contains(class_2338.method_10064(y, x, z))) {
         class_2338 var4 = this.lIlIIillil.field_1724.method_24515();
         return y == var4.method_10263() && z == var4.method_10260() && x < var4.method_10264();
      } else {
         return false;
      }
   }

   private boolean llIililIil(class_2338 pos) {
      class_2680 var2 = this.lIlIIillil.field_1687.method_8320(pos);
      if (var2.method_26215()) {
         return false;
      } else {
         class_2248 var3 = var2.method_26204();
         return var3 != class_2246.field_10382 && var3 != class_2246.field_10164 ? var2.method_26214(this.lIlIIillil.field_1687, pos) >= 0.0F : false;
      }
   }

   private void IlIillIiilIi(class_2338 t) {
      if (!t.equals(this.lliIIillil)) {
         this.IIIIllIIIl();
         this.lliIIillil = t;
         this.illlIillil = 0;
         this.IillIillil = 0;
         this.llllIillil = this.IlliIillil + this.IllIIillil.nextInt(2);
      }
   }

   private class_3965 iilllIIill(class_243 pitch, float reach, float eye, double yaw) {
      double var6 = Math.toRadians((double)reach);
      double var8 = Math.toRadians((double)eye);
      class_243 var10 = new class_243(-Math.sin(var6) * Math.cos(var8), -Math.sin(var8), Math.cos(var6) * Math.cos(var8));
      return this.lIlIIillil
         .field_1687
         .method_17742(
            new class_3959(pitch, pitch.method_1019(var10.method_1021(yaw)), class_3960.field_17558, class_242.field_1348, this.lIlIIillil.field_1724)
         );
   }

   private void IllIllllIl() {
      this.illIlIilIl(this.lIIlIillil);
      this.illIlIilIl(this.iIIlIillil);
      this.illIlIilIl(this.IlIlIillil);
   }

   private void iIIIlIlIIl(class_2338 pos) {
      if (this.iillIillil != null && !(this.iillIillil.method_26204() instanceof class_2346)) {
         this.IIilIillil.add(new lllilIIlillilIIl(pos, this.iillIillil, this.IlliIillil));
      }
   }

   public boolean IIIilIIiiIIi(iIIlIlIlIlIlIlIl e) {
      if (!lilIliIiiilIliIi.iiiIlIIIll() && this.lIllIillil && this.lIlIIillil.field_1724 != null) {
         float var2 = e.Illlllllilll();
         e.IlIlllIlilIl(class_3532.method_17821(var2, this.iiIlIillil, this.IiIlIillil));
         e.IIlllIlliIll(class_3532.method_16439(var2, this.IIllIillil, this.liIlIillil));
         e.IIillIiliIil();
         return true;
      } else {
         return false;
      }
   }

   private void IlIIillIIi() {
      long var7 = 3493864600302450314L;
      long var9 = 8447974454118195710L;
      if (this.llIlIillil == Integer.MIN_VALUE || this.IlliIillil - this.ilIlIillil >= 8) {
         this.ilIlIillil = this.IlliIillil;
         var7 ^= ((long)(this.llIlIillil == Integer.MIN_VALUE ? this.lIiIIillil : Math.min(this.llIlIillil, this.lIiIIillil)) << 32 ^ var7) & -1L << 32;
         var7 ^= (-2147483648L ^ var7) & -1L >>> 32;
         LongIterator var3 = this.illIIillil.iterator();

         while (var3.hasNext()) {
            long var4 = var3.nextLong();
            var9 ^= ((long)class_2338.method_10071(var4) << 32 ^ var9) & -1L << 32;
            if ((int)(var9 >>> 32) <= (int)(var7 >>> 32) && (int)(var9 >>> 32) > (int)var7) {
               this.liliIillil.method_16363(var4);
               if (!this.lIlIliIlIl(this.liliIillil) && this.llIililIil(this.liliIillil) && this.IiIilliIil(this.liliIillil)) {
                  var7 ^= ((long)((int)(var9 >>> 32)) ^ var7) & -1L >>> 32;
               }
            }
         }

         this.llIlIillil = (int)var7;
      }
   }

   private void llIIlilIIl() {
      if (!this.IIilIillil.isEmpty()) {
         Iterator var1 = this.IIilIillil.iterator();

         while (var1.hasNext()) {
            lllilIIlillilIIl var2 = (lllilIIlillilIIl)var1.next();
            class_2680 var3 = this.lIlIIillil.field_1687.method_8320(var2.IIIIIIilIl);
            if (!var3.method_26215() && var3.method_26204() == var2.lIIIIIilIl.method_26204()) {
               this.IlIlIillil.put(var2.IIIIIIilIl.method_10063(), this.IlliIillil + 1200);
               var1.remove();
            } else if (this.IlliIillil - var2.iIIIIIilIl >= 20) {
               var1.remove();
            }
         }
      }
   }

   private boolean IIIillIIil(class_2338 p) {
      class_2338 var2 = this.lIlIIillil.field_1724.method_24515();
      return p.method_10263() == var2.method_10263()
         && p.method_10260() == var2.method_10260()
         && (p.method_10264() == var2.method_10264() || p.method_10264() == var2.method_10264() - 1);
   }
}
