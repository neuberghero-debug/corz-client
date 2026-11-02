package gg.corz;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_12249;
import net.minecraft.class_1921;
import net.minecraft.class_2960;
import net.minecraft.class_4588;
import net.minecraft.class_4608;
import net.minecraft.class_4587.class_4665;

public final class IIIiIllllIIiIlll {
   final float[] IlIiiIIill;
   final int[] llIiiIIill;
   public static final class_2960 ililiIIill = class_2960.method_60655(
      Illillliilli<"Illillliilli","WT71kaZIG9d9hvRcwFKRp3VThVQ7uF/meoMYQzsrBEGv/IoxcQM=">(),
      Illillliilli<"Illillliilli","/zQLHGanrB+fo+mXIKaEPcAFpcMMx/hmUTjAsnYw4goXAKtoREaTco9Mv/GAgfipnjQf9Q==">()
   );
   private static class_1921 iiiliIIill;
   final int[] ilIiiIIill;
   private static final Map<String, IIIiIllllIIiIlll> IiiliIIill = new ConcurrentHashMap<>();
   final int[] IiIiiIIill;
   public static final int lliliIIill = 826691147;
   private static final Set<String> liiliIIill = ConcurrentHashMap.newKeySet();
   final float[] lIIiiIIill;
   final lIillIiiIillIi IIIiiIIill;
   final float[] iIIiiIIill;

   public static class_1921 Iilllilliill(class_2960 texture) {
      return class_12249.method_75994(texture);
   }

   public void Ililllililil(class_4665 light, class_4588 overlay, int vc, int e) {
      for (int var5 = 0; var5 < this.IiIiiIIill.length; var5++) {
         int var6 = this.IiIiiIIill[var5];
         overlay.method_56824(light, this.lIIiiIIill[var6 * 3], this.lIIiiIIill[var6 * 3 + 1], this.lIIiiIIill[var6 * 3 + 2])
            .method_39415(this.llIiiIIill[var6])
            .method_22913(this.IlIiiIIill[var6 * 2], this.IlIiiIIill[var6 * 2 + 1])
            .method_22922(e)
            .method_60803(vc)
            .method_60831(light, this.iIIiiIIill[var6 * 3], this.iIIiiIIill[var6 * 3 + 1], this.iIIiiIIill[var6 * 3 + 2]);
      }
   }

   public boolean Iiilliiliiil(iIiiliIiIliiliIi skin) {
      return skin != null
         && skin.IiilIiiIIi.length == this.IiIiiIIill.length
         && skin.ililIiiIIi.length == this.IiIiiIIill.length * 2
         && skin.iiilIiiIIi.length
            == skin.liilIiiIIi.length
               * ((((-1644155584 << 19 | -1644155584 >>> 13) >>> 25 | (-1644155584 << 19 | -1644155584 >>> 13) << 7) ^ 35) + -13 ^ 41418881);
   }

   public static IIIiIllllIIiIlll iliIiiliiiii(String model) {
      IIIiIllllIIiIlll var1 = IiiliIIill.get(model);
      if (var1 == null) {
         IlIlllIlilIl(model);
      }

      return var1;
   }

   private IIIiIllllIIiIlll(lIillIiiIillIi data) {
      this.IIIiiIIill = data;
      this.lIIiiIIill = data.IIiIliIiilIiIliIii;
      this.iIIiiIIill = data.iIiIliIiiIliIliIii;
      this.IlIiiIIill = data.lliIliIiiiliIliIii;
      this.llIiiIIill = data.IiiIliIiiliiIliIii;
      this.ilIiiIIill = data.iiiIliIiiIIIlliIii;
      this.IiIiiIIill = data.lIIlliIiiiIIlliIii;
   }

   public static class_1921 IIillIiliIil(class_2960 texture) {
      return class_12249.method_76014(texture);
   }

   public static class_1921 Illlllllilll() {
      if (iiiliIIill == null) {
         iiiliIIill = class_12249.method_75994(ililiIIill);
      }

      return iiiliIIill;
   }

