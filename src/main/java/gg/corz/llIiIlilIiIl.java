package gg.corz;

import com.corz.client.CorzClient;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.Color;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;
import net.minecraft.class_1041;
import net.minecraft.class_1132;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1542;
import net.minecraft.class_1646;
import net.minecraft.class_1661;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import net.minecraft.class_1728;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1914;
import net.minecraft.class_1916;
import net.minecraft.class_2281;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_2586;
import net.minecraft.class_2611;
import net.minecraft.class_2621;
import net.minecraft.class_2680;
import net.minecraft.class_2745;
import net.minecraft.class_2765;
import net.minecraft.class_2767;
import net.minecraft.class_3414;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import net.minecraft.class_3988;
import net.minecraft.class_4050;
import net.minecraft.class_4587;
import net.minecraft.class_465;
import net.minecraft.class_490;
import net.minecraft.class_492;
import net.minecraft.class_634;
import net.minecraft.class_642;
import net.minecraft.class_6880;
import net.minecraft.class_1269.class_9860;
import net.minecraft.class_1269.class_9861;
import net.minecraft.class_2350.class_2353;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import org.joml.Matrix4f;

public class llIiIlilIiIl extends ilIllIiIll {
   private final iilliIlIIiliIl iliilIilIiiilIil;
   private static final int lIIIIliliIIIIlil = 2;
   private static final long IiilIlilliilIlil = 1200L;
   private final iiIiiilIIliiil IlIilIilllIilIil;
   private final List<IiIlIIiliIlIIi> liiliIiliiiliIil;
   private static final long IIliIlillIliIlil = 200L;
   private iIlIIiIllIIi lllIIlilillIIlil;
   private int lliIllililiIllil;
   private static final long IlIIIlilllIIIlil = 120000L;
   private long iilIIlilIIiIIlil;
   private final iiIiiilIIliiil IiIIiIilliIIiIil;
   private static final long iIlIIlilIllIIlil = 90000L;
   private static final long iiliIlilIIiiIlil = -4611686018427387904L;
   private int iiiIllilIIIlllil;
   private final List<IliIlIllliIlIl> IiIiiIilliIiiIil;
   private long IIllllillIllllil;
   private final illlIlIlIillIlIl liIliIiliiIliIil;
   private static final int liIiIliliiIiIlil = 600;
   private static final long lIIiIliliIIiIlil = 6000L;
   private boolean IIiiiIillIiiiIil;
   private long IIIIllillIIIllil;
   private long lilIlliliilIllil;
   private final lilIIIliiilIIIli IilliIillilliIil;
   private static final long ilIIIlilIiIIIlil = 2500L;
   private final Map<IiIlIIiliIlIIi, Long> iIIiiIilIlIiiIil;
   private int iillllilIIilllil;
   private static final long IIlIIlillIlIIlil = 150L;
   private long lIllIliliIllIlil;
   private static final long ilIiIlilIiIiIlil = 100L;
   private final illlIlIlIillIlIl iIlliIilIllliIil;
   private final Map<String, Long> IiiiiIilliiiiIil;
   private boolean iliIIlilIiiIIlil;
   private boolean iiIIllilIIlIllil;
   private Object lIliiIiliIliiIil;
   private final iiIiiilIIliiil iIlilIilIllilIil;
   private final List<IlIiiIIillIiiIIi> IIIiiIillIIiiIil;
   private int lIIllliliIIlllil;
   private long illIllilIilIllil;
   private long illiiIilIiliiIil;
   private final lliliIIiililiIIi lllliIilillliIil;
   private boolean llIlIlililIlIlil;
   private String iiIlIlilIIllIlil;
   private final Set<Long> IIilIlillIilIlil;
   private final IIIIlilllIIIlill lllilIilillilIil;
   private final lliliIIiililiIIi iililIilIIiilIil;
   private String lillIliliillIlil;
   private boolean iIiiiIilIliiiIil;
   private final lliliIIiililiIIi IllIiIillllIiIil;
   private final iilliIlIIiliIl iIIIiIilIlIIiIil;
   private int liIllliliiIlllil;
   private final IiIlIIiliIlIIi ililiIilIiiliIil;
   private final lliliIIiililiIIi iiillIilIIIilIil = new lliliIIiililiIIi(
      IliIlllilIi<"IliIlllilIi","VCKnIr0bR6bb4AbwXffpEt70rgToZ8cfX1PbQZN1mrX1zDbv3JjJ2y0ujQ==">(),
      IliIlllilIi<"IliIlllilIi","u30uUFBJtulVoGpElCgh4/UMwqMucAqLXrFjj0E9kJZwZQMtvzJyQ76ZGjnSEQTZc5gbB71+xBenxDmIhn57Tw6+QJGmW0f8P0f3JbOEu299i9DpgH18becMmuWBwrJxcuvw4cDz3ruMCSS/4UtF9OnsqbnNwopy2u+7F5UPSFgD8Q1RTTPituCpfOXewaG3u1GmJ9ad6LR2j0IicX4tS9dTEiJzvFPFHNF+zix+cuOMtidqaP6lhQ==">(),
      IliIlllilIi<"IliIlllilIi","f51Ynb28v8yh7E2YbAYYPygYpPxP23tQ4dSIN4+L5Pi8KuM9Ow==">(),
      IliIlllilIi<"IliIlllilIi","f51Ynb28v8yh7E2YbAYYPygYpPxP23tQ4dSIN4+L5Pi8KuM9Ow==">(),
      IliIlllilIi<"IliIlllilIi","S0XASiZa+o6Y4u8CftcZWvBlFnufMdy0ByiAlZwZkeaImUW2">(),
      IliIlllilIi<"IliIlllilIi","jfKE1oz1vl7kFHyoH1wJ48T2wNaI2l+aUOJj8/FgVSluC5EZoQ==">(),
      IliIlllilIi<"IliIlllilIi","Y9o2Gd3GL8UkZ3gDYn6gInHXt4hI0U6XXsKkX9UJVOLRpsTt">()
   );
   private final lliliIIiililiIIi liiilIiliiiilIil;
   private final lliliIIiililiIIi IliilIillliilIil;
   private IlliliIillliliIi IilIIlillilIIlil;
   private static final long iiilIlilIIIiIlil = 1200L;
   private final lliliIIiililiIIi lIiilIiliIiilIil;
   private long IiIlIlilliIlIlil;
   private final illlIlIlIillIlIl IIlliIillIlliIil;
   private final iiIiiilIIliiil lIIilIiliIIilIil = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","SrWYFD2v10uPaU4X3lZ0CObbB3DjmrDRWke6g59mHIKZjYW+1buci1QHdYYq">(),
      IliIlllilIi<"IliIlllilIi","eZskBvIhBK6GFxFa/ggDX4Oq/fCOtcI9fbnNP08ftIDUHENVS4gCOQ69QyDur5S093vF6yqBo+yBtIDfijZCOdhRTpH8fN+KZoewQ0hhFI4gbGgtYXOqoXz7rD1zbyJCXQ23XzanDKFDyBVzO0o=">(),
      true
   );
   private final iilliIlIIiliIl iiiIiIilIIIliIil;
   private String illlIlilIillIlil;
   private long liiIIliliiiIIlil;
   private long iIIIllilIlIIllil;
   private static final long llliIlililliIlil = 8L;
   private final iiIiiilIIliiil ilIilIilIiIilIil;
   private int IIiIllillIiIllil;
   private static final double iIilIlilIlilIlil = 3.0;
   private static final long IlIiIlilllIiIlil = 20L;
   private String iIIlIlilIlIlIlil;
   private long liiiIliliiiiIlil;
   private final ConcurrentLinkedQueue<lIIIIliliIIIIlil> iiiiiIilIIIIIlil;
   private final Map<IiIlIIiliIlIIi, String> llIiiIililIiiIil;
   private long iliiIlilIiiiIlil;
   private final iiIiiilIIliiil iIiIiIilIliIiIil;
   private final iiIiiilIIliiil lilIiIiliilIiIil;
   private final iilliIlIIiliIl IiiIiIilliiIiIil;
   private long llIIllililIIllil;
   private int iIiIllilIliIllil;
   private boolean llllllililllllil;
   private final lliliIIiililiIIi IililIillililIil;
   private final iilliIlIIiliIl lIIliIiliIIliIil;
   private static final long liliiIiliiliiIil = 600000L;
   private static final double llilIlilililIlil = 4.5;
   private final llIlIillilIlIill IliliIillliliIil;
   private IlIiiIIillIiiIIi IlIlllilllIlllil;
   private final lliliIIiililiIIi lIlIiIiliIlIiIil;
   private final Deque<iIIIIIIlIlIIIIIl> Iillllillillllil;
   private long IllIllillllIllil;
   private final List<IliIlIllliIlIl> iiIiiIilIIliiIil;
   private final iilliIlIIiliIl ilIliIilIiIliIil;
   private class_490 IiIIllilliIIllil;
   private String IlllIlilllllIlil;
   private long ilIlllilIiIlllil;
   private String IIIlIlillIIlIlil;
   private final Map<class_1792, Long> lliiiIililiiiIil;
   private final IiIiiilliIiiil lIiliIiliIiliIil;
   private IIIIllIllIIIllIl lIiiIliliIiiIlil;
   private final iilliIlIIiliIl llIIiIililIIiIil;
   private final iilliIlIIiliIl illIiIilIilIiIil;
   private final iilliIlIIiliIl IIIIiIillIIIiIil;
   private static final long liIIIliliiIIIlil = 1500L;
   private final lliliIIiililiIIi IIlilIillIlilIil;
   private static final long IiliIlilliliIlil = 200L;
   private final iilliIlIIiliIl IlIliIilllIliIil;
   private long lIlIlliliIlIllil;
   private long IiiIllilliiIllil;
   private String IlliiIilllliiIil;
   private final iiIiiilIIliiil iiIIiIilIIlIiIil;
   private long lIiIIliliIiIIlil;
   private final iiIiiilIIliiil IIiIiIillIiIiIil;
   private final iilliIlIIiliIl liIilIiliiIilIil;
   private static final long iIliIlilIlliIlil = 40L;
   private long IliiIlillliiIlil;
   private long IliIIlillliIIlil;
   private final iilliIlIIiliIl lliIiIililiIiIil;
   private final IilllIlllilllIll iilliIilIIiliIil;
   private boolean iIllllilIlllllil;

   public iIlIIiIllIIi IIIIillIIIil() {
      return this.lllIIlilillIIlil;
   }

   public Integer llllililllil() {
      return !this.IliIlllilIi()
         ? 0
         : this.lIiiIliliIiiIlil == IIIIllIllIIIllIl.ilIillIiIl
            ? (2104428573 * -3 << 1 | 2104428573 * -3 >>> 31) * 96516119 ^ 1401018713
            : (-(6273638 + 113) >>> 15 | -(6273638 + 113) << 17) ^ 1965822497;
   }

   private void lIiiiiIiii() {
      boolean var1 = this.IiIIiIilliIIiIil.Iilllilliill() && !this.lIilIliIilIl();

      for (IiIlIIiliIlIIi var3 : this.liiliIiliiiliIil) {
         var3.iIiiiIiliIliiiIili = var1 && var3.IIIiiIililIIiiIili == llIlIlIlilIlIlIl.IilIliilIl;
      }
   }

   public int liIilliiIill(int i, int dir) {
      long var4 = -1317510203655235627L;
      var4 ^= ((long)(i + dir) << 32 ^ var4) & -1L << 32;
      if (i >= 0 && i < this.liiliIiliiiliIil.size() && (int)(var4 >>> 32) >= 0 && (int)(var4 >>> 32) < this.liiliIiliiiliIil.size()) {
         Collections.swap(this.liiliIiliiiliIil, i, (int)(var4 >>> 32));
         this.iIlillIllill();
         iiiIIIlIIIlIIl.liiiIIllIl();
         return (int)(var4 >>> 32);
      } else {
         return i;
      }
   }

   private void llIliilIli() {
      iIIIIIIlIlIIIIIl var1 = this.Iillllillillllil.peek();
      if (var1 == null) {
         this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
      } else {
         if (Iiiilllliiilll.field_1687.method_8469(var1.liiIIiIlIl) instanceof class_1542 var2 && var2.method_5805()) {
            this.iilliIilIIiliIil.IliIlllilIi(var2.method_24515(), 0.35);
            llIlllilIlll var4 = this.iilliIilIIiliIil.IilliliilIIi();
            this.iIllllilIlllllil = true;
            if (var4 == llIlllilIlll.iilllIIiIIillIIi || var4 == llIlllilIlll.lIillIIiiIillIIi || this.IliIlllliIll() > 300L) {
               this.iilliIilIIiliIil.iIlIlllllill();
               this.lIIiiiIIii(
                  IliIlllilIi<"IliIlllilIi","2zLRIGT9dt13OlAuAr+9m3ZbRfIEEHDt6P4Ds7sv/fPFPA==">()
                     + (var1.iliIIiIlIl == null ? "" : var1.iliIIiIlIl.IlIlllIlilIl()),
                  IliIlllilIi<"IliIlllilIi","QyzBK4VUXpebd2yyqXT7WF/JkguSCsQ0tK4OT4HwPbx/HfXZfWpY9a1OuXrAOBliaSjTlXVRKb2fGW41pTB03SAUD82XL4tzbUgOKg4VBUPWpWllzHx+73ze">()
                     + var2.method_24515().method_23854()
                     + IliIlllilIi<"IliIlllilIi","ptI4llSJTaW2WYu+fpEmWqKqC6bQm/qHOK5lIN0=">(),
                  false,
                  6000L
               );
               this.lliliilili();
               this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
            }

            return;
         }

         this.iilliIilIIiliIil.iIlIlllllill();
         this.lliliilili();
         this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
      }
   }

   private void IIIllllIIlll() {
      if (this.iIiiIlIliiIl()) {
         this.IiiiIlliiiIl();
      }
   }

   private void IIIiillIIiil(class_4587 matrices) {
      String var2 = this.iIilllIlilll();
      IlIiiIIillIiiIIi var3 = this.lIililiIilil();
      this.IIilIlillIilIlil.clear();

      for (IlIiiIIillIiiIIi var5 : this.IIIiiIillIIiiIil) {
         if (var5.IilliliilIIi(var2)) {
            class_2338 var6 = var5.liiiIIllIl();
            boolean var7 = var5.ilIiIiiiil == IlliliIillliliIi.IillIiiIIi;
            if (var7 || this.IIilIlillIilIlil.add(this.Ilililllilil(var6))) {
               boolean var8 = var5 == var3;
               boolean var9 = this.IliIlllilIi() && this.Iillillillil(var5);
               double var10 = Math.sqrt(var5.iIlIlllllill().method_1025(Iiiilllliiilll.field_1724.method_33571()));
               if (!(var10 > 16.0) || var8 || var9) {
                  float var12 = iIIiiIlIlIiiIl.IIIilIIiiIIi(var10);
                  if (!(var12 <= 0.0F)) {
                     class_238 var13 = var7 ? new class_238(var6) : iIIiiIlIlIiiIl.iliIiiliiiii(var6);
                     class_243 var14 = var7
                        ? new class_243((double)var6.method_10263() + 0.5, (double)var6.method_10264() + 1.6, (double)var6.method_10260() + 0.5)
                        : iIIiiIlIlIiiIl.Iiilliiliiil(var13);
                     class_243 var15 = llilllililll.iIlIlllllill(var14);
                     if (var15 != null && !(var15.field_1350 < 0.0) && !(var15.field_1350 > 1.0)) {
                        String var16 = Math.round(var10) + IliIlllilIi<"IliIlllilIi","YnN7tR2xMPWx6ScDBrhtb17KDkUP+TYAnNXdd3E=">();
                        String var17;
                        if (var9) {
                           long var18 = Math.max(0L, 200L - (this.IliiIlillliiIlil - var5.liIiIiiiil)) / 20L;
                           var17 = var18 > 0L
                              ? IliIlllilIi<"IliIlllilIi","BhpeSldEK9MfWja8hmw9x/in1a6FoSAZIeiCm9C6lNyIjbp8vcslxWSS">()
                                 + var18
                                 + IliIlllilIi<"IliIlllilIi","P5Qoj60waWNsO1U4r3mg+4VyoZQhYrct5W+HOB0=">()
                              : IliIlllilIi<"IliIlllilIi","F5Swpph45fpvCaQP8dwcOmMnRDyrUtFDtmNyxVALplT71I/QJqG9XVgg8Dw=">();
                        } else if (var7) {
                           var17 = var8 && this.lIiiIliliIiiIlil == IIIIllIllIIIllIl.lIIillIiIl
                              ? IliIlllilIi<"IliIlllilIi","qUOFOZbrgRPHnptH7YNtreR6GCaQuDA/P3dYUcLaWHmujc1G+YbN">()
                              : (var8 ? IliIlllilIi<"IliIlllilIi","EiLEvnZQ1b+MVwwaNtUjkgadzpg4/kcnQze5Ey75kY11uqEV8sJzLQXCHic=">() + var16 : var16);
                        } else {
                           boolean var20 = iIIiiIlIlIiiIl.lIiiIiIlilli(var6) != null;
                           var17 = var8
                              ? IliIlllilIi<"IliIlllilIi","EiLEvnZQ1b+MVwwaNtUjkgadzpg4/kcnQze5Ey75kY11uqEV8sJzLQXCHic=">() + var16
                              : (var20 ? IliIlllilIi<"IliIlllilIi","2LN41z+hfjVA2tSNbmn++qd8Dn9BxzhgyVp8YQquGOrGzQYSgx8=">() : "") + var16;
                        }

                        iIIiiIlIlIiiIl.IIillIiliIil(
                           matrices,
                           iIIiiIlIlIiiIl.liiiIIllIl(var5.ilIiIiiiil),
                           var17,
                           var9 ? -42406 : iIIiiIlIlIiiIl.IliIlllilIi(var5.ilIiIiiiil),
                           (float)var15.field_1352,
                           (float)var15.field_1351,
                           var12
                        );
                     }
                  }
               }
            }
         }
      }
   }

   public int IIiIillIiIil() {
      int var1 = 0;

      for (IiIlIIiliIlIIi var3 : this.liiliIiliiiliIil) {
         var1 += var3.lliiiIiliiliiiIili;
      }

      return var1;
   }

   public void ilililIiilil(illlllIillll event) {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null && this.iillilIIilil()) {
         if (!this.IIIiiIillIIiiIil.isEmpty() || this.lllIIlilillIIlil != iIlIIiIllIIi.iiIIiliiIIlIilii) {
            class_243 var2 = Iiiilllliiilll.field_1773.method_19418().method_71156();
            class_4587 var3 = event.IliiiIIilliiiIIi;
            var3.method_22903();
            var3.method_22904(-var2.field_1352, -var2.field_1351, -var2.field_1350);
            Matrix4f var4 = var3.method_23760().method_23761();
            String var5 = this.iIilllIlilll();
            IlIiiIIillIiiIIi var6 = this.lIililiIilil();
            float var7 = iIIiiIlIlIiiIl.iIlIlllllill();
            this.IIilIlillIilIlil.clear();

            for (IlIiiIIillIiiIIi var9 : this.IIIiiIillIIiiIil) {
               if (var9.IilliliilIIi(var5) && !(var9.iIlIlllllill().method_1025(var2) > 9216.0)) {
                  class_2338 var10 = var9.liiiIIllIl();
                  boolean var11 = var9 == var6;
                  if (var9.ilIiIiiiil == IlliliIillliliIi.IillIiiIIi) {
                     iIIiiIlIlIiiIl.IiIlliIliiIl(var4, var10, -13375745, var11 ? 1.0F : var7, var11);
                  } else if (this.IIilIlillIilIlil.add(this.Ilililllilil(var10))) {
                     class_238 var12 = iIIiiIlIlIiiIl.iliIiiliiiii(var10);
                     if (this.IliIlllilIi() && this.Iillillillil(var9)) {
                        float var13 = iIIiiIlIlIiiIl.IilliliilIIi();
                        iIIiiIlIlIiiIl.IlIlllIlilIl(var4, var12, -42406, 0.8F + 0.2F * var13, 0.1F + 0.08F * var13, 2.0F);
                     } else {
                        iIIiiIlIlIiiIl.IlIlllIlilIl(
                           var4, var12, iIIiiIlIlIiiIl.IliIlllilIi(var9.ilIiIiiiil), var11 ? 1.0F : var7, var11 ? 0.12F : 0.06F, var11 ? 2.5F : 2.0F
                        );
                     }
                  }
               }
            }

            if (this.lllIIlilillIIlil == iIlIIiIllIIi.IllIiliilllIilii
               && Iiiilllliiilll.field_1755 == null
               && Iiiilllliiilll.field_1765 instanceof class_3965 var14
               && var14.method_17783() == class_240.field_1332) {
               class_2338 var17 = var14.method_17777();
               if (this.IilIIlillilIIlil == IlliliIillliliIi.IillIiiIIi) {
                  iIIiiIlIlIiiIl.IiIlliIliiIl(var4, var17, -13375745, 1.0F, true);
               } else {
                  boolean var19 = this.lilllliillll(var17);
                  iIIiiIlIlIiiIl.IlIlllIlilIl(
                     var4,
                     iIIiiIlIlIiiIl.iliIiiliiiii(var17),
                     var19 ? iIIiiIlIlIiiIl.IliIlllilIi(this.IilIIlillilIIlil) : -38037,
                     1.0F,
                     var19 ? 0.16F : 0.1F,
                     2.5F
                  );
               }
            }

            if (this.lllIIlilillIIlil == iIlIIiIllIIi.lIlIiliiiIlIilii
               && Iiiilllliiilll.field_1755 == null
               && Iiiilllliiilll.field_1765 instanceof class_3966 var15
               && var15.method_17782() instanceof class_1646 var18) {
               iIIiiIlIlIiiIl.IlIlllIlilIl(var4, var18.method_5829(), IlIIilIlllIIilIl.lliiIlliIl, var7, 0.08F, 2.0F);
            }

            var3.method_22909();
            iIiiIIilIliiIIil.IiIiliIiiiIi();
         }
      }
   }

   private boolean IilIlllilIll() {
      return this.iilIllIIiIll(iIlIilIlIllIilIl.class)
         || this.iilIllIIiIll(iIIiIlIlIiIl.class)
         || this.iilIllIIiIll(lIIIlIIliIIIlIIl.class)
         || this.iilIllIIiIll(iiliililIIiiilil.class);
   }

   private boolean IIllllIlll(iIIIIIIlIlIIIIIl g) {
      lilIiIiliilIiIil var2 = this.lIiliIiliIiliIil.iIlIlllllill(g.IIiIIiIlIl);
      lIllIilliIllIill var3 = var2 == null ? null : IIilIlIllIilIlIl.lIiiIiIlilli(var2, g.iilIIiIlIl);
      if (var3 == null) {
         return false;
      } else if (var3.lIIiIilill > this.IiIIIlliIIIl(class_1802.field_8687)) {
         this.IIiillIiil(g, var3.lIIiIilill);
         return true;
      } else {
         class_1792 var4 = null;
         if (var3.illlIilill != null && var3.illlIilill != class_1802.field_8687 && this.IiIIIlliIIIl(var3.illlIilill) < var3.IillIilill) {
            var4 = var3.illlIilill;
         } else if (var3.IilliliilIIi() && var3.lillIilill != class_1802.field_8687 && this.IiIIIlliIIIl(var3.lillIilill) < var3.iillIilill) {
            var4 = var3.lillIilill;
         }

         if (var4 == null) {
            return false;
         } else {
            this.lliililiil(g, var4);
            return true;
         }
      }
   }

   private boolean ilIlIlIiIlIl() {
      boolean var1 = false;

      for (IiIlIIiliIlIIi var3 : this.liIiiiiIii()) {
         if (var3.IIIiiIililIIiiIili == llIlIlIlilIlIlIl.IilIliilIl) {
            class_1792 var4 = var3.iliIiiliiiii();
            if (var4 == null || var4.method_7882() <= 1) {
               return false;
            }

            var1 = true;
         }
      }

      return var1;
   }

   private class_238 IiIiilliIiil(lilIiIiliilIiIil vi) {
      class_1646 var2 = this.lIiliIiliIiliIil.liiiIIllIl(vi.lIilillIil);
      if (var2 == null) {
         return null;
      } else {
         double var3 = (double)var2.method_17681() / Double.longBitsToDouble(9205120671279886163L ^ 4593434652852498259L);
         double var5 = (double)var2.method_17682();
         class_243 var7 = var2.method_73189();
         return new class_238(
            var7.field_1352 - var3, var7.field_1351, var7.field_1350 - var3, var7.field_1352 + var3, var7.field_1351 + var5, var7.field_1350 + var3
         );
      }
   }

   public boolean llIIililIIil() {
      if (!this.IliIlllilIi() && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         this.lllIIlilillIIlil = iIlIIiIllIIi.lIlIiliiiIlIilii;
         this.iilIIlilIIiIIlil = System.currentTimeMillis();
         this.lIiIIliliIiIIlil = 0L;
         return true;
      } else {
         return false;
      }
   }

   public static IiIlIIiliIlIIi Illlllllllll(lIllIilliIllIill profession, String ti) {
      return IiIlIIiliIlIIi.lIiiIiIlilli(profession, ti);
   }

   public int lIIilliIIill(IiIlIIiliIlIIi t) {
      if (t == null) {
         return -1;
      } else {
         String var2 = t.Illlllllilll();

         for (int var3 = 0; var3 < this.liiliIiliiiliIil.size(); var3++) {
            if (this.liiliIiliiiliIil.get(var3).Illlllllilll().equals(var2)) {
               return var3;
            }
         }

         return -1;
      }
   }

   private void iiiiIlIIIIll() {
      if (!this.llllllililllllil && lIlillliIlilll.IliIlllilIi(this)) {
         this.llllllililllllil = true;
      }
   }

   @Override
   public void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null
         && Iiiilllliiilll.field_1687 != null
         && Iiiilllliiilll.field_1761 != null
         && Iiiilllliiilll.field_1724.field_3944 != null) {
         if (!Iiiilllliiilll.field_1724.method_5805()) {
            this.iliIllIiiIll(IliIlllilIi<"IliIlllilIi","gSojx4oQlCvSFvLy3uvJmIux7oWt50HtJxlX9cWkscgSfwCJmg1AfhNBnsLljQ==">());
         } else {
            if (this.lIliiIiliIliiIil != null && Iiiilllliiilll.method_1562() != this.lIliiIiliIliiIil) {
               this.IIiiiIillIiiiIil = true;
            }

            if (this.IIiiiIillIiiiIil) {
               if (Iiiilllliiilll.field_1724.field_6012 < 20) {
                  this.lllIllillIll();
                  this.IilliIillilliIil.IiIlliIliiIl();
                  return;
               }

               this.IiiIIlliiIIl();
            }

            this.IliiIlillliiIlil++;
            if (this.IliiIlillliiIlil % 20L == 0L) {
               this.iiiIIlIIIlIl();
            }

            if (this.IilIlllilIll()) {
               this.liiIlliiiIll(IliIlllilIi<"IliIlllilIi","v5vXVigpW0uG7hNcvaiVjylkKQUW6bRM87rN2dWYYy0mZ6oWq3U5K0ilbRhmGHlaJb1B/jNLjoUtdmIY/78v1vxz">());
            } else if (this.IlIlIlllIlIl()) {
               this.liiIlliiiIll(
                  IliIlllilIi<"IliIlllilIi","kCxr0LNuFkrkl+03kAAAtgTbl58KJXwy3HaqCzuVyGygY0W+wikI1Eesh9cm1304tLl/vcz0D4N3DJt1mHsLgC7UMjbVZmPK8L3S6oQE7c5XkADKF2N2Blt6g8g=">()
               );
            } else {
               this.IilliIillilliIil.IliIlllilIi(6.0F + (float)this.lliIiIililiIiIil.Iilllilliill() * 4.2F);
               this.IilliIillilliIil.liiiIIllIl();
               boolean var1 = this.lIiiIliliIiiIlil == IIIIllIllIIIllIl.llilllIiIl
                  || this.lIiiIliliIiiIlil == IIIIllIllIIIllIl.liilllIiIl
                  || this.lIiiIliliIiiIlil == IIIIllIllIIIllIl.iIIillIiIl;
               boolean var2 = !var1 && !this.iIllllilIlllllil && this.iIlIllIllIll();
               boolean var3 = this.lliiIliliiIl();
               boolean var4 = this.IlIilIilllIilIil.Iilllilliill() && this.IIiiIllIiiIl();
               this.lllIllillIll();
               this.iIllllilIlllllil = false;
               if (var3) {
                  this.IiiiIlliiiIl();
               }

               this.lIiiiiIiii();
               this.liiiiiiiii();
               this.iIIIIlIlIIIl();
               if ((!this.lIIilIiliIIilIil.Iilllilliill() || !var2) && !var4) {
                  if (this.lIiiIliliIiiIlil == IIIIllIllIIIllIl.ilIillIiIl) {
                     this.lIiIlliIiIll(IIIIllIllIIIllIl.iIilllIiIl);
                  }

                  try {
                     switch (this.lIiiIliliIiiIlil) {
                        case ilIillIiIl:
                           this.lIiIlliIiIll(IIIIllIllIIIllIl.iIilllIiIl);
                           break;
                        case IIIillIiIl:
                           this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
                           break;
                        case liilllIiIl:
                           this.lIIlliIIll();
                           break;
                        case iIIillIiIl:
                           this.lIilliIill();
                           break;
                        case iiilllIiIl:
                           this.llIililIil();
                           break;
                        case IlIillIiIl:
                           this.lIliliIlil();
                           break;
                        case llilllIiIl:
                           this.iiiilIIIIi();
                           break;
                        case ililllIiIl:
                           this.lIiIiiIiIi();
                           break;
                        case IiilllIiIl:
                           this.iliIiIiiIi();
                           break;
                        case iIilllIiIl:
                           this.liiIiiiiIi();
                           break;
                        case IlilllIiIl:
                           this.llIliilIli();
                           break;
                        case lIilllIiIl:
                           this.illliIilli();
                           break;
                        case lIIillIiIl:
                           this.lilliiilli();
                        case llIillIiIl:
                     }
                  } catch (Exception var6) {
                     this.IIililIili(
                        IliIlllilIi<"IliIlllilIi","H5/0cfYrpu+VSpfat6pevIQrkkM93ITcXpz8ETuCTxZvlb2YFwKj/NkG0Cw=">()
                           + var6.getClass().getSimpleName()
                           + IliIlllilIi<"IliIlllilIi","orO2c/CbyM9bdFq/lxN4NJIYcU2fEoiL/SxYtUQ=">()
                     );
                  }

                  this.IilliIillilliIil.lIiiIiIlilli();
               } else {
                  this.liiIlliiiIll(
                     var4
                        ? IliIlllilIi<"IliIlllilIi","KGrlL37mCuuf8LGKngRNE4CUXwYjNcO6ucL7IXAs0LF1Fk55JY0sOz1mIE/sWKLAWVsD6Y8=">()
                        : IliIlllilIi<"IliIlllilIi","1KsLrQhmeYipqWAgMS0y/EoEY7XPIk5rqiyjZeCqxM8ipypVZ94dPhDt70Ya4vVXtsTj">()
                  );
                  this.IilliIillilliIil.lIiiIiIlilli();
               }
            }
         }
      }
   }

   private void lIIIiiIIIi(iIIIIIIlIlIIIIIl g, IlIiiIIillIiiIIi site) {
      this.iIllllilIlllllil = true;
      boolean var3 = g.IiiIIiIlIl != null
         ? this.iIIilIlIil(g.IiiIIiIlIl, 0.25)
            || this.iIIilIlIil(g.IiiIIiIlIl, 0.6) && Iiiilllliiilll.field_1724.method_24828() && this.IlIIillIIi(site) >= 0.0
         : this.iIlIiIllIi(site);
      if (var3) {
         this.iilliIilIIiliIil.iIlIlllllill();
         this.lIiIlliIiIll(IIIIllIllIIIllIl.iiilllIiIl);
      } else {
         if (g.IiiIIiIlIl != null && this.iIIilIlIil(g.IiiIIiIlIl, 0.9)) {
            this.iilliIilIIiliIil.iIlIlllllill();
            this.ilIIiIiIIi(g.IiiIIiIlIl);
            String var6 = IliIlllilIi<"IliIlllilIi","RtSuYu0m1fwqk3dAfY3giTdDuFh1X0Wm0pk7kOMHsanw">();
         } else {
            this.iilliIilIIiliIil.IliIlllilIi(g.IiiIIiIlIl != null ? g.IiiIIiIlIl : this.liIIlliiIIll(site.liiiIIllIl()), g.IiiIIiIlIl != null ? 0.6 : 1.2);
            llIlllilIlll var5 = this.iilliIilIIiliIil.IilliliilIIi();
            String var4 = var5.name();
            if (var5 == llIlllilIlll.iilllIIiIIillIIi) {
               this.IIililIili(IliIlllilIi<"IliIlllilIi","jJ8inCChZeZO5Fgqj5hY4Yi99LDyIBxdfOPTtIkfwEisVvQtcUQPnHXflVazZ2o=">());
               return;
            }

            if (var5 == llIlllilIlll.IilllIIililllIIi && g.IiiIIiIlIl == null) {
               this.iilliIilIIiliIil.iIlIlllllill();
               this.lIiIlliIiIll(IIIIllIllIIIllIl.iiilllIiIl);
               return;
            }
         }

         if (this.IliIlllliIll() > 400L) {
            this.IIililIili(IliIlllilIi<"IliIlllilIi","jJ8inCChZeZO5Fgqj5hY4Yi99LDyIBxdfOPTtIkfwEisVvQtcUQPnHXflVazZ2o=">());
         }
      }
   }

   private String IlIlilllIlil(iIIIIIIlIlIIIIIl g) {
      lilIiIiliilIiIil var2 = g == null ? null : this.lIiliIiliIiliIil.iIlIlllllill(g.IIiIIiIlIl);
      return var2 == null
         ? IliIlllilIi<"IliIlllilIi","CUaOaQB3BT3IIJDDua7l+sy+UHgtTcOPTwzMJgBKxELi1ThJJU0=">()
         : IliIlllilIi<"IliIlllilIi","LfkWKpcxb6X+co4nMkVZxv42jDSHPAWmcQxlgIGdvmg=">() + var2.IiilillIil;
   }

   private IiIlIIiliIlIIi iiIiilIIliil(lilIiIiliilIiIil targets, List<IiIlIIiliIlIIi> vi) {
      IiIlIIiliIlIIi var3 = null;

      for (IiIlIIiliIlIIi var5 : vi) {
         if (IIilIlIllIilIlIl.IilliliilIIi(targets, var5)) {
            if (targets.lIIiillIil.isEmpty() || IIilIlIllIilIlIl.lIiiIiIlilli(targets, var5) != null || targets.IlIlllIlilIl(var5)) {
               return var5;
            }

            if (var3 == null) {
               var3 = var5;
            }
         }
      }

      return var3;
   }

   private iIIIIIIlIlIIIIIl iillIlIIilIl(String desc) {
      IlIiiIIillIiiIIi var2 = this.IlilIlllilIl();
      if (var2 == null) {
         return null;
      } else {
         iIIIIIIlIlIIIIIl var3 = new iIIIIIIlIlIIIIIl();
         var3.lilIIiIlIl = llliilililliilil.IIllllllil;
         var3.lliIIiIlIl = var2.ilIiIiiiil;
         var3.iliIIiIlIl = var2;
         var3.iIIlIiIlIl = desc;
         return var3;
      }
   }

   private List<IiIlIIiliIlIIi> liIiiiiIii() {
      ArrayList var1 = new ArrayList();

      for (IiIlIIiliIlIIi var3 : this.liiliIiliiiliIil) {
         if (var3.IIlllIlliIll() && this.IIliilIlii(var3) && !this.ilIiiIiIii(var3)) {
            var1.add(var3);
         }
      }

      return var1;
   }

   public IlIlIlllIlIl Iililllilill(IiIlIIiliIlIIi t) {
      int var2 = -1;
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      String var6 = "";
      int var7 = 0;
      if (t != null && this.IliIlllilIi()) {
         class_243 var8 = this.IIlIlllIlIll();

         for (lilIiIiliilIiIil var10 : this.lIiliIiliIiliIil.lIiiIiIlilli()) {
            if (var10.IIIiillIil && IIilIlIllIilIlIl.IilliliilIIi(var10, t)) {
               if (var10.iIlIlllllill(t)) {
                  var7++;
               } else if (var10.lIIiillIil.isEmpty()) {
                  var5++;
               } else {
                  lIllIilliIllIill var11 = IIilIlIllIilIlIl.lIiiIiIlilli(var10, t);
                  if (var11 != null) {
                     var3++;
                     if (var2 < 0 || var11.lIIiIilill < var2) {
                        var2 = var11.lIIiIilill;
                        var6 = var10.IiilillIil
                           + IliIlllilIi<"IliIlllilIi","6tRf5ZZSI/pBnjw2zFxlDCepDpsd23A3ZphDeIq4SaI=">()
                           + Math.round(Math.sqrt(var10.IlilillIil.method_1025(var8)))
                           + IliIlllilIi<"IliIlllilIi","YnN7tR2xMPWx6ScDBrhtb17KDkUP+TYAnNXdd3E=">();
                     }
                  } else if (var10.IlIlllIlilIl(t)) {
                     var4++;
                  }
               }
            }
         }

         return new IlIlIlllIlIl(var2, var6, var3, var4, var5, var7);
      } else {
         return new IlIlIlllIlIl(var2, var6, 0, 0, 0, 0);
      }
   }

   private void llIiililIiil(class_4587 matrices) {
      if (Iiiilllliiilll.field_1765 instanceof class_3966 var2 && var2.method_17782() instanceof class_1646 var3) {
         class_243 var7 = llilllililll.iIlIlllllill(var3.method_73189().method_1031(0.0, (double)var3.method_17682() + 0.55, 0.0));
         if (var7 != null && !(var7.field_1350 < 0.0) && !(var7.field_1350 > 1.0)) {
            String var5 = lIIllilliIIllill.lIiiIiIlilli(var3.method_7231().comp_3521());
            iIIiiIlIlIiiIl.IIillIiliIil(
               matrices,
               var5,
               IliIlllilIi<"IliIlllilIi","t1QWVfEtgrzmA036NtHxc6xKU7W1m5pcstyHXmPoelBZ8BwU1trVdnaVSsmI9Zhka6BO/4fhr2zd">(),
               IlIIilIlllIIilIl.lliiIlliIl,
               (float)var7.field_1352,
               (float)var7.field_1351,
               1.0F
            );
            return;
         }

         return;
      }
   }

   private static boolean llilllililll(IlIiiIIillIiiIIi p, class_2338 s) {
      return p.lIIiIiiiil == s.method_10263() && p.iIIiIiiiil == s.method_10264() && p.IlIiIiiiil == s.method_10260();
   }

   private static boolean iIIiIlIlIiIl(IlIiiIIillIiiIIi s, IlliliIillliliIi role) {
      return switch (role) {
         case iIllIiiIIi -> s.iliIiiliiiii();
         case IlllIiiIIi -> s.lIiiIiIlilli();
         case llllIiiIIi -> s.IIIllIIliIIl();
         case IillIiiIIi -> s.ilIiIiiiil == IlliliIillliliIi.IillIiiIIi;
         default -> s.ilIiIiiiil != IlliliIillliliIi.IillIiiIIi;
      };
   }

   private void lIIlliIIll() {
      if (this.iiillIilIIIilIil.Iilllilliill().equals(IliIlllilIi<"IliIlllilIi","Y9o2Gd3GL8UkZ3gDYn6gInHXt4hI0U6XXsKkX9UJVOLRpsTt">())) {
         this.iilllIIill();
      } else {
         iIIIIIIlIlIIIIIl var1 = this.Iillllillillllil.peek();
         if (var1 == null) {
            var1 = this.IIIlilIIli();
            if (var1 == null) {
               var1 = this.IillIllillIl();
            }

            if (var1 == null && this.iIllIlIlllIl() && this.llllIlilllIl() == 0 && this.ililIlIiilIl()) {
               this.liilIliiilIl();
               return;
            }

            if (var1 == null) {
               var1 = this.lllllillll();
            }

            if (var1 == null) {
               this.IlIllllIll();
               return;
            }

            this.Iillllillillllil.push(var1);
         }

         this.liIlliiIll(var1);
      }
   }

   private void IIiiillIiiil(class_4587 matrices, IIliiIlllIliiIll font) {
      float var3 = 230.0F;
      String var4 = IliIlllilIi<"IliIlllilIi","DJ/J1Hf8+XfW+Sz0SavnnVijngr3X9R8m1qkN94DSoAqcTwE/3Y0tQcj9g==">();
      String var5 = font.Iiilliiliiil(this.IiiIilliiIil(), var3);
      String var6 = IliIlllilIi<"IliIlllilIi","JbKTuj4RQrPhv9QEk1YnH0Cn72uQaHApH+G+D6LR/YeamxbG2w==">()
         + this.lilIiliilIil()
         + IliIlllilIi<"IliIlllilIi","Tu9dosk714H/vtVYcsLfrT/kvCsbFujVlRzDOaWVTd8cSKWnDO1rnXw=">()
         + this.IIiIillIiIil();
      String var7 = this.iIiIilIliIil();
      if (!var7.isEmpty()) {
         var7 = font.Iiilliiliiil(var7, var3);
      }

      ArrayList var8 = new ArrayList();
      float var9 = font.IilliliilIIi();
      float var10 = 2.0F;
      float var11 = 6.0F;
      float var12 = var9 * 0.42F;
      float var13 = 4.0F;
      float var14 = font.iIlIlllllill(var4) + var12 + var13;
      var14 = Math.max(var14, font.iIlIlllllill(var5));
      var14 = Math.max(var14, font.iIlIlllllill(var6));
      if (!var7.isEmpty()) {
         var14 = Math.max(var14, font.iIlIlllllill(var7));
      }

      for (int var15 = 0; var15 < var8.size(); var15++) {
         var8.set(var15, font.Iiilliiliiil(IiiIliiliiIlii.liiiIIllIl((String)var8.get(var15)), var3));
         var14 = Math.max(var14, font.iIlIlllllill((String)var8.get(var15)));
      }

      int var28 = 3 + (var7.isEmpty() ? 0 : 1) + var8.size();
      float var16 = var11 * 2.0F + (float)var28 * var9 + (float)(var28 - 1) * var10 + 2.0F;
      float[] var17 = this.liliiliiliil(var14 + var11 * 2.0F, var16);
      float var18 = var17[0];
      float var19 = var17[1];
      iIIiiIlIlIiiIl.Illlllllilll(var18, var19, var14 + var11 * 2.0F, var16);
      int var20 = -16184564;
      llilllililll.IiIlliIliiIl(
         matrices,
         new Color(var20 >> 16 & 0xFF, var20 >> 8 & 0xFF, var20 & 0xFF, 215),
         (double)var18,
         (double)var19,
         (double)(var18 + var14 + var11 * 2.0F),
         (double)(var19 + var16),
         4.0,
         6.0
      );
      int var21 = !this.IliIlllilIi() ? -4669236 : (this.lIiiIliliIiiIlil == IIIIllIllIIIllIl.ilIillIiIl ? -1535700 : -11870592);
      float var22 = var19 + var11;
      float var23 = var22 + (var9 - var12) / 2.0F;
      llilllililll.IiIlliIliiIl(
         matrices,
         iIiiilIliiil(var21),
         (double)(var18 + var11),
         (double)var23,
         (double)(var18 + var11 + var12),
         (double)(var23 + var12),
         (double)(var12 / 2.0F),
         6.0
      );
      font.IliIlllilIi(var4, var18 + var11 + var12 + var13, var22, new Color(-1));
      var22 += var9 + var10 + 2.0F;
      font.IliIlllilIi(var5, var18 + var11, var22, new Color(-3947581));
      var22 += var9 + var10;
      font.IliIlllilIi(var6, var18 + var11, var22, new Color(-8421505));
      if (!var7.isEmpty()) {
         var22 += var9 + var10;
         font.IliIlllilIi(var7, var18 + var11, var22, iIiiilIliiil(-1537398));
      }

      for (String var25 : var8) {
         var22 += var9 + var10;
         font.IliIlllilIi(var25, var18 + var11, var22, new Color(-8421505));
      }
   }

   private void lIIiiiIIii(String ticks, String good, boolean key, long msg) {
      Long var6 = this.IiiiiIilliiiiIil.get(ticks);
      if (var6 == null || this.IliiIlillliiIlil - var6 >= msg) {
         this.IiiiiIilliiiiIil.put(ticks, this.IliiIlillliiIlil);
         this.iIIlllIlIlll(good, key);
      }
   }

   private void iliIllIiiIll(String why) {
      this.iIIlllIlIlll(why, false);
      this.IIillIiliIil(false);
   }

   private int iIiIIlIliIIl(IliIlIllliIlIl o) {
      long var3 = -7743345647925342754L;
      if (o.iliIllIllIiiIllIll <= 0) {
         return 0;
      } else {
         var3 ^= ((long)this.illIIlIilIIl(o.IliIllIlllliIllIll) << 32 ^ var3) & -1L << 32;
         if ((int)(var3 >>> 32) < o.iliIllIllIiiIllIll) {
            o.iliIllIllIiiIllIll = (int)(var3 >>> 32);
         }

         return o.iliIllIllIiiIllIll;
      }
   }

   public String IiiIilliiIil() {
      long var1 = System.currentTimeMillis();
      if (var1 - this.lIllIliliIllIlil < (6902932999433208741L ^ 6902932999433208627L) && this.iiIlIlilIIllIlil != null) {
         return this.iiIlIlilIIllIlil;
      } else {
         this.lIllIliliIllIlil = var1;
         this.iiIlIlilIIllIlil = IiiIliiliiIlii.liiiIIllIl(this.iiiIilIIIlil());
         return this.iiIlIlilIIllIlil;
      }
   }

   private String iiiIilIIIlil() {
      if (this.lllIIlilillIIlil == iIlIIiIllIIi.lIlIiliiiIlIilii) {
         return IliIlllilIi<"IliIlllilIi","yYM3B2SzXLPK/+0Z+LVQxZ41c5sU9z++aKk2Rx5cjXu6YUnOCpTZPJaB/EjQLreZTyUXkLqM+xK4tZlA6cB3k6AZ">();
      } else if (this.lllIIlilillIIlil == iIlIIiIllIIi.IllIiliilllIilii) {
         return IliIlllilIi<"IliIlllilIi","HodnzWYakbyPUzOjkIheeL5yT6DG4DwCs+ccXxgjXcsuviT7Bt9aJmMKsKyY6gP9fVALjg==">()
            + iIIiiIlIlIiiIl.liiiIIllIl(this.IilIIlillilIIlil).toLowerCase(Locale.ROOT);
      } else if (!this.IliIlllilIi()) {
         return this.liiliIiliiiliIil.isEmpty()
            ? IliIlllilIi<"IliIlllilIi","5cAvqALsQn5JVBOdfVFcaHSCP+gLrOM/jxmdLH2GmQ7VwDSSFv0iu1GEreppUkod">()
            : IliIlllilIi<"IliIlllilIi","uL6jl2ynJXQz9qjBbVeUlzB3DcDN5pb71JMIsOm7ebihXGo=">();
      } else if (Iiiilllliiilll.field_1724 == null) {
         return IliIlllilIi<"IliIlllilIi","I1avPqubInEH4Y6MVRTh9Ai8rdEJmQ5VecvXZX24w91zt3EvuMI3u/iz5iHSE5Eo8g==">();
      } else {
         iIIIIIIlIlIIIIIl var1 = this.Iillllillillllil.peek();

         return switch (this.lIiiIliliIiiIlil) {
            case iIIillIiIl -> IliIlllilIi<"IliIlllilIi","cr3hFeG4uYOfGaL8my7ZnrK4J11KfrXuf6X5Rq5pAmtlVvM7sWeS">()
            + this.IlIlilllIlil(var1)
            + this.ilIlilIiIlil(var1);
            case iiilllIiIl -> IliIlllilIi<"IliIlllilIi","Hi+ByzO8qdQUCLK90XB7iRvteoz4IO8rO0WVCLuvrT50tiXz">() + this.IlIlilllIlil(var1);
            case IlIillIiIl -> this.liIliliiIlil(var1);
            case llilllIiIl, ililllIiIl, IiilllIiIl -> this.IIllillIllil(var1);
            case iIilllIiIl -> IliIlllilIi<"IliIlllilIi","mRzcw4Z5lKX/f86gtQfzKzAgn9p6zCfcT+Y5Zb0J0GIGRg4eSQkhEpI9axb/c1WK04oIZgwGdNuFdaU=">();
            case IlilllIiIl -> IliIlllilIi<"IliIlllilIi","phjOtxPIuODjG1juXj305frijiaDNiGxOZY9qYcs5/F1MixW75b24zccyE70e47vGMYXRS+eF/16a4MMvRgbeX3NfhCBP/4o">();
            case lIilllIiIl -> this.IlllIlilllllIlil.isEmpty()
            ? IliIlllilIi<"IliIlllilIi","yV7DcECeZLTxRzYTCeFS+IpQEoNgnm22l2JlJG41XZW+4Ux627OhKfJE6xIEJmoekq3wk0GSv9LqSELm">()
            : this.IlllIlilllllIlil;
            case lIIillIiIl -> var1 != null && var1.lIIlIiIlIl != null && !var1.lIIlIiIlIl.isEmpty()
            ? IliIlllilIi<"IliIlllilIi","ZCDRGzwMUpzL6qhh4cuW5ZbYJU9QFb+niYX5YPBLpNLtyaA6zY2R+Ms=">() + var1.lIIlIiIlIl
            : IliIlllilIi<"IliIlllilIi","/Ywpsww/NE1xqvbi2yz02fdKG9PRMEHJZjUT0eBZk9YAZKdZ">();
            case llIillIiIl -> this.IIIlIlillIIlIlil.isEmpty()
            ? IliIlllilIi<"IliIlllilIi","2UE/ap29EHoZmyu12tX3KHmGQ72OVt1mob+2OT43/4vrwQ==">()
            : lIIliliIIlil(this.IIIlIlillIIlIlil);
            default -> IliIlllilIi<"IliIlllilIi","4DS9aCaCOeP8eFqbFl3VB7yj3f+AqLxv/mWdtvAGSyZ87Eb1n8IOK/1DpbWUSp5VDrK+kHwI">();
         };
      }
   }

   private void lliililiil(iIIIIIIlIlIIIIIl g, class_1792 mat) {
      String var3 = mat != null ? IiiIlliiIl.IlIlllIlilIl(mat) : IliIlllilIi<"IliIlllilIi","/KagGUsr2DywQnN5UPEjOWHJ0hZUpbSWNhmByKE55tuBIiyu/g==">();
      if (this.lilIiIiliilIiIil.Iilllilliill() && mat != null && this.IlIIllllIIll(IlliliIillliliIi.iIllIiiIIi) != null) {
         if (this.IlIiillIii(mat)) {
            this.iiiliIIIii(
               g.iilIIiIlIl,
               IliIlllilIi<"IliIlllilIi","Kt7lupXbWuPd9clcqQOup64j9OrNqKsxNe2MpvQd/g==">()
                  + var3
                  + IliIlllilIi<"IliIlllilIi","K9OIVgmBrSzMu2qi6rRo1ekqX+r+5s7K8DpD1NKIHdlCwYppkJv/PfLxZS0W98YXPnOBDoIJk5++OX/nksCdaHvfHS8mSg==">(),
               1200L
            );
            this.lliliilili();
            this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
         } else {
            iIIIIIIlIlIIIIIl var5 = new iIIIIIIlIlIIIIIl();
            var5.lilIIiIlIl = llliilililliilil.lIllllllil;
            var5.lliIIiIlIl = IlliliIillliliIi.iIllIiiIIi;
            var5.iIiIIiIlIl = mat;
            var5.IliIIiIlIl = 64;
            var5.iIIlIiIlIl = IliIlllilIi<"IliIlllilIi","NZGioD40jMxWoz5aK6QVWfppgH4/LuUjSX1ZNF+TMmfYVa6bog==">() + var3;
            this.Iillllillillllil.push(var5);
            this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
         }
      } else {
         String var4 = !this.lilIiIiliilIiIil.Iilllilliill()
            ? IliIlllilIi<"IliIlllilIi","1Z/lRxmCAfYimv11gdaRb6Cyl8Kb7HALHPFPBXsJT6leH8g=">()
               + var3
               + IliIlllilIi<"IliIlllilIi","54ES3XxrbVfhniK4YU4/F+qmeZf7yHnMNtSJsZeD2aDtI6QySjOb/PCIvAqxnxdwSphM4IjijTBL9qyJQw==">()
            : (
               this.IIIiIllIIiIl(IlliliIillliliIi.iIllIiiIIi)
                  ? IliIlllilIi<"IliIlllilIi","1Z/lRxmCAfYimv11gdaRb6Cyl8Kb7HALHPFPBXsJT6leH8g=">()
                     + var3
                     + IliIlllilIi<"IliIlllilIi","TK/5bCss5FNHkn9tfPPF25dsUO/WjsOxVv+HSGaEAntTjtDhAcvxPdzQ3qFUEEMej2a10oSsZNFHZN5Xc5AI5DJDVq7aSNvxcMZ10wYvoQ==">()
                  : IliIlllilIi<"IliIlllilIi","1Z/lRxmCAfYimv11gdaRb6Cyl8Kb7HALHPFPBXsJT6leH8g=">()
                     + var3
                     + IliIlllilIi<"IliIlllilIi","H9iGxIjYlBLzE76B+HF2LJ8IJ8jX3rlf4eBCDv8rY4O1HMj1op2DLzaZ8SF5P1sZ0IXeValKRWxr6uSkqcx8dOhN6L++FbaGu2q4pWsdMQNUrEVUWw==">()
            );
         this.iiiliIIIii(g.iilIIiIlIl, var4, 1200L);
         this.lliliilili();
         this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
      }
   }

   private void iIIIIlIlIIIl() {
      lIIIIliliIIIIlil var1;
      while ((var1 = this.iiiiiIilIIIIIlil.poll()) != null) {
         lilIiIiliilIiIil var2 = null;
         double var3 = 4.0;

         for (lilIiIiliilIiIil var6 : this.lIiliIiliIiliIil.lIiiIiIlilli()) {
            if (var1.IilliliilIIi() >= 0) {
               if (var6.iIilillIil == var1.IilliliilIIi()) {
                  var2 = var6;
                  break;
               }
            } else {
               double var7 = var6.IlilillIil.method_1028(var1.IliIlllilIi(), var1.liiiIIllIl(), var1.iIlIlllllill());
               if (var7 <= var3) {
                  var3 = var7;
                  var2 = var6;
               }
            }
         }

         if (var2 != null) {
            var2.IIliillIil = this.IliiIlillliiIlil;
         }
      }
   }

   private boolean ilIiiIiIii(IiIlIIiliIlIIi t) {
      Long var2 = this.iIIiiIilIlIiiIil.get(t);
      return var2 != null && this.IliiIlillliiIlil < var2;
   }

   private boolean iIIilIlIil(class_2338 spot, double tol) {
      class_243 var4 = class_243.method_24953(spot);
      double var5 = Iiiilllliiilll.field_1724.method_23317() - var4.field_1352;
      double var7 = Iiiilllliiilll.field_1724.method_23321() - var4.field_1350;
      return Math.hypot(var5, var7) <= tol
         && Math.abs(Iiiilllliiilll.field_1724.method_23318() - (double)spot.method_10264())
            <= Double.longBitsToDouble(3948843679129019359L ^ 665719550775927775L);
   }

   private void lIlIiliIlIil(String msg) {
      long var2 = System.currentTimeMillis();
      if (var2 - this.IliIIlillliIIlil >= (-6831709939123626309L ^ -6831709939123627161L)) {
         this.IliIIlillliIIlil = var2;
         Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<"IliIlllilIi","DJ/J1Hf8+XfW+Sz0SavnnVijngr3X9R8m1qkN94DSoAqcTwE/3Y0tQcj9g==">(), msg, false);
      }
   }

   private int lIliiliIliil(lilIiIiliilIiIil rel, IiIlIIiliIlIIi active, boolean vi) {
      if (vi) {
         return ~(-1864520445 * -1 - -95) ^ 1872196131;
      } else if (active == null || rel.lIIiillIil.isEmpty()) {
         return ~(-(~-673183146 ^ 57)) ^ -676907709;
      } else if (IIilIlIllIilIlIl.lIiiIiIlilli(rel, active) != null) {
         return IlIIilIlllIIilIl.lliiIlliIl;
      } else {
         return rel.IlIlllIlilIl(active) ? ((786136019 * -53 ^ 51) >>> 11 | (786136019 * -53 ^ 51) << 21) ^ 1404773040 : -(1257487265 ^ 113 ^ 7) ^ 1253344485;
      }
   }

   private String Illiilllliil(lilIiIiliilIiIil rel, IiIlIIiliIlIIi vi) {
      if (vi != null && rel.iIlIlllllill(vi)) {
         return IliIlllilIi<"IliIlllilIi","1GxH4Lu53ySo1ypXSohs60AIWPfVQON9yNOab7SBuu8=">()
            + lIIllilliIIllill.IliIlllilIi(vi.IlIlllIlilIl())
            + IliIlllilIi<"IliIlllilIi","CvJAYmA4hXrs2EaMk05tWrNzPmd4Ef43dMhuyGEt7H/L/zMQ">()
            + lIIllilliIIllill.IliIlllilIi(rel.liilillIil);
      } else if (rel.lIIiillIil.isEmpty()) {
         return IliIlllilIi<"IliIlllilIi","ohJSW+ajr8Rs8sZB1oZRuRoQiWjq1/ewe87oF9tthN+Zm2KIp0j0k3xbig==">();
      } else if (vi == null) {
         return IliIlllilIi<"IliIlllilIi","jDwR3PjrtpOAxlBuzYuCP4YXYoKx/eIXH01vo2kblm/tjZhQJKTx9+4C4keT">();
      } else {
         lIllIilliIllIill var3 = IIilIlIllIilIlIl.lIiiIiIlilli(rel, vi);
         if (var3 != null) {
            return var3.iliIiiliiiii()
               + IliIlllilIi<"IliIlllilIi","6tRf5ZZSI/pBnjw2zFxlDCepDpsd23A3ZphDeIq4SaI=">()
               + var3.lIIiIilill
               + IliIlllilIi<"IliIlllilIi","VMjFs12itwJ+WnVD1tYUxxOvCHJo+foGBhrf25UPnY73">()
               + var3.liiiIIllIl()
               + IliIlllilIi<"IliIlllilIi","ekszXRbtty63RWYobJiHJIAIyAtyXyX5sJ3yu3vMX6np">();
         } else {
            lIllIilliIllIill var4 = rel.IiIlliIliiIl(vi);
            if (var4 != null) {
               return IliIlllilIi<"IliIlllilIi","jFoj0JFVmRXaDeM2+LsGnQoORNP69IlcwO0Ua/TRLGtiIDBnztYG9lQx">()
                  + var4.lIIiIilill
                  + IliIlllilIi<"IliIlllilIi","2MjMEFd6amnegv9FsafiSgx5/eKt58pVzsfiMhU=">();
            } else {
               return rel.IlIlllIlilIl(vi)
                  ? IliIlllilIi<"IliIlllilIi","aQctwOeZqhc1NcHFgexdCJqf0nuqzi3bSHRBrWI5xxc9pzouUP26QHPylyL/30adI50=">()
                  : IliIlllilIi<"IliIlllilIi","jDwR3PjrtpOAxlBuzYuCP4YXYoKx/eIXH01vo2kblm/tjZhQJKTx9+4C4keT">();
            }
         }
      }
   }

   public void liililiiilil(lIiIlliiIiIlli event) {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null && this.iillilIIilil()) {
         class_4587 var2 = new class_4587();
         CorzClient.fontManager.iIlIlllllill(var2);
         if (!this.IliIlllilIi()) {
            iIIiiIlIlIiiIl.IIlllIlliIll();
         }

         boolean var3 = this.lllIIlilillIIlil != iIlIIiIllIIi.iiIIiliiIIlIilii && Iiiilllliiilll.field_1755 == null;
         if (var3 && this.lllIIlilillIIlil == iIlIIiIllIIi.IllIiliilllIilii) {
            this.iIIiilIlIiil(var2);
         } else if (var3) {
            this.llIiililIiil(var2);
         }

         if (!this.IIIiiIillIIiiIil.isEmpty()) {
            this.IIIiillIIiil(var2);
         }

         if (var3) {
            String var4 = this.lllIIlilillIIlil == iIlIIiIllIIi.lIlIiliiiIlIilii
               ? IliIlllilIi<"IliIlllilIi","yYM3B2SzXLPK/+0Z+LVQxZ41c5sU9z++aKk2Rx5cjXu6YUnOCpTZPJaB/EjQLreZTyUXkLqM+xK4tZlA6cB3k6AZ">()
               : (
                  this.IilIIlillilIIlil == IlliliIillliliIi.IillIiiIIi
                     ? IliIlllilIi<"IliIlllilIi","Qjs2ZDLwH5PHbv4NjYsLt18fmMa8nDlckPFGEuHIB0GHj81urux8sQ7SW2Xr7rhWUODhMqrmbd8mN+on00OqvHF+/tdn1t81oA==">()
                     : IliIlllilIi<"IliIlllilIi","t/BAlteKAsAuvCcnEk5YHGlaVnBUXqxQaVO+rMpqeR3mx9VoHhKO0fPZiZoU">()
                        + iIIiiIlIlIiiIl.liiiIIllIl(this.IilIIlillilIIlil).toLowerCase(Locale.ROOT)
               );
            iIIiiIlIlIiiIl.Ililllililil(
               var2,
               var4,
               IliIlllilIi<"IliIlllilIi","N+sUZlT2zs4PahEDXqeQxRefG0HXOHfK+9gzZG5jkm6DU+bFe6ZOnYrW">(),
               this.lllIIlilillIIlil == iIlIIiIllIIi.lIlIiliiiIlIilii ? IlIIilIlllIIilIl.lliiIlliIl : iIIiiIlIlIiiIl.IliIlllilIi(this.IilIIlillilIIlil)
            );
         }
      }
   }

   private class_1646 iiIlllIIllll() {
      if (Iiiilllliiilll.field_1765 instanceof class_3966 var1) {
         class_1297 var10 = var1.method_17782();
         if (var10 instanceof class_1646) {
            return (class_1646)var10;
         }
      }

      if (!this.illiIlIiliIl()) {
         return null;
      } else {
         class_1646 var9 = null;
         double var2 = 36.0;

         for (class_1297 var5 : Iiiilllliiilll.field_1687.method_18112()) {
            if (var5 instanceof class_1646) {
               class_1646 var6 = (class_1646)var5;
               double var7 = var6.method_5858(Iiiilllliiilll.field_1724);
               if (var7 < var2) {
                  var2 = var7;
                  var9 = var6;
               }
            }
         }

         return var9;
      }
   }

   private void iiIliIIlli(IlIiiIIillIiiIIi site) {
      site.IliIlllilIi(true, this.IliiIlillliiIlil);
      class_2338 var2 = this.lIlliiIlli(site.liiiIIllIl());
      if (var2 != null) {
         for (IlIiiIIillIiiIIi var4 : this.IIIiiIillIIiiIil) {
            if (var4.liiiIIllIl().equals(var2) && var4.IilliliilIIi(site.llIiIiiiil)) {
               var4.IliIlllilIi(true, this.IliiIlillliiIlil);
            }
         }
      }
   }

   private boolean iIlllIllll(lilIiIiliilIiIil vi) {
      if (vi == null
         || !vi.IIIiillIil
         || vi.iliIiiliiiii(this.IliiIlillliiIlil)
         || this.IliiIlillliiIlil - vi.llIiillIil > (8985962042447801376L ^ 8985962042447801352L)) {
         return false;
      } else {
         return !this.iIiIiIilIliIiIil.Iilllilliill() && Iiiilllliiilll.field_1724 != null
            ? vi.IlilillIil
                  .method_1031(0.0, Double.longBitsToDouble(-6802946648912148392L ^ -7030378430094358440L), 0.0)
                  .method_1022(Iiiilllliiilll.field_1724.method_33571())
               <= Double.longBitsToDouble(-602145430133752974L ^ -5212705548654298254L)
            : true;
      }
   }

   private void IlliIlllliIl(int slot) {
      class_1703 var2 = Iiiilllliiilll.field_1724.field_7512;
      if (var2 != null && slot >= 0) {
         Iiiilllliiilll.field_1761.method_2906(var2.field_7763, slot, 0, class_1713.field_7794, Iiiilllliiilll.field_1724);
      }
   }

   private boolean lllIiillIi(class_243 s, IlIiiIIillIiiIIi eye) {
      class_243 var3 = this.liIIiiiIIi(eye).method_1031(0.0, Double.longBitsToDouble(6861157627527947190L ^ 6962040673794685484L), 0.0);
      class_3965 var4 = Iiiilllliiilll.field_1687
         .method_17742(new class_3959(s, var3, class_3960.field_17558, class_242.field_1348, Iiiilllliiilll.field_1724));
      if (var4.method_17783() == class_240.field_1333) {
         return true;
      } else {
         if (var4 instanceof class_3965 var5 && var5.method_17777().equals(eye.liiiIIllIl())) {
            return true;
         }

         return var4.method_17784().method_1025(s) >= var3.method_1025(s) - Double.longBitsToDouble(-3875321125736213873L ^ -726446486918913604L);
      }
   }

   private IlIiiIIillIiiIIi IlIIllllIIll(IlliliIillliliIi role) {
      String var2 = Iiiilllliiilll.field_1687.method_27983().method_29177().toString();
      IlIiiIIillIiiIIi var3 = null;
      double var4 = Double.MAX_VALUE;

      for (IlIiiIIillIiiIIi var7 : this.IIIiiIillIIiiIil) {
         if (var7.IilliliilIIi(var2) && iIIiIlIlIiIl(var7, role) && this.llIiIlilIiIl(var7)) {
            double var8 = var7.iIlIlllllill().method_1025(Iiiilllliiilll.field_1724.method_33571());
            if (var8 < var4) {
               var4 = var8;
               var3 = var7;
            }
         }
      }

      return var3;
   }

   private boolean lIlIIliIlIIl(class_1799 s) {
      if (s != null && !s.method_7960()) {
         if (!s.method_31574(class_1802.field_8687) && !s.method_31574(class_1802.field_8529)) {
            if (this.IIllIllIllIl(s)) {
               return false;
            } else {
               for (IiIlIIiliIlIIi var3 : this.liiliIiliiiliIil) {
                  if (this.liIlIliiIlIl(var3, s)) {
                     return true;
                  }
               }

               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void illIilIilIil(iiiIliIIIlli e) {
      if (this.iiIIllilIIlIllil) {
         if (Iiiilllliiilll.field_1690.field_1904.method_1434()) {
            e.IliIlllilIi();
            return;
         }

         this.iiIIllilIIlIllil = false;
      }

      if (this.lllIIlilillIIlil != iIlIIiIllIIi.iiIIiliiIIlIilii
         && Iiiilllliiilll.field_1724 != null
         && Iiiilllliiilll.field_1687 != null
         && Iiiilllliiilll.field_1755 == null) {
         if (this.lllIIlilillIIlil == iIlIIiIllIIi.lIlIiliiiIlIilii) {
            if (!(Iiiilllliiilll.field_1765 instanceof class_3966 var5) || !(var5.method_17782() instanceof class_3988 var7)) {
               e.IliIlllilIi();
               this.lIlIiliIlIil(IliIlllilIi<"IliIlllilIi","zlZG3TNArrkbS+dAIov5JNwju89aIDyIy4qe6KsT2R0VFv1EeRSSpwtzu46mS6oDVDgWav6jKiscoPai3WBds1ihSUOc">());
               return;
            }

            if (!Iiiilllliiilll.field_1724.method_6047().method_7960() || !Iiiilllliiilll.field_1724.method_6079().method_7960()) {
               e.IliIlllilIi();
               this.iiIIllilIIlIllil = true;
               if (Iiiilllliiilll.field_1761 != null) {
                  this.iiIilIIlil(var7, var5);
               }
            }
         } else {
            e.IliIlllilIi();
            if (Iiiilllliiilll.field_1765 instanceof class_3965 var2 && var2.method_17783() == class_240.field_1332) {
               class_2338 var6 = var2.method_17777();
               if (this.IilIIlillilIIlil != IlliliIillliliIi.IillIiiIIi && !this.lilllliillll(var6)) {
                  this.lIlIiliIlIil(
                     IliIlllilIi<"IliIlllilIi","WmOoXMFtTAedpMFrG6h8EdNBW/VY8DapIC302gP21uX1IuMLkuwfpBgMenN/egyy3Gn8y2qCj0w3ka0vpGylQwpkcSGYHKBbz9h+ilI5hNPNNZRohnxM">()
                  );
                  return;
               }

               String var4 = this.Iiilllliilll(var6, this.IilIIlillilIIlil);
               this.lllIIlilillIIlil = iIlIIiIllIIi.iiIIiliiIIlIilii;
               this.iiIIllilIIlIllil = true;
               Iliiiiilliiiii.IliIlllilIi()
                  .iIlIlllllill(IliIlllilIi<"IliIlllilIi","DJ/J1Hf8+XfW+Sz0SavnnVijngr3X9R8m1qkN94DSoAqcTwE/3Y0tQcj9g==">(), var4, true);
               this.iliIIlilIiiIIlil = true;
               this.liiIIliliiiIIlil = System.currentTimeMillis();
               return;
            }

            this.lIlIiliIlIil(IliIlllilIi<"IliIlllilIi","IAPJuB3hD73DZhrMGai5gYMqqaam1g2EBhAtzcQiGgnplRn66f2tu0GBypOdeFFxXDaJagQTvBrqR/Hkjoiot7U=">());
         }
      }
   }

   public boolean Iliilllliill(IlIiiIIillIiiIIi s) {
      return this.IliIlllilIi() && this.Iillillillil(s);
   }

   private class_1799 lilIIliilIIl(int i) {
      if (i <= ((-(663439752 >>> 7 | 663439752 << 25) + -103 << 29 | -(663439752 >>> 7 | 663439752 << 25) + -103 >>> 3) ^ -571073277)) {
         return Iiiilllliiilll.field_1724.method_31548().method_5438(i);
      } else if (i == ((-(-2093276000 * 51) - 73) * 1594008481 ^ -2043150573)) {
         return Iiiilllliiilll.field_1724.method_6079();
      } else {
         class_1703 var2 = Iiiilllliiilll.field_1724.field_7512;
         return var2 == null ? class_1799.field_8037 : var2.method_34255();
      }
   }

   private void IIiillIiil(iIIIIIIlIlIIIIIl need, int g) {
      iIIIIIIlIlIIIIIl var3 = this.llllIlilllIl() < 3 && this.iIllIlIlllIl()
         ? this.iillIlIIilIl(IliIlllilIi<"IliIlllilIi","Dn7t/2aZmBSPw/X5Gt9VQAIP5bpg0IE3W+CnENVmSeNQCfAchviMnKcJUg31v0v6uYk=">())
         : null;
      if (var3 != null) {
         this.Iillllillillllil.push(var3);
         this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
      } else {
         int var4 = Math.max(g, 1) + this.illIiIilIilIiIil.Iilllilliill();
         IlIiiIIillIiiIIi var5 = this.IlIIllllIIll(IlliliIillliliIi.llllIiiIIi);
         if (this.lilIiIiliilIiIil.Iilllilliill() && var5 != null && !this.IlIiillIii(class_1802.field_8687)) {
            iIIIIIIlIlIIIIIl var15 = new iIIIIIIlIlIIIIIl();
            var15.lilIIiIlIl = llliilililliilil.lIllllllil;
            var15.lliIIiIlIl = IlliliIillliliIi.llllIiiIIi;
            var15.iIiIIiIlIl = class_1802.field_8687;
            var15.IliIIiIlIl = var4;
            var15.iIIlIiIlIl = IliIlllilIi<"IliIlllilIi","jziJ4cxxEjzgjwl5c0m6EgARzKtFMmyfUwMXr4A1CLFdPJkm5qPfujdVOPywU+ux0hlN+/XOIA==">();
            this.Iillllillillllil.push(var15);
            this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
         } else if (!this.iIliiIllii()) {
            String var14 = !this.IIIiIllIIiIl(IlliliIillliliIi.llllIiiIIi)
               ? IliIlllilIi<"IliIlllilIi","ziLRcxZybvwTxP4IjBZVimLl5W1OXOZ6vOvZAdQPB1rF1GHUs4MimbePmWz47cHRYjoTyizpSxgKeH2zuPz1TpioHOyxkbVihEq8J/3XqDdvsNaMmqQrYM9oe/yvo934MysnR4vUSlWP0hMPo49SIFNCUAsSwdALMd40SSrUbJRqOWBcWl71s8F+Ao1o5cXCAkQueVU=">()
               : (
                  !this.lilIiIiliilIiIil.Iilllilliill()
                     ? IliIlllilIi<"IliIlllilIi","Llfc/EuAa4oqyuIkyHlmxkWP6XBhmDwzS2tKF/8EdTsXdnPQPgNl/Uaf5b6aqGgGEDsN8s+lunENhLX/wi+gm26tm6HyCRZYHYq/k6lfoFsRYPPGvO1Bf+S49qj1OcrPHAk/695Soa90Ym7HZctn">()
                     : (
                        var5 == null
                           ? IliIlllilIi<"IliIlllilIi","iV7Y16ckELpEDVw8d9UtaS7nzY6QnWHwHLADhoRVT/PYeM83upQGsntyH1UrdWz2R8/5RcDbxkQqRxY+/7PoCmxkztpw48WShQ7qV+cZC66eDV7pGKwlo+9dAXE=">()
                           : IliIlllilIi<"IliIlllilIi","sZmq4qYjEXJRCfPOCQHExPHDa7DYKn1lytqm3Cj+hfJ1wEyYQxWmmu/homYKLMdOV2Di1vbxyzh7qumAmHlfS3V5Dx4PSrZHYJKSfaS7mw941BbSCXxrDxwfb4+Z2f51ThSfwMTOCmox/0a+ODEU2oiR3gxeuac=">()
                     )
               );
            this.iiiliIIIii(need.iilIIiIlIl, var14, 1200L);
            this.lliliilili();
            this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
         } else {
            IiIlIIiliIlIIi var6 = this.iliiiIiiii();
            if (this.ilIiiIiIii(var6)) {
               this.iiiliIIIii(
                  need.iilIIiIlIl,
                  this.llIiiIililIiiIil
                     .getOrDefault(var6, IliIlllilIi<"IliIlllilIi","SuAO5/7P+t37twUCSiq6PYScYPEaTiZVjfhL6YKUfjblH0AtDK0iBkEfVthU9eJVrRS8Xj45mrU=">()),
                  1200L
               );
               this.lliliilili();
               this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
            } else {
               class_1792 var7 = IiiIlliiIl.iIlIlllllill(this.IllIiIillllIiIil.Iilllilliill());
               boolean var8 = var7 != null && this.IiIIIlliIIIl(var7) > 0;
               boolean var9 = var7 != null
                  && this.lilIiIiliilIiIil.Iilllilliill()
                  && this.IlIIllllIIll(IlliliIillliliIi.iIllIiiIIi) != null
                  && !this.IlIiillIii(var7);
               if (!var8 && !var9) {
                  this.iiiliIIIii(
                     need.iilIIiIlIl,
                     IliIlllilIi<"IliIlllilIi","fDrsugjnuQsaS1UexSOzf3boV9kB9PU97TXrSswZu1SaZWz9zDG/TkPYkgOJDTwSbTfj">()
                        + this.IllIiIillllIiIil.Iilllilliill()
                        + IliIlllilIi<"IliIlllilIi","DBH5GibHRIhqqMrIA8WMXIJLlkeDq6FwZldwsfWRFC33sJPpF9nvg5DhWCkZ">(),
                     1200L
                  );
                  this.lliliilili();
                  this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
               } else {
                  UUID var10 = this.llliiillii(var6);
                  boolean var11 = false;
                  String var12 = IliIlllilIi<"IliIlllilIi","S+ExhmoStoNcbtBV/CtoztZHUI3MbY/SXRiIJyWQbdHK8+sJ">() + this.IllIiIillllIiIil.Iilllilliill();
                  if (var10 == null) {
                     lilIiIiliilIiIil var13 = this.Iillllilll(var6, this.lIiliIiliIiliIil.iliIiiliiiii());
                     if (var13 != null) {
                        var13.liIiillIil = this.IliiIlillliiIlil;
                        var10 = var13.lIilillIil;
                        var12 = IliIlllilIi<"IliIlllilIi","WXK7BrDGqVHRCQ2B1Zg7mjLrrnvjNyaZEMBISn0o4zBlMKIItMIu">()
                           + var13.IiilillIil
                           + IliIlllilIi<"IliIlllilIi","iAEXIG0L14eNO8uGOCsU+Nq2WBAAu2vbQJeOdfJRwuevGA4=">()
                           + this.IllIiIillllIiIil.Iilllilliill()
                           + IliIlllilIi<"IliIlllilIi","CQrh+fHhPWFuLm9Ka76ona9Ywf534LmsXVsvQkjHSMg4Ew==">();
                     }
                  }

                  if (var10 == null) {
                     iIIIlllIlIIlll var18 = IIiliiilIiliii.liiiIIllIl(
                        this.lIiliIiliIiliIil.lIiiIiIlilli(),
                        List.of(var6),
                        this.IliiIlillliiIlil,
                        (long)this.ilIliIilIiIliIil.Iilllilliill(),
                        this.IIlIlllIlIll(),
                        this::iIlllIllll
                     );
                     if (var18 != null) {
                        var10 = var18.IliIlllilIi().lIilillIil;
                        var11 = var18.iIlIlllllill();
                        var12 = IliIlllilIi<"IliIlllilIi","J72M8bVfVBPA5/QPv2m9VFjFQ8YftTneU+gjc/3sLTPO9zstNgsm2aNbFxBnAkmP4Ugy">()
                           + var18.IliIlllilIi().IiilillIil;
                     }
                  }

                  if (var10 == null) {
                     String var20 = IliIlllilIi<"IliIlllilIi","8eLOaPqZE7BydGWR1LKg8RIF6F333hVigrcS9aJklQ==">().equals(var6.llIiiIiliilIiiIili)
                        ? IliIlllilIi<"IliIlllilIi","r2bxVORlAYFnAPB17vQHXUS4igL+TwIGgyMIlD6XLGjsK8Fn">()
                        : var6.llIiiIiliilIiiIili;
                     this.iiiliIIIii(
                        need.iilIIiIlIl,
                        IliIlllilIi<"IliIlllilIi","Ngj6Ep5n3/wtxPDIdGGNeMqlw8iSfAe0FV7LLOimu5YKzVdr1dUDA6nZKApx7mOIF7Q3">()
                           + var20
                           + IliIlllilIi<"IliIlllilIi","WMTU8U41mp2pmHyndp/+gVof0N3TTZDlt1XOQnbqgDZmCvDpJz0i4kXQBsz4/gjc">()
                           + this.IllIiIillllIiIil.Iilllilliill()
                           + IliIlllilIi<"IliIlllilIi","KH1GarSZ/QBw+jSyNVcz+PDcKBvBhiKpjv68dioGheDn82Um5bhdCz3x5BCxbTNKfzQ1OM0OzAwVWs/cl+qm4dnWcyWnYtCm">(),
                        (long)this.ilIliIilIiIliIil.Iilllilliill()
                     );
                     this.lliliilili();
                     this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
                  } else {
                     iIIIIIIlIlIIIIIl var19 = new iIIIIIIlIlIIIIIl();
                     var19.lilIIiIlIl = llliilililliilil.iiIlllllil;
                     var19.iilIIiIlIl = var6;
                     var19.IIiIIiIlIl = var10;
                     var19.IIIlIiIlIl = var11;
                     var19.lIiIIiIlIl = var4;
                     var19.iIIlIiIlIl = IliIlllilIi<"IliIlllilIi","h7XcQPUAQWl+S7pQcMCejJUYNLxlfwmGZwchq+a1z4BLcCLrkH7UU/4oGtopuoaEpw==">() + var4;
                     this.Iillllillillllil.push(var19);
                     this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
                  }
               }
            }
         }
      }
   }

   private String IIiIIllIiIIl() {
      class_642 var1 = Iiiilllliiilll.method_1558();
      if (var1 != null) {
         return IliIlllilIi<"IliIlllilIi","lkvoxsTFEedwN54Xpr2/somMKB9VV4V6VfoIqD7t0g==">() + var1.field_3761;
      } else {
         class_1132 var2 = Iiiilllliiilll.method_1576();
         return var2 != null ? IliIlllilIi<"IliIlllilIi","6Lw0eIc1z7gVb9G0QTzhUr1npgPddH3CqmmjTz5nQA==">() + var2.method_27728().method_150() : "";
      }
   }

   private void liiIiiiiIi() {
      iIIIIIIlIlIIIIIl var1 = this.Iillllillillllil.peek();
      if (var1 != null && var1.iliIIiIlIl != null) {
         if (this.IliIlllliIll() > 600L) {
            this.IiiiIlliiiIl();
            this.lIIIlliIIIll();
            this.lliliilili();
            this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
         } else {
            float[] var2 = this.IIlIilIlIi(var1.iliIIiIlIl);
            this.IilliIillilliIil.iIlIlllllill(var2[0], var2[1], 1);
            if (this.IiIIllilliIIllil != null && Iiiilllliiilll.field_1755 == this.IiIIllilliIIllil) {
               if (this.IliiIlillliiIlil - this.illIllilIilIllil >= 2L && this.IliiIlillliiIlil - this.lilIlliliilIllil >= 8L) {
                  if (this.IilliIillilliIil.IIIllIIliIIl(var2[0], var2[1], 2.5F) && this.iilIiIIiIi()) {
                     int var5 = this.Illlilllli();
                     if (this.iiiIllilIIIlllil != Integer.MAX_VALUE && var5 < this.iiiIllilIIIlllil) {
                        this.IIiIllillIiIllil = this.IIiIllillIiIllil + (this.iiiIllilIIIlllil - var5);
                        this.IiiIllilliiIllil = this.IliiIlillliiIlil;
                     }

                     if (var5 != 0 && this.IliiIlillliiIlil - this.IiiIllilliiIllil <= 40L) {
                        this.iiiIllilIIIlllil = var5;
                        int var4 = this.IiIliliIli(this::iiIIIlIIlIIl);
                        if (var4 >= 0) {
                           Iiiilllliiilll.field_1761
                              .method_2906(Iiiilllliiilll.field_1724.field_7498.field_7763, var4, 1, class_1713.field_7795, Iiiilllliiilll.field_1724);
                           this.lilIlliliilIllil = this.IliiIlillliiIlil;
                        }
                     } else {
                        Iiiilllliiilll.field_1724.method_7346();
                        this.lIIIlliIIIll();
                        if (var5 == 0) {
                           this.IlIlllilllIlllil = var1.iliIIiIlIl;
                           this.ilIlllilIiIlllil = this.IliiIlillliiIlil + 50L;
                        }

                        this.lliliilili();
                        this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
                     }
                  } else {
                     this.lIIllliliIIlllil = 0;
                     Iiiilllliiilll.field_1724.method_7346();
                  }
               }
            } else {
               this.IiIIllilliIIllil = null;
               class_243 var3 = var1.iliIIiIlIl.iIlIlllllill();
               if (Math.hypot(var3.field_1352 - Iiiilllliiilll.field_1724.method_23317(), var3.field_1350 - Iiiilllliiilll.field_1724.method_23321()) > 4.0
                  && this.iIiIiIilIliIiIil.Iilllilliill()) {
                  this.lIiIlliIiIll(IIIIllIllIIIllIl.liilllIiIl);
               } else if (!this.iIllIlIlllIl()) {
                  this.lliliilili();
                  this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
               } else if (!this.IilliIillilliIil.IIIllIIliIIl(var2[0], var2[1], 2.0F)) {
                  this.lIIllliliIIlllil = 0;
               } else {
                  this.lIIllliliIIlllil = this.iilIiIIiIi() ? this.lIIllliliIIlllil + 1 : 0;
                  if (this.lIIllliliIIlllil >= 3 && Iiiilllliiilll.field_1755 == null) {
                     this.iiiiIlIIIIll();
                     this.IiIIllilliIIllil = new class_490(Iiiilllliiilll.field_1724);
                     Iiiilllliiilll.method_1507(this.IiIIllilliIIllil);
                     this.illIllilIilIllil = this.IliiIlillliiIlil;
                     this.lilIlliliilIllil = -4611686018427387904L;
                     this.IiiIllilliiIllil = this.IliiIlillliiIlil;
                  }
               }
            }
         }
      } else {
         this.IiiiIlliiiIl();
         this.lIIIlliIIIll();
         this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
      }
   }

   private void lIiIiiIiIi() {
      iIIIIIIlIlIIIIIl var1 = this.Iillllillillllil.peek();
      if (var1 == null) {
         this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
      } else {
         IlIiiIIillIiiIIi var2 = var1.iliIIiIlIl;
         if (var2 == null) {
            this.Iillllillillllil.pop();
            this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
         } else if (var2.ilIiIiiiil == IlliliIillliliIi.IillIiiIIi) {
            this.IIiIllillIiIllil = 0;
            this.iiiIllilIIIlllil = Integer.MAX_VALUE;
            this.lilIlliliilIllil = -4611686018427387904L;
            this.lIiIlliIiIll(IIIIllIllIIIllIl.lIIillIiIl);
         } else if (this.liliIliiliIl()) {
            this.iiiiIlIIIIll();
            this.illIllilIilIllil = this.IliiIlillliiIlil;
            this.lilIlliliilIllil = -4611686018427387904L;
            this.IIiIllillIiIllil = 0;
            this.IiiIllilliiIllil = this.IliiIlillliiIlil;
            this.iIiIllilIliIllil = Integer.MAX_VALUE;
            this.lliIllililiIllil = Integer.MIN_VALUE;
            this.lIiIlliIiIll(IIIIllIllIIIllIl.IIIillIiIl);
         } else {
            class_243 var3 = var2.iIlIlllllill();
            double var4 = var3.method_1022(Iiiilllliiilll.field_1724.method_33571());
            if (var4 > 4.3 && this.iIiIiIilIliIiIil.Iilllilliill()) {
               this.lIiIlliIiIll(IIIIllIllIIIllIl.liilllIiIl);
            } else {
               this.IilliIillilliIil.IilliliilIIi(var3, 1);
               if (this.IilliIillilliIil.IlIlllIlilIl(var3, 16.0F)
                  && this.IliiIlillliiIlil - this.IIIIllillIIIllil >= (long)this.iiiIiIilIIIliIil.Iilllilliill()) {
                  class_3965 var6 = this.IliIilliIi(var2.liiiIIllIl());
                  if (var6 != null) {
                     Iiiilllliiilll.field_1761.method_2896(Iiiilllliiilll.field_1724, class_1268.field_5808, var6);
                     Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
                     this.llIIllililIIllil = this.IliiIlillliiIlil;
                  }

                  this.IIIIllillIIIllil = this.IliiIlillliiIlil;
               }

               if (this.IliIlllliIll() > (long)this.IlIliIilllIliIil.Iilllilliill()) {
                  this.IIililIili(
                     IliIlllilIi<"IliIlllilIi","6dSrKsHmKEoR8+lJ3lh4PaVm+IIyhN8WA3Lsg15Bp0uEmufvJZJGmZbtQhZGPgbJ+vgf1uSGDMcNu/+BfZskx8B9K3S/cyUzMw8c+D8=">()
                  );
               }
            }
         }
      }
   }

   private IlIiiIIillIiiIIi lIililiIilil() {
      iIIIIIIlIlIIIIIl var1 = this.Iillllillillllil.peek();
      if (var1 != null && this.IliIlllilIi()) {
         return this.lIiiIliliIiiIlil != IIIIllIllIIIllIl.liilllIiIl
               && this.lIiiIliliIiiIlil != IIIIllIllIIIllIl.iiilllIiIl
               && this.lIiiIliliIiiIlil != IIIIllIllIIIllIl.IIIillIiIl
               && this.lIiiIliliIiiIlil != IIIIllIllIIIllIl.lIIillIiIl
            ? null
            : var1.iliIIiIlIl;
      } else {
         return null;
      }
   }

   private void lIIIlliIIIll() {
      if (this.llllllililllllil) {
         lIlillliIlilll.liiiIIllIl(this);
         this.llllllililllllil = false;
      }
   }

   public llIiIlilIiIl() {
      super(IliIlllilIi<"IliIlllilIi","+ze9nrAA2hNpT6oN8Uxi/96zPboOd0WDLnI/6MNLBneAb9j0euRMOVczWJ4ZZsA=">(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.IlIilIilllIilIil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","nJKd2A2e1oQc1PX+zYmNG6qaP/3d9Dz9CBfZhak7O/7FBU5vncwG41LAvtF3">(),
         IliIlllilIi<"IliIlllilIi","no61QqOOBIB9ctlpx/YhrFqO1J8QpXvIM0J5epcU77velGiUNdfzY6mQkIMFi6450XUJDQOmchmcwRm4GkLYZ1tBe6iD/d1+C1x3F+7c3LL/ZqmjgLgL7IdjSQ9UQNdu6uY=">(),
         true
      );
      this.ilIilIilIiIilIil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","NhSHJ1hdTp74bnfrythNVEtKm9+tHk4YIVNJx/LmoiCcDNeUr8KF3TV1">(),
         IliIlllilIi<"IliIlllilIi","7YM7QEkGAOK4MAv9HmEAywhkZDrDA4p30C8e949sJZypqzS7NEG5a0LEfiklX8cRs47Soi+he1U2CplcS3mkluEa6+6j12UDyxA3vrODPnve5tPwWG6tlL2mzDay">(),
         true
      );
      this.liIilIiliiIilIil = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","zMlq2jTCDSN2EHWlV1LMnbmT/y1k/IOrB6bD8lwdAuCviDm2MATFOA==">(),
         IliIlllilIi<"IliIlllilIi","ejmwzIxIj4Tq1Ud8TJq3KnRA5zcZn+6hsp54/tp7QTWbmmDYsQQO4P6nxjo5FWw9qrTXybgUQwl1WIRgamvPj95uh1kOpzI62IMg">(),
         32,
         4,
         96
      );
      this.IIlilIillIlilIil = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","/Sdzb5BG6FGil7SuoFZkSOU+HuP0ASVC8LG5XbuyH7+fO0S2SW/KhgqD">(),
         IliIlllilIi<"IliIlllilIi","R7QpEKDsD8I4XlCBniSc6HTxt7309hF2bWK4tq9y6wZ3J4Y3GPpQf2rvIatnrPfUWkTlGTaEa/6qziiK4Us3UUaZS7EAvrzZYJIwzybGRfburRTvZhY=">(),
         IliIlllilIi<"IliIlllilIi","oBri1ypBG1GWcdsXN9uO6bRfs6ipMk24vmG6fKs+J76KB3Uf3Gs=">(),
         IliIlllilIi<"IliIlllilIi","OEfRv2k3WA/Ql9GvXDVugAyDPWGs7WSGiqLG3dGrWJxQ0C3s">(),
         IliIlllilIi<"IliIlllilIi","PPlcU1hGZuXwoAVVftGkQekB4Uj1T1g2ov/q/P6WUd9dip4=">(),
         IliIlllilIi<"IliIlllilIi","MxsYjubxEy68QKzRXonCrZinfDQ/za+ZSEUA6md+cPt4ppX2Zcw=">(),
         IliIlllilIi<"IliIlllilIi","8xfEMKJi0EH3e5CxDZbbliFoJPtd6qVreoEn8pOXX16o4KMfs6mf">(),
         IliIlllilIi<"IliIlllilIi","0nQ74ErW9sj8AEycMnUq+0bP7hgJSrQUbjZC/mVceltyFfXiflVYXII=">(),
         IliIlllilIi<"IliIlllilIi","oBri1ypBG1GWcdsXN9uO6bRfs6ipMk24vmG6fKs+J76KB3Uf3Gs=">()
      );
      this.iIlilIilIllilIil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","w8EHIsIbPVRGzmx3v3lvKpN4oXjO2OVZmRJObNYpOMAtNswAe/hajw==">(),
         IliIlllilIi<"IliIlllilIi","jBrFHaKW6physEFzquTBvKIR83aByXNvjUjrUui7w308NQBUDzD/+OCe+6pUNuMwp0+I/Go4Xfr+xcXzyL8sNGUIwWVE76DQOtfR86I8qyKDZZsAzgapdsWhR0QAlctgIqLLGCrbZA==">(),
         true
      );
      this.lllilIilillilIil = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","GRntfhRqGGn8xw9G+CGU6AS27SY80Ud3rVHmxcKskcpLsSks+ZcNEC38c8eK">(),
         IliIlllilIi<"IliIlllilIi","S2N/QWoULEGv94EC1KvQGJn3G2fopmALaGSE9ErsOIGVQSqNDNO2hW68/t1KZPuEjFYAJJN0zSny/9RLEIxrREZ3Kwpz579KIj/YgUFjZtm/OP9lwdA=">(),
         3.0,
         1.5,
         4.5,
         0.1
      );
      this.IililIillililIil = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","++yPDtSHuxpPmDC3XDc0UPOTqr/+6OKSQYjxbkhGWI2hPfkUbdM=">(),
         IliIlllilIi<"IliIlllilIi","RcdxNInpFVdPfYo78K83+FYCPwBka13O9Ec+LFULsouBv7nZjcrt2xAo3qvGmTdwMmdLB7/jRQGTHwgn5MMp1/4IcroC7UA=">(),
         IliIlllilIi<"IliIlllilIi","86762yOCKJh+tMqrlXuN/KU1ugXM0NAY8bL1qfP7ZUtrMRDvdA==">(),
         lIIllilliIIllill.liiiIIllIl()
      );
      this.iililIilIIiilIil = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","s5U/A9fJbiwXmj3oCBmbFiGlCmSCSGic0UNuVN3YQ5sihQ==">(),
         IliIlllilIi<"IliIlllilIi","ODpqqg+DmidGzOmyBLCdJymUE37hwkSEHoPPTnNbroodUiByqS9wMCxxIOJZfjqkxwcz/CzIC5CFqxe7M8Ts296OBt3D0DcG84U=">(),
         IliIlllilIi<"IliIlllilIi","2rmrqEq0mry/0wdnwN1ZM4Qhtab3j/JhA8f3KVcYDQ==">(),
         IliIlllilIi<"IliIlllilIi","2rmrqEq0mry/0wdnwN1ZM4Qhtab3j/JhA8f3KVcYDQ==">(),
         IliIlllilIi<"IliIlllilIi","mfqB+06NfQ9LuGPKkd8bTPqMshFe92q3k5dGe1DoOQM=">()
      );
      this.lIiilIiliIiilIil = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","cMCPJ2exFmV7RdGFffZXZ7XN8YbHu8u5K/Jcl/aMlqh8jg==">(),
         IliIlllilIi<"IliIlllilIi","MslXuH2+pdvACKjEajMrd6YpDXuuS48CjRwOuB9apqzJbbqumO65eQhpjHnu9z4fXqufyTT3JlenJF3ay+H+BStrTIX2lNA7klr4ZmtSlw+n5+fl6gbuIBRFmb88FY0HRXQn5B6iM15JKg==">(),
         IliIlllilIi<"IliIlllilIi","idlza0dadIILxtNJ75RO3ZX4BiqYy/kBFBfbDQVEGvp82k66GJo9tbqs">(),
         IliIlllilIi<"IliIlllilIi","idlza0dadIILxtNJ75RO3ZX4BiqYy/kBFBfbDQVEGvp82k66GJo9tbqs">(),
         IliIlllilIi<"IliIlllilIi","QqK/VhtENyCm2da+nVO41N0Ac4NNYGw5r9HHDRW2RgA=">(),
         IliIlllilIi<"IliIlllilIi","61dPeki85lhbjC+DW90QebO7rPsZqVz1dKNJh3Am1kkEw2Y=">()
      );
      this.IliilIillliilIil = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","fjc6SmDwuBcmHqX4fXAv0xW42pPX6N3BSufGddYkhiy+V8dqemGJ">(),
         IliIlllilIi<"IliIlllilIi","nN2EZD9o31XjequPuxcILGMAIlDMsIEutBsBPpoRQkf/gScAZlQ4t1vkctowg48/mAE0II0+lnnxr1cB7HErTje8RyNsplI7fq37qmNmRNK77rU=">(),
         IliIlllilIi<"IliIlllilIi","3la2XJY4BP3Y8YPKRJh+suUTUdkink87F1FRzct6kRbdd6w=">(),
         IliiiiIilliiiiIi.IliIlllilIi()
      );
      this.iliilIilIiiilIil = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","U+/K25cHop+/n5V3gdSnXeYbE2hV5c6JyDnlZdj1zvvOeWYI2VZxXbI=">(),
         IliIlllilIi<"IliIlllilIi","7jX5srEZFGWLR6rTcxTS6f6FO4rhD9yetpZ6uDmNx/e/BEV72aTcauMrhcwit1Mc9ZpFqiKOzA0fjpgOOHG2+jkbLw==">(),
         1,
         1,
         5
      );
      this.liiilIiliiiilIil = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","QqK/VhtENyCm2da+nVO41N0Ac4NNYGw5r9HHDRW2RgA=">(),
         IliIlllilIi<"IliIlllilIi","Xgr6h2GVYKDW/MkMWfa61GVCpVGsPMByvu0YzIFfvCUAnNBIZ3u1ZvuNYPQ59ilUcXttCsiXLK33BEFxAhbwkTkrdo86r3Dh33VU+Hc/XoaJRC0=">(),
         IliIlllilIi<"IliIlllilIi","VF7ZDxgyqVopTELmD/ERUncXInS3FLwynreXQLtCCbVhMTM=">(),
         IiiIlliiIl.IliIlllilIi()
      );
      this.IIIIiIillIIIiIil = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","zCNLG2NxX+FhZeBMsPBO2ngrQ9Pflnwu2UZu0aD1YkR6RkF118/aS9mRnhE=">(),
         IliIlllilIi<"IliIlllilIi","846DveKHlwsAaFCTODK4Qy1ngZLyipSdsc4KHB9Q2hTmngfnnn3JxOqTf6BKLUKUojD9SwSwxKFysP+1/yJO42ggVq+rQUu23uM0ShNDevAtq+yAdhGlLrMM">(),
         0,
         0,
         64
      );
      this.iIIIiIilIlIIiIil = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","z0GJoE/uyCn/HVUvaR4yGdFcWySxA4r9lOy7jCH+hrnK46wcuKsrCXY=">(),
         IliIlllilIi<"IliIlllilIi","JsBLyo1PXBrnAOig1b4ya1HRsBYUML40HgEFUboj2CdFtNS/NvMyUjmhJ+RpwE+RIzHFtm/tniVZFnq/bZ5owalnylg0roDIXkYjwCCeBeplKJ9jYHTYXL1vZBTEFWw=">(),
         0,
         0,
         4608
      );
      this.llIIiIililIIiIil = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","szW2EPnavWUjILylki7I+ujkImBisr0KN9FyxAbMUrtN+Nss">(),
         IliIlllilIi<"IliIlllilIi","4gsmDdh3I+KQb4jRMm902uYc7xdwY+an75a8HYDqx127NyhRmnXAV1QCOK6ketxJj74acL3XnjWbOhfE6rVQuptMrLV/+w==">(),
         100,
         0,
         100
      );
      this.IiIIiIilliIIiIil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","kHPmKtOS8HJEqbMo/l6CLC5mr06DIGuJaQj/Oh7q6tcqTMppOhmiaBk9KMQ=">(),
         IliIlllilIi<"IliIlllilIi","iFZUDVysTV4gddaGBc8aW20OVpVbt4yJgbxzAWdlZWWLvlVb4hHnqiv7wNla5mCsR57Da7vPPxlCZIG1zSKmk94t37GzQ1k9mVRreD4YhCjfmqMOxs+aAzCfGq5s6Eo53JEU4tvPqeAbyZ86kGvj/SR85nLyeQgleoEy1OFqLuYcsRStMYelTgT8IpdzdUNJ8Z9qT6DJqP0vKiSKFRq6jUaOfRttgSAfNAd5VrBBwEfR6c6+d/vV3wNNqNPgd++S98FdWWKRy2AIhbsaiaZv7Sy2dLLcSD91vT3ZCZfkkzBfKCwyvNgPeSvP4Jkcv6HiQL00Y3pGE3qzGZe6J+GWozONhPC6Mc3qSVnhj+pUHCkI2rT1winOhJ42sHEIdO+7GG6RH8B22WdCHvT+6LFSAJllXRmb69ZiabZSFuB04Ew1pD8iNKLJVxKS6Glaob9aMbYQ2oRnTHdTb0oeosgtvi91mw4=">(),
         false
      );
      this.iiIIiIilIIlIiIil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","XHoRR4Zz8jdTfDEfT1mvq51qZq9lC68TYTMP6dEuLTy+tqIda4cg6QvB1eMDCuWdVw==">(),
         IliIlllilIi<"IliIlllilIi","fndzAee/zoJ63ufTpdULw6oQzzM4oEUxQe2uu1qEZmTF484hZXjKnNEgtugi6KMo1wBYZlHVeyVy5eAptHeihnDZYc03tiQy985ULoHqXJJHndpXppzD4jSOkMrwT5ouQnFWvNNhAdNhXy7GKxbVrkq/E1mVqw4=">(),
         true
      );
      this.lIlIiIiliIlIiIil = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","JBxIjyZz+y/oclkkY7npeYXQnetH8O2OLVwO/xDp2tKS/gbIgJm6NiDp">(),
         IliIlllilIi<"IliIlllilIi","u4bx+eKsyMKsRN9XFCMSpyMD0M2r2/SRykQQGuPrXX+OmtgFW45uFa+U/lkImAX65Z5PA4B3V/kUO7lNAs2bBuvQ3hxO">(),
         IliIlllilIi<"IliIlllilIi","jjb8hCwPc/EoyZ/CKMLoGeWq793/CgZvmbiaGuwt1yvWmg==">(),
         IliIlllilIi<"IliIlllilIi","jjb8hCwPc/EoyZ/CKMLoGeWq793/CgZvmbiaGuwt1yvWmg==">(),
         IliIlllilIi<"IliIlllilIi","QLDRg9MoQVTJ1oWwsjRtBg/RJxJhiUqUTuubDoSwiDoohEJV">(),
         IliIlllilIi<"IliIlllilIi","eddQ2QYLSXwcUfhv8NCp6d6wXDlAYfzq1evPNHpJrcJl3w==">(),
         IliIlllilIi<"IliIlllilIi","/yNzjoI0OWyqsr369dkSrYkgBbThGitkRuuN7r6Qn1IC+EQ=">(),
         IliIlllilIi<"IliIlllilIi","+uaLZE22cl59xnquOvnhXAHwhgs8l7iSIQFM/zlzIf11iL2vPQ==">(),
         IliIlllilIi<"IliIlllilIi","Aklfpkin41Vga8jG7TWs3NB4ZSgS9Oc2y/ju6DTcGxq0LpSRwj5C">(),
         IliIlllilIi<"IliIlllilIi","8eLOaPqZE7BydGWR1LKg8RIF6F333hVigrcS9aJklQ==">()
      );
      this.IllIiIillllIiIil = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","qrvz0IBhcWSLanIDsy4gtmrB2BEO4oDsOUXOUmQidI2sVLR+fQ==">(),
         IliIlllilIi<"IliIlllilIi","Kfeqhj4rkvlYyJ09w25+KUO5cfHujtgmdVpB4CSjftYhtuX8P40VSFqtJ4ZXndlGlXeX8q7ssF1FUirc">(),
         IliIlllilIi<"IliIlllilIi","VF7ZDxgyqVopTELmD/ERUncXInS3FLwynreXQLtCCbVhMTM=">(),
         IiiIlliiIl.liiiIIllIl()
      );
      this.illIiIilIilIiIil = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","3vEeRuAFkqS9WS2iepLio2S7oM4LMdqLK1btqtC5C7KXQBFqralXEEfUVA==">(),
         IliIlllilIi<"IliIlllilIi","MDyJDCzOt9ZUngZPbA5JZDw1qDobAdWYd5/X5AGWQBC2YDTlBPzwXXMd/GIBBhSHyJXETUyORnYkdtE8v7+UpJwR5QXENnTZyFBFd5FsjQwZfExpMA==">(),
         64,
         0,
         4608
      );
      this.lilIiIiliilIiIil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","XkPL8ssmxdcpKBaa3ooX8voY9Dc7GheIERrIxJhnm23DSmPraYPH70DHqi+49Mq0qq1E">(),
         IliIlllilIi<"IliIlllilIi","kEWGtZIvzrV1ZXYlVLzsDxLoa48wVmkZ2EcbIsJONFkRzDRj/S1seZryGBI0EiNtvMxySLTnPh8tdDdu3e7C1ZLSBn+ofiYLd906SeV5nga1W2D3uEZ/70/WIyYpMXI=">(),
         true
      );
      this.IIiIiIillIiIiIil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","PW7xaDXKBlBxPxWqnuQY1K/xrqBTzyV/nwu8Us4xN6GLNsYi+kWdku9+sAkVL2fC">(),
         IliIlllilIi<"IliIlllilIi","kGFgtJL+mdlWvqdhpJAokuqlt/W4Ap7Wt2U+2yuVJLilUlNzpwcEAgHHSlMF6WgY1A6Jt0mgH9YurFV+RbZFIId+WgBXasdrnpG8jNi5V4M4A3Bex9K8A/O1mpZix45gCf05FBr787Zxtjx9nrba2wnduqrA">(),
         true
      );
      this.iIiIiIilIliIiIil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","PulP7PNzvxZ4Egxsu2XikE+MgSchzbfF3ZuYKloFYpgZYUe6rxc=">(),
         IliIlllilIi<"IliIlllilIi","4tpigC9zo43HDTHBiXtLPOnsbu9TK774bIRm1ZaWRGkiyK/bLhA6SBcfv0tiTRmPSpJhYqWZIHV/+KFJjJkQ14iTQytDCmArwXSQOBZTBi46XnFm1YEq4/IS/T+DD6QhF3EMk3RxWrQvdgWumNBvlHINrAo=">(),
         true
      );
      this.lliIiIililiIiIil = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","PYwLV3R+Qj4kUROPWgcl6w5Hic8keZquEUZvJwjAq7w+LPHz5yI=">(),
         IliIlllilIi<"IliIlllilIi","lrEQ7H9V7QcG9/hmQYwsUAa9vFAk6+PfMWK6+ilcQ85UNU0Y2bc/RudIwgOMGZsyEHn0ZIJzRSaFcLGWSJ1wvNXW2VJr">(),
         6,
         1,
         10
      );
      this.IiiIiIilliiIiIil = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","ng2KQr3FmiH+dG8f3Q+6PuBOafrsz1H73rxMVScahfgKeMrHTVaW">(),
         IliIlllilIi<"IliIlllilIi","MAJEr/zICKqA1QA0LhPwXcb2u3WrCjCnpyrwm1huEqQ+WaW9YHfII89uwW6OV+XBYXYyeafjimcI7BLDT0npxpxrnjpenxDbre/EEt0npLNRUkDoRNuGp8QZOpE=">(),
         4,
         1,
         20
      );
      this.iiiIiIilIIIliIil = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","4P354k4qsZC/oPrn/QjbzgE8vTkyKXWgv/YFsLRZMH8J10OcXkJKO5oprTHR">(),
         IliIlllilIi<"IliIlllilIi","9qPLREandjX8QWSSX0A42vynF0VBAf9zwXcY40Nw047ULsNVDcNEAi8RxCk+mXzNgkzHdOnBcUpctGx97UZNkQ==">(),
         6,
         1,
         40
      );
      this.lIIliIiliIIliIil = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","F0XJ1eHTGoxjHHUK91wbNuTjwdbJDTySRXATpxQh/6PmBL4e/L/q">(),
         IliIlllilIi<"IliIlllilIi","Ot63cJbEcb/8+t2hScipFP04gpXZCkObxML4Q69GlCIQraGj0+wHMWwlcXoA9G0yd2yBOpl+U54uRDyrHoJ+/U0zoHf40FEo5KYm">(),
         20,
         5,
         100
      );
      this.IlIliIilllIliIil = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","bsioeT17UTdfDJb7Q5rmTMNw9+0bqids6fKs1AWrLsio315kQdjU">(),
         IliIlllilIi<"IliIlllilIi","uJsiTkvTfL9EF7AM7Na+TkLPpZejVUfNqWrvwZNQr/Mh5xT2BcsOVIxznYl4fQLDCQxjY9vzcumZBdNcM3GaRgDLSGJOGg/I/LYR+NwgN1RK8ENlhTdKEQ/KEHEsyQ==">(),
         60,
         20,
         200
      );
      this.ilIliIilIiIliIil = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","Z0Z8oDCaIToR/NV/IO09xzD94a4TGypkG8SyNDXs2nspaIuulJL5CJjD5sx3txQ=">(),
         IliIlllilIi<"IliIlllilIi","r52Dja7EpXpUzrJMIiNfGw4+PyAqANfRbQL3ApvZL+iUoTKtp80ENYlsYwmb8VNgPRUS65MMuEuemkbvwXuyLFWsofdV23euSVozEQaxpQmU1SJfrMqP6Xf3L/vsZtEJPubNdlH7LBaMm5SOYUTRRRoXI61K4pGNAkWf/SifLPrmb3+MUxpdYVYVjyr7bpLfGnez+noDl6GbS0M26+k5z2PLzSJ2v+G5BAdir2VGzMehJMUtBK+86K4nyMQhwcAK+SClQpNmJ9v0t49Y4XQ1Nj4JXGp1Ig==">(),
         600,
         200,
         6000,
         20
      );
      this.liIliIiliiIliIil = new illlIlIlIillIlIl(
         IliIlllilIi<"IliIlllilIi","AfU2gsOiJCnJdoaVbab0bYvUDFAf7bOBsfFT8fuLUJEwBGi5mnlQ+Iog3DqVbuA=">(),
         IliIlllilIi<"IliIlllilIi","pGTg3E63p4qqgB/GN4bOXIhsJ6hlygb6O1cU4rwbfsMQQ8kzT798Ssj5EYrPUSSvSYHbAKERsp3QmDH9eNBkjWIblxjMIv/NdnhYOcbp7b9yvpqZ2IHbaaVcy83cvdPnS9rgLg==">()
      );
      this.IIlliIillIlliIil = new illlIlIlIillIlIl(
         IliIlllilIi<"IliIlllilIi","8eVUhMGLgp3hTwQ+i2FaznphjgFeNT1LRBkK1wG5puCQkAaTNTCiZg==">(),
         IliIlllilIi<"IliIlllilIi","zZRMMIZqkM5/O1HIo6NCZWx/fVlFfyUt6+DwS2/5jMii3tsiw47KotDh2hZxJLr/KFeL8Ulpl5bVi3hNWZlsTSzKoj5GDNm4ygr5KxIWbZIwhNldP4xIfeO/ZOEid25k">()
      );
      this.iIlliIilIllliIil = new illlIlIlIillIlIl(
         IliIlllilIi<"IliIlllilIi","rVPyOkcZKfLJb4863KeORzrAYynjE9IzbO9y0uKOyrM0GZbxCnP2rnHdruHwB8nLa7qBDy1EXA==">(),
         IliIlllilIi<"IliIlllilIi","vyQnqjzRvSRFlbHg6hVoR90/7LWg4e2ejO0GPN7kv9xD3k9m2VgahWomymc1VQD1g3LTttI58v0gsrRL+Q03EyZQ7m6nQ+d2iCZ4b5HfncXbyQU=">()
      );
      this.lllliIilillliIil = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","r7FjH+F0m38fjBIrSUJrCqqR9otVbTLyAiwKFYJci+8bvbI3AD8Fpg==">(),
         IliIlllilIi<"IliIlllilIi","UBx2i3l/TICEOfvvcXE77IbqYinQInugxzzmxmh4cWIAdKYNCvl6Cgms9MhY3oahRURSYp4NUWEEw48k10mXTzaCLLJtoH6IHlXBfRxUPOdLis0wqJjoB6pSfqJifyRFExCnxS8Eoq/Z0R1bhRomcghB8UmogDb71oMDhD+UeawAuibswGuSNQJv8nxp4fSalGOU3IUTp69zKYBMpoccM8YT9qQIe27uE1uLnpcZP1GAxAAlu5mKwO7MRyjUCwhf">(),
         IliIlllilIi<"IliIlllilIi","8eLOaPqZE7BydGWR1LKg8RIF6F333hVigrcS9aJklQ==">(),
         IliIlllilIi<"IliIlllilIi","8eLOaPqZE7BydGWR1LKg8RIF6F333hVigrcS9aJklQ==">(),
         IliIlllilIi<"IliIlllilIi","rZT+FNDai1a8bAsWJhVZLw0f4y3U9uwhtYcE5aS6VuDEvyr3RA==">(),
         IliIlllilIi<"IliIlllilIi","nH7ZqxhJRMGuOi8JUtfBb1sNjh4+CDRdmryr9LvME8+yzEs=">(),
         IliIlllilIi<"IliIlllilIi","d+LBfMxs4jV366HpkpezWYBfsBpsQhLVWuPd0xH/fyGr+6HQ">(),
         IliIlllilIi<"IliIlllilIi","NmQP9xb+saQy7QWLAz4aqPPHZSv2VwGVQO0TlJ8zHN1xP5zh5A==">()
      );
      this.IilliIillilliIil = new lilIIIliiilIIIli(0.4F, 3.0F);
      this.iilliIilIIiliIil = new IilllIlllilllIll(this.IilliIillilliIil);
      this.lIiliIiliIiliIil = new IiIiiilliIiiil();
      this.IliliIillliliIil = new llIlIillilIlIill();
      this.ililiIilIiiliIil = new IiIlIIiliIlIIi();
      this.liiliIiliiiliIil = new ArrayList<>();
      this.IIIiiIillIIiiIil = new ArrayList<>();
      this.iIIiiIilIlIiiIil = new IdentityHashMap<>();
      this.llIiiIililIiiIil = new IdentityHashMap<>();
      this.IiIiiIilliIiiIil = new ArrayList<>();
      this.iiIiiIilIIliiIil = new ArrayList<>();
      this.lliiiIililiiiIil = new HashMap<>();
      this.IiiiiIilliiiiIil = new HashMap<>();
      this.iiiiiIilIIIIIlil = new ConcurrentLinkedQueue<>();
      this.lllIIlilillIIlil = iIlIIiIllIIi.iiIIiliiIIlIilii;
      this.IilIIlillilIIlil = IlliliIillliliIi.IlllIiiIIi;
      this.IIIlIlillIIlIlil = "";
      this.iIIlIlilIlIlIlil = "";
      this.iiIlIlilIIllIlil = "";
      this.IlllIlilllllIlil = "";
      this.lillIliliillIlil = "";
      this.IIilIlillIilIlil = new HashSet<>();
      this.lIiiIliliIiiIlil = IIIIllIllIIIllIl.lIilllIiIl;
      this.liiiIliliiiiIlil = -4611686018427387904L;
      this.IIIIllillIIIllil = -4611686018427387904L;
      this.iIIIllilIlIIllil = -4611686018427387904L;
      this.llIIllililIIllil = -4611686018427387904L;
      this.lIlIlliliIlIllil = -4611686018427387904L;
      this.IllIllillllIllil = -4611686018427387904L;
      this.illIllilIilIllil = -4611686018427387904L;
      this.lilIlliliilIllil = -4611686018427387904L;
      this.iIiIllilIliIllil = Integer.MAX_VALUE;
      this.lliIllililiIllil = Integer.MIN_VALUE;
      this.IiiIllilliiIllil = -4611686018427387904L;
      this.iiiIllilIIIlllil = Integer.MAX_VALUE;
      this.ilIlllilIiIlllil = -4611686018427387904L;
      this.IIllllillIllllil = -4611686018427387904L;
      this.Iillllillillllil = new ArrayDeque<>();

      for (IilliIllilliIl var4 : new IilliIllilliIl[]{this.liIilIiliiIilIil, this.IIlilIillIlilIil, this.iIlilIilIllilIil, this.lllilIilillilIil}) {
         var4.iIlIlllllill(IliIlllilIi<"IliIlllilIi","nDIaaSxjBPbcNVjVBaaZAQf+wwT/bWKf/FsGncalnH+qgQrCn/UcNTFA+iklKg==">());
      }

      for (IilliIllilliIl var20 : new IilliIllilliIl[]{
         this.IililIillililIil,
         this.iililIilIIiilIil,
         this.lIiilIiliIiilIil,
         this.IliilIillliilIil,
         this.iliilIilIiiilIil,
         this.liiilIiliiiilIil,
         this.IIIIiIillIIIiIil,
         this.iIIIiIilIlIIiIil,
         this.llIIiIililIIiIil,
         this.IiIIiIilliIIiIil
      }) {
         var20.iIlIlllllill(IliIlllilIi<"IliIlllilIi","Ig7rEnYnTDBvkQui371iwbQrNcqVCtVWGXVGbAw8bqb5bTC3lwhrlS0=">());
      }

      for (IilliIllilliIl var21 : new IilliIllilliIl[]{
         this.iiIIiIilIIlIiIil, this.lIlIiIiliIlIiIil, this.IllIiIillllIiIil, this.illIiIilIilIiIil, this.lilIiIiliilIiIil, this.IIiIiIillIiIiIil
      }) {
         var21.iIlIlllllill(IliIlllilIi<"IliIlllilIi","35d3pNPuO79Mh5EDWb1KgecIRVjIbRiNuf5JYbjamxpKbnimZw==">());
      }

      for (IilliIllilliIl var22 : new IilliIllilliIl[]{
         this.iIiIiIilIliIiIil,
         this.lliIiIililiIiIil,
         this.IiiIiIilliiIiIil,
         this.iiiIiIilIIIliIil,
         this.lIIliIiliIIliIil,
         this.IlIliIilllIliIil,
         this.ilIliIilIiIliIil
      }) {
         var22.iIlIlllllill(IliIlllilIi<"IliIlllilIi","/xM3bVjK112KIJsNBcCOo5SeXrhcrRMdCctOSVs6zdR+fEnfBMkDUhVPZkTO">());
      }

      for (IilliIllilliIl var23 : new IilliIllilliIl[]{this.liIliIiliiIliIil, this.IIlliIillIlliIil, this.iIlliIilIllliIil, this.lllliIilillliIil}) {
         var23.iIlIlllllill(IliIlllilIi<"IliIlllilIi","0R47IY19m8A9rGYDtIDITygOjDMTkr56FhY50sdH0G/a6RMfq1QOTmZBTiUE3Q==">());
      }

      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.iiillIilIIIilIil,
            this.lIIilIiliIIilIil,
            this.IlIilIilllIilIil,
            this.ilIilIilIiIilIil,
            this.liIilIiliiIilIil,
            this.IIlilIillIlilIil,
            this.iIlilIilIllilIil,
            this.lllilIilillilIil,
            this.IililIillililIil,
            this.iililIilIIiilIil,
            this.lIiilIiliIiilIil,
            this.IliilIillliilIil,
            this.iliilIilIiiilIil,
            this.liiilIiliiiilIil,
            this.IIIIiIillIIIiIil,
            this.iIIIiIilIlIIiIil,
            this.llIIiIililIIiIil,
            this.IiIIiIilliIIiIil,
            this.iiIIiIilIIlIiIil,
            this.lIlIiIiliIlIiIil,
            this.IllIiIillllIiIil,
            this.illIiIilIilIiIil,
            this.lilIiIiliilIiIil,
            this.IIiIiIillIiIiIil,
            this.iIiIiIilIliIiIil,
            this.lliIiIililiIiIil,
            this.IiiIiIilliiIiIil,
            this.iiiIiIilIIIliIil,
            this.lIIliIiliIIliIil,
            this.IlIliIilllIliIil,
            this.ilIliIilIiIliIil,
            this.liIliIiliiIliIil,
            this.IIlliIillIlliIil,
            this.iIlliIilIllliIil,
            this.lllliIilillliIil
         }
      );

      for (IilliIllilliIl var24 : new IilliIllilliIl[]{
         this.IililIillililIil,
         this.iililIilIIiilIil,
         this.lIiilIiliIiilIil,
         this.IliilIillliilIil,
         this.iliilIilIiiilIil,
         this.liiilIiliiiilIil,
         this.IIIIiIillIIIiIil,
         this.iIIIiIilIlIIiIil,
         this.llIIiIililIIiIil,
         this.liIliIiliiIliIil,
         this.IIlliIillIlliIil,
         this.iIlliIilIllliIil,
         this.lllliIilillliIil
      }) {
         var24.lIiiIiIlilli();
      }

      this.IliliIillliliIil.iIlIlllllill(this::iiIIIlIIlIIl);
   }

   private iIIIIIIlIlIIIIIl IIIlilIIli() {
      if (this.IlIlllilllIlllil != null && this.IliiIlillliiIlil >= this.ilIlllilIiIlllil && Iiiilllliiilll.field_1687 != null) {
         IlIiiIIillIiiIIi var1 = this.IlIlllilllIlllil;
         this.IlIlllilllIlllil = null;
         class_1542 var2 = this.iIIliIlIli(var1);
         if (var2 == null) {
            this.liIllliliiIlllil = 0;
            return null;
         } else if (this.iIiIiIilIliIiIil.Iilllilliill() && ++this.liIllliliiIlllil <= (~-1895770373 * 19 * -43 ^ 1638799934)) {
            iIIIIIIlIlIIIIIl var3 = new iIIIIIIlIlIIIIIl();
            var3.lilIIiIlIl = llliilililliilil.iIllllllil;
            var3.liiIIiIlIl = var2.method_5628();
            var3.iliIIiIlIl = var1;
            var3.iIIlIiIlIl = IliIlllilIi<"IliIlllilIi","Xf+yIzD75eXob7u3PqkPib6AwkJ5JPrSnIpIGPZkYhetWKfaLkTsT2uMaNTVMwOSSw==">();
            return var3;
         } else {
            this.liIllliliiIlllil = 0;
            this.lIIiiiIIii(
               IliIlllilIi<"IliIlllilIi","2zLRIGT9dt13OlAuAr+9m3ZbRfIEEHDt6P4Ds7sv/fPFPA==">() + var1.IlIlllIlilIl(),
               IliIlllilIi<"IliIlllilIi","2ewlrHTRB610DraAGKwTQ+9hiY1GgUnbvwpRyQ6ueyEWyMcZEOzVduCuYZ3/lsz/tULTkYIv/jmqA1yDo/i+WQAnW1k=">()
                  + var1.liiiIIllIl().method_23854()
                  + IliIlllilIi<"IliIlllilIi","+voZmcoB2n1LCKWjhFNFKUs41MOcJVT0D1EncZJ7PocHmCjBCi7/FY573nCJsJEkapu1Wf4cwPTXbtRPCYEZMj+w2g4VAhBjXycZ/gBvA/NxsumwXS0R/trRnxcyqpEjl6q5BeySy2twa8CeQawob+ro3PzAOg==">(),
               false,
               -4907319584225082925L ^ -4907319584225077597L
            );
            return null;
         }
      } else {
         return null;
      }
   }

   private IiIlIIiliIlIIi lIlllliIllll(lilIiIiliilIiIil vi) {
      String var2 = lIIllilliIIllill.lIiiIiIlilli(vi.ililillIil);

      for (lIllIilliIllIill var4 : vi.lIIiillIil) {
         if (var4.IlIiIilill && var4.llIiIilill != null) {
            String var5 = IliiiiIilliiiiIi.lIiiIiIlilli(var4.llIiIilill);
            if (IliiiiIilliiiiIi.liiiIIllIl(var5) != null) {
               IiIlIIiliIlIIi var6 = IiIlIIiliIlIIi.IliIlllilIi(var5, Math.max(1, var4.IiIiIilill), 80, false);
               var6.llIiiIiliilIiiIili = var2;
               return var6;
            }
         }
      }

      for (lIllIilliIllIill var9 : vi.lIIiillIil) {
         if (IiiIlliiIl.iliIiiliiiii(var9.lIilIilill)) {
            return Illlllllllll(var9, var2);
         }
      }

      for (lIllIilliIllIill var10 : vi.lIIiillIil) {
         if (var10.iIIiIilill && var10.illlIilill != null) {
            String var11 = IiiIlliiIl.IlIlllIlilIl(var10.illlIilill);
            if (IiiIlliiIl.iIlIlllllill(var11) != null) {
               return IiIlIIiliIlIIi.liiiIIllIl(var2, var11, 60);
            }
         }
      }

      return null;
   }

   private IiIlIIiliIlIIi iliiiIiiii() {
      this.ililiIilIiiliIil.liiliIiliiiiliIili = true;
      this.ililiIilIiiliIil.IIIiiIililIIiiIili = llIlIlIlilIlIlIl.iilIliilIl;
      this.ililiIilIiiliIil.iIIiiIiliIlIiiIili = ililIlIiilIl.iliIIillIiiIIill;
      this.ililiIilIiiliIil.llIiiIiliilIiiIili = this.lIlIiIiliIlIiIil.Iilllilliill();
      this.ililiIilIiiliIil.lIliiIiliiIliiIili = this.IllIiIillllIiIil.Iilllilliill();
      this.ililiIilIiiliIil.illiiIiliIiliiIili = (-406472845 + -111 ^ -125) * -1643291835 ^ 1079544159;
      this.ililiIilIiiliIil.liliiIiliiiliiIili = 0;
      return this.ililiIilIiiliIil;
   }

   private boolean illiIlIiliIl() {
      return Iiiilllliiilll.field_1755 instanceof class_492 && Iiiilllliiilll.field_1724.field_7512 instanceof class_1728;
   }

   private boolean iIlIllIllIll() {
      return Iiiilllliiilll.field_1690.field_1894.method_1434()
         || Iiiilllliiilll.field_1690.field_1881.method_1434()
         || Iiiilllliiilll.field_1690.field_1913.method_1434()
         || Iiiilllliiilll.field_1690.field_1849.method_1434()
         || Iiiilllliiilll.field_1690.field_1903.method_1434();
   }

   private boolean liIlIliiIlIl(IiIlIIiliIlIIi s, class_1799 t) {
      if (s != null && s.liiliIiliiiiliIili && s.IIIiiIililIIiiIili == llIlIlIlilIlIlIl.IilIliilIl) {
         return switch (s.iIIiiIiliIlIiiIili) {
            case IliIIilllliIIill -> llIIiliilIIili.IilliliilIIi(t, s.IiIiiIililiIiiIili, Math.max(1, s.iiIiiIiliIIliiIili));
            case liiIIilliiiIIill -> {
               class_1792 var3 = IiiIlliiIl.iIlIlllllill(s.lIliiIiliiIliiIili);
               yield var3 != null && t.method_31574(var3);
            }
            case iliIIillIiiIIill -> false;
         };
      } else {
         return false;
      }
   }

   private boolean iiIIIlIIlIIl(class_1799 s) {
      long var4 = 537610301628450869L;
      if (!this.lIlIIliIlIIl(s)) {
         return false;
      } else {
         IliIlIllliIlIl var2 = this.IllIIllllIIl(s);
         if (var2 == null) {
            return true;
         } else {
            var4 ^= ((long)this.iIiIIlIliIIl(var2) << 32 ^ var4) & -1L << 32;
            return (int)(var4 >>> 32) <= 0 || s.method_7947() <= this.illIIlIilIIl(var2.IliIllIlllliIllIll) - (int)(var4 >>> 32);
         }
      }
   }

   private void iliIiIiiIi() {
      iIIIIIIlIlIIIIIl var1 = this.Iillllillillllil.peek();
      if (var1 != null && this.liliIliiliIl()) {
         boolean var2 = var1.lilIIiIlIl == llliilililliilil.IIllllllil && this.IliiIlillliiIlil - this.IiiIllilliiIllil <= 40L;
         if (this.IliIlllliIll() > (long)(var2 ? 2400 : 300)) {
            this.IiiiIlliiiIl();
            this.lIIIlliIIIll();
            this.lliliilili();
            this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
         } else if (this.IliiIlillliiIlil - this.illIllilIilIllil >= 4L) {
            if (this.IliiIlillliiIlil - this.lilIlliliilIllil >= 2L) {
               if (var1.lilIIiIlIl == llliilililliilil.IIllllllil) {
                  int var5 = this.Illlilllli();
                  if (this.iIiIllilIliIllil != Integer.MAX_VALUE && var5 < this.iIiIllilIliIllil) {
                     this.IIiIllillIiIllil = this.IIiIllillIiIllil + (this.iIiIllilIliIllil - var5);
                     this.IiiIllilliiIllil = this.IliiIlillliiIlil;
                     if (var1.iliIIiIlIl != null) {
                        var1.iliIIiIlIl.IliIlllilIi(false, this.IliiIlillliiIlil);
                     }
                  }

                  if (var5 == 0) {
                     if (var1.iliIIiIlIl != null) {
                        var1.iliIIiIlIl.IliIlllilIi(false, this.IliiIlillliiIlil);
                     }

                     this.IiiiIlliiiIl();
                     this.lIIIlliIIIll();
                     this.lliliilili();
                     this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
                  } else if (var5 >= this.iIiIllilIliIllil) {
                     if (this.IliiIlillliiIlil - this.IiiIllilliiIllil < 40L) {
                        if (this.IliiIlillliiIlil - this.lilIlliliilIllil >= 4L) {
                           int var8 = this.iiIiIlIIliIl(this::iiIIIlIIlIIl);
                           if (var8 >= 0) {
                              this.IlliIlllliIl(var8);
                              this.lilIlliliilIllil = this.IliiIlillliiIlil;
                           }
                        }
                     } else {
                        if (var1.iliIIiIlIl != null) {
                           this.iiIliIIlli(var1.iliIIiIlIl);
                        }

                        this.IiiiIlliiiIl();
                        this.lIIIlliIIIll();
                        this.lliliilili();
                        this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
                     }
                  } else {
                     this.iIiIllilIliIllil = var5;
                     int var7 = this.iiIiIlIIliIl(this::iiIIIlIIlIIl);
                     if (var7 >= 0) {
                        this.IlliIlllliIl(var7);
                        this.lilIlliliilIllil = this.IliiIlillliiIlil;
                     }
                  }
               } else if (var1.lilIIiIlIl == llliilililliilil.lIllllllil) {
                  int var3 = this.IiIIIlliIIIl(var1.iIiIIiIlIl);
                  if (var3 >= var1.IliIIiIlIl) {
                     this.lliiiIililiiiIil.remove(var1.iIiIIiIlIl);
                     this.IiiiIlliiiIl();
                     this.lIIIlliIIIll();
                     this.lliliilili();
                     this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
                  } else if (var3 <= this.lliIllililiIllil) {
                     this.lliiiIililiiiIil.remove(var1.iIiIIiIlIl);
                     this.IiiiIlliiiIl();
                     this.lIIIlliIIIll();
                     iIIIIIIlIlIIIIIl var6 = this.iIllIlIlllIl()
                        ? this.iillIlIIilIl(IliIlllilIi<"IliIlllilIi","KwezrveqfEQ1fFvisddKKDDQPioWTecNpa77doMFqfhBeoK0BA==">())
                        : null;
                     if (var6 != null) {
                        this.Iillllillillllil.push(var6);
                     } else {
                        this.lliliilili();
                     }

                     this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
                  } else {
                     this.lliIllililiIllil = var3;
                     int var4 = this.lIliIliIliIl(g -> g.method_31574(var1.iIiIIiIlIl));
                     if (var4 >= 0) {
                        this.IlliIlllliIl(var4);
                        this.IIiIllillIiIllil++;
                        this.lilIlliliilIllil = this.IliiIlillliiIlil;
                     } else {
                        if (this.IIiIllillIiIllil > 0) {
                           this.lliiiIililiiiIil.remove(var1.iIiIIiIlIl);
                        } else {
                           this.lliiiIililiiiIil.put(var1.iIiIIiIlIl, this.IliiIlillliiIlil + (long)(var1.iIiIIiIlIl == class_1802.field_8687 ? 200 : 600));
                        }

                        this.IiiiIlliiiIl();
                        this.lIIIlliIIIll();
                        this.lliliilili();
                        this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
                     }
                  }
               } else {
                  this.IiiiIlliiiIl();
                  this.lIIIlliIIIll();
                  this.lliliilili();
                  this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
               }
            }
         }
      } else {
         this.IiiiIlliiiIl();
         this.lIIIlliIIIll();
         this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
      }
   }

   private boolean iIliiIllii() {
      return this.iiIIiIilIIlIiIil.Iilllilliill()
         && !this.iiillIilIIIilIil.Iilllilliill().equals(IliIlllilIi<"IliIlllilIi","S0XASiZa+o6Y4u8CftcZWvBlFnufMdy0ByiAlZwZkeaImUW2">());
   }

   @Override
   public void iIiIlIliIl(JsonElement element) {
      this.liiliIiliiiliIil.clear();
      this.IIIiiIillIIiiIil.clear();
      if (element instanceof JsonObject var2) {
         try {
            if (var2.has(IliIlllilIi<"IliIlllilIi","2xymHMOkbCJwDogzvMMvVFmAQsT+GeQQIjAHBP5htPzFR9w=">())) {
               for (JsonElement var4 : var2.getAsJsonArray(IliIlllilIi<"IliIlllilIi","2xymHMOkbCJwDogzvMMvVFmAQsT+GeQQIjAHBP5htPzFR9w=">())) {
                  if (var4.isJsonObject()) {
                     this.liiliIiliiiliIil.add(IiIlIIiliIlIIi.Ililllililil(var4.getAsJsonObject()));
                  }
               }
            }

            if (var2.has(IliIlllilIi<"IliIlllilIi","a2lLZ9Q+FEoP7siQhPUlhT5/SF0gu2vHv699u48Ff132asjR">())) {
               for (JsonElement var8 : var2.getAsJsonArray(IliIlllilIi<"IliIlllilIi","a2lLZ9Q+FEoP7siQhPUlhT5/SF0gu2vHv699u48Ff132asjR">())) {
                  if (var8.isJsonObject()) {
                     this.IIIiiIillIIiiIil.add(IlIiiIIillIiiIIi.IIlllIlliIll(var8.getAsJsonObject()));
                  }
               }
            }
         } catch (Exception var5) {
         }

         if (!var2.has(IliIlllilIi<"IliIlllilIi","8cg3wIItMOdMAzs0xLrzhMpx6y7Jn0rh79QTXaQ=">())) {
            IiIlIIiliIlIIi var7 = this.Iliiilliii();
            if (this.lIIilliIIill(var7) < 0) {
               this.liiliIiliiiliIil.add(0, var7);
            }

            this.liiliIiliiiliIil.sort((b, a) -> Integer.compare(a.illiiIiliIiliiIili, b.illiiIiliIiliiIili));
            if (this.ilIliIilIiIliIil.Iilllilliill() < 600) {
               this.ilIliIilIiIliIil.IIillIiliIil(600);
            }
         }

         this.iIlillIllill();
      }
   }

   private boolean ilillIiill(class_2338 p) {
      class_2680 var2 = Iiiilllliiilll.field_1687.method_8320(p);
      return !var2.method_26215() && var2.method_26234(Iiiilllliiilll.field_1687, p);
   }

   private boolean lilllliillll(class_2338 pos) {
      class_2586 var2 = Iiiilllliiilll.field_1687.method_8321(pos);
      return var2 instanceof class_2621 || var2 instanceof class_2611;
   }

   private boolean lIIlIliIIlIl() {
      if (Iiiilllliiilll.field_1724 == null) {
         return false;
      } else {
         class_1661 var1 = Iiiilllliiilll.field_1724.method_31548();

         for (int var2 = 0; var2 <= 35; var2++) {
            class_1799 var3 = var1.method_5438(var2);
            if (this.lIlIIliIlIIl(var3) && !this.iiIIIlIIlIIl(var3)) {
               return true;
            }
         }

         return false;
      }
   }

   private void iIiilIliil(iIIIIIIlIlIIIIIl g) {
      this.IiiiIlliiiIl();
      this.IliliIillliliIil.Illlllllilll();
      this.lIIIlliIIIll();
      this.lliililiil(g, this.IliliIillliliIil.IIIllIIliIIl());
   }

   private boolean IlIiillIii(class_1792 item) {
      Long var2 = this.lliiiIililiiiIil.get(item);
      return var2 != null && this.IliiIlillliiIlil < var2;
   }

   private void lilliiilli() {
      this.IiiiIlliiiIl();
      this.IliliIillliliIil.Illlllllilll();
      this.iilliIilIIiliIil.iIlIlllllill();
      this.lIIIlliIIIll();
      if (this.IliIlllliIll() >= (long)this.lIIliIiliIIliIil.Iilllilliill()) {
         iIIIIIIlIlIIIIIl var1 = this.Iillllillillllil.peek();
         if (var1 != null && var1.iiiIIiIlIl >= 2) {
            this.iIiliIlili(var1);
         }

         this.lIiIlliIiIll(IIIIllIllIIIllIl.iIilllIiIl);
      }
   }

   private IlIiiIIillIiiIIi IiIiIlliIiIl() {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         String var1 = Iiiilllliiilll.field_1687.method_27983().method_29177().toString();
         IlIiiIIillIiiIIi var2 = null;
         double var3 = Double.MAX_VALUE;

         for (IlIiiIIillIiiIIi var6 : this.IIIiiIillIIiiIil) {
            if (var6.IilliliilIIi(var1)
               && var6.lIiiIiIlilli()
               && this.llIiIlilIiIl(var6)
               && (!var6.IiIiIiiiil || this.IliiIlillliiIlil - var6.liIiIiiiil >= 200L)) {
               double var7 = var6.iIlIlllllill().method_1025(Iiiilllliiilll.field_1724.method_33571());
               if (var7 < var3) {
                  var3 = var7;
                  var2 = var6;
               }
            }
         }

         return var2;
      } else {
         return null;
      }
   }

   public void IllIillllIil() {
      if (this.iiIIllilIIlIllil && !Iiiilllliiilll.field_1690.field_1904.method_1434()) {
         this.iiIIllilIIlIllil = false;
      }

      if (this.iliIIlilIiiIIlil && System.currentTimeMillis() - this.liiIIliliiiIIlil > 5000L) {
         this.iliIIlilIiiIIlil = false;
      }

      if (this.iliIIlilIiiIIlil && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1755 == null) {
         this.iliIIlilIiiIIlil = false;
         iIIiIIIlIlIiIIIl.IIllllIlll(this);
      } else if (this.lllIIlilillIIlil != iIlIIiIllIIi.iiIIiliiIIlIilii) {
         if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
            long var1 = System.currentTimeMillis();
            boolean var3 = Iiiilllliiilll.field_1755 instanceof class_492 && Iiiilllliiilll.field_1724.field_7512 instanceof class_1728;
            if (!var3 && var1 - this.iilIIlilIIiIIlil > 120000L) {
               this.iiIIilIIlIil(
                  IliIlllilIi<"IliIlllilIi","r5O0gAeWp6PLf3cSIBdwGoHwqzcChybc6zNAL1Ta7NR/G4F4wzsjCt/k1VGog97aEdm0EJ2U/G2/sUDNq4uhGorYL+tRnBMDSfQyUYcWyjn+dTGp8nQ1og==">()
               );
            } else if (this.lllIIlilillIIlil == iIlIIiIllIIi.lIlIiliiiIlIilii) {
               if (!var3) {
                  this.lIiIIliliIiIIlil = 0L;
               } else {
                  if (Iiiilllliiilll.field_1765 instanceof class_3966 var4 && var4.method_17782() instanceof class_3988 var5 && !(var5 instanceof class_1646)) {
                     Iiiilllliiilll.field_1724.method_7346();
                     this.lIlIiliIlIil(
                        IliIlllilIi<"IliIlllilIi","9LAsJHnfghTs3ucNmrVg9MroH1XNuay3MeDNmbmrNj9xAC+EONR59KrV/d+LeFW3JA0tBhA74TYPnX2UG9xXH9gmcpBmF4yUy4RwKDgMR3dFEyvl">()
                     );
                     this.lIiIIliliIiIIlil = 0L;
                     return;
                  }

                  if (this.lIiIIliliIiIIlil == 0L) {
                     this.lIiIIliliIiIIlil = var1;
                  }

                  class_1916 var9 = ((class_1728)Iiiilllliiilll.field_1724.field_7512).method_17438();
                  if (!var9.isEmpty() || var1 - this.lIiIIliliIiIIlil >= 2500L) {
                     ArrayList var10 = new ArrayList();

                     for (int var12 = 0; var12 < var9.size(); var12++) {
                        if (var9.get(var12) != null) {
                           var10.add(lIllIilliIllIill.IliIlllilIi((class_1914)var9.get(var12), var12));
                        }
                     }

                     class_1646 var13 = this.iiIlllIIllll();
                     String var7 = var13 == null
                        ? IliIlllilIi<"IliIlllilIi","8eLOaPqZE7BydGWR1LKg8RIF6F333hVigrcS9aJklQ==">()
                        : lIIllilliIIllill.lIiiIiIlilli(var13.method_7231().comp_3521());
                     int var8 = var13 == null ? 0 : var13.method_7231().comp_3522();
                     this.lllIIlilillIIlil = iIlIIiIllIIi.iiIIiliiIIlIilii;
                     this.lIiIIliliIiIIlil = 0L;
                     Iiiilllliiilll.field_1724.method_7346();
                     iIIiIIIlIlIiIIIl.iIlllIllll(this, var10, var7, var8);
                  }
               }
            }
         } else {
            this.iiIIilIIlIil(null);
         }
      }
   }

   private void iiiilIIIIi() {
      iIIIIIIlIlIIIIIl var1 = this.Iillllillillllil.peek();
      if (var1 == null) {
         this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
      } else {
         IlIiiIIillIiiIIi var2 = var1.iliIIiIlIl;
         if (var2 == null) {
            this.Iillllillillllil.pop();
            this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
         } else if (var2.ilIiIiiiil == IlliliIillliliIi.IillIiiIIi) {
            this.lIIIiiIIIi(var1, var2);
         } else {
            class_243 var3 = var2.iIlIlllllill();
            if (var3.method_1022(Iiiilllliiilll.field_1724.method_33571()) <= 3.4) {
               this.iilliIilIIiliIil.iIlIlllllill();
               this.lIiIlliIiIll(IIIIllIllIIIllIl.iiilllIiIl);
            } else {
               this.iilliIilIIiliIil.IliIlllilIi(this.liIIlliiIIll(var2.liiiIIllIl()), 1.6);
               llIlllilIlll var4 = this.iilliIilIIiliIil.IilliliilIIi();
               this.iIllllilIlllllil = true;
               if (var4 == llIlllilIlll.IilllIIililllIIi) {
                  this.lIiIlliIiIll(IIIIllIllIIIllIl.iiilllIiIl);
               } else if (var4 == llIlllilIlll.iilllIIiIIillIIi || this.IliIlllliIll() > 400L) {
                  this.IIililIili(IliIlllilIi<"IliIlllilIi","jJ8inCChZeZO5Fgqj5hY4Yi99LDyIBxdfOPTtIkfwEisVvQtcUQPnHXflVazZ2o=">());
               }
            }
         }
      }
   }

   private float[] liliiliiliil(float w, float h) {
      class_1041 var3 = Iiiilllliiilll.method_22683();
      float var4 = (float)var3.method_4486();
      double var5 = (double)var3.method_4495();
      int var7 = var3.method_4476(IIililillIililil.iiiIlIIIll(Iiiilllliiilll), Iiiilllliiilll.method_1573());
      float var8 = var5 > 0.0 ? (float)((double)var7 / var5) : 1.0F;
      if (!(var8 > 0.0F)) {
         var8 = 1.0F;
      }

      int var9 = IiIiIIliliIiIIli.iIlllIllll();
      float var10 = var9 > 0 ? (float)var9 + 5.0F : 6.0F;
      float var11 = (var4 / var8 - w / var8) / 2.0F;
      float var12 = IIililillIililil.liIIlliiIIll(
         var11,
         var10,
         w / var8,
         h / var8,
         IliIlllilIi<"IliIlllilIi","mE+vRCLpcoXU5IZT8QkUJX4YHW4imz8iE6oO1RWqkntGFw==">(),
         IliIlllilIi<"IliIlllilIi","4pTukML1MqidN0jCOZlwFNIWI68lqo4OarNJSoOV/dA=">(),
         IliIlllilIi<"IliIlllilIi","14+lY5RTZCRjavIkJDJS5TXeneCQgGJFoQpiY9MMAeom">(),
         IliIlllilIi<"IliIlllilIi","9CT8a30O/cbzn0WLHW9J+rJK6eLHX/c8LxsrMv/qizRy13A=">(),
         IliIlllilIi<"IliIlllilIi","ZVvUnpLfULgjC/XaI/7UXXnq8ezLo03/7v2xsPG7p7sslMw=">()
      );
      return new float[]{Math.max(4.0F, var11 * var8), Math.max(4.0F, var12 * var8)};
   }

   private double IlIIillIIi(IlIiiIIillIiiIIi s) {
      class_243 var2 = this.liIIiiiIIi(s);
      double var3 = Math.hypot(var2.field_1352 - Iiiilllliiilll.field_1724.method_23317(), var2.field_1350 - Iiiilllliiilll.field_1724.method_23321());
      double var5 = var2.field_1351 - (Iiiilllliiilll.field_1724.method_23320() - Double.longBitsToDouble(-4014738099501153559L ^ -604612875617373734L));
      return !this.lllIiillIi(Iiiilllliiilll.field_1724.method_33571(), s)
         ? Double.longBitsToDouble(1715395784025164656L ^ -6323529550831170704L)
         : ilIiiiIiIiIiiiIi.iliIiiliiiii(var3, var5);
   }

   private boolean liilliiill(class_2338 feet) {
      try {
         return IIIlIIIilIIlIIIi.IIlllIlliIll(Iiiilllliiilll.field_1687, feet);
      } catch (Exception var3) {
         return false;
      }
   }

   private void iilllIIill() {
      if (this.illiIlIiliIl()) {
         if (!this.IliliIillliliIil.IilliliilIIi()) {
            IiIlIIiliIlIIi var1 = this.ilIIllIiIIll();
            if (var1 == null) {
               return;
            }

            this.iiiiIlIIIIll();
            this.IliliIillliliIil.liiiIIllIl(var1, this.IiiIiIilliiIiIil.Iilllilliill(), true);
         }

         iIiliIlili var2 = this.IliliIillliliIil.Iilllilliill();
         if (var2 != iIiliIlili.IiiiiIIlliiiiIIl && var2 != iIiliIlili.iiiiiIIlIIIIIlIl) {
            if (var2 == iIiliIlili.IlIIIlIlllIIIlIl
               || var2 == iIiliIlili.ilIIIlIlIiIIIlIl
               || var2 == iIiliIlili.liIIIlIliiIIIlIl
               || var2 == iIiliIlili.lllIIlIlillIIlIl) {
               this.lIIiiiIIii(
                  IliIlllilIi<"IliIlllilIi","Smfpq6ZYNDDLrpAgRhPnM4N8dn6AQDqfAJ1ZkBtxaz+7mNc=">() + var2,
                  IliIlllilIi<"IliIlllilIi","Zrqts/tvYNM7TG8Nv5IQktAdHMpcCz7FBc4KbAkvv0GjNQ+/rYFTekcF0q5ji0KhRg==">()
                     + this.IliliIillliliIil.IiIlliIliiIl()
                     + IliIlllilIi<"IliIlllilIi","ptI4llSJTaW2WYu+fpEmWqKqC6bQm/qHOK5lIN0=">(),
                  false,
                  600L
               );
            }

            this.IliliIillliliIil.Illlllllilll();
            this.lIIIlliIIIll();
         }
      }
   }

   private void ilIIiIiIIi(class_2338 stand) {
      double var2 = (double)stand.method_10263()
         + Double.longBitsToDouble(-43222973008611344L ^ -4573844198143330320L)
         - Iiiilllliiilll.field_1724.method_23317();
      double var4 = (double)stand.method_10260()
         + Double.longBitsToDouble(-6055186364539726490L ^ -7775561422195255962L)
         - Iiiilllliiilll.field_1724.method_23321();
      float var6 = (float)Math.toDegrees(Math.atan2(-var2, var4));
      this.IilliIillilliIil.iIlIlllllill(var6, 25.0F, 0);
      if (Math.abs(class_3532.method_15393(var6 - Iiiilllliiilll.field_1724.method_36454())) < 30.0F) {
         illIilIilIil.IliIlllilIi(Iiiilllliiilll.field_1690.field_1832, true);
         Iiiilllliiilll.field_1690.field_1894.method_23481(true);
      }
   }

   private boolean lIilIliIilIl() {
      return this.IiIIiIilliIIiIil.Iilllilliill() && Iiiilllliiilll.field_1687 != null && this.IIIiIllIIiIl(IlliliIillliliIi.IillIiiIIi);
   }

   private String ilIlilIiIlil(iIIIIIIlIlIIIIIl g) {
      class_1646 var2 = g == null ? null : this.lIiliIiliIiliIil.liiiIIllIl(g.IIiIIiIlIl);
      return var2 != null && Iiiilllliiilll.field_1724 != null
         ? IliIlllilIi<"IliIlllilIi","6tRf5ZZSI/pBnjw2zFxlDCepDpsd23A3ZphDeIq4SaI=">()
            + Math.round(Math.sqrt(var2.method_5858(Iiiilllliiilll.field_1724)))
            + IliIlllilIi<"IliIlllilIi","YnN7tR2xMPWx6ScDBrhtb17KDkUP+TYAnNXdd3E=">()
         : "";
   }

   private boolean llIiIlilIiIl(IlIiiIIillIiiIIi s) {
      if (this.IliiIlillliiIlil < s.iiIiIiiiil) {
         return false;
      } else {
         return !this.iIiIiIilIliIiIil.Iilllilliill() && Iiiilllliiilll.field_1724 != null
            ? s.iIlIlllllill().method_1022(Iiiilllliiilll.field_1724.method_33571()) <= Double.longBitsToDouble(3969643665774193960L ^ 8576263134620790056L)
            : true;
      }
   }

   private iIIIIIIlIlIIIIIl IillIllillIl() {
      if ((this.IIiIiIillIiIiIil.Iilllilliill() || this.lIilIliIilIl()) && this.IliiIlillliiIlil >= this.IllIllillllIllil) {
         if (this.iIllIlIlllIl()
            && this.llllIlilllIl() <= (this.ilIlIlIiIlIl() ? 1 : (547020068 * 1594008481 << 27 | 547020068 * 1594008481 >>> 5) ^ 563337211)) {
            iIIIIIIlIlIIIIIl var1 = this.iillIlIIilIl(IliIlllilIi<"IliIlllilIi","ENW0LqMa3Cp9sc3ND4FnrbRbOHqyM2yMbyRPEjDmsZhyvfabAx68UjxYvg==">());
            if (var1 == null) {
               return null;
            } else {
               this.IllIllillllIllil = this.IliiIlillliiIlil + (1965213898773598733L ^ 1965213898773598825L);
               return var1;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private void lIilliIill() {
      iIIIIIIlIlIIIIIl var1 = this.Iillllillillllil.peek();
      if (var1 == null) {
         this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
      } else {
         class_1646 var2 = this.lIiliIiliIiliIil.liiiIIllIl(var1.IIiIIiIlIl);
         if (var2 == null) {
            this.Iiililiili(var1);
         } else {
            class_243 var3 = var2.method_33571();
            double var4 = var3.method_1022(Iiiilllliiilll.field_1724.method_33571());
            class_2338 var6 = this.Ilillllill(var2);
            if (var6 == null) {
               if (var4 <= 3.0) {
                  this.iilliIilIIiliIil.iIlIlllllill();
                  this.lIiIlliIiIll(IIIIllIllIIIllIl.ililllIiIl);
                  return;
               }
            } else if (this.iIIilIlIil(var6, 0.65) && var4 <= 3.0) {
               this.iilliIilIIiliIil.iIlIlllllill();
               this.lIiIlliIiIll(IIIIllIllIIIllIl.ililllIiIl);
               return;
            }

            class_2338 var7 = var6 != null ? var6 : this.liIIlliiIIll(var2.method_24515());
            this.iilliIilIIiliIil.IliIlllilIi(var7, var6 != null ? 0.6 : 1.2);
            llIlllilIlll var8 = this.iilliIilIIiliIil.IilliliilIIi();
            this.iIllllilIlllllil = true;
            if (var8 != llIlllilIlll.IilllIIililllIIi && (var6 != null || !(var4 <= 3.0))) {
               if (var8 == llIlllilIlll.iilllIIiIIillIIi || this.IliIlllliIll() > 400L) {
                  this.IIililIili(IliIlllilIi<"IliIlllilIi","IPbNxmMlQxVTRkit1zPW+BloQR9Zq4ovCHQscac4wtlBQ8bZ4pkZ8zKmM5U=">());
               }
            } else {
               this.iilliIilIIiliIil.iIlIlllllill();
               this.lIiIlliIiIll(IIIIllIllIIIllIl.ililllIiIl);
            }
         }
      }
   }

   private String IIllillIllil(iIIIIIIlIlIIIIIl g) {
      if (g == null) {
         return IliIlllilIi<"IliIlllilIi","uW7pyK8E1q4s9ZqwZ61zhfYd5KCnCTXydiqFvnJv74Gs14nQDAwJiCE=">();
      } else if (g.lilIIiIlIl != llliilililliilil.IIllllllil) {
         if (g.lilIIiIlIl == llliilililliilil.lIllllllil) {
            return g.iIiIIiIlIl == class_1802.field_8687
               ? IliIlllilIi<"IliIlllilIi","tmZOFBA265v2m9YDOT3/7oncWi67CCTKW2po9g02mj1+CnjPOh3tTfdtfZrwI0U09fuB+bBFgRSgVwjzDLP5o5+i">()
               : IliIlllilIi<"IliIlllilIi","X8vuP+5x59YRmMhr0R+bTLFFfkODVRi2TxZBTQJMHOpgK24=">()
                  + IiiIlliiIl.IlIlllIlilIl(g.iIiIIiIlIl)
                  + IliIlllilIi<"IliIlllilIi","I0mESV02Y9whtT+AKxFJ68hhmS31WEvxpAJtsHomJevQTFbYurVXgxva8JqhZs8N9xYJ5g==">();
         } else {
            return IliIlllilIi<"IliIlllilIi","uW7pyK8E1q4s9ZqwZ61zhfYd5KCnCTXydiqFvnJv74Gs14nQDAwJiCE=">();
         }
      } else {
         return g.iliIIiIlIl != null && g.iliIIiIlIl.ilIiIiiiil == IlliliIillliliIi.IillIiiIIi
            ? IliIlllilIi<"IliIlllilIi","d2vxmcOilKkVMXmfpIkknIYNCLM5od2nSCupcp5yLEm0q6mT9jjtly7MJIxrjSP6qyvlYFuF0xay">()
            : IliIlllilIi<"IliIlllilIi","i+1CFyC4yr1am/5D5218QzaZJXHNyP8yqzja0ROOFlwscvXy/zszzoTI62hghsBoRHwni460sz3MMYyJtg==">();
      }
   }

   private boolean Iillillillil(IlIiiIIillIiiIIi s) {
      return s.IiIiIiiiil && this.IliiIlillliiIlil - s.liIiIiiiil < (-4055947630680254892L ^ -4055947630680254820L);
   }

   private String Iiilllliilll(class_2338 pos, IlliliIillliliIi role) {
      String var3 = this.iIilllIlilll();
      class_2338 var4 = iIIiiIlIlIiiIl.lIiiIiIlilli(pos);
      IlIiiIIillIiiIIi var5 = null;

      for (IlIiiIIillIiiIIi var7 : this.IIIiiIillIIiiIil) {
         if (var7.IilliliilIIi(var3) && (llilllililll(var7, pos) || var4 != null && llilllililll(var7, var4))) {
            var5 = var7;
            break;
         }
      }

      String var8 = iIIiiIlIlIiiIl.liiiIIllIl(role);
      if (var5 != null && var5.ilIiIiiiil == role) {
         return IliIlllilIi<"IliIlllilIi","/ch3IdDVAzKOM+2EG32ZAoQD7BkxgbJ7aW47ycw3z6EWDNVc8BJXY3JURj6iSvDy">()
            + var8.toLowerCase(Locale.ROOT)
            + IliIlllilIi<"IliIlllilIi","ptI4llSJTaW2WYu+fpEmWqKqC6bQm/qHOK5lIN0=">();
      } else {
         if (role == IlliliIillliliIi.IillIiiIIi) {
            this.IIIiiIillIIiiIil.removeIf(s -> s.ilIiIiiiil == IlliliIillliliIi.IillIiiIIi && s.IilliliilIIi(var3));
         }

         if (var5 != null) {
            this.IIIiiIillIIiiIil.remove(var5);
         }

         this.IIIiiIillIIiiIil.add(new IlIiiIIillIiiIIi(pos, var3, role));
         if (var5 != null && var5.ilIiIiiiil == IlliliIillliliIi.IillIiiIIi) {
            this.liiilliiiill();
         }

         iiiIIIlIIIlIIl.IilliliilIIi();
         return var5 != null
            ? IliIlllilIi<"IliIlllilIi","cFWTfinlzbyGFaQTIaT7kR6zSkbcnzcdh4ZKP+v/jSbvXMxsuqqds69r20RZ/HI=">()
               + var8.toLowerCase(Locale.ROOT)
               + IliIlllilIi<"IliIlllilIi","ptI4llSJTaW2WYu+fpEmWqKqC6bQm/qHOK5lIN0=">()
            : IliIlllilIi<"IliIlllilIi","F4a09+opHR6SZSvax1jIoZgP2dYxgL2RDGX/xvqXYuQJ418Ir+IBvQ==">()
               + var8.toLowerCase(Locale.ROOT)
               + IliIlllilIi<"IliIlllilIi","ptI4llSJTaW2WYu+fpEmWqKqC6bQm/qHOK5lIN0=">();
      }
   }

   private int Illlilllli() {
      if (Iiiilllliiilll.field_1724 == null) {
         return 0;
      } else {
         class_1661 var1 = Iiiilllliiilll.field_1724.method_31548();
         int var2 = 0;

         for (int var3 = 0; var3 <= 35; var3++) {
            if (this.iiIIIlIIlIIl(var1.method_5438(var3))) {
               var2++;
            }
         }

         return var2;
      }
   }

   private void IiiiIlliiiIl() {
      if (Iiiilllliiilll.field_1724 != null) {
         if (Iiiilllliiilll.field_1755 instanceof class_490) {
            if (this.lIiiIliliIiiIlil == IIIIllIllIIIllIl.lIIillIiIl && this.IiIIllilliIIllil != null && Iiiilllliiilll.field_1755 == this.IiIIllilliIIllil) {
               Iiiilllliiilll.field_1724.method_7346();
            }
         } else {
            if (Iiiilllliiilll.field_1755 instanceof class_465) {
               Iiiilllliiilll.field_1724.method_7346();
            }
         }
      }
   }

   private String iIilllIlilll() {
      return Iiiilllliiilll.field_1687 == null ? "" : Iiiilllliiilll.field_1687.method_27983().method_29177().toString();
   }

   private void illlllIillll() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1765 instanceof class_3965 var1 && var1.method_17783() == class_240.field_1332) {
         String var3 = this.lllliIilillliIil.Iilllilliill();

         IlliliIillliliIi var5 = switch (var3) {
            case IliIlllilIi<"IliIlllilIi","rZT+FNDai1a8bAsWJhVZLw0f4y3U9uwhtYcE5aS6VuDEvyr3RA==">() -> IlliliIillliliIi.iIllIiiIIi;
            case IliIlllilIi<"IliIlllilIi","nH7ZqxhJRMGuOi8JUtfBb1sNjh4+CDRdmryr9LvME8+yzEs=">() -> IlliliIillliliIi.IlllIiiIIi;
            case IliIlllilIi<"IliIlllilIi","d+LBfMxs4jV366HpkpezWYBfsBpsQhLVWuPd0xH/fyGr+6HQ">() -> IlliliIillliliIi.llllIiiIIi;
            case IliIlllilIi<"IliIlllilIi","NmQP9xb+saQy7QWLAz4aqPPHZSv2VwGVQO0TlJ8zHN1xP5zh5A==">() -> IlliliIillliliIi.IillIiiIIi;
            default -> IlliliIillliliIi.illlIiiIIi;
         };
         if (var5 != IlliliIillliliIi.IillIiiIIi && !this.lilllliillll(var1.method_17777())) {
            this.iIIlllIlIlll(
               IliIlllilIi<"IliIlllilIi","16XehtoSIbFIXclilHd6Epf0lmrBz63nMaYJ7qq2h2+E80v9Nr2hPxFPOVm/ahF0Pyg/0GJeguC7YVZe/rPCl6i1zWuv5v/QInsQEm0+/kc+L9tGcoYpSykfIFjRmg==">(),
               false
            );
         } else {
            this.iIIlllIlIlll(this.Iiilllliilll(var1.method_17777(), var5), true);
         }
      } else {
         this.iIIlllIlIlll(
            IliIlllilIi<"IliIlllilIi","XjvnvT2QdDapVzXzx5JAhjSayzIpcwIfTcg+PKdwnvAPAZn9tXL7c4C+oSs+lPTmxxzHZfFkcldSJoaN6iY0bTlZPgYnSI73B+W3eoMq25lHv7rzTXE2bQ==">(),
            false
         );
      }
   }

   private static String lIIliliIIlil(String s) {
      return s.endsWith(IliIlllilIi<"IliIlllilIi","ptI4llSJTaW2WYu+fpEmWqKqC6bQm/qHOK5lIN0=">()) ? s.substring(0, s.length() - 1) : s;
   }

   private class_3965 IliIilliIi(class_2338 site) {
      class_243 var2 = Iiiilllliiilll.field_1724.method_33571();
      class_243 var3 = ilIiiIiIii.Iiilliiliiil(Iiiilllliiilll.field_1724.method_36454(), Iiiilllliiilll.field_1724.method_36455());
      class_243 var4 = var2.method_1019(var3.method_1021(Double.longBitsToDouble(7808584545224536763L ^ 3191269027262935739L)));
      class_3965 var5 = Iiiilllliiilll.field_1687
         .method_17742(new class_3959(var2, var4, class_3960.field_17559, class_242.field_1348, Iiiilllliiilll.field_1724));
      if (var5 instanceof class_3965 var6
         && var5.method_17783() == class_240.field_1332
         && var6.method_17777().method_19455(site) <= (-(~133158996) ^ 133158996)) {
         return var6;
      }

      class_243 var9 = class_243.method_24953(site);
      class_2350 var7 = class_2350.method_10142(var2.field_1352 - var9.field_1352, var2.field_1351 - var9.field_1351, var2.field_1350 - var9.field_1350);
      class_243 var8 = var9.method_1019(
         new class_243(
            (double)var7.method_10148() * Double.longBitsToDouble(-6408581647273869090L ^ -7426395163059601186L),
            (double)var7.method_10164() * Double.longBitsToDouble(154049736385732617L ^ 4450483780897185801L),
            (double)var7.method_10165() * Double.longBitsToDouble(-415236388378239200L ^ -4189252876114714848L)
         )
      );
      return new class_3965(var8, var7, site, false);
   }

   private iIIIIIIlIlIIIIIl lllllillll() {
      List var1 = this.lIiliIiliIiliIil.iliIiiliiiii();
      List var2 = this.liIiiiiIii();

      for (IiIlIIiliIlIIi var4 : var2) {
         List var5 = IIilIlIllIilIlIl.iliIiiliiiii(var1, var4, this::iIlllIllll);
         if (!var5.isEmpty()) {
            liIlIiiliiIlIiil var6 = IIilIlIllIilIlIl.IIIllIIliIIl(var5, this.Iiliililii(), this.IIlIlllIlIll(), this.iillllilIIilllil++);
            if (var6 != null) {
               iIIIIIIlIlIIIIIl var7 = new iIIIIIIlIlIIIIIl();
               var7.lilIIiIlIl = var4.IIIiiIililIIiiIili == llIlIlIlilIlIlIl.iilIliilIl ? llliilililliilil.liIlllllil : llliilililliilil.IiIlllllil;
               var7.iilIIiIlIl = var4;
               var7.IIiIIiIlIl = var6.IliIlllilIi().lIilillIil;
               var7.iIIlIiIlIl = var4.Illlllllilll();
               return var7;
            }
         }
      }

      for (IiIlIIiliIlIIi var10 : var2) {
         lilIiIiliilIiIil var12 = this.Iillllilll(var10, var1);
         if (var12 != null) {
            var12.liIiillIil = this.IliiIlillliiIlil;
            iIIIIIIlIlIIIIIl var14 = new iIIIIIIlIlIIIIIl();
            var14.lilIIiIlIl = var10.IIIiiIililIIiiIili == llIlIlIlilIlIlIl.iilIliilIl ? llliilililliilil.liIlllllil : llliilililliilil.IiIlllllil;
            var14.iilIIiIlIl = var10;
            var14.IIiIIiIlIl = var12.lIilillIil;
            var14.iIIlIiIlIl = IliIlllilIi<"IliIlllilIi","WmrlfuNxgQ2psy86PB1KunwzSFfhhTwZa7RiDbZ986AH4iaD">() + var12.IiilillIil;
            return var14;
         }
      }

      iIIIlllIlIIlll var9 = IIiliiilIiliii.liiiIIllIl(
         var1, var2, this.IliiIlillliiIlil, (long)this.ilIliIilIiIliIil.Iilllilliill(), this.IIlIlllIlIll(), this::iIlllIllll
      );
      if (var9 != null) {
         lilIiIiliilIiIil var11 = var9.IliIlllilIi();
         iIIIIIIlIlIIIIIl var13 = new iIIIIIIlIlIIIIIl();
         var13.lilIIiIlIl = var9.liiiIIllIl().IIIiiIililIIiiIili == llIlIlIlilIlIlIl.iilIliilIl ? llliilililliilil.liIlllllil : llliilililliilil.IiIlllllil;
         var13.iilIIiIlIl = var9.liiiIIllIl();
         var13.IIiIIiIlIl = var11.lIilillIil;
         var13.IIIlIiIlIl = var9.iIlIlllllill();
         var13.iIIlIiIlIl = IliIlllilIi<"IliIlllilIi","fJdb67BgyEXUhGCR4xCv+M5sAxlgHgeL8nlPoaLjT2i1mOVCsdBBZRY=">();
         return var13;
      } else {
         return null;
      }
   }

   public String lllillillill(IiIlIIiliIlIIi t) {
      return this.IliIlllilIi() && this.ilIiiIiIii(t) ? IiiIliiliiIlii.liiiIIllIl(this.llIiiIililIiiIil.getOrDefault(t, "")) : "";
   }

   private void iIlillIllill() {
      for (int var1 = 0; var1 < this.liiliIiliiiliIil.size(); var1++) {
         this.liiliIiliiiliIil.get(var1).illiiIiliIiliiIili = Math.max(0, 100 - var1);
      }
   }

   private int lIliIliIliIl(Predicate<class_1799> match) {
      class_1703 var2 = Iiiilllliiilll.field_1724.field_7512;
      if (var2 == null) {
         return -1;
      } else {
         int var3 = var2.field_7761.size() - 36;
         if (var3 <= 0) {
            return -1;
         } else {
            for (int var4 = 0; var4 < var3; var4++) {
               if (match.test(var2.method_7611(var4).method_7677())) {
                  return var4;
               }
            }

            return -1;
         }
      }
   }

   public void iiIIilIIlIil(String why) {
      this.lllIIlilillIIlil = iIlIIiIllIIi.iiIIiliiIIlIilii;
      this.lIiIIliliIiIIlil = 0L;
      if (why != null) {
         Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<"IliIlllilIi","DJ/J1Hf8+XfW+Sz0SavnnVijngr3X9R8m1qkN94DSoAqcTwE/3Y0tQcj9g==">(), why, false);
      }
   }

   private void IiiIIlliiIIl() {
      this.IIiiiIillIiiiIil = false;
      this.iIiiiIilIliiiIil = true;
      class_634 var1 = Iiiilllliiilll.method_1562();
      String var2 = this.IIiIIllIiIIl();
      boolean var3 = !var2.isEmpty() && var2.equals(this.IlliiIilllliiIil) && System.currentTimeMillis() - this.illiiIilIiliiIil < 600000L;
      this.IiIiiIilliIiiIil.clear();

      for (IliIlIllliIlIl var5 : this.lliIIliliIIl()) {
         int var6 = var5.liiIllIlliiiIllIll;
         if (var3) {
            IliIlIllliIlIl var7 = null;

            for (IliIlIllliIlIl var9 : this.iiIiiIilIIliiIil) {
               if (class_1799.method_31577(var9.IliIllIlllliIllIll, var5.IliIllIlllliIllIll)) {
                  var7 = var9;
                  break;
               }
            }

            if (var7 != null) {
               var6 = var5.liiIllIlliiiIllIll >= var7.liiIllIlliiiIllIll
                  ? var7.iliIllIllIiiIllIll + (var5.liiIllIlliiiIllIll - var7.liiIllIlliiiIllIll)
                  : Math.min(var7.iliIllIllIiiIllIll, var5.liiIllIlliiiIllIll);
            }
         }

         if (var6 > 0) {
            this.IiIiiIilliIiiIil.add(new IliIlIllliIlIl(var5.IliIllIlllliIllIll, var6, var5.liiIllIlliiiIllIll));
         }
      }

      this.lIliiIiliIliiIil = var1;
      this.iiIiiIilIIliiIil.clear();
      this.IlliiIilllliiIil = null;
      int var10 = 0;

      for (IliIlIllliIlIl var13 : this.IiIiiIilliIiiIil) {
         if (IiiIlliiIl.iliIiiliiiii(var13.IliIllIlllliIllIll.method_7909())) {
            var10 += var13.iliIllIllIiiIllIll;
         }
      }

      boolean var12 = false;

      for (IiIlIIiliIlIIi var15 : this.liiliIiliiiliIil) {
         var12 |= var15.liiliIiliiiiliIili && var15.IIIllIIliIIl();
      }

      if (var10 > 0 && var12) {
         this.iIIlllIlIlll(
            IliIlllilIi<"IliIlllilIi","ud7FiNIh8SJ3qzUyYy3dFVOtL6t2bOI01N/BZPEwwFGcefLTLBU=">()
               + var10
               + IliIlllilIi<"IliIlllilIi","K3MeNDV+J6Ecqba31xo8p1Yq1A7LbNvp5FXAolxtyo9PYaC3VwI=">()
               + (var10 == 1 ? "" : IliIlllilIi<"IliIlllilIi","P5Qoj60waWNsO1U4r3mg+4VyoZQhYrct5W+HOB0=">())
               + IliIlllilIi<"IliIlllilIi","RT36WooaVP8IQ9rHo3S7S5QoKJVtXJtdeHBGeHLFqCojDxv0VJupPmQN/Y/i5325UhG0MbHtHaGTSJiaJ44Awg3o8NfZjwF3WAPEtPMbF2QhoC+8Ljt/zMOyhnLRWOkefKG5y7o=">(),
            true
         );
      }
   }

   private int iiIiIlIIliIl(Predicate<class_1799> match) {
      class_1703 var2 = Iiiilllliiilll.field_1724.field_7512;
      if (var2 == null) {
         return -1;
      } else {
         int var3 = var2.field_7761.size() - 36;
         if (var3 < 0) {
            return -1;
         } else {
            for (int var4 = var3; var4 < var2.field_7761.size(); var4++) {
               if (match.test(var2.method_7611(var4).method_7677())) {
                  return var4;
               }
            }

            return -1;
         }
      }
   }

   private String IIillllIilll() {
      if (this.IIIiiIillIIiiIil.isEmpty()) {
         return IliIlllilIi<"IliIlllilIi","nMsK5PUlB4X2JFMzlwTKmLirHd/nuwXFuPcXn4UX0OKNRGQScMs6EahsP0M+geHDsD9W345neMZt+cwwhxYQ7xP76wSjqeT2QWT12bU6gd3AX/Sn+dvBIU0WsJMDvG22eI7dko1kilxh">();
      } else {
         StringBuilder var1 = new StringBuilder(IliIlllilIi<"IliIlllilIi","zze476rDnEWjHS4sl4LMIXEpFuM8lBAzNrn0qhINXCfxi5/mHg==">());

         for (int var2 = 0; var2 < this.IIIiiIillIIiiIil.size(); var2++) {
            if (var2 > 0) {
               var1.append(IliIlllilIi<"IliIlllilIi","F+9lBp8e3Njc/cfRs1Co9yKhnwGB/Dz/UZpuTZbL">());
            }

            IlIiiIIillIiiIIi var3 = this.IIIiiIillIIiiIil.get(var2);
            var1.append(iIIiiIlIlIiiIl.liiiIIllIl(var3.ilIiIiiiil))
               .append(IliIlllilIi<"IliIlllilIi","poyiE7j7impodXBZKhLGIBeF+eo/PYE4ucCsUCiAEA==">())
               .append(var3.lIIiIiiiil)
               .append(' ')
               .append(var3.iIIiIiiiil)
               .append(' ')
               .append(var3.IlIiIiiiil);
         }

         return var1.toString();
      }
   }

   private boolean IIllIllIllIl(class_1799 s) {
      if (this.iIliiIllii()) {
         class_1792 var2 = IiiIlliiIl.iIlIlllllill(this.IllIiIillllIiIil.Iilllilliill());
         if (var2 != null && s.method_31574(var2)) {
            return true;
         }
      }

      for (IiIlIIiliIlIIi var3 : this.liiliIiliiiliIil) {
         if (var3.liiliIiliiiiliIili && var3.IIIiiIililIIiiIili == llIlIlIlilIlIlIl.iilIliilIl) {
            class_1792 var4 = IiiIlliiIl.iIlIlllllill(var3.lIliiIiliiIliiIili);
            if (var4 != null && s.method_31574(var4)) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected void IIiilIiiiIii(illlllIillll event) {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null && this.iIlilIilIllilIil.Iilllilliill()) {
         class_243 var2 = Iiiilllliiilll.field_1773.method_19418().method_71156();
         class_4587 var3 = event.IliiiIIilliiiIIi;
         var3.method_22903();
         var3.method_22904(-var2.field_1352, -var2.field_1351, -var2.field_1350);
         Matrix4f var4 = var3.method_23760().method_23761();
         UUID var5 = this.Iillllillillllil.peek() != null ? this.Iillllillillllil.peek().IIiIIiIlIl : null;
         List var6 = this.liIiiiiIii();
         float var7 = iIIiiIlIlIiiIl.iIlIlllllill();

         for (lilIiIiliilIiIil var9 : this.lIiliIiliIiliIil.lIiiIiIlilli()) {
            boolean var10 = var5 != null && var5.equals(var9.lIilillIil);
            IiIlIIiliIlIIi var11 = this.iiIiilIIliil(var9, var6);
            if (var11 != null || var10) {
               class_238 var12 = this.IiIiilliIiil(var9);
               if (var12 != null) {
                  iIIiiIlIlIiiIl.IlIlllIlilIl(
                     var4, var12, this.lIliiliIliil(var9, var11, var10), var10 ? 1.0F : var7 * 0.8F, var10 ? 0.1F : 0.05F, var10 ? 2.0F : 1.5F
                  );
               }
            }
         }

         var3.method_22909();
         iIiiIIilIliiIIil.IiIiliIiiiIi();
      }
   }

   private boolean IIliilIlii(IiIlIIiliIlIIi t) {
      String var2 = this.iiillIilIIIilIil.Iilllilliill();

      return switch (var2) {
         case IliIlllilIi<"IliIlllilIi","S0XASiZa+o6Y4u8CftcZWvBlFnufMdy0ByiAlZwZkeaImUW2">() -> t.IIIiiIililIIiiIili == llIlIlIlilIlIlIl.IilIliilIl;
         case IliIlllilIi<"IliIlllilIi","jfKE1oz1vl7kFHyoH1wJ48T2wNaI2l+aUOJj8/FgVSluC5EZoQ==">() -> t.IIIiiIililIIiiIili == llIlIlIlilIlIlIl.iilIliilIl;
         default -> true;
      };
   }

   private void liilIliiilIl() {
      if (this.IliiIlillliiIlil - this.IIllllillIllllil > 600L) {
         boolean var1 = false;

         for (IlIiiIIillIiiIIi var3 : this.IIIiiIillIIiiIil) {
            if (var3.lIiiIiIlilli() && var3.IiIiIiiiil && this.IliiIlillliiIlil - var3.liIiIiiiil < 200L) {
               var1 = true;
            }
         }

         this.iIIlllIlIlll(
            this.lIilIliIilIl()
               ? IliIlllilIi<"IliIlllilIi","saIQUyOVBBTIWPnFyX1VARvnXHURo1rFymNGi5Gy4n51bX9dD3PWo/ueeFUPlMI9kENEuO/bpDZmquMqVUb8TYS1JlG5AIOh3DEI+4caocvrnUelNih0JtyE9yy3vWo=">()
               : (
                  var1
                     ? IliIlllilIi<"IliIlllilIi","Mjk8w3uJRTTMDZtAzhEjl0ceqeU9gIS+cd5M7WUoDs1rOl3Yk+62tJ6+i9jXU5TXTsTx1HzCipP5/pjhEs9sXkCVH5U1iq6qYKQr7jgEA28WCWKihJPivjv3Z/XS5t7rw2nQbHEFUqeGtAEnLROOORrzCfwp20MlIsZGkee5tC/IEc/Y">()
                     : IliIlllilIi<"IliIlllilIi","lapE466GbLM+Belxz2dxC1EPc55TIdw92kZb5UwGRK2jxyA9A3xE4d5mecZI7YJkNkXIOzv/bN5PUaacsv6koyPU6UFCaNFtU8oxKaFkiS4kuALzbdYi+3pXOxYqsnqczQ==">()
               ),
            false
         );
         this.IIllllillIllllil = this.IliiIlillliiIlil;
      }

      this.IlllIlilllllIlil = this.lIilIliIilIl()
         ? IliIlllilIi<"IliIlllilIi","zFOgufMMxQiq1okHXpVacw4j2XSV4GCW381zUVu6rCwiQGB6uYBUABJ/IzB6VlhPyIam3XtvaeLi4w==">()
         : IliIlllilIi<"IliIlllilIi","kQLYMpxhovfqyvKzEn4YY8TGrnxF/NxRyVcuJmYJAIC+sXLq57gjUXiQXO3lKtZDPEixboOqEKt2BGHyyxixWQ==">();
      this.lIlIlliliIlIllil = this.IliiIlillliiIlil + 100L;
      this.lIiIlliIiIll(IIIIllIllIIIllIl.IlIillIiIl);
   }

   @Override
   protected void IiIIlliIIl(IliIliIllliIliIl event) {
      if (this.iiiiiIilIIIIIlil.size() < (-(-1129958145 * -85 << 13 | -1129958145 * -85 >>> 19) ^ -216706010)) {
         if (event.iilIIiiIll instanceof class_2767 var2 && IIIIIllIIIIl(var2.method_11894())) {
            this.iiiiiIilIIIIIlil.add(new lIIIIliliIIIIlil(var2.method_11890(), var2.method_11889(), var2.method_11893(), -1));
            return;
         }

         if (event.iilIIiiIll instanceof class_2765 var3 && IIIIIllIIIIl(var3.method_11882())) {
            this.iiiiiIilIIIIIlil.add(new lIIIIliliIIIIlil(0.0, 0.0, 0.0, var3.method_11883()));
         }
      }
   }

   private String liIliliiIlil(iIIIIIIlIlIIIIIl g) {
      if (g == null || g.iilIIiIlIl == null) {
         return IliIlllilIi<"IliIlllilIi","Lx6EztS6qQCTsIO7W4BzbLjbNT4K9mprtvCWSnqJx5dP8AI=">();
      } else if (g.lilIIiIlIl == llliilililliilil.iiIlllllil) {
         return IliIlllilIi<"IliIlllilIi","qKcb3ADtuLElBw0VVZp3E8ZV0t7+Sss7h81kUY9YCjAgOnf7">()
            + IiiIlliiIl.lIiiIiIlilli(g.iilIIiIlIl.lIliiIiliiIliiIili)
            + IliIlllilIi<"IliIlllilIi","+BFjEuEp7s1DjueontJ67L6XLX7jbHGxGIzK/uSigU0liIt0HuJL0KA=">();
      } else {
         return g.iilIIiIlIl.IIIiiIililIIiiIili == llIlIlIlilIlIlIl.iilIliilIl
            ? IliIlllilIi<"IliIlllilIi","qKcb3ADtuLElBw0VVZp3E8ZV0t7+Sss7h81kUY9YCjAgOnf7">()
               + IiiIlliiIl.lIiiIiIlilli(g.iilIIiIlIl.lIliiIiliiIliiIili)
               + IliIlllilIi<"IliIlllilIi","6tRf5ZZSI/pBnjw2zFxlDCepDpsd23A3ZphDeIq4SaI=">()
               + g.iilIIiIlIl.lliiiIiliiliiiIili
               + IliIlllilIi<"IliIlllilIi","PssSOiV65Of9bdD9B4eETQe7drWI0meP6R+2AVelLdiu">()
            : IliIlllilIi<"IliIlllilIi","0mYsgVFbpmPORi0ryBcm089sRNwbg0D2lG82TtXXkTYQbZo=">()
               + g.iilIIiIlIl.Iilllilliill()
               + IliIlllilIi<"IliIlllilIi","6tRf5ZZSI/pBnjw2zFxlDCepDpsd23A3ZphDeIq4SaI=">()
               + g.iilIIiIlIl.lliiiIiliiliiiIili
               + IliIlllilIi<"IliIlllilIi","SRw+WKCYdKhb7Tb+1vvwp3kaleRHfnWufHuc4DgFdcVpDZQ=">();
      }
   }

   private void IlIllllIll() {
      List var1 = this.liIiiiiIii();
      this.IlllIlilllllIlil = IliIlllilIi<"IliIlllilIi","yV7DcECeZLTxRzYTCeFS+IpQEoNgnm22l2JlJG41XZW+4Ux627OhKfJE6xIEJmoekq3wk0GSv9LqSELm">();
      if (var1.isEmpty() && this.iiliiIIiii()) {
         if (!this.iIllIlIlllIl() || this.IlilIlllilIl() == null) {
            this.iIIlllIlIlll(
               IliIlllilIi<"IliIlllilIi","eug5NOE11fhIiTt5bC+CrjlTJKerJ91IQMH0NdSslDAs+OhLoEtrmJ+IM4p3e8WhmQ5i0/j3WoAVnsfk/vTu8u+0lvDM6puY4kbe6kB9QRQu12cZjzI2wHvf">(),
               true
            );
            this.IIillIiliIil(false);
            return;
         }

         this.IlllIlilllllIlil = IliIlllilIi<"IliIlllilIi","DCSOj1mOldHM3ZQby1L7Vwl1GAmFLeenJovuhLsg38V1XWtL8oZ1ES4UBezo9H5PHvGLz+UGsbll3TIfUeIzvNj27aLM7g==">();
      } else if (var1.isEmpty()) {
         for (IiIlIIiliIlIIi var3 : this.liiliIiliiiliIil) {
            String var4 = this.ilIiiIiIii(var3) ? this.llIiiIililIiiIil.getOrDefault(var3, "") : "";
            if (!var4.isEmpty()) {
               this.IlllIlilllllIlil = IliIlllilIi<"IliIlllilIi","j9J/U9NjxD0KyYy7Z4j6tdX1EwScUv04EJrU5keE9I9iE8QGCX9A">() + var4;
               break;
            }
         }
      } else {
         IiIlIIiliIlIIi var12 = (IiIlIIiliIlIIi)var1.get(0);
         String var13 = IliIlllilIi<"IliIlllilIi","8eLOaPqZE7BydGWR1LKg8RIF6F333hVigrcS9aJklQ==">().equals(var12.llIiiIiliilIiiIili)
            ? IliIlllilIi<"IliIlllilIi","r2bxVORlAYFnAPB17vQHXUS4igL+TwIGgyMIlD6XLGjsK8Fn">()
            : var12.llIiiIiliilIiiIili;
         int var14 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;
         int var9 = 0;

         for (lilIiIiliilIiIil var11 : this.lIiliIiliIiliIil.lIiiIiIlilli()) {
            if (var11.IIIiillIil && IIilIlIllIilIlIl.IilliliilIIi(var11, var12)) {
               var14++;
               if (var11.iIlIlllllill(var12)) {
                  var8++;
                  if (var11.lIIiillIil.isEmpty() && this.iIlllIllll(var11)) {
                     var9++;
                  }
               } else if (var11.iliIiiliiiii(this.IliiIlillliiIlil)) {
                  var6++;
               } else if (var11.lIIiillIil.isEmpty()) {
                  var7++;
               } else if (var11.IlIlllIlilIl(var12)) {
                  var5++;
               }
            }
         }

         int var15 = var14 - var8;
         String var16 = lIIllilliIIllill.IliIlllilIi(var12.IlIlllIlilIl());
         if (var15 == 0 && var9 > 0) {
            this.IlllIlilllllIlil = IliIlllilIi<"IliIlllilIi","ekBD2LZgg7HYCrjAZgaXwZh+8jluwzvUnO2jnxapvNLGcC37oj9lKQR3tAsSlqQZE17zg5haSR7ZgA==">();
         } else if (var15 == 0 && var8 > 0) {
            this.IlllIlilllllIlil = IliIlllilIi<"IliIlllilIi","3GIFo/26ZIt9jmz0g+M/FoSvAjr6xOac9NLiuPNn3A==">()
               + var16
               + IliIlllilIi<"IliIlllilIi","zz9sJTvPSPuFQ1xbN+abRsbNUlDL4Xyw6KYvp50=">()
               + var13
               + IliIlllilIi<"IliIlllilIi","sUPo8T6llyzWVHLLq81Lml2QMvr/jwy8o6JiyfcuZP3HJY93">()
               + this.liIilIiliiIilIil.Iilllilliill()
               + IliIlllilIi<"IliIlllilIi","KPnWhj7ONPrp6SsDXTJBj53TIzZpUwmLBivUrhxpJVb0nc0=">();
            this.lIIiiiIIii(
               IliIlllilIi<"IliIlllilIi","Lwher8dFbpM96lCyIQF932k7mtVPCs4bV6Zy13j/nqYXlHx7RnM=">(),
               IliIlllilIi<"IliIlllilIi","5c3AjAU/7qqKjTsoGNzlLOTpi6ApCjpJZqs8T5GR8c7F">()
                  + var16
                  + IliIlllilIi<"IliIlllilIi","zz9sJTvPSPuFQ1xbN+abRsbNUlDL4Xyw6KYvp50=">()
                  + var13
                  + IliIlllilIi<"IliIlllilIi","7lQHFT+ntAgBdYpKlTfsCFcVBquHSYqQ/kew7mU2WWu2/Yk=">()
                  + var12.Iilllilliill()
                  + IliIlllilIi<"IliIlllilIi","gizSqADrcBKPH4A8zuyJ+G4XFHlF0bmWwd8PEkfnzNMlR1N209fITELrKzELj8V3Ig==">()
                  + this.liIilIiliiIilIil.Iilllilliill()
                  + IliIlllilIi<"IliIlllilIi","gYqrof5yDbzjBx/RsghWzxMpkC5jPJAgziUtKLNDn7NUvHTQEawxZtmMhlMAGKAbHZzcNFw=">()
                  + var13
                  + IliIlllilIi<"IliIlllilIi","0Irqq8wtfqeb8Wkm9IBCkbVuCoSYnq4r9hGptdGRI9kq181xsBsI1JJkiK2K+g==">()
                  + var16
                  + IliIlllilIi<"IliIlllilIi","ptI4llSJTaW2WYu+fpEmWqKqC6bQm/qHOK5lIN0=">(),
               false,
               6000L
            );
         } else if (var7 > 0 && var5 == 0 && var15 > var6) {
            this.IlllIlilllllIlil = IliIlllilIi<"IliIlllilIi","ekBD2LZgg7HYCrjAZgaXwZh+8jluwzvUnO2jnxapvNLGcC37oj9lKQR3tAsSlqQZE17zg5haSR7ZgA==">();
         } else if (var14 == 0) {
            this.IlllIlilllllIlil = IliIlllilIi<"IliIlllilIi","3GIFo/26ZIt9jmz0g+M/FoSvAjr6xOac9NLiuPNn3A==">()
               + var13
               + IliIlllilIi<"IliIlllilIi","sUPo8T6llyzWVHLLq81Lml2QMvr/jwy8o6JiyfcuZP3HJY93">()
               + this.liIilIiliiIilIil.Iilllilliill()
               + IliIlllilIi<"IliIlllilIi","KPnWhj7ONPrp6SsDXTJBj53TIzZpUwmLBivUrhxpJVb0nc0=">();
            this.lIIiiiIIii(
               IliIlllilIi<"IliIlllilIi","7TIHGhoV3AQSLca3+jsTXSwJ/nsErJZGQRDICWXDUiRLroJNcw==">(),
               IliIlllilIi<"IliIlllilIi","3GIFo/26ZIt9jmz0g+M/FoSvAjr6xOac9NLiuPNn3A==">()
                  + var13
                  + IliIlllilIi<"IliIlllilIi","sUPo8T6llyzWVHLLq81Lml2QMvr/jwy8o6JiyfcuZP3HJY93">()
                  + this.liIilIiliiIilIil.Iilllilliill()
                  + IliIlllilIi<"IliIlllilIi","efd/tbkrszrUuuAKcYqpn5U9Cejiv/WW9Hs/4kyFieNu7gi9kfjUgQ==">()
                  + var12.Illlllllilll()
                  + IliIlllilIi<"IliIlllilIi","ptI4llSJTaW2WYu+fpEmWqKqC6bQm/qHOK5lIN0=">(),
               false,
               6000L
            );
         } else if (var5 > 0) {
            this.IlllIlilllllIlil = IliIlllilIi<"IliIlllilIi","cdGHWdYX2NlwIwnT0F7VyDTzc6l8v/n9Hsb5+TDUT9WzoBCkNa6VcsN2zbbJ93siUC6OXFd+R5cFLoAnijE=">();
            this.lIIiiiIIii(
               IliIlllilIi<"IliIlllilIi","KiU+FhNvOu2TbjqGCi2Y8SmUxlv/gcrjo3BOx6kxOqMpKZZL3b55UQ==">(),
               var12.Illlllllilll()
                  + IliIlllilIi<"IliIlllilIi","P8Pqzrz6Rbra8UBXeCFHjqZvjrLSdHg+YubA/KRZRZ6RaiNeRN1GyyhOua5m">()
                  + var13
                  + IliIlllilIi<"IliIlllilIi","3rq0o6jNwf8cnFUmpOpyJAvJSLJych7c5gsbc+FCdJX1/jcQnlyBNXAy6q1p1juddXY6SLCQdR0+wyxNsfJ82eJ5sQ3W">()
                  + this.ilIliIilIiIliIil.Iilllilliill() / 20
                  + IliIlllilIi<"IliIlllilIi","nuAcuKsAjEOwE44KGRMg14Sbn9OYJKIXsKkbMRL9/OlzCQbaASN2Rqw/HrlhdKI5Ky84Gx9+weYaQKYu8UKmmCwMuJddG0XASQsro7k=">(),
               true,
               6000L
            );
         } else if (var6 == var15) {
            this.IlllIlilllllIlil = IliIlllilIi<"IliIlllilIi","a3GlydwDEOgwka01qcKojxX8iynpQ1pmrt3T1mK311waBekK2nJFEWwqf7q3BzfIzlztGkqnPdMsSNuXF3ZB9D2HeA0=">();
            this.lIIiiiIIii(
               IliIlllilIi<"IliIlllilIi","v24A40K4G3o1PExKIQ+RXzxmD5a8H9F3s9xzLHI8gVKmSuOwYODZzg==">(),
               IliIlllilIi<"IliIlllilIi","Cd/qqeVcuz3Zj4yKkcwXdqc/GX+9o+ReSDGSXBfK7oo5QA==">()
                  + var13
                  + IliIlllilIi<"IliIlllilIi","Yar8pV80SqABAjL2nqwSykk549Ep4zWW4F6OBjTpqaD3dXgKhq8Uz1kUYKjdfezwAVmDIGoQZdBaLXZPfgC/eRZde8krjlT6I9NLxgiezXmjvwme">(),
               false,
               6000L
            );
         } else if (!this.iIiIiIilIliIiIil.Iilllilliill() && !this.ilIllIiIll()) {
            this.IlllIlilllllIlil = IliIlllilIi<"IliIlllilIi","DdJ6bJOXd6N35+5DOypzQ41KO6Emm2AcydOZtMnx2s6VU9gqwVVgu6e835w=">()
               + var13
               + IliIlllilIi<"IliIlllilIi","bqAI2wN00XizeJR5yJ/qO4l1JoZmm0662b0nOBKReaal1xZkftNmzmFtWgfY">();
            this.lIIiiiIIii(
               IliIlllilIi<"IliIlllilIi","tHVp+ABJFeHGRgv7/V1A65BVmgrXpi2YCKGnI4NsHc3rHC0y3vA=">(),
               IliIlllilIi<"IliIlllilIi","8O3dhsFHqd6rQay7nAzkgIS0nbYD4lu4JTuY8iiXqkXgIKs8h7IvyeBF3/N6d6tX61hKS/w=">()
                  + var13
                  + IliIlllilIi<"IliIlllilIi","9fWihXE9aBASpEma/lZeR1nigdmKb4zyQerNZy6PH9plAcqxmcEkIz5DgVHlqRBZr3C/XKLdhB+MB7udp+sq+StYvA==">(),
               false,
               6000L
            );
         } else {
            this.IlllIlilllllIlil = IliIlllilIi<"IliIlllilIi","3GIFo/26ZIt9jmz0g+M/FoSvAjr6xOac9NLiuPNn3A==">()
               + var13
               + IliIlllilIi<"IliIlllilIi","KOWRBnRzF6SBue9gNLnHg0GlBgIue8/DwwObouvfQU38e+TP/BhvJwJZWg==">()
               + var12.Iilllilliill();
            this.lIIiiiIIii(
               IliIlllilIi<"IliIlllilIi","yPlT4cZaysl1AQy0fGkLTCzdJCzCU4yt+BwYitd97iCyLmy7uyOiKw==">(),
               IliIlllilIi<"IliIlllilIi","3GIFo/26ZIt9jmz0g+M/FoSvAjr6xOac9NLiuPNn3A==">()
                  + var13
                  + IliIlllilIi<"IliIlllilIi","KOWRBnRzF6SBue9gNLnHg0GlBgIue8/DwwObouvfQU38e+TP/BhvJwJZWg==">()
                  + var12.Illlllllilll()
                  + IliIlllilIi<"IliIlllilIi","VaYFWHLjH3bLSvz8rxHfxSg5sgNucX5cUQJkYTpSiTyUoI/9LtMiF+FpyXzVvjJEklavJX2ZqoRrI0LNDsi105dum6J3ReCaJwTrweHv">(),
               false,
               6000L
            );
         }
      }

      this.lIlIlliliIlIllil = this.IliiIlillliiIlil + 20L;
      this.lIiIlliIiIll(IIIIllIllIIIllIl.IlIillIiIl);
   }

   private void IIililIili(String why) {
      if (this.iIiiIlIliiIl()) {
         this.IiiiIlliiiIl();
      }

      iIIIIIIlIlIIIIIl var2 = this.Iillllillillllil.peek();
      if (var2 != null) {
         var2.iiiIIiIlIl++;
         var2.lIIlIiIlIl = why;
      }

      this.lIiIlliIiIll(IIIIllIllIIIllIl.llIillIiIl);
   }

   private int IiIIIlliIIIl(class_1792 item) {
      if (item != null && Iiiilllliiilll.field_1724 != null) {
         class_1661 var2 = Iiiilllliiilll.field_1724.method_31548();
         int var3 = 0;

         for (int var4 = 0; var4 <= 35; var4++) {
            class_1799 var5 = var2.method_5438(var4);
            if (var5.method_31574(item)) {
               var3 += var5.method_7947();
            }
         }

         return var3;
      } else {
         return 0;
      }
   }

   private void liiiiiiiii() {
      if (this.IliiIlillliiIlil - this.liiiIliliiiiIlil >= 10L) {
         this.lIiliIiliIiliIil.IliIlllilIi(this.IliiIlillliiIlil, (double)this.liIilIiliiIilIil.Iilllilliill());
         this.liiiIliliiiiIlil = this.IliiIlillliiIlil;
      }
   }

   private void iIIlllIlIlll(String msg, boolean good) {
      Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<"IliIlllilIi","+ze9nrAA2hNpT6oN8Uxi/96zPboOd0WDLnI/6MNLBneAb9j0euRMOVczWJ4ZZsA=">(), msg, good);
      if (Iiiilllliiilll.field_1724 != null) {
         Iiiilllliiilll.field_1724
            .method_7353(
               class_2561.method_43470(
                  (
                        good
                           ? IliIlllilIi<"IliIlllilIi","6qfQ4o1gFAZk/GXgeuQ1w43CajZkHlpKRLv+QLkkv3dGndryA4/Ot4VFBHJS">()
                           : IliIlllilIi<"IliIlllilIi","2k0TJDKrYyilypWhxaLfqwEnbc1fxpSNCX4NUzp5QD34YRvLa/ZLn3RexkPr">()
                     )
                     + msg
               ),
               false
            );
      }

      if (!good) {
         this.iIIlIlilIlIlIlil = IiiIliiliiIlii.liiiIIllIl(msg);
         this.llIlIlililIlIlil = true;
         this.IiIlIlilliIlIlil = System.currentTimeMillis();
      }
   }

   public int lilIiliilIil() {
      return this.IiIIIlliIIIl(class_1802.field_8687);
   }

   private void liiilliiiill() {
      if (this.IiIIiIilliIIiIil.Iilllilliill() && !this.IIIiIllIIiIl(IlliliIillliliIi.IillIiiIIi)) {
         this.IiIIiIilliIIiIil.IIillIiliIil(false);
      }
   }

   private boolean iIiiIlIliiIl() {
      return Iiiilllliiilll.field_1755 != null && Iiiilllliiilll.field_1724 != null
         ? (this.lIiiIliliIiiIlil == IIIIllIllIIIllIl.IiilllIiIl || this.lIiiIliliIiiIlil == IIIIllIllIIIllIl.ililllIiIl) && this.illiIlIiliIl()
            || (this.lIiiIliliIiiIlil == IIIIllIllIIIllIl.IIIillIiIl || this.lIiiIliliIiiIlil == IIIIllIllIIIllIl.iiilllIiIl) && this.liliIliiliIl()
            || this.lIiiIliliIiiIlil == IIIIllIllIIIllIl.lIIillIiIl && this.IiIIllilliIIllil != null && Iiiilllliiilll.field_1755 == this.IiIIllilliIIllil
            || this.lliiIliliiIl()
         : false;
   }

   private int IiIliliIli(Predicate<class_1799> match) {
      class_1661 var2 = Iiiilllliiilll.field_1724.method_31548();

      for (int var3 = 9; var3 <= 35; var3++) {
         if (match.test(var2.method_5438(var3))) {
            return var3;
         }
      }

      for (int var4 = 0; var4 <= 8; var4++) {
         if (match.test(var2.method_5438(var4))) {
            return 36 + var4;
         }
      }

      return -1;
   }

   private class_2338 IilIililIi(IlIiiIIillIiiIIi s) {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         class_2338 var2 = s.liiiIIllIl();
         if (!Iiiilllliiilll.field_1687.method_8320(var2.method_10084()).method_26220(Iiiilllliiilll.field_1687, var2.method_10084()).method_1110()) {
            return null;
         } else {
            int[] var3 = new int[]{1, 0, 2, -1};
            class_2338 var4 = null;
            double var5 = -1.0E9;

            for (int var7 = 1; var7 <= 3; var7++) {
               for (int var8 = -var7; var8 <= var7; var8++) {
                  for (int var9 = -var7; var9 <= var7; var9++) {
                     if (Math.max(Math.abs(var8), Math.abs(var9)) == var7) {
                        int var10 = Math.min(Math.abs(var8), Math.abs(var9));
                        if (var7 != 3 || var10 <= 1) {
                           for (int var14 : var3) {
                              class_2338 var15 = var2.method_10069(var8, var14, var9);
                              if (this.liilliiill(var15)) {
                                 class_243 var16 = new class_243(
                                    (double)var15.method_10263() + 0.5, (double)var15.method_10264() + 1.62, (double)var15.method_10260() + 0.5
                                 );
                                 double var17 = Math.hypot((double)var8, (double)var9);
                                 double var19 = (double)s.iIIiIiiiil + 1.0 - (var16.field_1351 - 0.3);
                                 double var21 = ilIiiiIiIiIiiiIi.iliIiiliiiii(var17, var19);
                                 if (!(var21 < -0.35) && this.lllIiillIi(var16, s)) {
                                    double var23 = Math.min(var21, 0.2) * 20.0
                                       - (double)var10 * 0.5
                                       - (double)Math.abs(var14 - 1) * 0.5
                                       - 0.05 * Math.sqrt(var15.method_10262(Iiiilllliiilll.field_1724.method_24515()));
                                    if (var23 > var5) {
                                       var5 = var23;
                                       var4 = var15;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }

            return var4;
         }
      } else {
         return null;
      }
   }

   private void lliliilili() {
      if (!this.Iillllillillllil.isEmpty()) {
         this.Iillllillillllil.pop();
      }
   }

   private class_243 IIlIlllIlIll() {
      return Iiiilllliiilll.field_1724 != null ? Iiiilllliiilll.field_1724.method_73189() : class_243.field_1353;
   }

   public IlliliIillliliIi iIIIilIlIIil() {
      return this.IilIIlillilIIlil;
   }

   private boolean iillilIIilil() {
      return this.IliIlllilIi() || this.lllIIlilillIIlil != iIlIIiIllIIi.iiIIiliiIIlIilii || Iiiilllliiilll.field_1755 instanceof iIIiIIIlIlIiIIIl;
   }

   private IliIlIllliIlIl IllIIllllIIl(class_1799 s) {
      for (IliIlIllliIlIl var3 : this.IiIiiIilliIiiIil) {
         if (class_1799.method_31577(var3.IliIllIlllliIllIll, s)) {
            return var3;
         }
      }

      return null;
   }

   private boolean ilIllIiIll() {
      for (lilIiIiliilIiIil var2 : this.lIiliIiliIiliIil.lIiiIiIlilli()) {
         if (this.iIlllIllll(var2)) {
            return true;
         }
      }

      return false;
   }

   private UUID llliiillii(IiIlIIiliIlIIi t) {
      List var2 = IIilIlIllIilIlIl.iliIiiliiiii(this.lIiliIiliIiliIil.iliIiiliiiii(), t, this::iIlllIllll);
      liIlIiiliiIlIiil var3 = IIilIlIllIilIlIl.IIIllIIliIIl(var2, this.Iiliililii(), this.IIlIlllIlIll(), this.iillllilIIilllil);
      return var3 == null ? null : var3.IliIlllilIi().lIilillIil;
   }

   private IlIiiIIillIiiIIi IlilIlllilIl() {
      if (Iiiilllliiilll.field_1687 == null || Iiiilllliiilll.field_1724 == null) {
         return null;
      } else if (this.lIilIliIilIl()) {
         return this.IlIIllllIIll(IlliliIillliliIi.IillIiiIIi);
      } else {
         return this.IIiIiIillIiIiIil.Iilllilliill() ? this.IiIiIlliIiIl() : null;
      }
   }

   public void ilIillIiIill(int i) {
      if (i >= 0 && i < this.liiliIiliiiliIil.size()) {
         IiIlIIiliIlIIi var2 = this.liiliIiliiiliIil.remove(i);
         this.iIIiiIilIlIiiIil.remove(var2);
         this.llIiiIililIiiIil.remove(var2);
         this.iIlillIllill();
         iiiIIIlIIIlIIl.IilliliilIIi();
      }
   }

   private void iIiliIlili(iIIIIIIlIlIIIIIl g) {
      String var2 = g.lIIlIiIlIl != null && !g.lIIlIiIlIl.isEmpty()
         ? g.lIIlIiIlIl
         : IliIlllilIi<"IliIlllilIi","EaxrTFf1GncsEpAz3WZgUg/c4OiXwNwIAjQ9NNvuxVgallBrSZQ1OqODgw==">();
      if (g.iliIIiIlIl != null && (g.lilIIiIlIl == llliilililliilil.IIllllllil || g.lilIIiIlIl == llliilililliilil.lIllllllil)) {
         g.iliIIiIlIl.iiIiIiiiil = this.IliiIlillliiIlil + 1200L;
         String var4 = g.iliIIiIlIl.ilIiIiiiil == IlliliIillliliIi.IillIiiIIi
            ? IliIlllilIi<"IliIlllilIi","mA9DZvvZp6WoNHEERlNFTPmKFT/Wloefm7G1WIGGnbsT7X5QFV0ztO4=">()
            : IliIlllilIi<"IliIlllilIi","LfkWKpcxb6X+co4nMkVZxv42jDSHPAWmcQxlgIGdvmg=">()
               + g.iliIIiIlIl.ilIiIiiiil
               + IliIlllilIi<"IliIlllilIi","JEJKy4tdrd7AhJgurVJSqAZqHdmJHCSLBxVIbW7kK8zvgg==">();
         this.lIIiiiIIii(
            IliIlllilIi<"IliIlllilIi","lK6tIJEKDHd4MTX5aDwWPa/8//Yd1qgECv4aRdVnuh34">() + g.iliIIiIlIl.IlIlllIlilIl(),
            IliIlllilIi<"IliIlllilIi","nPhQ0+IuT/QfTpFgER5R/LpVfVVKGi3IbG0gIf+vHGeJHn8ZfQ==">()
               + var4
               + IliIlllilIi<"IliIlllilIi","poyiE7j7impodXBZKhLGIBeF+eo/PYE4ucCsUCiAEA==">()
               + g.iliIIiIlIl.liiiIIllIl().method_23854()
               + IliIlllilIi<"IliIlllilIi","xCIz5MfNuNNVBfbi90UZC5MBCy7zr97BBXSVoQYPNOT0aUGlrsT/ZZqtr64zeQ==">()
               + var2
               + IliIlllilIi<"IliIlllilIi","ptI4llSJTaW2WYu+fpEmWqKqC6bQm/qHOK5lIN0=">(),
            false,
            1200L
         );
      } else if (g.IIiIIiIlIl != null) {
         lilIiIiliilIiIil var3 = this.lIiliIiliIiliIil.iIlIlllllill(g.IIiIIiIlIl);
         if (var3 != null) {
            var3.iiIiillIil = this.IliiIlillliiIlil + 1200L;
            this.lIIiiiIIii(
               IliIlllilIi<"IliIlllilIi","oIAd2RVgmeaiGQPS1Oo1nUcFxlQbftDjDjcPDDNU7r0=">() + var3.lIilillIil,
               IliIlllilIi<"IliIlllilIi","nzOdbTjLQTnsdpSUECmd3JUVDR8X7Fleo4oY/EHhbljs9sCH1PnSW64=">()
                  + var3.IiilillIil
                  + IliIlllilIi<"IliIlllilIi","poyiE7j7impodXBZKhLGIBeF+eo/PYE4ucCsUCiAEA==">()
                  + var3.llilillIil.method_23854()
                  + IliIlllilIi<"IliIlllilIi","xCIz5MfNuNNVBfbi90UZC5MBCy7zr97BBXSVoQYPNOT0aUGlrsT/ZZqtr64zeQ==">()
                  + var2
                  + IliIlllilIi<"IliIlllilIi","ptI4llSJTaW2WYu+fpEmWqKqC6bQm/qHOK5lIN0=">(),
               false,
               1200L
            );
         }
      }

      this.lliliilili();
   }

   private long IliIlllliIll() {
      return this.IliiIlillliiIlil - this.iliiIlilIiiiIlil;
   }

   public int iliillIiiill(IlliliIillliliIi row) {
      long var5 = -5210284601434580482L;
      var5 ^= ((long)this.IIIiiIillIIiiIil.size() << 32 ^ var5) & -1L << 32;
      String var3 = this.iIilllIlilll();
      this.IIIiiIillIIiiIil.removeIf(s -> (var3.isEmpty() || s.IilliliilIIi(var3)) && iilillIIiill(s, row));
      var5 ^= ((long)((int)(var5 >>> 32) - this.IIIiiIillIIiiIil.size()) ^ var5) & -1L >>> 32;
      if ((int)var5 > 0) {
         if (row == IlliliIillliliIi.IillIiiIIi) {
            this.liiilliiiill();
         }

         iiiIIIlIIIlIIl.IilliliilIIi();
      }

      return (int)var5;
   }

   private boolean iilIllIIiIll(Class<? extends ilIllIiIll> cls) {
      ilIllIiIll var2 = llilIllililIll.iliIiiliiiii(cls);
      return var2 != null && var2 != this && var2.IliIlllilIi();
   }

   @Override
   protected void iiIIlIIlIl(iIIlIlIlIlIlIlIl e) {
      this.IilliIillilliIil.iliIiiliiiii(e);
   }

   public List<IlIiiIIillIiiIIi> lIiilliIiill(IlliliIillliliIi row) {
      ArrayList var2 = new ArrayList();
      String var3 = this.iIilllIlilll();

      for (IlIiiIIillIiiIIi var5 : this.IIIiiIillIIiiIil) {
         if ((var3.isEmpty() || var5.IilliliilIIi(var3)) && iilillIIiill(var5, row)) {
            var2.add(var5);
         }
      }

      return var2;
   }

   private void Iiililiili(iIIIIIIlIlIIIIIl g) {
      this.lliliilili();
      this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
   }

   private boolean lliiIliliiIl() {
      if (Iiiilllliiilll.field_1755 == null || Iiiilllliiilll.field_1724 == null) {
         return false;
      } else if (this.illiIlIiliIl()) {
         return this.lIiiIliliIiiIlil != IIIIllIllIIIllIl.IiilllIiIl
            && this.lIiiIliliIiiIlil != IIIIllIllIIIllIl.ililllIiIl
            && !this.iiillIilIIIilIil.Iilllilliill().equals(IliIlllilIi<"IliIlllilIi","Y9o2Gd3GL8UkZ3gDYn6gInHXt4hI0U6XXsKkX9UJVOLRpsTt">())
            && this.IliiIlillliiIlil - this.iIIIllilIlIIllil <= (2717840471918121208L ^ 2717840471918121116L);
      } else {
         return !this.liliIliiliIl()
            ? false
            : this.lIiiIliliIiiIlil != IIIIllIllIIIllIl.IIIillIiIl
               && this.lIiiIliliIiiIlil != IIIIllIllIIIllIl.iiilllIiIl
               && this.IliiIlillliiIlil - this.llIIllililIIllil <= (3364349897913132999L ^ 3364349897913132963L);
      }
   }

   public static boolean iilillIIiill(IlIiiIIillIiiIIi s, IlliliIillliliIi row) {
      return s.ilIiIiiiil == row || s.ilIiIiiiil == IlliliIillliliIi.illlIiiIIi && row != IlliliIillliliIi.IillIiiIIi;
   }

   public boolean IiIIilliIIil(IlliliIillliliIi role) {
      if (!this.IliIlllilIi() && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && role != null) {
         this.lllIIlilillIIlil = iIlIIiIllIIi.IllIiliilllIilii;
         this.IilIIlillilIIlil = role;
         this.iilIIlilIIiIIlil = System.currentTimeMillis();
         return true;
      } else {
         return false;
      }
   }

   private void llIIIlilIIIl(UUID uuid) {
      if (uuid != null) {
         class_492 var2 = this.illiIlIiliIl() ? (class_492)Iiiilllliiilll.field_1755 : null;
         if (var2 != null) {
            class_1916 var3 = Iiiilllliiilll.field_1724.field_7512 instanceof class_1728 var4 ? var4.method_17438() : null;
            if (var3 != null) {
               ArrayList var6 = new ArrayList();

               for (int var7 = 0; var7 < var3.size(); var7++) {
                  if (var3.get(var7) != null) {
                     var6.add(lIllIilliIllIill.IliIlllilIi((class_1914)var3.get(var7), var7));
                  }
               }

               lilIiIiliilIiIil var8 = this.lIiliIiliIiliIil.IilliliilIIi(uuid);
               var8.IilliliilIIi(var6);
               var8.ilIiillIil = this.IliiIlillliiIlil;
            }
         }
      }
   }

   public int IlIillllIill(IiIlIIiliIlIIi t) {
      long var3 = -327308966267953049L;
      if (t == null) {
         return -1;
      } else {
         var3 ^= ((long)this.lIIilliIIill(t) << 32 ^ var3) & -1L << 32;
         if ((int)(var3 >>> 32) >= 0) {
            return (int)(var3 >>> 32);
         } else {
            this.liiliIiliiiliIil.add(t);
            this.iIlillIllill();
            iiiIIIlIIIlIIl.IilliliilIIi();
            return this.liiliIiliiiliIil.size() - 1;
         }
      }
   }

   private int illIIlIilIIl(class_1799 like) {
      if (Iiiilllliiilll.field_1724 == null) {
         return 0;
      } else {
         int var2 = 0;

         for (int var3 = 0; var3 <= 37; var3++) {
            class_1799 var4 = this.lilIIliilIIl(var3);
            if (!var4.method_7960() && class_1799.method_31577(var4, like)) {
               var2 += var4.method_7947();
            }
         }

         return var2;
      }
   }

   private boolean ililIlIiilIl() {
      if (Iiiilllliiilll.field_1687 == null || Iiiilllliiilll.field_1724 == null) {
         return false;
      } else {
         return this.lIilIliIilIl()
            ? this.IlIIllllIIll(IlliliIillliliIi.IillIiiIIi) == null
            : this.IIiIiIillIiIiIil.Iilllilliill() && this.IIIiIllIIiIl(IlliliIillliliIi.IlllIiiIIi) && this.IiIiIlliIiIl() == null;
      }
   }

   private void iiiIIlIIIlIl() {
      if (this.iIiiiIilIliiiIil && !this.IIiiiIillIiiiIil && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.method_1562() == this.lIliiIiliIliiIil) {
         this.iiIiiIilIIliiIil.clear();

         for (IliIlIllliIlIl var2 : this.lliIIliliIIl()) {
            IliIlIllliIlIl var3 = this.IllIIllllIIl(var2.IliIllIlllliIllIll);
            this.iiIiiIilIIliiIil.add(new IliIlIllliIlIl(var2.IliIllIlllliIllIll, var3 == null ? 0 : this.iIiIIlIliIIl(var3), var2.liiIllIlliiiIllIll));
         }

         this.IlliiIilllliiIil = this.IIiIIllIiIIl();
         this.illiiIilIiliiIil = System.currentTimeMillis();
      }
   }

   private boolean iIlIiIllIi(IlIiiIIillIiiIIi s) {
      if (!Iiiilllliiilll.field_1724.method_24828()) {
         return false;
      } else {
         class_243 var2 = s.iIlIlllllill();
         double var3 = Math.abs(Iiiilllliiilll.field_1724.method_23317() - var2.field_1352);
         double var5 = Math.abs(Iiiilllliiilll.field_1724.method_23321() - var2.field_1350);
         if (Math.hypot(var3, var5) > Double.longBitsToDouble(1193425812385787214L ^ 5801996721923448445L)) {
            return false;
         } else {
            return Math.abs(Iiiilllliiilll.field_1724.method_23318() - (double)(s.iIIiIiiiil + 1))
                  > Double.longBitsToDouble(-2471021015997780867L ^ -7083832934332011395L)
               ? false
               : this.lllIiillIi(Iiiilllliiilll.field_1724.method_33571(), s);
         }
      }
   }

   private liliIllliiliIlll Iiliililii() {
      String var1 = this.IIlilIillIlilIil.Iilllilliill();

      return switch (var1) {
         case IliIlllilIi<"IliIlllilIi","OEfRv2k3WA/Ql9GvXDVugAyDPWGs7WSGiqLG3dGrWJxQ0C3s">() -> liliIllliiliIlll.IiliIlIill;
         case IliIlllilIi<"IliIlllilIi","PPlcU1hGZuXwoAVVftGkQekB4Uj1T1g2ov/q/P6WUd9dip4=">() -> liliIllliiliIlll.liliIlIill;
         case IliIlllilIi<"IliIlllilIi","MxsYjubxEy68QKzRXonCrZinfDQ/za+ZSEUA6md+cPt4ppX2Zcw=">() -> liliIllliiliIlll.iiliIlIill;
         case IliIlllilIi<"IliIlllilIi","8xfEMKJi0EH3e5CxDZbbliFoJPtd6qVreoEn8pOXX16o4KMfs6mf">() -> liliIllliiliIlll.IIiiIlIill;
         case IliIlllilIi<"IliIlllilIi","0nQ74ErW9sj8AEycMnUq+0bP7hgJSrQUbjZC/mVceltyFfXiflVYXII=">() -> liliIllliiliIlll.lIiiIlIill;
         default -> liliIllliiliIlll.iIiiIlIill;
      };
   }

   private List<IliIlIllliIlIl> lliIIliliIIl() {
      ArrayList var1 = new ArrayList();
      if (Iiiilllliiilll.field_1724 == null) {
         return var1;
      } else {
         for (int var2 = 0; var2 <= 37; var2++) {
            class_1799 var3 = this.lilIIliilIIl(var2);
            if (!var3.method_7960()) {
               IliIlIllliIlIl var4 = null;

               for (IliIlIllliIlIl var6 : var1) {
                  if (class_1799.method_31577(var6.IliIllIlllliIllIll, var3)) {
                     var4 = var6;
                     break;
                  }
               }

               if (var4 == null) {
                  var1.add(new IliIlIllliIlIl(var3.method_46651(1), var3.method_7947(), var3.method_7947()));
               } else {
                  var4.iliIllIllIiiIllIll = var4.iliIllIllIiiIllIll + var3.method_7947();
                  var4.liiIllIlliiiIllIll = var4.liiIllIlliiiIllIll + var3.method_7947();
               }
            }
         }

         return var1;
      }
   }

   private class_2338 Ilillllill(class_1646 v) {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         class_2338 var2 = v.method_24515();
         class_243 var3 = v.method_33571();
         class_2338 var4 = null;
         double var5 = -1.0E9;

         for (class_2350 var8 : class_2353.field_11062) {
            class_2338 var9 = var2.method_10093(var8);
            if ((!this.ilillIiill(var9) || !this.ilillIiill(var9.method_10084())) && !this.ilillIiill(var9.method_10084())) {
               int var10 = 0;

               for (class_2350 var12 : class_2353.field_11062) {
                  if (var12 != var8 && (this.ilillIiill(var2.method_10093(var12)) || this.ilillIiill(var2.method_10093(var12).method_10084()))) {
                     var10++;
                  }
               }

               for (int var15 = 1; var15 <= 2; var15++) {
                  class_2338 var16 = var2.method_10079(var8, var15);
                  if (this.liilliiill(var16) && (var15 != 2 || !this.ilillIiill(var9))) {
                     double var13 = (double)var10 * 10.0
                        + (this.IIIillIIil(var16, var3) ? 5.0 : 0.0)
                        + (var15 == 2 ? 1.0 : 0.0)
                        - 0.15 * Math.sqrt(var16.method_10262(Iiiilllliiilll.field_1724.method_24515()));
                     if (var13 > var5) {
                        var5 = var13;
                        var4 = var16;
                     }
                  }
               }
            }
         }

         return var4;
      } else {
         return null;
      }
   }

   @Override
   protected void Iliilliiilii(lIiIlliiIiIlli event) {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         class_4587 var2 = new class_4587();
         CorzClient.fontManager.iIlIlllllill(var2);
         IIliiIlllIliiIll var3 = CorzClient.fontManager.lIiiIiIlilli();
         iIIiiIlIlIiiIl.IIlllIlliIll();
         if (this.ilIilIilIiIilIil.Iilllilliill()) {
            this.IIiiillIiiil(var2, var3);
         }

         if (this.iIlilIilIllilIil.Iilllilliill()) {
            this.illiilIiliil(var2);
         }
      }
   }

   private lilIiIiliilIiIil Iillllilll(IiIlIIiliIlIIi byDistance, List<lilIiIiliilIiIil> t) {
      lilIiIiliilIiIil var3 = null;

      for (lilIiIiliilIiIil var5 : t) {
         if (this.iIlllIllll(var5)
            && var5.lIIiillIil.isEmpty()
            && this.IliiIlillliiIlil - var5.liIiillIil >= (long)this.IlIliIilllIliIil.Iilllilliill() * 3L
            && IIilIlIllIilIlIl.IilliliilIIi(var5, byDistance)) {
            if (!var5.iIlIlllllill(byDistance)) {
               return var5;
            }

            if (var3 == null) {
               var3 = var5;
            }
         }
      }

      if (var3 == null) {
         return null;
      } else {
         for (lilIiIiliilIiIil var7 : t) {
            if (var7.IIIiillIil && IIilIlIllIilIlIl.IilliliilIIi(var7, byDistance) && !var7.iIlIlllllill(byDistance)) {
               return null;
            }
         }

         return var3;
      }
   }

   private void iiIilIIlil(class_1297 hit, class_3966 v) {
      class_1269 var3 = Iiiilllliiilll.field_1761.method_2917(Iiiilllliiilll.field_1724, hit, v, class_1268.field_5808);
      if (!var3.method_23665()) {
         var3 = Iiiilllliiilll.field_1761.method_2905(Iiiilllliiilll.field_1724, hit, class_1268.field_5808);
      }

      if (var3 instanceof class_9860 var4 && var4.comp_2909() == class_9861.field_52427) {
         Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
      }
   }

   private boolean IIIillIIil(class_2338 feet, class_243 target) {
      class_243 var3 = new class_243(
         (double)feet.method_10263() + Double.longBitsToDouble(8929098534922795342L ^ 4902880468053571918L),
         (double)feet.method_10264() + Double.longBitsToDouble(660593259493429076L ^ 3950516230991371960L),
         (double)feet.method_10260() + Double.longBitsToDouble(3643192923524525728L ^ 968054744866451104L)
      );
      class_3965 var4 = Iiiilllliiilll.field_1687
         .method_17742(new class_3959(var3, target, class_3960.field_17558, class_242.field_1348, Iiiilllliiilll.field_1724));
      return var4.method_17783() == class_240.field_1333
         || var4.method_17784().method_1025(var3) >= target.method_1025(var3) - Double.longBitsToDouble(-4528315349176901237L ^ -73462642551844168L);
   }

   public void IIlilllIlill(IiIlIIiliIlIIi t) {
      if (t != null) {
         this.iIIiiIilIlIiiIil.remove(t);
         this.llIiiIililIiiIil.remove(t);
      }

      iiiIIIlIIIlIIl.liiiIIllIl();
   }

   private boolean liliIliiliIl() {
      return Iiiilllliiilll.field_1755 instanceof class_465
         && !(Iiiilllliiilll.field_1755 instanceof class_490)
         && !(Iiiilllliiilll.field_1755 instanceof class_492)
         && Iiiilllliiilll.field_1724.field_7512 != null
         && Iiiilllliiilll.field_1724.field_7512 != Iiiilllliiilll.field_1724.field_7498;
   }

   private void illiilIiliil(class_4587 matrices) {
      UUID var2 = this.Iillllillillllil.peek() != null ? this.Iillllillillllil.peek().IIiIIiIlIl : null;
      List var3 = this.liIiiiiIii();

      for (lilIiIiliilIiIil var5 : this.lIiliIiliIiliIil.lIiiIiIlilli()) {
         boolean var6 = var2 != null && var2.equals(var5.lIilillIil);
         IiIlIIiliIlIIi var7 = this.iiIiilIIliil(var5, var3);
         if (var7 != null || var6) {
            class_1646 var8 = this.lIiliIiliIiliIil.liiiIIllIl(var5.lIilillIil);
            if (var8 != null) {
               double var9 = Math.sqrt(var8.method_5858(Iiiilllliiilll.field_1724));
               if (!(var9 > 32.0)) {
                  class_243 var11 = llilllililll.iIlIlllllill(var8.method_73189().method_1031(0.0, (double)var8.method_17682() + 0.55, 0.0));
                  if (var11 != null && !(var11.field_1350 < 0.0) && !(var11.field_1350 > 1.0)) {
                     String var12 = var6
                        ? var5.IiilillIil + IliIlllilIi<"IliIlllilIi","3VyIqYW6q8WbJMgUSdnB3hAyvtEtAU9DIuGYZQ1zJzMldwNf8Gs=">()
                        : var5.IiilillIil;
                     iIIiiIlIlIiiIl.IIillIiliIil(
                        matrices,
                        var12,
                        this.Illiilllliil(var5, var7),
                        this.lIliiliIliil(var5, var7, var6),
                        (float)var11.field_1352,
                        (float)var11.field_1351,
                        var9 > 16.0 ? 0.75F : 1.0F
                     );
                  }
               }
            }
         }
      }
   }

   public String iIllilIlllil() {
      long var4 = -7546601570268187017L;
      if (!this.IliIlllilIi() && this.lllIIlilillIIlil == iIlIIiIllIIi.iiIIiliiIIlIilii) {
         var4 ^= ((long)this.liiliIiliiiliIil.size() << 32 ^ var4) & -1L << 32;
         String var2 = (int)(var4 >>> 32) == 0 ? "" : this.liiliIiliiiliIil.get(0).Iilllilliill();
         String var3 = (int)(var4 >>> 32) + IliIlllilIi<"IliIlllilIi","8TV6RyEVeQI2Nqb4ShXpcJkME8eKsq7hCrCqvX4=">() + var2;
         if (!var3.equals(this.illlIlilIillIlil)) {
            this.illlIlilIillIlil = var3;
            this.lillIliliillIlil = (int)(var4 >>> 32) == 0
               ? IliIlllilIi<"IliIlllilIi","jj2bnvQXQtkvLjwwqSvWgtGUmQq0NiSPPRK8K5Jsk9Vckmrh3YYFtXw=">()
               : (
                  (int)(var4 >>> 32) == (531179537 * -65 * 1527099483 ^ -1618833612)
                     ? var2
                     : var2
                        + IliIlllilIi<"IliIlllilIi","WxldPTa0jzFdyR9rUvLEn3WNI+QqZwKZ0N2YU+rT4Q==">()
                        + ((int)(var4 >>> 32) - 1)
                        + IliIlllilIi<"IliIlllilIi","7wzLFb1XTSJbyEcMh0zperNtN9eNm/6sgjZh6KBvmuQG">()
               );
         }

         return this.lillIliliillIlil;
      } else {
         return this.IiiIilliiIil();
      }
   }

   private void liiIlliiiIll(String why) {
      this.lllIllillIll();
      this.iilliIilIIiliIil.iIlIlllllill();
      this.IilliIillilliIil.IiIlliIliiIl();
      this.IliliIillliliIil.Illlllllilll();
      this.IIIllllIIlll();
      this.lIIIlliIIIll();
      this.IIIlIlillIIlIlil = why;
      if (this.lIiiIliliIiiIlil != IIIIllIllIIIllIl.ilIillIiIl) {
         this.lIiIlliIiIll(IIIIllIllIIIllIl.ilIillIiIl);
      }
   }

   private static boolean IIIIIllIIIIl(class_6880<class_3414> sound) {
      try {
         return sound != null
            && ((class_3414)sound.comp_349())
               .comp_3319()
               .method_12832()
               .startsWith(IliIlllilIi<"IliIlllilIi","cUkg21eh0KeijBRvwTGdszH/AaQ4Qu1wmGnoD5eTdlMhY/wxyFqNwP6ZAarraIj5aw==">());
      } catch (Exception var2) {
         return false;
      }
   }

   private void lIliliIlil() {
      iIIIIIIlIlIIIIIl var1 = this.Iillllillillllil.peek();
      if (var1 == null) {
         this.IiiiIlliiiIl();
         this.lIIIlliIIIll();
         this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
      } else if (!this.illiIlIiliIl()) {
         this.IliliIillliliIil.Illlllllilll();
         this.lIIIlliIIIll();
         this.IIililIili(IliIlllilIi<"IliIlllilIi","8InAJ9zXVsabHqkjgp6v+uMW45n370PzJ6fLorU6zBFGOu1kuWfTjWeixgvDvd49v6kX">());
      } else {
         iIiliIlili var2 = this.IliliIillliliIil.Iilllilliill();
         this.llIIIlilIIIl(var1.IIiIIiIlIl);
         if (var2 != iIiliIlili.IiiiiIIlliiiiIIl && var2 != iIiliIlili.iIlIIlIlIllIIlIl && var2 != iIiliIlili.lllIIlIlillIIlIl) {
            this.Illillllil(var1, var2 == iIiliIlili.lIIIIlIliIIIIlIl);
         }

         switch (var2) {
            case IiiiiIIlliiiiIIl:
            default:
               break;
            case iiiiiIIlIIIIIlIl:
               var1.iiiIIiIlIl = 0;
               this.IiiiiIilliiiiIil.keySet().removeIf(k -> k.startsWith(IliIlllilIi<"IliIlllilIi","c/kGHouE2c5mpjBJQD9MG9xLF5IPj1sr10d53yjg2yTW">()));
               if (var1.lilIIiIlIl == llliilililliilil.iiIlllllil && this.IiIIIlliIIIl(class_1802.field_8687) >= var1.lIiIIiIlIl) {
                  this.IiiiIlliiiIl();
                  this.IliliIillliliIil.Illlllllilll();
                  this.lIIIlliIIIll();
                  this.lliliilili();
                  this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
               } else if (this.IliiIlillliiIlil % 20L == 0L) {
               }
               break;
            case IIlIIlIllIlIIlIl:
               this.iIIlllIlIlll(
                  var1.iilIIiIlIl.Illlllllilll() + IliIlllilIi<"IliIlllilIi","qfgnSxvQKnh89VrT5Ubek0l8SFx9JCvgojCXW7BuyO1IBrwZSq0Y+NCl1/w=">(), true
               );
               this.IiiiIlliiiIl();
               this.IliliIillliliIil.Illlllllilll();
               this.lIIIlliIIIll();
               this.lliliilili();
               this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
               break;
            case lIIIIlIliIIIIlIl:
               this.illilIilil(var1);
               break;
            case IlIIIlIlllIIIlIl:
               this.lililiilil(var1);
               break;
            case ilIIIlIlIiIIIlIl:
               this.iIiilIliil(var1);
               break;
            case liIIIlIliiIIIlIl:
               this.Iiiilliiil(var1);
               break;
            case iIlIIlIlIllIIlIl:
               this.IiiiIlliiiIl();
               this.IliliIillliliIil.Illlllllilll();
               this.lIIIlliIIIll();
               this.IIililIili(IliIlllilIi<"IliIlllilIi","8InAJ9zXVsabHqkjgp6v+uMW45n370PzJ6fLorU6zBFGOu1kuWfTjWeixgvDvd49v6kX">());
               break;
            case lllIIlIlillIIlIl:
               String var3 = this.IliliIillliliIil.IiIlliIliiIl();
               this.IiiiIlliiiIl();
               this.IliliIillliliIil.Illlllllilll();
               this.lIIIlliIIIll();
               this.IIililIili(var3.isEmpty() ? IliIlllilIi<"IliIlllilIi","MK/Hg6nFbeD/3kUymQgoN9Mz6hbuIKea2XRJzrbGAv1f98dQb/2pqnIxNkU=">() : var3);
         }
      }
   }

   private boolean iiliiIIiii() {
      boolean var1 = false;

      for (IiIlIIiliIlIIi var3 : this.liiliIiliiiliIil) {
         if (var3.liiliIiliiiiliIili && this.IIliilIlii(var3)) {
            if (!var3.IiIlliIliiIl()) {
               return false;
            }

            var1 = true;
         }
      }

      return var1;
   }

   private void lIiIlliIiIll(IIIIllIllIIIllIl s) {
      if (s != this.lIiiIliliIiiIlil) {
         this.lIiiIliliIiiIlil = s;
         this.iliiIlilIiiiIlil = this.IliiIlillliiIlil;
      }
   }

   private class_243 liIIiiiIIi(IlIiiIIillIiiIIi s) {
      return new class_243(
         (double)s.lIIiIiiiil + Double.longBitsToDouble(-7247121158385308475L ^ -6589595612789216059L),
         (double)s.iIIiIiiiil + 1.0,
         (double)s.IlIiIiiiil + Double.longBitsToDouble(-6019229039560962445L ^ -7811661691254419853L)
      );
   }

   private void iIIiilIlIiil(class_4587 matrices) {
      if (Iiiilllliiilll.field_1765 instanceof class_3965 var2 && var2.method_17783() == class_240.field_1332) {
         class_2338 var12 = var2.method_17777();
         boolean var4 = this.IilIIlillilIIlil == IlliliIillliliIi.IillIiiIIi;
         boolean var5 = var4 || this.lilllliillll(var12);
         class_238 var6 = var4 ? new class_238(var12) : iIIiiIlIlIiiIl.iliIiiliiiii(var12);
         class_243 var7 = var4
            ? new class_243((double)var12.method_10263() + 0.5, (double)var12.method_10264() + 1.6, (double)var12.method_10260() + 0.5)
            : iIIiiIlIlIiiIl.Iiilliiliiil(var6);
         class_243 var8 = llilllililll.iIlIlllllill(var7);
         if (var8 != null && !(var8.field_1350 < 0.0) && !(var8.field_1350 > 1.0)) {
            String var9 = iIIiiIlIlIiiIl.liiiIIllIl(this.IilIIlillilIIlil);
            String var10 = var5
               ? IliIlllilIi<"IliIlllilIi","XxafSci9lD/30igKUtQ3hxZYUyy9D6Yro4aroI6CpbxXa7XY7AsI/qw3v4lS3U4=">()
               : IliIlllilIi<"IliIlllilIi","2catixULz9ottJqAvoPv/GenBtB/I/gLEZHle2QgoXLvUSdM30dq">();
            String var11 = var5 ? var9 : IliIlllilIi<"IliIlllilIi","y9ZFD2CAimIhUn+Fr7zwV0DtIaEgLiccfcmpmigcZzQmiVukaGi+dwXaLEH/tvErLPqxnUxTcuqC8Lrtg2ao">();
            iIIiiIlIlIiiIl.IIillIiliIil(
               matrices, var10, var11, var5 ? iIIiiIlIlIiiIl.IliIlllilIi(this.IilIIlillilIIlil) : -38037, (float)var8.field_1352, (float)var8.field_1351, 1.0F
            );
            return;
         }

         return;
      }
   }

   private void lllIllillIll() {
      Iiiilllliiilll.field_1690.field_1894.method_23481(false);
      Iiiilllliiilll.field_1690.field_1881.method_23481(false);
      Iiiilllliiilll.field_1690.field_1913.method_23481(false);
      Iiiilllliiilll.field_1690.field_1849.method_23481(false);
      Iiiilllliiilll.field_1690.field_1903.method_23481(false);
      illIilIilIil.IliIlllilIi(Iiiilllliiilll.field_1690.field_1832, false);
      illIilIilIil.IliIlllilIi(Iiiilllliiilll.field_1690.field_1867, false);
   }

   private boolean IIiiIllIiiIl() {
      if (!(Iiiilllliiilll.field_1755 instanceof class_465)) {
         return false;
      } else {
         return this.iIiiIlIliiIl()
            ? false
            : !this.iiillIilIIIilIil.Iilllilliill().equals(IliIlllilIi<"IliIlllilIi","Y9o2Gd3GL8UkZ3gDYn6gInHXt4hI0U6XXsKkX9UJVOLRpsTt">())
               || !this.illiIlIiliIl();
      }
   }

   @Override
   protected void Iilililiiili() {
      this.iiiIIlIIIlIl();
      this.lllIllillIll();
      this.iilliIilIIiliIil.iIlIlllllill();
      this.IilliIillilliIil.IiIlliIliiIl();
      this.IliliIillliliIil.Illlllllilll();
      this.IiiiIlliiiIl();
      this.lIIIlliIIIll();
      this.iiiIlIIIll();
   }

   @Override
   protected void Illillliilli() {
      if (this.IilIlllilIll()) {
         this.iIIlllIlIlll(
            IliIlllilIi<"IliIlllilIi","dq4pkNPENx7cAQ00XaMRrpXwcWhde69SGJjofnvmkHacppj3j/uQlaqgODRJwPO3Nrug6VVaxxpH40rK5HW7wPO/ZEPpHFoRIjTuZNiCTQ2c5O6VWOVbG3PP5qpnFuqSEXnWZlw=">(),
            false
         );
         this.IIillIiliIil(false);
      } else {
         if (this.lllIIlilillIIlil != iIlIIiIllIIi.iiIIiliiIIlIilii) {
            this.iiIIilIIlIil(null);
         }

         this.iiiIlIIIll();
         this.ililiIilIiiliIil.lliiiIiliiliiiIili = 0;

         for (IiIlIIiliIlIIi var2 : this.liiliIiliiiliIil) {
            var2.lliiiIiliiliiiIili = 0;
         }

         this.iIIlIlilIlIlIlil = "";
         this.llIlIlililIlIlil = false;
         if (this.liIiiiiIii().isEmpty()) {
            this.iIIlllIlIlll(
               this.liiliIiliiiliIil.isEmpty()
                  ? IliIlllilIi<"IliIlllilIi","iVNQTE7wLKDePvxT4UvGBaZEmKLQyV6ikeMESYjyDGJn9rLN6gT/B1GcGm5jVNn6e16hl6aFHIwJxA/YptN/3ivmlB2tBjCm6B3T6ShCiVkJnX2eotFvMXtelg==">()
                  : IliIlllilIi<"IliIlllilIi","WPN55lC2GC9N3nsWe69411diNLWrwGIfI4jDMM7Dm10UdbWlgBhn09mv7Uned76kBGxiK9ENq/I6/3TFsAMpB3wd5NaqclEndfJ6I8kViXUB5sR6hINjpkE046hOzAmKvu2tdwyexnvosnylz01St+nx2urDkHdoryM=">(),
               false
            );
            this.IIillIiliIil(false);
         } else {
            this.iIIlllIlIlll(IliIlllilIi<"IliIlllilIi","My2/QoiwGlbJrTzyZnGre7+FquP2J9t8+i97tRRFFovtoF8XwoXot8jswVQ/rA9YiucAW07cEOQ=">(), true);
            if (this.IIiIiIillIiIiIil.Iilllilliill() || this.lilIiIiliilIiIil.Iilllilliill()) {
               this.iIIlllIlIlll(this.IIillllIilll(), !this.IIIiiIillIIiiIil.isEmpty());
            }

            this.IIiiiIillIiiiIil = true;
            if (this.IiIIiIilliIIiIil.Iilllilliill() && !this.IIIiIllIIiIl(IlliliIillliliIi.IillIiiIIi)) {
               this.iIIlllIlIlll(
                  IliIlllilIi<"IliIlllilIi","QUzgAoBfVGD3dBGB/qqzNBynOoFxFZSickmyo2gjoGY+CGLeSbc/ueNMYhtqv7nR2/lcyiIVcnzCnzVgRaOlWqwLI91QhrG+RnfSEmwF85V9Fzw+PPVJo4/3Q2/3tMHJ1IXxDg2I5q4fd4vGtbVeANRKLDwGxOA93S4yG5KR6dKjWF5Qx8Lvq2OhBFGWV+Fo+S/nkFY99WbDvuUlEg==">(),
                  false
               );
            }
         }
      }
   }

   public boolean lliIililiIil() {
      return this.IliIlllilIi() && this.lIiiIliliIiiIlil == IIIIllIllIIIllIl.ilIillIiIl;
   }

   private boolean IIIiIllIIiIl(IlliliIillliliIi role) {
      if (Iiiilllliiilll.field_1687 == null) {
         return false;
      } else {
         String var2 = Iiiilllliiilll.field_1687.method_27983().method_29177().toString();

         for (IlIiiIIillIiiIIi var4 : this.IIIiiIillIIiiIil) {
            if (var4.IilliliilIIi(var2) && iIIiIlIlIiIl(var4, role)) {
               return true;
            }
         }

         return false;
      }
   }

   private float[] IIlIilIlIi(IlIiiIIillIiiIIi s) {
      class_243 var2 = this.liIIiiiIIi(s);
      double var3 = var2.field_1352 - Iiiilllliiilll.field_1724.method_23317();
      double var5 = var2.field_1350 - Iiiilllliiilll.field_1724.method_23321();
      float var7 = (float)Math.toDegrees(Math.atan2(-var3, var5));
      double var8 = var2.field_1351 - (Iiiilllliiilll.field_1724.method_23320() - Double.longBitsToDouble(4523532175279014668L ^ 78218951296643135L));
      return new float[]{var7, ilIiiiIiIiIiiiIi.IilliliilIIi(Math.hypot(var3, var5), var8)};
   }

   @Override
   public JsonElement IIiIllIiIl() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(IliIlllilIi<"IliIlllilIi","8cg3wIItMOdMAzs0xLrzhMpx6y7Jn0rh79QTXaQ=">(), 2);
      JsonArray var2 = new JsonArray();

      for (IiIlIIiliIlIIi var4 : this.liiliIiliiiliIil) {
         var2.add(var4.IIillIiliIil());
      }

      var1.add(IliIlllilIi<"IliIlllilIi","2xymHMOkbCJwDogzvMMvVFmAQsT+GeQQIjAHBP5htPzFR9w=">(), var2);
      JsonArray var6 = new JsonArray();

      for (IlIiiIIillIiiIIi var5 : this.IIIiiIillIIiiIil) {
         var6.add(var5.IiIlliIliiIl());
      }

      var1.add(IliIlllilIi<"IliIlllilIi","a2lLZ9Q+FEoP7siQhPUlhT5/SF0gu2vHv699u48Ff132asjR">(), var6);
      return var1;
   }

   public void llIlllilIlll(IiiIlllliiIlll event) {
      long var3 = 3421638560092522208L;
      if (event.liiiIIllIl() == (1527441150 - 85 - -79 ^ 1527441145)) {
         if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
            var3 ^= ((long)event.IliIlllilIi() << 32 ^ var3) & -1L << 32;
            if (this.lllIIlilillIIlil != iIlIIiIllIIi.iiIIiliiIIlIilii
               && Iiiilllliiilll.field_1755 == null
               && (int)(var3 >>> 32) == ((-(997457348 * -49) >>> 23 | -(997457348 * -49) << 9) ^ 1730480578)) {
               event.IilliliilIIi();
               this.iiIIilIIlIil(null);
               this.iliIIlilIiiIIlil = true;
               this.liiIIliliiiIIlil = System.currentTimeMillis();
            } else if (Iiiilllliiilll.field_1755 != null) {
               if (Iiiilllliiilll.field_1755 instanceof class_492 && this.liIliIiliiIliIil.IiIiliIiiiIi((int)(var3 >>> 32))) {
                  this.IiIlllliIlll();
               }
            } else {
               if (this.IIlliIillIlliIil.IiIiliIiiiIi((int)(var3 >>> 32))) {
                  this.illlllIillll();
               } else if (this.liIliIiliiIliIil.IiIiliIiiiIi((int)(var3 >>> 32))) {
                  this.IiIlllliIlll();
               }
            }
         }
      }
   }

   private long Ilililllilil(class_2338 p) {
      class_2338 var2 = iIIiiIlIlIiiIl.lIiiIiIlilli(p);
      return var2 == null ? p.method_10063() : Math.min(p.method_10063(), var2.method_10063());
   }

   private class_3966 IiIilliIil(class_1646 v) {
      if (Iiiilllliiilll.field_1765 instanceof class_3966 var2 && var2.method_17782() == v) {
         return var2;
      }

      class_243 var6 = Iiiilllliiilll.field_1724.method_33571();
      class_243 var7 = ilIiiIiIii.Iiilliiliiil(Iiiilllliiilll.field_1724.method_36454(), Iiiilllliiilll.field_1724.method_36455());
      class_243 var4 = var6.method_1019(var7.method_1021(Iiiilllliiilll.field_1724.method_55755()));
      class_238 var5 = v.method_5829().method_1014((double)v.method_5871());
      return var5.method_992(var6, var4).map(p -> new class_3966(v, p)).orElse(null);
   }

   private class_2338 liIIlliiIIll(class_2338 target) {
      double var2 = Math.min(this.lllilIilillilIil.Iilllilliill(), Double.longBitsToDouble(3453608260572108472L ^ 8064085076915100277L));

      try {
         class_2338 var4 = IIIlIIIilIIlIIIi.llIIlilIIl(target, var2, null, null, null, IIIlIIIilIIlIIIi.IliIIIliil);
         if (var4 != null) {
            return var4;
         }
      } catch (Exception var5) {
      }

      return target;
   }

   private class_2338 lIlliiIlli(class_2338 pos) {
      if (Iiiilllliiilll.field_1687 == null) {
         return null;
      } else {
         class_2680 var2 = Iiiilllliiilll.field_1687.method_8320(pos);
         if (var2.method_26204() instanceof class_2281 && var2.method_28498(class_2281.field_10770)) {
            return var2.method_11654(class_2281.field_10770) == class_2745.field_12569 ? null : pos.method_10093(class_2281.method_9758(var2));
         } else {
            return null;
         }
      }
   }

   private void llIililIil() {
      iIIIIIIlIlIIIIIl var1 = this.Iillllillillllil.peek();
      if (var1 == null) {
         this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
      } else if (this.illiIlIiliIl()) {
         this.iiiiIlIIIIll();
         this.llIIIlilIIIl(var1.IIiIIiIlIl);
         this.IliliIillliliIil.IliIlllilIi(var1.iilIIiIlIl, this.IiiIiIilliiIiIil.Iilllilliill());
         this.lIiIlliIiIll(IIIIllIllIIIllIl.IiilllIiIl);
      } else {
         class_1646 var2 = this.lIiliIiliIiliIil.liiiIIllIl(var1.IIiIIiIlIl);
         if (var2 == null) {
            this.Iiililiili(var1);
         } else {
            class_243 var3 = var2.method_33571();
            double var4 = var3.method_1022(Iiiilllliiilll.field_1724.method_33571());
            if (var4 > 4.0) {
               if (this.iIiIiIilIliIiIil.Iilllilliill()) {
                  this.lIiIlliIiIll(IIIIllIllIIIllIl.llilllIiIl);
               } else {
                  this.IIililIili(IliIlllilIi<"IliIlllilIi","iElz9JkIIuh39ir7Se+mfuOxlgKZoC87l0epj4UHYRR1RzWeD9fp4sUExvK6U7eqrsL2dTh1+W4SOmNiOY5kFRXb0Q==">());
               }
            } else {
               this.IilliIillilliIil.IilliliilIIi(var3, 1);
               if (this.IliiIlillliiIlil - this.IIIIllillIIIllil >= (long)this.iiiIiIilIIIliIil.Iilllilliill()) {
                  class_3966 var6 = this.IiIilliIil(var2);
                  if (var6 != null) {
                     this.iiIilIIlil(var2, var6);
                     this.IIIIllillIIIllil = this.IliiIlillliiIlil;
                     this.iIIIllilIlIIllil = this.IliiIlillliiIlil;
                  }
               }

               if (this.IliIlllliIll() > (long)this.IlIliIilllIliIil.Iilllilliill()) {
                  this.IIililIili(
                     IliIlllilIi<"IliIlllilIi","Y3b/6TlRlfni+jhba66rdw51SlYST91gyXBn+AaO2C/iRQSOECLn110Ir09/qon/9XR/NrQqx3SBUBVxwoWqVb3v4AnzsGlGzVWSHcsY7Ym/RCHyB/J7rxQl70aNJ0p3pUqYdluypw==">()
                  );
               }
            }
         }
      }
   }

   public String iIiIilIliIil() {
      return this.llIlIlililIlIlil && System.currentTimeMillis() - this.IiIlIlilliIlIlil < (6180184696063592233L ^ 6180184696063547577L)
         ? this.iIIlIlilIlIlIlil
         : "";
   }

   private int llllIlilllIl() {
      if (Iiiilllliiilll.field_1724 == null) {
         return 0;
      } else {
         class_1661 var1 = Iiiilllliiilll.field_1724.method_31548();
         int var2 = 0;

         for (int var3 = 0; var3 <= 35; var3++) {
            if (var1.method_5438(var3).method_7960()) {
               var2++;
            }
         }

         return var2;
      }
   }

   private void Iiiilliiil(iIIIIIIlIlIIIIIl g) {
      this.IiiiIlliiiIl();
      this.IliliIillliliIil.Illlllllilll();
      this.lIIIlliIIIll();
      if (!this.iIllIlIlllIl()) {
         this.iiiliIIIii(
            g.iilIIiIlIl,
            this.lIIlIliIIlIl()
               ? IliIlllilIi<"IliIlllilIi","h9qkBPke7ZDVNha1GBlONRFUo0xyOoFkSHqGf0ZfZ+vfyjUGi3q928UCZCzGwdmO35F+xbBImqSDVitMxPDxbfnXH6Ylk8GTIvnpTMyVgbmpQZaOLrojVm66jDtQfwYkIcv1FHfsY4H8RExpwDJX1OgR8zjTXNuu64Ajw9Hg+oaXWkps">()
               : IliIlllilIi<"IliIlllilIi","B8oPjXAQyaPdR3+N++nsMRE2yiAkdLl1YxjpQ8yhLPnuOeFafDwpWEIFF4M3qSCX3IYIwdXG73CIWU3eyEa9UPR1AnWYwd4g8/mxfRGWOSE3NcdrJD4lLArSM/DrxsfFy2s=">(),
            9023182712323871129L ^ 9023182712323872041L
         );
         this.lliliilili();
         this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
      } else {
         iIIIIIIlIlIIIIIl var2 = this.iillIlIIilIl(IliIlllilIi<"IliIlllilIi","ENW0LqMa3Cp9sc3ND4FnrbRbOHqyM2yMbyRPEjDmsZhyvfabAx68UjxYvg==">());
         if (var2 != null) {
            this.Iillllillillllil.push(var2);
            this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
         } else if (this.ililIlIiilIl()) {
            this.lliliilili();
            this.liilIliiilIl();
         } else {
            this.iiiliIIIii(
               g.iilIIiIlIl,
               !this.IIiIiIillIiIiIil.Iilllilliill() && !this.lIilIliIilIl()
                  ? IliIlllilIi<"IliIlllilIi","jVerTVQAacBO+4DqpXA6jzalf3sY1S6YS8qFyZG8uPQ06MyRXzFCX3vzumqaEI8CU2HTO0Ik11o8ZyTKSCrE9S2f4rk4RZLzjKI=">()
                  : IliIlllilIi<"IliIlllilIi","dlL2W2lxoBJwExKYXYpJvJY9sRIv4XpvLSypAgA1kEH8XBpM2/V8wjWtnpOkGABhFPrbZfs+IJUnow1h/morqskGYf1bWOkxLjFOShDcvfur6ZFn5i1H77jYYFSH0pTwSUQsi08Jdwefiiur5fkqr+E=">(),
               -1189405372656570795L ^ -1189405372656571675L
            );
            this.lliliilili();
            this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
         }
      }
   }

   private boolean IlIlIlllIlIl() {
      if (!this.iilIllIIiIll(IIlilIillIlilIil.class)) {
         return false;
      } else {
         for (IiIlIIiliIlIIi var2 : this.liiliIiliiiliIil) {
            if (var2.IIlllIlliIll() && this.IIliilIlii(var2) && var2.IIIllIIliIIl()) {
               return true;
            }
         }

         return false;
      }
   }

   private void iiiIlIIIll() {
      this.Iillllillillllil.clear();
      this.IiIiiIilliIiiIil.clear();
      this.IIiiiIillIiiiIil = false;
      this.iIiiiIilIliiiIil = false;
      this.iIIiiIilIlIiiIil.clear();
      this.llIiiIililIiiIil.clear();
      this.lliiiIililiiiIil.clear();
      this.IiiiiIilliiiiIil.clear();
      this.iiiiiIilIIIIIlil.clear();
      this.lIiliIiliIiliIil.IlIlllIlilIl();
      this.IliliIillliliIil.Illlllllilll();
      this.lIiiIliliIiiIlil = IIIIllIllIIIllIl.lIilllIiIl;
      this.iliiIlilIiiiIlil = this.IliiIlillliiIlil;
      this.lIlIlliliIlIllil = -5369482724854468204L ^ 8465575330427695508L;
      this.iIllllilIlllllil = false;
      this.IlIlllilllIlllil = null;
      this.liIllliliiIlllil = 0;
      this.lIIllliliIIlllil = 0;
      this.IiIIllilliIIllil = null;
   }

   private void illliIilli() {
      if (this.IliiIlillliiIlil >= this.lIlIlliliIlIllil) {
         if (this.Iillllillillllil.isEmpty() && this.iIllIlIlllIl()) {
            iIIIIIIlIlIIIIIl var1 = this.iillIlIIilIl(IliIlllilIi<"IliIlllilIi","b2f84A2mdEvcP2cFKZzraWNGF/MvY7OCjXcKkOlXG4edT62KPFOE4B4+OIwyttGkndk=">());
            if (var1 != null) {
               this.Iillllillillllil.push(var1);
               this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
               return;
            }

            if (this.llllIlilllIl() == 0 && this.ililIlIiilIl()) {
               this.liilIliiilIl();
               return;
            }
         }

         this.lIiIlliIiIll(IIIIllIllIIIllIl.iIilllIiIl);
      }
   }

   public List<IiIlIIiliIlIIi> iiilllIIIill() {
      return Collections.unmodifiableList(this.liiliIiliiiliIil);
   }

   private static Color iIiiilIliiil(int argb) {
      long var2 = 1119417025299653002L;
      var2 ^= (
            (long)(
                     argb
                              >>> (
                                 ((1150209328 >>> 27 | 1150209328 << 5) * -941362695 >>> 13 | (1150209328 >>> 27 | 1150209328 << 5) * -941362695 << 19)
                                    ^ 776050904
                              )
                           == 0
                        ? -((2047295704 ^ -41) * 2083697005) - 99 ^ 1678723013
                        : argb >>> (-(~(--687716544 ^ -79)) ^ -687716502)
                  )
                  << 32
               ^ var2
         )
         & -1L << 32;
      return new Color(
         argb >> (-1372110081 ^ 61 ^ -45 ^ -13 ^ -1372110094) & (~-31197069 - 85 + -47 ^ 31197175),
         argb >> ((-(~-1444116058) * -991146299 << 5 | -(~-1444116058) * -991146299 >>> 27) ^ -581308294) & (~(~-701612087 * 115) ^ 918988610),
         argb & (-(~(-60011727 * -1527099483 << 29 | -60011727 * -1527099483 >>> 3)) ^ -1109700020),
         (int)(var2 >>> 32)
      );
   }

   private IiIlIIiliIlIIi ilIIllIiIIll() {
      if (!this.illiIlIiliIl()) {
         return null;
      } else {
         class_1916 var1 = ((class_1728)Iiiilllliiilll.field_1724.field_7512).method_17438();
         ArrayList var2 = new ArrayList();

         for (int var3 = 0; var3 < var1.size(); var3++) {
            if (var1.get(var3) != null) {
               var2.add(lIllIilliIllIill.IliIlllilIi((class_1914)var1.get(var3), var3));
            }
         }

         for (IiIlIIiliIlIIi var4 : this.liIiiiiIii()) {
            for (lIllIilliIllIill var6 : var2) {
               if (IIilIlIllIilIlIl.IliIlllilIi(var4, var6)) {
                  return var4;
               }
            }
         }

         return null;
      }
   }

   private void liIlliiIll(iIIIIIIlIlIIIIIl g) {
      switch (g.lilIIiIlIl) {
         case lIllllllil:
         case iIllllllil:
         case IiIlllllil:
            if (g.IIiIIiIlIl == null) {
               g.IIiIIiIlIl = this.llliiillii(g.iilIIiIlIl);
            }

            if (g.IIiIIiIlIl == null) {
               this.Iiililiili(g);
               return;
            }

            if (g.lilIIiIlIl == llliilililliilil.IiIlllllil && this.IIllllIlll(g)) {
               return;
            }

            this.lIiIlliIiIll(this.iIiIiIilIliIiIil.Iilllilliill() ? IIIIllIllIIIllIl.llilllIiIl : IIIIllIllIIIllIl.ililllIiIl);
            break;
         case IIllllllil:
            IlIiiIIillIiiIIi var3 = this.IlilIlllilIl();
            if (var3 == null) {
               this.Iillllillillllil.pop();
               this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
               return;
            }

            g.iliIIiIlIl = var3;
            g.lliIIiIlIl = var3.ilIiIiiiil;
            g.IiiIIiIlIl = var3.ilIiIiiiil == IlliliIillliliIi.IillIiiIIi && this.iIiIiIilIliIiIil.Iilllilliill() ? this.IilIililIi(var3) : null;
            this.lIiIlliIiIll(this.iIiIiIilIliIiIil.Iilllilliill() ? IIIIllIllIIIllIl.liilllIiIl : IIIIllIllIIIllIl.iiilllIiIl);
            break;
         case liIlllllil:
            IlIiiIIillIiiIIi var2 = this.IlIIllllIIll(g.lliIIiIlIl);
            if (var2 == null) {
               this.Iillllillillllil.pop();
               this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
               return;
            }

            g.iliIIiIlIl = var2;
            this.lIiIlliIiIll(this.iIiIiIilIliIiIil.Iilllilliill() ? IIIIllIllIIIllIl.liilllIiIl : IIIIllIllIIIllIl.iiilllIiIl);
            break;
         case iiIlllllil:
            this.lIiIlliIiIll(IIIIllIllIIIllIl.iIIillIiIl);
      }
   }

   private void lililiilil(iIIIIIIlIlIIIIIl g) {
      this.IiiiIlliiiIl();
      this.IliliIillliliIil.Illlllllilll();
      this.lIIIlliIIIll();
      this.IIiillIiil(g, this.IliliIillliliIil.iliIiiliiiii());
   }

   private void IiIlllliIlll() {
      class_1646 var1 = this.iiIlllIIllll();
      if (var1 == null) {
         this.iIIlllIlIlll(IliIlllilIi<"IliIlllilIi","qgfS1xLwJqjN8e9ocSSqjakFYQvST6nkz80RMPITolFLyt4trVqNFrUpyaowUfDdgak3X20pi2XQ3WvUbEqebA==">(), false);
      } else {
         lilIiIiliilIiIil var2 = this.lIiliIiliIiliIil.IilliliilIIi(var1.method_5667());
         var2.IliIlllilIi(var1, this.IliiIlillliiIlil);
         if (this.illiIlIiliIl()) {
            this.llIIIlilIIIl(var1.method_5667());
         }

         if (var2.lIIiillIil.isEmpty()) {
            this.iIIlllIlIlll(
               IliIlllilIi<"IliIlllilIi","TOA1g2yYzQYC3NonLy4FDY29eZk91zxZ3MHywL/C9C2BWkg1e5SEgtY3CIUqud4AEXTYQJe9CtMpo2WBmGb4q7Mtgrx7ylqRVpCWeA2UluPEQXmY2TUn7xD0PeTjowXa13RSNoC9TFkGmCh9KTH0bOQeqvbC+lEGKPcSJuwkWgBB8TznGuj7">(),
               false
            );
         } else {
            IiIlIIiliIlIIi var3 = this.lIlllliIllll(var2);
            if (var3 == null) {
               this.iIIlllIlIlll(
                  IliIlllilIi<"IliIlllilIi","hC+Dgcw29LlWLNbn4qhjXeB3gYYhDV9vbWF9r2F6a1Z6">()
                     + var2.IiilillIil
                     + IliIlllilIi<"IliIlllilIi","SuAGcHA4SM4dwBIlhEpoAPjAk4kXDci2CC5cGvPuKGvLKMX70/SUOWCC3on4n5pUK9fwv+4pZ27rz67F9uluLfcC2hDMC0/u6BuWm6ne4UhsL5J6sfoujqlD0F5tp6vO4fgoC5qCqR8duPFX0ZTXQ8QS+0lPXkrK/P4y+MOAxZQ=">(),
                  false
               );
            } else if (this.lIIilliIIill(var3) >= 0) {
               this.iIIlllIlIlll(
                  IliIlllilIi<"IliIlllilIi","T1HSQAqi6/Na41V+aLufpJMasBPZJ8DtR4Jr/UY+Tt8WfEJ/NhXTyOPz9WhG5WGTMO0=">() + var3.Iilllilliill(), false
               );
            } else {
               this.IlIillllIill(var3);
               this.iIIlllIlIlll(IliIlllilIi<"IliIlllilIi","QYYAwjk19R8G54oRrU1egx9G62jwuawioYgmc5AQjHKe3DVf2m4pdk0=">() + var3.Iilllilliill(), true);
            }
         }
      }
   }

   private void illilIilil(iIIIIIIlIlIIIIIl g) {
      String var2 = this.IliliIillliliIil.IiIlliIliiIl();
      lilIiIiliilIiIil var3 = this.lIiliIiliIiliIil.iIlIlllllill(g.IIiIIiIlIl);
      lIllIilliIllIill var4 = var3 != null ? var3.IiIlliIliiIl(g.iilIIiIlIl) : null;
      if (var4 != null) {
         this.lIIiiiIIii(
            IliIlllilIi<"IliIlllilIi","HXmu0pSNQvfA5fvGREPHxsN+YtQG+fZ1gikkWEquNMAe+w==">() + var3.lIilillIil,
            g.iilIIiIlIl.Illlllllilll()
               + IliIlllilIi<"IliIlllilIi","Djc+9ET2Lx2SNmQJMK41ACFK8hFfpa3lpgWlJpgNBuAxxXo=">()
               + var4.lIIiIilill
               + IliIlllilIi<"IliIlllilIi","Hkvgml3TBhdW7iNg3BgeVE6JB5dhu2wqXgDHVLsL5GTHykGfx5ZgaFD4cqNq">()
               + var3.IiilillIil
               + IliIlllilIi<"IliIlllilIi","poyiE7j7impodXBZKhLGIBeF+eo/PYE4ucCsUCiAEA==">()
               + var3.llilillIil.method_23854()
               + IliIlllilIi<"IliIlllilIi","hAKloIHtlnNXTgvaL7Qg/p0fcO+HUiynwB7iFFOXswr4NX0rOlbRq7b0mTh6/ohaxqx2xp3WgOZmua2UHR4=">()
               + g.iilIIiIlIl.IlliiIilillliiIili
               + IliIlllilIi<"IliIlllilIi","m0o6/7HnGKJVrRF2AerzzHFL0xnM9qKNOnTCHs0HQPfkb15Zcqp1l7biRkZuu/SiYoPdinaDAbYOZ45zt+hsozcCl0yS2A==">(),
            false,
            -665549704299643384L ^ -665549704299648648L
         );
      }

      this.IiiiIlliiiIl();
      this.IliliIillliliIil.Illlllllilll();
      this.lIIIlliIIIll();
      UUID var5 = this.llliiillii(g.iilIIiIlIl);
      if (var5 != null && !var5.equals(g.IIiIIiIlIl)) {
         g.IIiIIiIlIl = var5;
         g.iiiIIiIlIl = 0;
         this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
      } else {
         this.lliliilili();
         this.lIiIlliIiIll(IIIIllIllIIIllIl.IlilllIiIl);
      }
   }

   private void Illillllil(iIIIIIIlIlIIIIIl stillDrained, boolean g) {
      lilIiIiliilIiIil var3 = this.lIiliIiliIiliIil.iIlIlllllill(stillDrained.IIiIIiIlIl);
      if (var3 != null) {
         var3.lIiiIiIlilli(stillDrained.IIIlIiIlIl, g);
      }

      stillDrained.IIIlIiIlIl = false;
   }

   private IiIlIIiliIlIIi Iliiilliii() {
      IiIlIIiliIlIIi var1 = new IiIlIIiliIlIIi();
      var1.liiliIiliiiiliIili = true;
      var1.IIIiiIililIIiiIili = this.iililIilIIiilIil.Iilllilliill().equals(IliIlllilIi<"IliIlllilIi","mfqB+06NfQ9LuGPKkd8bTPqMshFe92q3k5dGe1DoOQM=">())
         ? llIlIlIlilIlIlIl.iilIliilIl
         : llIlIlIlilIlIlIl.IilIliilIl;
      String var2 = this.lIiilIiliIiilIil.Iilllilliill();

      var1.iIIiiIiliIlIiiIili = switch (var2) {
         case IliIlllilIi<"IliIlllilIi","QqK/VhtENyCm2da+nVO41N0Ac4NNYGw5r9HHDRW2RgA=">() -> ililIlIiilIl.liiIIilliiiIIill;
         case IliIlllilIi<"IliIlllilIi","61dPeki85lhbjC+DW90QebO7rPsZqVz1dKNJh3Am1kkEw2Y=">() -> ililIlIiilIl.iliIIillIiiIIill;
         default -> ililIlIiilIl.IliIIilllliIIill;
      };
      if (var1.IIIiiIililIIiiIili == llIlIlIlilIlIlIl.iilIliilIl) {
         var1.iIIiiIiliIlIiiIili = ililIlIiilIl.iliIIillIiiIIill;
      }

      var1.llIiiIiliilIiiIili = this.IililIillililIil.Iilllilliill();
      var1.IiIiiIililiIiiIili = this.IliilIillliilIil.Iilllilliill();
      var1.iiIiiIiliIIliiIili = this.iliilIilIiiilIil.Iilllilliill();
      var1.lIliiIiliiIliiIili = this.liiilIiliiiilIil.Iilllilliill();
      var1.IlliiIilillliiIili = this.IIIIiIillIIIiIil.Iilllilliill();
      var1.illiiIiliIiliiIili = this.llIIiIililIIiIil.Iilllilliill();
      var1.liliiIiliiiliiIili = this.iIIIiIilIlIIiIil.Iilllilliill();
      return var1;
   }

   private class_1542 iIIliIlIli(IlIiiIIillIiiIIi site) {
      class_243 var2 = site.iIlIlllllill();

      for (class_1542 var4 : Iiiilllliiilll.field_1687
         .method_8390(
            class_1542.class,
            new class_238(var2, var2).method_1009(5.0, 3.0, 5.0),
            e -> e.method_5805() && e.method_24828() && this.lIlIIliIlIIl(e.method_6983())
         )) {
         boolean var5 = Math.abs(var4.method_23317() - var2.field_1352) < 0.7
            && Math.abs(var4.method_23321() - var2.field_1350) < 0.7
            && var4.method_23318() >= (double)site.iIIiIiiiil - 0.5
            && var4.method_23318() <= (double)site.iIIiIiiiil + 2.0;
         if (!var5) {
            return var4;
         }
      }

      return null;
   }

   private boolean iilIiIIiIi() {
      return Iiiilllliiilll.field_1724.method_24828()
         && !Iiiilllliiilll.field_1724.method_5715()
         && Iiiilllliiilll.field_1724.method_18376() == class_4050.field_18076
         && Iiiilllliiilll.field_1724.method_18798().method_37268() < Double.longBitsToDouble(9073625079742682297L ^ 4823859934670034836L);
   }

   private void iiiliIIIii(IiIlIIiliIlIIi why, String t, long ticks) {
      if (why != null) {
         this.iIIiiIilIlIiiIil.put(why, this.IliiIlillliiIlil + Math.max(ticks, (long)this.lIIliIiliIIliIil.Iilllilliill()));
         this.llIiiIililIiiIil.put(why, t);
         this.lIIiiiIIii(
            IliIlllilIi<"IliIlllilIi","qcdP8ILfkUep0gaei1mb0AYqEg5Sta/Pt2KPRS0dHSZQSQ==">()
               + System.identityHashCode(why)
               + IliIlllilIi<"IliIlllilIi","93b/DfP/LygkQ0N7W+j4F+esUPCBM7TqbW3rnpI=">()
               + t,
            IliIlllilIi<"IliIlllilIi","HdvW1PGaNMsrishe1JzOIU48q8T0Zp798vtNrVmeFnKz/73p">()
               + why.Illlllllilll()
               + IliIlllilIi<"IliIlllilIi","cUAx88J5RBnKNlSdSW8qUQRTVcUNfzrdLIlli7bb/a92">()
               + t
               + IliIlllilIi<"IliIlllilIi","ptI4llSJTaW2WYu+fpEmWqKqC6bQm/qHOK5lIN0=">(),
            false,
            7780515769583983383L ^ 7780515769583979623L
         );
      }
   }

   private boolean iIllIlIlllIl() {
      if (Iiiilllliiilll.field_1724 == null) {
         return false;
      } else {
         class_1661 var1 = Iiiilllliiilll.field_1724.method_31548();

         for (int var2 = 0; var2 <= 35; var2++) {
            if (this.iiIIIlIIlIIl(var1.method_5438(var2))) {
               return true;
            }
         }

         return false;
      }
   }
}
