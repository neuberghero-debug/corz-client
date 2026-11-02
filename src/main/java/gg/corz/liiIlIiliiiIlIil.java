package gg.corz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.class_1533;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2549;
import net.minecraft.class_2586;
import net.minecraft.class_2631;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_310;

public final class liiIlIiliiiIlIil {
   private int[] IIilIIlIil;
   private static final int lillIIlIil = 2;
   private final Map<Long, liilliiiilli> iillIIlIil = new LinkedHashMap<>();
   private int lIilIIlIil;
   private int iIilIIlIil;

   public liiIlIiliiiIlIil() {
      this.IIilIIlIil = new int[0];
      this.lIilIIlIil = -1;
   }

   public void IliIlllilIi() {
      this.iillIIlIil.clear();
      this.iIilIIlIil = 0;
   }

   public void IilliliilIIi(class_310 s, liilliiiilli mc) {
      if (s.field_1687 != null) {
         List var3 = s.field_1687.method_8390(class_1533.class, new class_238(mc.iIiilIlIlIliilIlIl).method_1014(1.0), f -> true);
         class_1533 var4 = null;

         for (class_1533 var6 : var3) {
            if (var4 == null || var6.method_24515().method_10262(mc.iIiilIlIlIliilIlIl) < var4.method_24515().method_10262(mc.iIiilIlIlIliilIlIl)) {
               var4 = var6;
            }
         }

         if (var4 == null) {
            mc.IiiilIlIlliiilIlIl++;
         } else {
            mc.IiiilIlIlliiilIlIl = 0;
            mc.lliilIlIliliilIlIl = var4.method_6940().method_31574(class_1802.field_8833) ? liIiIIIiiiIiIIIi.lIliiIliil : liIiIIIiiiIiIIIi.iIliiIliil;
         }
      }
   }

   public Collection<liilliiiilli> liiiIIllIl() {
      return this.iillIIlIil.values();
   }

   private static boolean iliIiiliiiii(class_310 head, class_2338 mc, class_2350 bow) {
      int var3 = 0;
      class_2338 var4 = mc.method_10093(bow.method_10153());

      for (class_2338 var8 : new class_2338[]{
         var4, var4.method_10074(), var4.method_10093(bow.method_10153()), mc.method_10074().method_10079(bow.method_10153(), 2)
      }) {
         if (IIIllIIliIIl(head.field_1687.method_8320(var8))) {
            var3++;
         }
      }

      return var3 >= 2;
   }

   public static boolean IIIllIIliIIl(class_2680 s) {
      return s.method_27852(class_2246.field_10286)
         || s.method_27852(class_2246.field_10505)
         || s.method_27852(class_2246.field_9992)
         || s.method_27852(class_2246.field_10175)
         || s.method_27852(class_2246.field_10462)
         || s.method_27852(class_2246.field_10574)
         || s.method_27852(class_2246.field_10540)
         || s.method_27852(class_2246.field_10455);
   }

   private void IlIlllIlilIl(int r) {
      this.lIilIIlIil = r;
      ArrayList var2 = new ArrayList();

      for (int var3 = -r; var3 <= r; var3++) {
         for (int var4 = -r; var4 <= r; var4++) {
            if (var3 * var3 + var4 * var4 <= r * r + r) {
               var2.add(new int[]{var3, var4});
            }
         }
      }

      var2.sort((b, a) -> Integer.compare(b[0] * b[0] + b[1] * b[1], a[0] * a[0] + a[1] * a[1]));
      this.IIilIIlIil = new int[var2.size() * 2];

      for (int var5 = 0; var5 < var2.size(); var5++) {
         this.IIilIIlIil[2 * var5] = ((int[])var2.get(var5))[0];
         this.IIilIIlIil[2 * var5 + 1] = ((int[])var2.get(var5))[1];
      }

      this.iIilIIlIil = 0;
   }

   public class_1533 lIiiIiIlilli(class_310 s, liilliiiilli mc) {
      if (s.field_1687 == null) {
         return null;
      } else {
         List var3 = s.field_1687
            .method_8390(class_1533.class, new class_238(mc.iIiilIlIlIliilIlIl).method_1014(1.0), f -> f.method_6940().method_31574(class_1802.field_8833));
         return var3.isEmpty() ? null : (class_1533)var3.get(0);
      }
   }

   public void iIlIlllllill(class_310 mc, int chunksPerTick, int radiusChunks) {
      if (mc.field_1687 != null && mc.field_1724 != null) {
         if (chunksPerTick != this.lIilIIlIil) {
            this.IlIlllIlilIl(chunksPerTick);
         }

         int var4 = mc.field_1724.method_31477() >> 4;
         int var5 = mc.field_1724.method_31479() >> 4;
         int var6 = this.IIilIIlIil.length / 2;

         for (int var7 = 0; var7 < radiusChunks && var6 > 0; var7++) {
            int var8 = this.iIilIIlIil++ % var6;
            class_2818 var9 = mc.field_1687.method_2935().method_21730(var4 + this.IIilIIlIil[2 * var8], var5 + this.IIilIIlIil[2 * var8 + 1]);
            if (var9 != null) {
               for (class_2586 var11 : var9.method_12214().values()) {
                  if (var11 instanceof class_2631) {
                     class_2680 var12 = var11.method_11010();
                     if (var12.method_27852(class_2246.field_10472)) {
                        class_2338 var13 = var11.method_11016();
                        if (!this.iillIIlIil.containsKey(var13.method_10063())) {
                           class_2350 var14 = (class_2350)var12.method_11654(class_2549.field_11724);
                           if (iliIiiliiiii(mc, var13, var14)) {
                              this.iillIIlIil.put(var13.method_10063(), new liilliiiilli(var13, var14));
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
