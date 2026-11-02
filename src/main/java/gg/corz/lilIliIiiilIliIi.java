package gg.corz;

import com.corz.client.mixins.AccessorClientPlayNetworkHandler;
import com.corz.client.mixins.AccessorInput;
import com.corz.client.mixins.AccessorKeyBinding;
import net.minecraft.class_10185;
import net.minecraft.class_1656;
import net.minecraft.class_241;
import net.minecraft.class_243;
import net.minecraft.class_304;
import net.minecraft.class_315;
import net.minecraft.class_3532;
import net.minecraft.class_3675;
import net.minecraft.class_5498;
import net.minecraft.class_631;
import net.minecraft.class_634;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_3675.class_306;
import net.minecraft.class_3675.class_307;
import org.lwjgl.glfw.GLFW;

public class lilIliIiiilIliIi extends ilIllIiIll {
   private final iiIiiilIIliiil iIiiIliIIi;
   private final IIIIlilllIIIlill liliIliIIi = new IIIIlilllIIIlill(
      IliIlllilIi<"IliIlllilIi","zq7IMMQUX6Tn8Z5GgW/Nex/9LDDUWeYONl1znPXpfWyt">(),
      IliIlllilIi<"IliIlllilIi","2HLJP6J8oLPHEui5eSXGYozuUw4psg3X7SRNR5m6c9h3KmSY1A1inlI5e9k=">(),
      1.0,
      0.1,
      50.0,
      0.1
   );
   private final iiIiiilIIliiil IIiiIliIIi;
   private float liIIlliIIi;
   private boolean IiiIlliIIi;
   private boolean IilIlliIIi;
   private final iiIiiilIIliiil lIiiIliIIi;
   private double lIIIlliIIi;
   private boolean IIiIlliIIi;
   private double iiiiIliIIi;
   private boolean IllIlliIIi;
   private final iiIiiilIIliiil IliiIliIIi;
   private boolean IIlIlliIIi;
   private boolean iiIIlliIIi;
   private boolean iIiIlliIIi;
   private double IlIIlliIIi;
   private boolean iliIlliIIi;
   private class_5498 illIlliIIi;
   private float ilIIlliIIi;
   private static final int IiliIliIIi = 40;
   private double iIIIlliIIi;
   private float IiIIlliIIi;
   private final iilliIlIIiliIl iliiIliIIi;
   private boolean lllIlliIIi;
   private double IIIIlliIIi;
   private static lilIliIiiilIliIi IiiiIliIIi;
   private int liiIlliIIi;
   private boolean IliIlliIIi;
   private boolean lilIlliIIi;
   private boolean iilIlliIIi;
   private boolean lIiIlliIIi;
   private class_638 lIlIlliIIi;
   private boolean iIlIlliIIi;
   private boolean lliIlliIIi;
   private double liiiIliIIi;
   private final IIIIlilllIIIlill lliiIliIIi;
   private final IIIIlilllIIIlill iiliIliIIi = new IIIIlilllIIIlill(
      IliIlllilIi<"IliIlllilIi","Mc0QRTSACBl8B48DwCNQLHogfR7NaJR7MrZ/ZFYZ4VOSjcct0w4/Q56U">(),
      IliIlllilIi<"IliIlllilIi","UlqLf23gOXi3QNEGNXoEgC5qe3fXcehWB6SpAOJl32LptN2wUt1qn866QhN42+dgtt14qA==">(),
      1.0,
      0.2,
      5.0,
      0.05
   );
   private float llIIlliIIi;

   public static boolean lIIlliIIll() {
      return iiiIlIIIll() && IiiiIliIIi.lIiiIliIIi.Iilllilliill();
   }