   public void IlIillIiilIi(class_4665 e, class_4588 vc, iIiiliIiIliiliIi skin) {
      if (skin != null) {
         int[] var4 = skin.liilIiiIIi;
         float[] var5 = skin.iiilIiiIIi;

         for (int var6 = 0; var6 < var4.length; var6++) {
            int var7 = var4[var6] * 4;
            if (var7 + 3 >= this.IiIiiIIill.length) {
               return;
            }

            for (int var8 = 0; var8 < 4; var8++) {
               this.IiIiliIiiiIi(e, vc, this.IiIiiIIill[var7 + var8], var5, (var6 * 4 + var8) * 2);
            }

            for (int var9 = 3; var9 >= 0; var9--) {
               this.IiIiliIiiiIi(e, vc, this.IiIiiIIill[var7 + var9], var5, (var6 * 4 + var9) * 2);
            }
         }
      }
   }

   public int IliIlllilIi() {
      return this.llIiiIIill.length;
   }

   public int iIlIlllllill() {
      return this.IiIiiIIill.length / 4;
   }

   public static void IlIlllIlilIl(String model) {
      if (liiliIIill.add(model)) {
         CompletableFuture.runAsync(() -> {
            IIIiIllllIIiIlll var1 = IIlllIlliIll(model);
            if (var1 != null) {
               IiiliIIill.put(model, var1);
            }
         });
      }
   }

   static IIIiIllllIIiIlll IIlllIlliIll(String model) {
      lIillIiiIillIi var1 = lIillIiiIillIi.lIiiIiIlilli(model);
      return var1 == null ? null : new IIIiIllllIIiIlll(var1);
   }

   public static void IiIlliIliiIl() {
      for (illIIlllIilIIlll var3 : new illIIlllIilIIlll[]{
         illIIlllIilIIlll.ilIIIIIill, illIIlllIilIIlll.IiIIIIIill, illIIlllIilIIlll.liIIIIIill, illIIlllIilIIlll.iiIIIIIill
      }) {
         for (int var4 = 0; var4 < var3.IlIlllIlilIl(); var4++) {
            IlIlllIlilIl(var3.IiIlliIliiIl(var4).IliIlllilIi());
         }
      }
   }

   public static boolean IIIllIIliIIl(illIIlllIilIIlll rig) {
      boolean var1 = true;

      for (int var2 = 0; var2 < rig.IlIlllIlilIl(); var2++) {
         if (iliIiiliiiii(rig.IiIlliIliiIl(var2).IliIlllilIi()) == null) {
            var1 = false;
         }
      }

      return var1;
   }

   public int liiiIIllIl() {
      return this.ilIiiIIill.length / 3;
   }

   public lIillIiiIillIi IilliliilIIi() {
      return this.IIIiiIIill;
   }

   private void IiIiliIiiiIi(class_4665 i, class_4588 vc, int guv, float[] o, int e) {
      vc.method_56824(i, this.lIIiiIIill[guv * 3], this.lIIiiIIill[guv * 3 + 1], this.lIIiiIIill[guv * 3 + 2])
         .method_39415(-1)
         .method_22913(o[e], o[e + 1])
         .method_22922(class_4608.field_21444)
         .method_60803(15728880)
         .method_60831(i, this.iIIiiIIill[guv * 3], this.iIIiiIIill[guv * 3 + 1], this.iIIiiIIill[guv * 3 + 2]);
   }

   static IIIiIllllIIiIlll lIiiIiIlilli(byte[] data) {
      return new IIIiIllllIIiIlll(lIillIiiIillIi.IilliliilIIi(data));
   }

   public void IIIilIIiiIIi(class_4665 overlay, class_4588 vc, int skin, int e, iIiiliIiIliiliIi light) {
      if (!this.Iiilliiliiil(light)) {
         this.Ililllililil(overlay, vc, skin, e);
      } else {
         float[] var6 = light.ililIiiIIi;
         int[] var7 = light.IiilIiiIIi;

         for (int var8 = 0; var8 < this.IiIiiIIill.length; var8++) {
            int var9 = this.IiIiiIIill[var8];
            vc.method_56824(overlay, this.lIIiiIIill[var9 * 3], this.lIIiiIIill[var9 * 3 + 1], this.lIIiiIIill[var9 * 3 + 2])
               .method_39415(var7[var8])
               .method_22913(var6[var8 * 2], var6[var8 * 2 + 1])
               .method_22922(e)
               .method_60803(skin)
               .method_60831(overlay, this.iIIiiIIill[var9 * 3], this.iIIiiIIill[var9 * 3 + 1], this.iIIiiIIill[var9 * 3 + 2]);
         }
      }
   }
}
