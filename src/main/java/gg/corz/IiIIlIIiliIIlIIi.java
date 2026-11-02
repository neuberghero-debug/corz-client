package gg.corz;

import com.corz.client.mixins.AccessorEntityS2CPacket;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicReference;
import net.minecraft.class_10182;
import net.minecraft.class_10264;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2604;
import net.minecraft.class_2664;
import net.minecraft.class_2678;
import net.minecraft.class_2684;
import net.minecraft.class_2709;
import net.minecraft.class_2716;
import net.minecraft.class_2724;
import net.minecraft.class_2743;
import net.minecraft.class_2777;
import net.minecraft.class_2824;
import net.minecraft.class_3532;
import net.minecraft.class_4588;
import net.minecraft.class_8038;
import org.joml.Matrix4f;

public class IiIIlIIiliIIlIIi extends ilIllIiIll implements lIlliiIlli {
   private static final float llllllliil = 1.5F;
   private static final lilllliiilllli illlllliil = lilllliiilllli.IIliIiIIIl.IilliliilIIi(true).iliIiiliiiii(true);
   private long iIIillliil;
   private float iiIillliil;
   private final Iiiliillliiliill Iillllliil = new Iiiliillliiliill(
      IliIlllilIi<"IliIlllilIi","5J0EKWcltEWmG+BIwDvy13JjBidibUUfyx72V8j2wc3GKzQ=">(),
      IliIlllilIi<"IliIlllilIi","Njy+TEjmqnvurDRgjTZOpQVPUTsR4pWsJ1zeYlNuWksPXuvQy8zlEjLKdfgHxLXODAjV8kGq8qtr+u81pTNwVmnYZ1AOkJaxYsefsfRY47iYl7f5VYZrm3f1PSeEhaWSCtHHL0qBK6jwMDml6JUBbJpp7sLebvzwLvDKWmmRgoFg0bPl1dklfwPrjsLmGKlt">(),
      50.0,
      100.0,
      0.0,
      500.0,
      5.0
   );
   private volatile lIiIIIlliIiIIIll lIilllliil;
   private volatile long llilllliil;
   private int iiilllliil;
   private float IIlillliil;
   private static final long iIllllliil = 1500L;
   private final AtomicReference<lIIlIlIiiIIlIlIi> IIilllliil;
   private final IiIllliliIllli liilllliil;
   private long lIIillliil;
   private int IIIillliil;
   private final iliiliilIiiiliil iillllliil;
   private class_243 IiIillliil;
   private static final int Illlllliil = 3;
   private class_243 llIillliil;
   private volatile boolean Iiilllliil;
   private static final double lIllllliil = 6.0;
   private static final long IIllllliil = 3000L;
   private final iiIiiilIIliiil lillllliil = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","+MYH6Nv5WRREO3LiIVLbixWQ+KH41xUx5Af5qR9kHo2pNL5nhaAIPRzURhl4">(),
      IliIlllilIi<"IliIlllilIi","ZHMqNG+EYX6cK5VoH52g8iFWa1NSZvCG5BZFwb5O7XymgFma2pm1t7QMj6+jizzVQAp6+S/sKAh8kDBkejufRtm7IEVJXl+TCtsHv3No62hsECdkYpj+YohI">(),
      true
   );
   private volatile long iIilllliil;
   private int liIillliil;
   private long IlIillliil;
   private class_243 ilIillliil;
   private volatile boolean ililllliil;
   private volatile class_2596<?> Ililllliil;

   private void lIIlliIIll(IllliIlllllliIll q, class_2596<?> v, lIiIIIlliIiIIIll frame, long f) {
      int var6 = q.IllIIiilll.IIIllIIliIIl();
      if (v instanceof class_2684 var7) {
         if (var7.method_22826() && var7 instanceof AccessorEntityS2CPacket var14 && var14.corzGetEntityId() == var6) {
            q.IllIIiilll = q.IllIIiilll.IilliliilIIi((long)var7.method_36150(), (long)var7.method_36151(), (long)var7.method_36152(), f);
         }
      } else if (v instanceof class_10264 var8) {
         if (var8.comp_3223() == var6) {
            q.IllIIiilll = q.IllIIiilll.lIiiIiIlilli(var8.comp_3224().comp_3148(), f);
         }
      } else if (v instanceof class_2777 var9) {
         if (var9.comp_3237() == var6) {
            q.IllIIiilll = q.IllIIiilll.iliIiiliiiii(ilIllIiIll(q.IllIIiilll.IiIlliIliiIl(), var9), f);
         }
      } else if (v instanceof class_2604 var10) {
         if (var10.method_11167() == var6) {
            q.IllIIiilll = q.IllIIiilll.lIiiIiIlilli(new class_243(var10.method_11175(), var10.method_11174(), var10.method_11176()), f);
         }
      } else if (v instanceof class_2716 var11) {
         if (var11.method_36548().contains(var6)) {
            q.illIIiilll = true;
         }
      } else if (v instanceof class_2743 var12) {
         if (var12.method_11818() == frame.liiiIIllIl()) {
            q.lllIIiilll = true;
         }
      } else if (v instanceof class_2664 var13 && var13.comp_2884().isPresent()) {
         q.lllIIiilll = true;
      }
   }

   @Override
   public long iiiIlIIIll(class_2596<?> queued, boolean packet, long nowMs) {
      if (queued != null && queued == this.Ililllliil) {
         this.Ililllliil = null;
         lIiIIIlliIiIIIll var5 = this.lIilllliil;
         if (var5 == null) {
            return 0L;
         } else {
            long var6 = lIiIlIiliIiIlIil.lIiiIiIlilli(var5.IlIlllIlilIl(), var5.IiIlliIliiIl(), ThreadLocalRandom.current().nextDouble());
            long var8 = lIiIlIiliIiIlIil.iliIiiliiiii(nowMs, var6, this.llilllliil);
            if (var8 <= nowMs) {
               return 0L;
            } else {
               this.llilllliil = var8;
               return var8;
            }
         }
      } else {
         return 0L;
      }
   }

   private static void IIIillIIil(
      class_4588 by,
      Matrix4f cx,
      float dx,
      float bz,
      float m,
      float az,
      float vc,
      float cy,
      float argb,
      float dy,
      float bx,
      float dz,
      float cz,
      float ay,
      int ax
   ) {
      by.method_22918(cx, dx, bz, m).method_39415(ax);
      by.method_22918(cx, az, vc, cy).method_39415(ax);
      by.method_22918(cx, argb, dy, bx).method_39415(ax);
      by.method_22918(cx, dz, cz, ay).method_39415(ax);
   }

   private void iIlllIllll(class_1309 target, long now) {
      if (this.IIIillliil != (((1647680687 >>> 9 | 1647680687 << 23) >>> 29 | (1647680687 >>> 9 | 1647680687 << 23) << 3) ^ 1115105677)) {
         this.Ilillllill();
      }

      this.IIIillliil = target.method_5628();
      this.iIIillliil = now;
      this.Iiilllliil = false;
      this.IlIillliil = -7627839306798055576L ^ -1595532730056720233L;
      this.IIilllliil.set(lIIlIlIiiIIlIlIi.IliIlllilIi(this.IIIillliil, this.iIilllliil));
   }

   @Override
   protected void Iilililiiili() {
      this.Ilillllill();
      this.iiilllliil = -1;
      this.liilllliil.iIlIlllllill();
   }

   private static double liIlliiIll(lIiIIIlliIiIIIll v, class_243 feet) {
      return lIlIlIIiiIlIlIIi.IliIlllilIi(
         v.iIlIlllllill(), v.IilliliilIIi(), v.lIiiIiIlilli(), feet.field_1352, feet.field_1351, feet.field_1350, v.iliIiiliiiii(), v.IIIllIIliIIl()
      );
   }

   private static void liilliiill(Matrix4f argb, float y2, float x1, float y1, float m, float z2, float x2, int z1) {
      class_4588 var8 = iIiiIIilIliiIIil.lIiiIiIlilli();
      IIIillIIil(var8, argb, y2, x1, y1, m, x1, y1, m, x1, x2, y2, x1, x2, z1);
      IIIillIIil(var8, argb, y2, z2, y1, y2, z2, x2, m, z2, x2, m, z2, y1, z1);
      IIIillIIil(var8, argb, y2, x1, y1, y2, z2, y1, m, z2, y1, m, x1, y1, z1);
      IIIillIIil(var8, argb, y2, x1, x2, m, x1, x2, m, z2, x2, y2, z2, x2, z1);
      IIIillIIil(var8, argb, y2, x1, y1, y2, x1, x2, y2, z2, x2, y2, z2, y1, z1);
      IIIillIIil(var8, argb, m, x1, y1, m, z2, y1, m, z2, x2, m, x1, x2, z1);
   }

   private void IIllllIlll(int id, long now) {
      if (!(Iiiilllliiilll.field_1687.method_8469(id) instanceof class_1309 var5) || !liiIIIlliiiIIIll.IliIlllilIi(var5, illlllliil)) {
         return;
      }

      if (!(liiIIIlliiiIIIll.IIIllIIliIIl(var5) > Double.longBitsToDouble(2277903112541754593L ^ 6882833731528086753L))) {
         if (id != this.IIIillliil) {
            this.iIlllIllll(var5, now);
         }

         this.lIIillliil = now;
      }
   }

   private static int iIIilIlIil(int argb) {
      long var5 = 2780524173275814099L;
      long var7 = 4408720565603332477L;
      var5 ^= ((long)(argb >>> ((-1190640775 - 37) * 35 ^ -73 ^ -1277244461)) << 32 ^ var5) & -1L << 32;
      var5 ^= ((long)((int)((float)(argb >> (-(~-791801938) ^ -791801921) & ((614894227 - -65 ^ -119) + 101 ^ -614894275)) * 0.49F)) ^ var5) & -1L >>> 32;
      var7 ^= (
            (long)((int)((float)(argb >> (~(~-9234099 - -33) ^ -9234140) & (((-1242096595 ^ -13) << 29 | (-1242096595 ^ -13) >>> 3) ^ -918479740)) * 0.49F))
                  << 32
               ^ var7
         )
         & -1L << 32;
      var7 ^= ((long)((int)((float)(argb & ((-659476590 - -63 + 53) * 1431655765 ^ -1211830527)) * 0.49F)) ^ var7) & -1L >>> 32;
      return (int)(var5 >>> 32)
            << ((-(117436323 >>> 19 | 117436323 << 13) * 941362695 >>> 25 | -(117436323 >>> 19 | 117436323 << 13) * 941362695 << 7) ^ 1351873456)
         | (int)var5 << (~(((-943229910 << 1 | -943229910 >>> 31) >>> 23 | (-943229910 << 1 | -943229910 >>> 31) << 9) + -45) ^ -500214499)
         | (int)(var7 >>> 32) << (332479371 - -107 + 11 ^ -51 ^ -332479548)
         | (int)var7;
   }

   private void ilillIiill() {
      this.IIIillliil = -1;
      this.lIilllliil = null;
      this.IIilllliil.set(null);
      this.Ililllliil = null;
      this.llilllliil = 0L;
      this.Iiilllliil = false;
      this.llIillliil = null;
      this.ilIillliil = null;
      this.IiIillliil = null;
      this.liIillliil = 0;
   }

   private static class_243 ilIllIiIll(class_243 current, class_2777 teleport) {
      long var5 = -3230873007426598511L;
      Set var2 = teleport.comp_3239();
      var5 ^= (
            (long)(!var2.contains(class_2709.field_12400) && !var2.contains(class_2709.field_12398) && !var2.contains(class_2709.field_12403) ? 0 : 1) << 32
               ^ var5
         )
         & -1L << 32;
      if (current == null && (int)(var5 >>> 32) != 0) {
         return null;
      } else {
         class_10182 var4 = new class_10182(current != null ? current : class_243.field_1353, class_243.field_1353, 0.0F, 0.0F);
         return class_10182.method_63639(var4, teleport.comp_3238(), var2).comp_3148();
      }
   }

   @Override
   protected void IiIIlliIIl(IliIliIllliIliIl event) {
      class_2596 var2 = event.iilIIiiIll;
      if (!(var2 instanceof class_2678) && !(var2 instanceof class_2724)) {
         lIiIIIlliIiIIIll var3 = this.lIilllliil;
         if (var3 != null && IIIiillllIIiilll.iliIiiliiiii(var2, IiIIlIIiliIIlIIi::IlIllllIll)) {
            long var4 = this.iIilllliil;
            IllliIlllllliIll var6 = new IllliIlllllliIll();

            while (true) {
               lIIlIlIiiIIlIlIi var7 = this.IIilllliil.get();
               if (var7 != null && var7.IIIllIIliIIl() == var3.IliIlllilIi()) {
                  var6.IllIIiilll = var7;
                  var6.lllIIiilll = false;
                  var6.illIIiilll = false;
                  if (var2 instanceof class_8038 var8) {
                     for (class_2596 var10 : var8.method_48324()) {
                        this.lIIlliIIll(var6, var10, var3, var4);
                     }
                  } else {
                     this.lIIlliIIll(var6, var2, var3, var4);
                  }

                  if (var6.IllIIiilll != var7 && !this.IIilllliil.compareAndSet(var7, var6.IllIIiilll)) {
                     continue;
                  }

                  if (var6.illIIiilll) {
                     this.Iiilllliil = true;
                     this.Ililllliil = null;
                     this.lIilliIill();
                     return;
                  }

                  if (var6.lllIIiilll) {
                     this.Ililllliil = null;
                     this.lIilliIill();
                     return;
                  }

                  lIIlIlIiiIIlIlIi var13 = var6.IllIIiilll;
                  if (var13.liiiIIllIl() && var7.IiIlliIliiIl() != null && !var13.IiIlliIliiIl().equals(var7.IiIlliIliiIl())) {
                     double var14 = liIlliiIll(var3, var7.IiIlliIliiIl());
                     double var11 = liIlliiIll(var3, var13.IiIlliIliiIl());
                     if (var11 <= 6.0 && lIiIlIiliIiIlIil.IilliliilIIi(var14, var11)) {
                        this.Ililllliil = var2;
                        return;
                     }

                     this.Ililllliil = null;
                     this.lIilliIill();
                     return;
                  }

                  return;
               }

               return;
            }
         }
      } else {
         this.ililllliil = true;
         this.Ililllliil = null;
      }
   }

   private void lllllillll(class_1309 target, boolean now, long holding) {
      long var9 = -1537042899716821963L;
      lIIlIlIiiIIlIlIi var5 = this.IIilllliil.get();
      if (var5 != null && var5.IIIllIIliIIl() == target.method_5628()) {
         var9 ^= ((long)lIiIlIiliIiIlIil.IIIllIIliIIl(now, this.IlIillliil, var5.IIlllIlliIll(), this.iIilllliil) << 32 ^ var9) & -1L << 32;
         if ((int)(var9 >>> 32) != 0 || !var5.liiiIIllIl() && holding - this.iIIillliil >= (454532386518959482L ^ 454532386518958246L)) {
            class_243 var7 = target.method_43389().method_60933();
            class_243 var8 = class_10182.method_63638(target).comp_3148();
            if (!var5.liiiIIllIl() || !var7.equals(var5.IlIlllIlilIl()) || !var8.equals(var5.IiIlliIliiIl())) {
               this.IIilllliil.compareAndSet(var5, var5.iIlIlllllill(var7, var8));
            }
         }
      }
   }

   private boolean Iillllilll() {
      long var2 = 5908274884863766373L;
      var2 ^= ((long)iillIlllIIilIlll.IliIlllilIi() << 32 ^ var2) & -1L << 32;
      if ((int)(var2 >>> 32) != 0) {
         this.IlIillliil = -8528250991057642797L ^ -695121045797133012L;
      } else if (this.IlIillliil == (8480239178387708020L ^ 743132858467067787L)) {
         this.IlIillliil = this.iIilllliil;
      }

      return (boolean)((int)(var2 >>> 32));
   }

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         if (!this.liilllliil.liiiIIllIl(Iiiilllliiilll.field_1687) || this.ililllliil) {
            this.ililllliil = false;
            this.liilllliil.IliIlllilIi(Iiiilllliiilll.field_1687);
            this.Ilillllill();
         }

         boolean var1 = this.Iillllilll();
         long var2 = IIIiillllIIiilll.IliIlllilIi();
         int var4 = this.iiilllliil;
         this.iiilllliil = -1;
         if (var4 != -1) {
            this.IIllllIlll(var4, var2);
         }

         if (this.IIIillliil != -1) {
            if (!this.Iiilllliil
               && Iiiilllliiilll.field_1687.method_8469(this.IIIillliil) instanceof class_1309 var6
               && liiIIIlliiiIIIll.IliIlllilIi(var6, illlllliil)
               && !Iiiilllliiilll.field_1724.method_29504()
               && var2 - this.lIIillliil <= 3000L) {
               this.lllllillll(var6, var1, var2);
               lIIlIlIiiIIlIlIi var7 = this.IIilllliil.get();
               class_243 var8 = var7 != null && var7.IIIllIIliIIl() == this.IIIillliil && var7.liiiIIllIl() ? var7.IiIlliIliiIl() : null;
               class_243 var9 = var8 != null ? var8 : var6.method_73189();
               class_243 var10 = Iiiilllliiilll.field_1724.method_33571();
               double var11 = (double)var6.method_17681() / 2.0;
               double var13 = (double)var6.method_17682();
               if (lIlIlIIiiIlIlIIi.IliIlllilIi(
                     var10.field_1352, var10.field_1351, var10.field_1350, var9.field_1352, var9.field_1351, var9.field_1350, var11, var13
                  )
                  > 6.0) {
                  this.Ilillllill();
                  return;
               }

               this.iiIillliil = var6.method_17681();
               this.IIlillliil = var6.method_17682();
               this.lIilllliil = new lIiIIIlliIiIIIll(
                  this.IIIillliil,
                  Iiiilllliiilll.field_1724.method_5628(),
                  var10.field_1352,
                  var10.field_1351,
                  var10.field_1350,
                  var11,
                  var13,
                  this.Iillllliil.Iilllilliill(),
                  this.Iillllliil.Ililllililil()
               );
               this.iilllIIill(var8);
               return;
            }

            this.Ilillllill();
         }
      }
   }

   private void Ilillllill() {
      this.ilillIiill();
      iillIlllIIilIlll.lIiiIiIlilli(this);
   }

   @Override
   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      if (Iiiilllliiilll.method_18854()) {
         if (event.lIiilIIIIi instanceof class_2824 var2 && IIIliiIilIIliiIi.IliIlllilIi(var2)) {
            this.iiilllliil = IIIliiIilIIliiIi.liiiIIllIl(var2);
         }
      }
   }

   @Override
   protected void Illillliilli() {
      this.ilillIiill();
      this.iiilllliil = -1;
      this.ililllliil = false;
      this.IlIillliil = 551935651304748471L ^ 8671436385550027336L;
      this.liilllliil.IliIlllilIi(Iiiilllliiilll.field_1687);
   }

   private void iilllIIill(class_243 server) {
      if (server != null) {
         if (this.ilIillliil == null) {
            this.llIillliil = server;
            this.ilIillliil = server;
            this.IiIillliil = server;
            this.liIillliil = 0;
         } else {
            if (!server.equals(this.IiIillliil)) {
               this.IiIillliil = server;
               this.liIillliil = 3;
            }

            this.llIillliil = this.ilIillliil;
            if (this.liIillliil > 0) {
               this.ilIillliil = this.ilIillliil.method_1019(this.IiIillliil.method_1020(this.ilIillliil).method_1021(1.0 / (double)this.liIillliil));
               this.liIillliil--;
            }
         }
      }
   }

   public IiIIlIIiliIIlIIi() {
      super(IliIlllilIi<"IliIlllilIi","3L4NuHLaK2lcoG3/fs+n9zZHRyr1GJt/Atdd6YdVdWjnl2GK+CA=">(), lllIllillIll.iiIlIIIiIIllIIIi);
      this.iillllliil = new iliiliilIiiiliil(
         IliIlllilIi<"IliIlllilIi","8zVJNnvaJrLj5AbO4kRdpA1JW0b/9mLFY8UgjPvimB/W">(),
         IliIlllilIi<"IliIlllilIi","gLPX2WSKNOk5PMnCHyfeivX8hm/gV+FmptypXHuOMM++4unXNqzNJsNJBX0PJ1DjmkdFeHsSdXgEAmPxwuA=">(),
         1678083689
      );
      this.IIilllliil = new AtomicReference<>();
      this.liilllliil = new IiIllliliIllli();
      this.iiilllliil = -1;
      this.IIIillliil = -1;
      this.IlIillliil = Long.MAX_VALUE;
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.Iillllliil, this.lillllliil, this.iillllliil});
   }

   private static boolean IlIllllIll(class_2596<?> q) {
      return q instanceof class_2684
         || q instanceof class_10264
         || q instanceof class_2777
         || q instanceof class_2604
         || q instanceof class_2716
         || q instanceof class_2743
         || q instanceof class_2664;
   }

   private void lIilliIill() {
      this.llilllliil = 0L;
      if (iillIlllIIilIlll.liiiIIllIl(this)) {
         iillIlllIIilIlll.lIiiIiIlilli(this);
      }
   }

   @Override
   protected void IIiilIiiiIii(illlllIillll event) {
      this.Iillllilll();
      this.iIilllliil++;
      if (this.lillllliil.Iilllilliill() && this.IIIillliil != -1 && this.ilIillliil != null && this.llIillliil != null) {
         float var2 = event.liiiiIIiiiiiiIIi;
         double var3 = class_3532.method_16436((double)var2, this.llIillliil.field_1352, this.ilIillliil.field_1352);
         double var5 = class_3532.method_16436((double)var2, this.llIillliil.field_1351, this.ilIillliil.field_1351);
         double var7 = class_3532.method_16436((double)var2, this.llIillliil.field_1350, this.ilIillliil.field_1350);
         float var9 = this.iiIillliil / 2.0F;
         if (!iIiiIIilIliiIIil.IlIillIiilIi(var3, var5 + (double)this.IIlillliil / 2.0, var7, this.IIlillliil)) {
            Matrix4f var10 = iIiiIIilIliiIIil.IIillIiliIil();
            float var11 = iIiiIIilIliiIIil.Ililllililil(var3 - (double)var9);
            float var12 = iIiiIIilIliiIIil.Iiilliiliiil(var5 + 0.01);
            float var13 = iIiiIIilIliiIIil.IIIilIIiiIIi(var7 - (double)var9);
            float var14 = iIiiIIilIliiIIil.Ililllililil(var3 + (double)var9);
            float var15 = iIiiIIilIliiIIil.Iiilliiliiil(var5 + (double)this.IIlillliil);
            float var16 = iIiiIIilIliiIIil.IIIilIIiiIIi(var7 + (double)var9);
            int var17 = this.iillllliil.Iilllilliill();
            liilliiill(var10, var11, var12, var13, var14, var15, var16, var17);
            iIiiIIilIliiIIil.iIIIlIlIIl(var10, var11, var12, var13, var14, var15, var16, iIIilIlIil(var17), 1.5F);
         }
      }
   }
}