   private void Ilillllill(class_746 minSpeedSq, double player, boolean strictForward) {
      long var21 = -2180820916901621442L;
      class_243 var5 = minSpeedSq.method_18798();
      double var6 = var5.field_1352;
      double var8 = var5.field_1350;
      if (!(var6 * var6 + var8 * var8 < player)) {
         double var10 = Math.toRadians((double)minSpeedSq.method_36454());
         double var12 = -Math.sin(var10);
         double var14 = Math.cos(var10);
         double var16 = var6 * var12 + var8 * var14;
         double var18 = var6 * -var14 + var8 * var12;
         var21 ^= ((long)(strictForward ? (Math.abs(var16) > Math.abs(var18) ? 1 : 0) : (Math.abs(var16) >= Math.abs(var18) ? 1 : 0)) << 32 ^ var21)
            & -1L << 32;
         if ((int)(var21 >>> 32) != 0) {
            if (var16 > Double.longBitsToDouble(3877693859577223045L ^ 743151426202631801L)) {
               this.IIiIlliIIi = true;
            } else if (var16 < Double.longBitsToDouble(-2947694416658419146L ^ 7536718753835097034L)) {
               this.lIiIlliIIi = true;
            }
         } else if (var18 > Double.longBitsToDouble(3964208405765708607L ^ 613563529042719427L)) {
            this.iIiIlliIIi = true;
         } else if (var18 < Double.longBitsToDouble(6843598067585341749L ^ -2199662745429151543L)) {
            this.IliIlliIIi = true;
         }
      }
   }

   private static boolean iiIilIIlil(class_304 binding) {
      if (Iiiilllliiilll.field_1755 == null && Iiiilllliiilll.method_1569()) {
         class_306 var1 = ((AccessorKeyBinding)binding).getBoundKey();
         long var2 = Iiiilllliiilll.method_22683().method_4490();
         if (var1.method_1442() != class_307.field_1668) {
            return var1.method_1442() == class_307.field_1672
               ? GLFW.glfwGetMouseButton(var2, var1.method_1444()) == (-1082584833 ^ -61 ^ 11 ^ 1082584886)
               : false;
         } else {
            return var1.method_1444() != class_3675.field_16237.method_1444()
               && GLFW.glfwGetKey(var2, var1.method_1444()) == (~(-166575670 ^ 99) + 117 - 91 ^ 166575729);
         }
      } else {
         return false;
      }
   }

   @Override
   protected void Illillliilli() {
      if (Iiiilllliiilll.field_1724 == null) {
         this.Ililllililil();
      } else {
         this.iiIIlliIIi = true;
         this.IIlIlliIIi = false;
      }
   }

   public static boolean IlIllllIll() {
      return iiiIlIIIll() && IiiiIliIIi.iIiiIliIIi.Iilllilliill();
   }

   public float lililiilil(float tickDelta) {
      return class_3532.method_16439(tickDelta, this.liIIlliIIi, this.ilIIlliIIi);
   }

   private void lllllillll() {
      ilIllIiIll var1 = llilIllililIll.iliIiiliiiii(liiIiiIiiiiIiiIi.class);
      if (var1 != null && var1.IliIlllilIi()) {
         this.IIiIlliIIi = true;
      }
   }

   public void lIliliIlil(double cursorDeltaX, double cursorDeltaY) {
      double var5 = this.lliiIliIIi.Iilllilliill();
      this.llIIlliIIi += (float)(cursorDeltaX * var5) * 0.15F;
      this.ilIIlliIIi = class_3532.method_15363(this.ilIIlliIIi + (float)(cursorDeltaY * var5) * 0.15F, -90.0F, 90.0F);
   }

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         if (this.iiIIlliIIi) {
            this.liIlliiIll();
         }

