package gg.corz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_2663;
import net.minecraft.class_4184;
import net.minecraft.class_4588;
import org.joml.Matrix4f;

public class liIIllIiiiIIllIi extends ilIllIiIll {
   private final IIIIlilllIIIlill ilIlilIIIi;
   private final iiIiiilIIliiil iIIlilIIIi;
   private final Map<Integer, Integer> lIllilIIIi;
   private static final double[] illlilIIIi = new double[10];
   private final iilliIlIIiliIl IlIlilIIIi;
   private static final int llllilIIIi = 9;
   private final List<liIililiiIilil> IIllilIIIi;
   private static final double[] IillilIIIi = new double[10];
   private final iiIiiilIIliiil lIIlilIIIi;
   private static final int liIlilIIIi = -12130194;
   private long IlllilIIIi;
   private final iiIiiilIIliiil IIIlilIIIi;
   private static final int IiIlilIIIi = -403876;
   private final iiIiiilIIliiil iiiIilIIIi = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","xFIbPnPHpboO1DYGua+gKQBSS+qJQyN6iYJkPN8l965dbyi5VjV5srU=">(),
      IliIlllilIi<"IliIlllilIi","70fP4n0QwwFyHOP0sQMcaV6oG/UynQjURSL+sLqSY5zasAuD651K+qTEIwv/QtlHKwpqQSXnNboh9MhcHW6abwd4zjI=">(),
      true
   );
   private final Queue<class_2663> iIllilIIIi;
   private final IIIIlilllIIIlill llIlilIIIi;
   private static final int iiIlilIIIi = 700;

   @Override
   public void IiIIlliIIl(IliIliIllliIliIl event) {
      if (this.IIIlilIIIi.Iilllilliill()) {
         if (event.iilIIiiIll instanceof class_2663 var2
            && var2.method_11470()
               == (
                  ((-1767502637 << 13 | -1767502637 >>> 19) * -373475417 >>> 1 | (-1767502637 << 13 | -1767502637 >>> 19) * -373475417 << 31) * -1527099483
                     ^ 1250636893
               )) {
            this.iIllilIIIi.add(var2);
         }
      }
   }

   @Override
   public void Iilililiiili() {
      this.IIllilIIIi.clear();
      this.lIllilIIIi.clear();
      this.iIllilIIIi.clear();
      this.IlllilIIIi = 0L;
   }

   private static int ilIllIiIll(int t, float rgb) {
      long var5 = -196866116719642868L;
      long var7 = 4522427808205970782L;
      var5 ^= (
            (long)(
                     t >> (-(~(1856857617 ^ 113)) ^ 1856857713)
                        & (((586487728 >>> 19 | 586487728 << 13) << 9 | (586487728 >>> 19 | 586487728 << 13) >>> 23) ^ -334971462)
                  )
                  << 32
               ^ var5
         )
         & -1L << 32;
      var5 ^= ((long)(t >> ((--633764291 << 29 | --633764291 >>> 3) ^ -7 ^ -1689833271) & (~157184256 * -121 ^ 1839425926)) ^ var5) & -1L >>> 32;
      var7 ^= ((long)(t & ((-(-266215530 << 3 | -266215530 >>> 29) + 99 >>> 11 | -(-266215530 << 3 | -266215530 >>> 29) + 99 << 21) ^ 1972362975)) << 32 ^ var7)
         & -1L << 32;
      var5 ^= (
            (long)Math.round((float)((int)(var5 >>> 32)) + (float)(((357835973 + 99 >>> 29 | 357835973 + 99 << 3) ^ -1432278593) - (int)(var5 >>> 32)) * rgb)
                  << 32
               ^ var5
         )
         & -1L << 32;
      var5 ^= ((long)Math.round((float)((int)var5) + (float)(((-1543885693 + -47) * -799063683 ^ 1234500091) - (int)var5) * rgb) ^ var5) & -1L >>> 32;
      var7 ^= (
            (long)Math.round((float)((int)(var7 >>> 32)) + (float)((((817537721 ^ 53) - 83) * 19 * -2083697005 ^ 1972427038) - (int)(var7 >>> 32)) * rgb) << 32
               ^ var7
         )
         & -1L << 32;
      return (int)(var5 >>> 32) << ((465692976 - 37 ^ 41) * -1762037865 + -21 ^ 562577641)
         | (int)var5 << (((1596092372 << 3 | 1596092372 >>> 29) << 11 | (1596092372 << 3 | 1596092372 >>> 29) >>> 21) - -87 ^ -1678436329)
         | (int)(var7 >>> 32);
   }

   @Override
   public void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         class_2663 var1;
         while ((var1 = this.iIllilIIIi.poll()) != null) {
            if (this.IIIlilIIIi.Iilllilliill()) {
               try {
                  class_1297 var2 = var1.method_11469(Iiiilllliiilll.field_1687);
                  if (var2 != null) {
                     this.lIIlliIIll(
                        var2.method_23317(),
                        var2.method_23318() + (double)var2.method_17682() * 0.6,
                        var2.method_23321(),
                        this.IlIlilIIIi.Iilllilliill() * 2,
                        true
                     );
                  }
               } catch (Throwable var12) {
               }
            }
         }

         HashSet var13 = new HashSet();
         if (this.iiiIilIIIi.Iilllilliill()) {
            double var3 = 1024.0;

            for (class_1297 var6 : Iiiilllliiilll.field_1687.method_18112()) {
               if (var6 instanceof class_1309) {
                  class_1309 var7 = (class_1309)var6;
                  if (var6 != Iiiilllliiilll.field_1724) {
                     int var8 = var6.method_5628();
                     var13.add(var8);
                     int var9 = var7.field_6235;
                     Integer var10 = this.lIllilIIIi.put(var8, var9);
                     int var11 = var10 == null ? 0 : var10;
                     if (var9 == var7.field_6254 && var11 != var7.field_6254 && var6.method_5858(Iiiilllliiilll.field_1724) < var3) {
                        this.lIIlliIIll(
                           var6.method_23317(),
                           var6.method_23318() + (double)var6.method_17682() * 0.5,
                           var6.method_23321(),
                           this.IlIlilIIIi.Iilllilliill(),
                           false
                        );
                     }
                  }
               }
            }
         }

         this.lIllilIIIi.keySet().retainAll(var13);
      }
   }

   private void IlIllllIll(class_4588 py, Matrix4f camPos, class_243 m, double pz, double coreArgb, double vc, float s, int px) {
      double var12 = m.field_1352 - pz;
      double var14 = m.field_1351 - coreArgb;
      double var16 = m.field_1350 - vc;
      double var18 = Math.sqrt(var12 * var12 + var14 * var14 + var16 * var16);
      if (!(var18 < 1.0E-4)) {
         var12 /= var18;
         var14 /= var18;
         var16 /= var18;
         double var20 = var16;
         double var22 = -var12;
         double var24 = Math.sqrt(var16 * var16 + var22 * var22);
         if (var24 < 1.0E-4) {
            var20 = 1.0;
            var22 = 0.0;
            var24 = 1.0;
         }

         var20 /= var24;
         var22 /= var24;
         double var26 = 0.0;
         double var28 = var14 * var22 - var16 * var26;
         double var30 = var16 * var20 - var12 * var22;
         double var32 = var12 * var26 - var14 * var20;
         float var34 = (float)pz;
         float var35 = (float)coreArgb;
         float var36 = (float)vc;
         int var37 = -16777216;
         float var38 = 0.0F;
         float var39 = 0.0F;
         float var40 = 0.0F;

         for (int var41 = 0; var41 <= 9; var41++) {
            double var42 = illlilIIIi[var41];
            double var44 = IillilIIIi[var41];
            float var46 = (float)((var20 * var42 + var28 * var44) * (double)s);
            float var47 = (float)((var26 * var42 + var30 * var44) * (double)s);
            float var48 = (float)((var22 * var42 + var32 * var44) * (double)s);
            float var49 = var34 + var46;
            float var50 = var35 + var47;
            float var51 = var36 + var48;
            if (var41 > 0) {
               iIiiIIilIliiIIil.IiIlliIliiIl(py, camPos, var34, var35, var36, px, var38, var39, var40, -16777216, var49, var50, var51, -16777216);
            }

            var38 = var49;
            var39 = var50;
            var40 = var51;
         }
      }
   }

   public boolean iiiIlIIIll() {
      return this.IliIlllilIi() && this.iiiIilIIIi.Iilllilliill() && this.lIIlilIIIi.Iilllilliill();
   }

   private static int IIllllIlll(int v) {
      return v < 0
         ? 0
         : Math.min(
            v,
            (
                  ((-715734514 << 13 | -715734514 >>> 19) << 21 | (-715734514 << 13 | -715734514 >>> 19) >>> 11) * -1556147571 << 21
                     | ((-715734514 << 13 | -715734514 >>> 19) << 21 | (-715734514 << 13 | -715734514 >>> 19) >>> 11) * -1556147571 >>> 11
               )
               ^ -807393430
         );
   }

   public liIIllIiiiIIllIi() {
      super(IliIlllilIi<"IliIlllilIi","0Ytp/0qxtk5ZTNOnWE+W3XIp25e67fLSCfOOixjq+NRZgwGsbQ==">(), lllIllillIll.llIlIIIiilIlIIIi);
      this.IIIlilIIIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","R+tjvaw+aYgNKd+b7LCjvQkv/r5Gm6RRPIlKLtQh6x4D6Hb9fyi7HfPbOQ==">(),
         IliIlllilIi<"IliIlllilIi","tw/u0RfUCSlAYhYB6xLbXPvjmgw3RErvgmPxMlJWP0K0wSvXyEgQH1zGIR9aMKi2NX4EoArOHCEIzSvUDD8f84SZDSt+sNBJ">(),
         true
      );
      this.lIIlilIIIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","Cu7o3+dguhC5WCfZyUd6uMiylh+aYZkeoJE8/D7kQUffkx9FB6OwmoZGsyesnA==">(),
         IliIlllilIi<"IliIlllilIi","JJ/QfUlf8N3pbtG+ENREtNbE58+Nl+nNPcj7UPUHTzayNsS9IJzb6vx77fC/nV+FcUW9UMcOelN/S3HfYZILXhxWMI9lIuPun+9wK2eObMhunNyUx6pLJf/BPk5+9fZLsNkNKVu42bGcrD2d">(),
         true
      );
      this.iIIlilIIIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","80rJkCtgRgH9hKMi3qIUX2xAg/8sZvVNfJN+EfqHA3MQiMIBWkt4Cmc=">(),
         IliIlllilIi<"IliIlllilIi","v1KwZWUNCKNYlm1LABx/SaQlroUiZEv2rbWkhfXEyv0cOpD9E9VcPL0DqUms92S/v93IerAJhv2wQlZF865TPx9SOTyypOQsF7I=">(),
         true
      );
      this.IlIlilIIIi = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","OccL0msbsM/EjgxEJMvNXDGi5hj/t8SNlahGPXwUYjjVbQ==">(),
         IliIlllilIi<"IliIlllilIi","5piT7zeOHH5ARt1JMObdtrUyO8JDuf74Pr/+9vqCXB+e8cyrjGby/DZ4sUhYxzo5ZK9ub8mCdchMMZHXtbPax7IusQAZNJ53Zw==">(),
         14,
         4,
         40,
         1
      );
      this.llIlilIIIi = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","6t3b/h/Jz46wwQ0InM6euvdmEGseafaguwbGOgG7wdtqXPEV">(),
         IliIlllilIi<"IliIlllilIi","UIhhS+veck+JrEc1Dc9SQTmuCJ/2yMORr5msCqFvfN0JQn+hu0Y88TnqvxdqlH7WOyyYCyoaRHYdThoElGq+">(),
         0.8,
         0.3,
         2.0,
         0.1
      );
      this.ilIlilIIIi = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","ax3vyIj6Ph/crm07P9rslwe/bxG07pdjQotbNmEH7uQ=">(),
         IliIlllilIi<"IliIlllilIi","LUQEurV8FXLaPY67jMsVzMl7VnZHl1s9PhRotNJ2BFa2VLMYajZNhTxX8WSfRQ1tEJyWKkkIH772MXxUa+rDfw==">(),
         0.1,
         0.04,
         0.3,
         0.01
      );
      this.IIllilIIIi = new ArrayList<>();
      this.lIllilIIIi = new HashMap<>();
      this.iIllilIIIi = new ConcurrentLinkedQueue<>();
      this.IlllilIIIi = 0L;
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{this.iiiIilIIIi, this.IIIlilIIIi, this.lIIlilIIIi, this.iIIlilIIIi, this.IlIlilIIIi, this.llIlilIIIi, this.ilIlilIIIi}
      );
   }

   static {
      for (int var0 = 0; var0 <= 9; var0++) {
         double var1 = (Math.PI * 2) * (double)var0 / 9.0;
         illlilIIIi[var0] = Math.cos(var1);
         IillilIIIi[var0] = Math.sin(var1);
      }
   }

   @Override
   public void IIiilIiiiIii(illlllIillll event) {
      if (!this.IIllilIIIi.isEmpty() && Iiiilllliiilll.field_1687 != null) {
         class_4184 var2 = Iiiilllliiilll.field_1773.method_19418();
         if (var2 != null) {
            class_243 var3 = var2.method_71156();
            long var4 = System.nanoTime();
            float var6 = this.IlllilIIIi == 0L ? 0.0F : (float)Math.min(0.1, (double)(var4 - this.IlllilIIIi) / 1.0E9);
            this.IlllilIIIi = var4;
            event.IliiiIIilliiiIIi.method_22903();
            event.IliiiIIilliiiIIi.method_22904(-var3.field_1352, -var3.field_1351, -var3.field_1350);
            Matrix4f var7 = event.IliiiIIilliiiIIi.method_23760().method_23761();
            class_4588 var8 = this.iIIlilIIIi.Iilllilliill() ? iIiiIIilIliiIIil.iliIiiliiiii() : iIiiIIilIliiIIil.IIIllIIliIIl();
            float var9 = (float)Math.exp(-1.8 * (double)var6);
            Iterator var10 = this.IIllilIIIi.iterator();

            while (var10.hasNext()) {
               liIililiiIilil var11 = (liIililiiIilil)var10.next();
               if (var6 > 0.0F) {
                  var11.llllllIliilllllIli *= (double)var9;
                  var11.iillllIliIIilllIli *= (double)var9;
                  var11.IillllIlilillllIli = var11.IillllIlilillllIli * (double)var9 - (double)(7.0F * var6);
                  var11.liIlllIliiiIlllIli = var11.liIlllIliiiIlllIli + var11.llllllIliilllllIli * (double)var6;
                  var11.IIllllIlilIllllIli = var11.IIllllIlilIllllIli + var11.IillllIlilillllIli * (double)var6;
                  var11.iIllllIliIlllllIli = var11.iIllllIliIlllllIli + var11.iillllIliIIilllIli * (double)var6;
                  var11.lIilllIliiIilllIli += var6;
               }

               if (var11.lIilllIliiIilllIli >= var11.IlilllIlillilllIli) {
                  var10.remove();
               } else {
                  float var12 = var11.lIilllIliiIilllIli / var11.IlilllIlillilllIli;
                  float var13 = 1.0F - var12;
                  var13 *= var13;
                  if (!(var13 <= 0.012F)) {
                     int var14 = liIlliiIll(ilIllIiIll(var11.ililllIliIiilllIli, 0.35F), var13);
                     float var15 = var11.liilllIliiiilllIli * (0.6F + 0.4F * (1.0F - var12));
                     this.IlIllllIll(var8, var7, var3, var11.liIlllIliiiIlllIli, var11.IIllllIlilIllllIli, var11.iIllllIliIlllllIli, var15, var14);
                  }
               }
            }

            event.IliiiIIilliiiIIi.method_22909();
         }
      }
   }

   private static int liIlliiIll(int rgb, float f) {
      long var5 = -1782137612708500878L;
      long var7 = -3839806775064521835L;
      var5 ^= (
            (long)IIllllIlll(Math.round((float)(rgb >> ((--1624929018 ^ -7) * -2014922929 ^ 974498045) & ((~(1522886725 * -75) + 35) * 49 ^ 266329590)) * f))
                  << 32
               ^ var5
         )
         & -1L << 32;
      var5 ^= (
            (long)IIllllIlll(
                  Math.round((float)(rgb >> ((-116061100 * -5 >>> 29 | -116061100 * -5 << 3) ^ 347476713) & (~(41374087 * 286331153) ^ -2001559561)) * f)
               )
               ^ var5
         )
         & -1L >>> 32;
      var7 ^= ((long)IIllllIlll(Math.round((float)(rgb & (((2119715139 ^ 119) >>> 29 | (2119715139 ^ 119) << 3) ^ -222148260)) * f)) << 32 ^ var7) & -1L << 32;
      return (-1930534000 >>> 23 | -1930534000 << 9) * -73 * 858993459 ^ -1691871635
         | (int)(var5 >>> 32) << (-((-1844463333 >>> 7 | -1844463333 << 25) + -51) ^ -925114159)
         | (int)var5 << (~(1983950643 + 69) ^ -1983950705)
         | (int)(var7 >>> 32);
   }

   private void lIIlliIIll(double z, double y, double x, int totem, boolean count) {
      ThreadLocalRandom var9 = ThreadLocalRandom.current();
      int var10 = 0xFF000000 | IlIIilIlllIIilIl.lliiIlliIl & 16777215;

      for (int var11 = 0; var11 < totem && this.IIllilIIIi.size() < 700; var11++) {
         liIililiiIilil var12 = new liIililiiIilil();
         var12.liIlllIliiiIlllIli = z;
         var12.IIllllIlilIllllIli = y;
         var12.iIllllIliIlllllIli = x;
         double var13 = var9.nextDouble() * Math.PI * 2.0;
         double var15 = 2.0 * var9.nextDouble() - 1.0;
         double var17 = Math.sqrt(Math.max(0.0, 1.0 - var15 * var15));
         double var19 = var17 * Math.cos(var13);
         double var21 = var17 * Math.sin(var13);
         if (count) {
            var15 = Math.abs(var15) * 0.6 + 0.5;
         }

         double var23 = count ? 2.2 + var9.nextDouble() * 3.2 : 2.8 + var9.nextDouble() * 2.6;
         var12.llllllIliilllllIli = var19 * var23;
         var12.IillllIlilillllIli = var15 * var23 + (count ? 1.6 : 0.0);
         var12.iillllIliIIilllIli = var21 * var23;
         var12.lIilllIliiIilllIli = 0.0F;
         var12.IlilllIlillilllIli = (float)this.llIlilIIIi.Iilllilliill() * (count ? 1.25F : 1.0F) * (0.75F + var9.nextFloat() * 0.5F);
         var12.liilllIliiiilllIli = (float)this.ilIlilIIIi.Iilllilliill() * (0.7F + var9.nextFloat() * 0.6F);
         if (count) {
            var12.ililllIliIiilllIli = var9.nextFloat() < 0.3F ? -12130194 : -403876;
         } else {
            var12.ililllIliIiilllIli = var9.nextFloat() < 0.4F ? -1 : var10;
         }

         this.IIllilIIIi.add(var12);
      }
   }
}
