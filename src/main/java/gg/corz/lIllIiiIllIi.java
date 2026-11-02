package gg.corz;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_276;
import net.minecraft.class_310;
import net.minecraft.class_6367;

public final class lIllIiiIllIi {
   private static boolean IllllIIIllllllIIIl;
   private static class_276 lIlllIIIliIlllIIIl;
   private static class_6367 iiIllIIIlIIlllIIIl;
   private static boolean illllIIIlIilllIIIl;
   private static class_6367 IiIllIIIlliIllIIIl;

   static boolean iliIiiliiiii() {
      if (IllllIIIllllllIIIl && lIlllIIIliIlllIIIl == IiIllIIIlliIllIIIl) {
         iiIllIIIlIIlllIIIl = IiIlliIliiIl(
            iiIllIIIlIIlllIIIl,
            IIlllIlliIll<"IIlllIlliIll","jL4XCzEgbsIrlSWUQabqh7mc12BmgXfKYo4dLRUFEWFctNmweCVZDuaS">(),
            IiIllIIIlliIllIIIl.field_1482,
            IiIllIIIlliIllIIIl.field_1481
         );
         if (!illllIIIlIilllIIIl) {
            RenderSystem.getDevice()
               .createCommandEncoder()
               .clearColorAndDepthTextures(iiIllIIIlIIlllIIIl.method_30277(), 0, iiIllIIIlIIlllIIIl.method_30278(), 1.0);
            illllIIIlIilllIIIl = true;
         }

         lIlllIIIliIlllIIIl = iiIllIIIlIIlllIIIl;
         return true;
      } else {
         return false;
      }
   }

   private lIllIiiIllIi() {
   }

   public static void iIlIlllllill() {
      long var4 = -4476424161628094604L;
      if (!IllllIIIllllllIIIl && !iIIlIllIlIlIll.IliIlllilIi()) {
         try {
            if (!iIIlIllIlIlIll.liIlliiIll()) {
               return;
            }

            class_310 var0 = class_310.method_1551();
            class_276 var1 = var0.method_1522();
            var4 ^= ((long)var1.field_1482 << 32 ^ var4) & -1L << 32;
            var4 ^= ((long)var1.field_1481 ^ var4) & -1L >>> 32;
            if ((int)(var4 >>> 32) <= 0 || (int)var4 <= 0 || var1.method_30277() == null) {
               return;
            }

            if ((int)(var4 >>> 32) != var0.method_22683().method_4489() || (int)var4 != var0.method_22683().method_4506()) {
               return;
            }

            IiIllIIIlliIllIIIl = IiIlliIliiIl(
               IiIllIIIlliIllIIIl, IIlllIlliIll<"IIlllIlliIll","fMY7oOtrkGK/6VHuIRI/tP4lhIQu1k/Ippzvj9nhAXnnMTP0IgQ=">(), (int)(var4 >>> 32), (int)var4
            );
            RenderSystem.getDevice()
               .createCommandEncoder()
               .clearColorAndDepthTextures(IiIllIIIlliIllIIIl.method_30277(), 0, IiIllIIIlliIllIIIl.method_30278(), 1.0);
            illllIIIlIilllIIIl = false;
            iIIlIllIlIlIll.lIilliIill();
            lIlllIIIliIlllIIIl = IiIllIIIlliIllIIIl;
            IllllIIIllllllIIIl = true;
         } catch (Throwable var6) {
            iIIlIllIlIlIll.lliIliliIl(IIlllIlliIll<"IIlllIlliIll","Kug/vs3e0B40lM8fWg/gd/c5Dzk5wU4ENR1ICuyAEHub">(), var6);
         }
      }
   }

   public static class_276 IliIlllilIi() {
      return lIlllIIIliIlllIIIl;
   }

   private static class_6367 IiIlliIliiIl(class_6367 name, String w, int h, int fb) {
      if (name == null) {
         return new class_6367(w, h, fb, true);
      } else {
         if (name.field_1482 != h || name.field_1481 != fb) {
            name.method_1234(h, fb);
         }

         return name;
      }
   }

   public static void lIiiIiIlilli() {
      IllllIIIllllllIIIl = false;
      lIlllIIIliIlllIIIl = null;
   }

   public static void IlIlllIlilIl() {
      if (!IllllIIIllllllIIIl) {
         if (IiIllIIIlliIllIIIl != null) {
            IiIllIIIlliIllIIIl.method_1238();
            IiIllIIIlliIllIIIl = null;
         }

         if (iiIllIIIlIIlllIIIl != null) {
            iiIllIIIlIIlllIIIl.method_1238();
            iiIllIIIlIIlllIIIl = null;
         }
      }
   }

   public static boolean liiiIIllIl() {
      return IllllIIIllllllIIIl;
   }

   static void IIIllIIliIIl() {
      if (IllllIIIllllllIIIl && lIlllIIIliIlllIIIl == iiIllIIIlIIlllIIIl) {
         lIlllIIIliIlllIIIl = IiIllIIIlliIllIIIl;
      }
   }

   public static void IilliliilIIi() {
      if (IllllIIIllllllIIIl) {
         IllllIIIllllllIIIl = false;
         lIlllIIIliIlllIIIl = null;

         try {
            iIIlIllIlIlIll.IiIilliIil(IiIllIIIlliIllIIIl, illllIIIlIilllIIIl ? iiIllIIIlIIlllIIIl : null);
         } catch (Throwable var1) {
            iIIlIllIlIlIll.lliIliliIl(IIlllIlliIll<"IIlllIlliIll","qg2nL9DHTRL17V8Hsy4aKFakrlygj8VKZnsFlQLRriMbAe2w0g==">(), var1);
         }
      }
   }
}