         if (this.IIlIlliIIi) {
            if (Iiiilllliiilll.field_1687 != this.lIlIlliIIi) {
               this.IIillIiliIil(false);
            } else {
               boolean var1 = ilIllIiIll();
               if (var1) {
                  this.ilillIiill();
                  this.liilliiill();
               } else if (this.liiIlliIIi > 0) {
                  this.liiIlliIIi--;
                  this.Iillllilll();
               }

               this.lIIIlliIIi = this.liiiIliIIi;
               this.iIIIlliIIi = this.iiiiIliIIi;
               this.IlIIlliIIi = this.IIIIlliIIi;
               this.IiIIlliIIi = this.llIIlliIIi;
               this.liIIlliIIi = this.ilIIlliIIi;
               class_1656 var2 = Iiiilllliiilll.field_1724.method_31549();
               if (!var1 && var2.field_7477) {
                  var2.field_7479 = false;
                  this.IllIlliIIi = true;
               }

               class_315 var3 = Iiiilllliiilll.field_1690;
               double var4 = IiIilliIil(var3.field_1894, var3.field_1881);
               double var6 = IiIilliIil(var3.field_1913, var3.field_1849);
               double var8 = IiIilliIil(var3.field_1903, var3.field_1832);
               double var10 = this.liliIliIIi.Iilllilliill();
               double var12 = this.IIiiIliIIi.Iilllilliill() ? 0.5 : 1.0;
               double var14 = Math.toRadians((double)this.llIIlliIIi);
               double var16 = -Math.sin(var14) * var4 * var10 + Math.cos(var14) * var6 * var10;
               double var18 = Math.cos(var14) * var4 * var10 + Math.sin(var14) * var6 * var10;
               double var20 = var8 * var10 * this.iiliIliIIi.Iilllilliill();
               this.liiiIliIIi += var16 * var12;
               this.iiiiIliIIi += var20 * var12;
               this.IIIIlliIIi += var18 * var12;
               this.IIIillIIil();
            }
         }
      }
   }

   private void iIlllIllll() {
      class_746 var1 = Iiiilllliiilll.field_1724;
      class_315 var2 = Iiiilllliiilll.field_1690;
      class_10185 var3 = var1.field_3913.field_54155;
      this.IIiIlliIIi = iiIilIIlil(var2.field_1894) || var3.comp_3159();
      this.lIiIlliIIi = iiIilIIlil(var2.field_1881) || var3.comp_3160();
      this.iIiIlliIIi = iiIilIIlil(var2.field_1913) || var3.comp_3161();
      this.IliIlliIIi = iiIilIIlil(var2.field_1849) || var3.comp_3162();
      this.lliIlliIIi = iiIilIIlil(var2.field_1903) || var3.comp_3163();
      this.iliIlliIIi = iiIilIIlil(var2.field_1832) || var3.comp_3164() || var1.method_5715();
      this.IiiIlliIIi = iiIilIIlil(var2.field_1867) || var3.comp_3165();
      this.lllllillll();
      this.iilllIIill(var1);
   }

   private void iIIilIlIil() {
      if (Iiiilllliiilll.field_1687 != null) {
         Iiiilllliiilll.field_1687.method_2935().method_20180(llIililIil());
         if (Iiiilllliiilll.field_1769 != null) {
            Iiiilllliiilll.field_1769.method_3292();
         }
      }
   }

   private void liilliiill() {
      class_315 var1 = Iiiilllliiilll.field_1690;
      var1.field_1894.method_23481(false);
      var1.field_1881.method_23481(false);
      var1.field_1913.method_23481(false);
      var1.field_1849.method_23481(false);
      var1.field_1903.method_23481(false);
      illIilIilIil.IliIlllilIi(var1.field_1832, false);
      illIilIilIil.IliIlllilIi(var1.field_1867, false);
   }

   private void liIlliiIll() {
      class_746 var1 = Iiiilllliiilll.field_1724;
      this.liiiIliIIi = this.lIIIlliIIi = var1.method_23317();
      this.iiiiIliIIi = this.iIIIlliIIi = var1.method_23318() + (double)var1.method_5751();
      this.IIIIlliIIi = this.IlIIlliIIi = var1.method_23321();
      this.llIIlliIIi = this.IiIIlliIIi = var1.method_36454();
      this.ilIIlliIIi = this.liIIlliIIi = var1.method_36455();
      this.iIlIlliIIi = var1.method_31549().field_7479;
      this.IllIlliIIi = false;
      this.IilIlliIIi = false;
      if (this.lIiiIliIIi.Iilllilliill()) {
         this.illIlliIIi = Iiiilllliiilll.field_1690.method_31044();
         if (this.illIlliIIi.method_31034()) {
            Iiiilllliiilll.field_1690.method_31043(class_5498.field_26665);
            this.IilIlliIIi = true;
         }
      }

      this.iiIIlliIIi = false;
      this.IIlIlliIIi = true;
      this.lIlIlliIIi = Iiiilllliiilll.field_1687;
      this.lilIlliIIi = ((AccessorKeyBinding)Iiiilllliiilll.field_1690.field_1832).getPressedRaw();
      this.iilIlliIIi = ((AccessorKeyBinding)Iiiilllliiilll.field_1690.field_1867).getPressedRaw();
      this.iIlllIllll();
      this.lIilliIill();
      this.liiIlliIIi = (~(-420275057 * 1227133513) * -1056139499 << 17 | ~(-420275057 * 1227133513) * -1056139499 >>> 15) ^ -1154403294;
      this.lllIlliIIi = Iiiilllliiilll.field_1730;
      Iiiilllliiilll.field_1730 = false;
      this.IIIillIIil();
      if (Iiiilllliiilll.field_1769 != null) {
         Iiiilllliiilll.field_1769.method_3292();
      }

      IIllllIlll();
   }

   public class_243 Illillllil(float tickDelta) {
      return new class_243(
         class_3532.method_16436((double)tickDelta, this.lIIIlliIIi, this.liiiIliIIi),
         class_3532.method_16436((double)tickDelta, this.iIIIlliIIi, this.iiiiIliIIi),
         class_3532.method_16436((double)tickDelta, this.IlIIlliIIi, this.IIIIlliIIi)
      );
   }

   private void Iillllilll() {
      class_746 var1 = Iiiilllliiilll.field_1724;
      this.lllllillll();
      if (this.IliiIliIIi.Iilllilliill()) {
         class_315 var2 = Iiiilllliiilll.field_1690;
         class_10185 var3 = var1.field_3913.field_54155;
         this.IIiIlliIIi = this.IIiIlliIIi | (iiIilIIlil(var2.field_1894) || var3.comp_3159());
         this.lIiIlliIIi = this.lIiIlliIIi | (iiIilIIlil(var2.field_1881) || var3.comp_3160());
         this.iIiIlliIIi = this.iIiIlliIIi | (iiIilIIlil(var2.field_1913) || var3.comp_3161());
         this.IliIlliIIi = this.IliIlliIIi | (iiIilIIlil(var2.field_1849) || var3.comp_3162());
         this.lliIlliIIi = this.lliIlliIIi | (iiIilIIlil(var2.field_1903) || var3.comp_3163());
         this.iliIlliIIi = this.iliIlliIIi | (iiIilIIlil(var2.field_1832) || var3.comp_3164());
         this.IiiIlliIIi = this.IiiIlliIIi | (iiIilIIlil(var2.field_1867) || var3.comp_3165());
      } else {
         this.iliIlliIIi = this.iliIlliIIi | var1.method_5715();
      }

      this.iilllIIill(var1);
      this.Ilillllill(var1, 1.0E-10, false);
   }

   public lilIliIiiilIliIi() {
      super(IliIlllilIi<"IliIlllilIi","pW9bm4cOG4chDoV5wnR5xcZhL4BrjzOpd5QnWeupS2vsWyA=">(), lllIllillIll.IIIlIIIilIIlIIIi);
      this.IIiiIliIIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","+1Jdjp37TiCTE9oVDs6NrLGZxEXnflpgA4GdGjR1QPS187dumA==">(),
         IliIlllilIi<"IliIlllilIi","nHTF4yQz93ruUEPfvX++rJJ9+PEgbAwE3v8XkzwFMQ/yQh+wcBzirhnZMla9vMvG">(),
         true
      );
      this.lIiiIliIIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","t6Yl209x5HnLJ606xHsmWOUVHh1i0xnhQHQwdvJuneUVuGig6fLwdDw=">(),
         IliIlllilIi<"IliIlllilIi","LUsziKWFS2a7lToM5iE5HLWJXSpAisF8KMXDJVJcHJ+cGTgXKGbbYYMsq6DB0xlOLkRpk05ECoKydYA=">(),
         true
      );
      this.iIiiIliIIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","VX4vAKXOnN6rvzmGeQIsz3trvjivQqBZbKrLoqUoTJbcT6x/OG4=">(),
         IliIlllilIi<"IliIlllilIi","p9eFIxFQlNJJ8I37fVQ4dvIoec8Okwot/+rHdpGbf72tXgUQdGQhNV0nqocGeiNOekFsQlZc2Y4k7VI=">(),
         true
      );
      this.IliiIliIIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","gjFYz2H0905SO2vhqJgeTsGGie8bkScwjs2l0ZBLpshCHLfnbrZA6zajL2xkZf0eVHLi">(),
         IliIlllilIi<"IliIlllilIi","0cJ4flSke+JreQMkF/73vgD/UFk31SmrJq7UHyyNnAxzHAknqdSKBiElvroPRkDECsFuy30kUv3P2bq6">(),
         false
      );
      this.lliiIliIIi = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","v3z5yCrWksOnhqsK/DGo6Ge5Dty3NVoI+pNS92bAhNo+svAk/H9Ew+DlTE4=">(),
         IliIlllilIi<"IliIlllilIi","T4xfv0TM9xob6JJBQ8ndnUHp7OsCJEp/zrgpLWw8Uc9awKVo0I9XKoj6ETScv7+Q01PY">(),
         0.5,
         0.1,
         2.0,
         0.05
      );
      this.iliiIliIIi = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","2gegc4PFy6UmEJZhizUTdyFsp1es/TskuHMEEW/Wv4kDXHz41bvXwX2u">(),
         IliIlllilIi<"IliIlllilIi","QVLzF0Ir8j4P8YpgK+Laqshuxz6gGaOPS3MbWHi/ibrSZYNB9Q61Z7BJjMtLf+A9ztRIJUcD5dR+06W47A==">(),
         12,
         2,
         32
      );
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.liliIliIIi, this.iiliIliIIi, this.IIiiIliIIi, this.lIiiIliIIi, this.iIiiIliIIi, this.IliiIliIIi, this.lliiIliIIi, this.iliiIliIIi
         }
      );
      IiiiIliIIi = this;
   }

   private static int llIililIil() {
      long var2 = 106291435708332672L;
      class_634 var0 = Iiiilllliiilll.method_1562();
      var2 ^= ((long)(var0 != null ? ((AccessorClientPlayNetworkHandler)var0).getChunkLoadDistance() : 0) << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) > 0 ? (int)(var2 >>> 32) : Iiiilllliiilll.field_1690.method_38521();
   }

   private void iilllIIill(class_746 player) {
      if (player.field_6250 > 0.015F) {
         this.IIiIlliIIi = true;
      }

      if (player.field_6250 < -0.015F) {
         this.lIiIlliIIi = true;
      }

      if (player.field_6212 > 0.015F) {
         this.iIiIlliIIi = true;
      }

      if (player.field_6212 < -0.015F) {
         this.IliIlliIIi = true;
      }
   }

   public static void IIllllIlll() {
      lilIliIiiilIliIi var0 = IiiiIliIIi;
      if (var0 != null && iiiIlIIIll() && Iiiilllliiilll.field_1724 != null && !ilIllIiIll()) {
         class_746 var1 = Iiiilllliiilll.field_1724;
         class_315 var2 = Iiiilllliiilll.field_1690;
         boolean var3 = var0.IliiIliIIi.Iilllilliill();
         boolean var4 = var3 && iiIilIIlil(var2.field_1894);
         boolean var5 = var3 && iiIilIIlil(var2.field_1881);
         boolean var6 = var3 && iiIilIIlil(var2.field_1913);
         boolean var7 = var3 && iiIilIIlil(var2.field_1849);
         boolean var8 = var0.IIiIlliIIi || var4;
         boolean var9 = var0.lIiIlliIIi || var5;
         boolean var10 = var0.iIiIlliIIi || var6;
         boolean var11 = var0.IliIlliIIi || var7;
         boolean var12 = var0.lliIlliIIi;
         boolean var13 = var0.iliIlliIIi || var3 && iiIilIIlil(var2.field_1832);
         boolean var14 = var0.IiiIlliIIi || var3 && iiIilIIlil(var2.field_1867);
         if (var3) {
            if (var5) {
               var0.IIiIlliIIi = false;
            }

            if (var4) {
               var0.lIiIlliIIi = false;
            }

            if (var7) {
               var0.iIiIlliIIi = false;
            }

            if (var6) {
               var0.IliIlliIIi = false;
            }
         }

         AccessorInput var15 = (AccessorInput)var1.field_3913;
         var15.setPlayerInput(new class_10185(var8, var9, var10, var11, var12, var13, var14));
         float var16 = (var10 ? 1.0F : 0.0F) - (var11 ? 1.0F : 0.0F);
         float var17 = (var8 ? 1.0F : 0.0F) - (var9 ? 1.0F : 0.0F);
         var15.setMovementVector(new class_241(var16, var17).method_35581());
         var1.method_5660(var13);
      }
   }

   private void IIIillIIil() {
      if (this.IIlIlliIIi && Iiiilllliiilll.field_1687 != null) {
         class_631 var1 = Iiiilllliiilll.field_1687.method_2935();
         var1.method_20180(Math.max(llIililIil(), this.iliiIliIIi.Iilllilliill()));
      }
   }

   public static boolean iiiIlIIIll() {
      return IiiiIliIIi != null && IiiiIliIIi.IliIlllilIi() && IiiiIliIIi.IIlIlliIIi;
   }

   public float illilIilil(float tickDelta) {
      return class_3532.method_16439(tickDelta, this.IiIIlliIIi, this.llIIlliIIi);
   }

   private static double IiIilliIil(class_304 negative, class_304 positive) {
      return (iiIilIIlil(negative) ? 1.0 : 0.0) - (iiIilIIlil(positive) ? 1.0 : 0.0);
   }

   @Override
   protected void Iilililiiili() {
      long var5 = 1033938652123797181L;
      long var7 = 808859387432261649L;
      var5 ^= ((long)this.IIlIlliIIi << 32 ^ var5) & -1L << 32;
      this.ilillIiill();
      this.iiIIlliIIi = false;
      this.IIlIlliIIi = false;
      if (this.IilIlliIIi) {
         Iiiilllliiilll.field_1690.method_31043(this.illIlliIIi);
         this.IilIlliIIi = false;
      }

      if ((int)(var5 >>> 32) != 0) {
         var5 ^= ((long)(Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1687 == this.lIlIlliIIi ? 1 : 0) ^ var5) & -1L >>> 32;
         var7 ^= ((long)ilIllIiIll() << 32 ^ var7) & -1L << 32;
         Iiiilllliiilll.field_1730 = this.lllIlliIIi;
         if (Iiiilllliiilll.field_1761 != null && (int)(var7 >>> 32) == 0) {
            Iiiilllliiilll.field_1761.method_2925();
         }

         if ((int)(var7 >>> 32) == 0) {
            if ((Boolean)Iiiilllliiilll.field_1690.method_42449().method_41753()) {
               illIilIilIil.IliIlllilIi(Iiiilllliiilll.field_1690.field_1832, this.lilIlliIIi);
            }

            if ((Boolean)Iiiilllliiilll.field_1690.method_42450().method_41753()) {
               illIilIilIil.IliIlllilIi(Iiiilllliiilll.field_1690.field_1867, this.iilIlliIIi);
            }
         }

         if ((int)var5 != 0) {
            this.iIIilIlIil();
         }

         if ((int)var5 != 0 && Iiiilllliiilll.field_1724 != null && this.IllIlliIIi) {
            class_1656 var4 = Iiiilllliiilll.field_1724.method_31549();
            if (var4.field_7478) {
               var4.field_7479 = this.iIlIlliIIi;
            }
         }

         this.IllIlliIIi = false;
         this.lIlIlliIIi = null;
      }
   }

   public static lilIliIiiilIliIi IIiillIiil() {
      return IiiiIliIIi;
   }

   private void lIilliIill() {
      if (!this.IIiIlliIIi && !this.lIiIlliIIi && !this.iIiIlliIIi && !this.IliIlliIIi) {
         this.Ilillllill(Iiiilllliiilll.field_1724, Double.longBitsToDouble(-4025155164551291200L ^ -691655233282518278L), true);
      }
   }

   public static boolean ilIllIiIll() {
      ilIllIiIll var0 = llilIllililIll.iliIiiliiiii(iiliililIIiiilil.class);
      if (var0 != null && var0.IliIlllilIi()) {
         return true;
      } else {
         ilIllIiIll var1 = llilIllililIll.iliIiiliiiii(iIlIilIlIllIilIl.class);
         return var1 != null && var1.IliIlllilIi();
      }
   }

   private void ilillIiill() {
      this.IIiIlliIIi = false;
      this.lIiIlliIIi = false;
      this.iIiIlliIIi = false;
      this.IliIlliIIi = false;
      this.lliIlliIIi = false;
      this.iliIlliIIi = false;
      this.IiiIlliIIi = false;
      this.liiIlliIIi = 0;
   }
}
