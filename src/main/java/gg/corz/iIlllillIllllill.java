package gg.corz;

import net.minecraft.class_10185;
import net.minecraft.class_2596;
import net.minecraft.class_2793;
import net.minecraft.class_2813;
import net.minecraft.class_2815;
import net.minecraft.class_2824;
import net.minecraft.class_2828;
import net.minecraft.class_2846;
import net.minecraft.class_2848;
import net.minecraft.class_2851;
import net.minecraft.class_2868;
import net.minecraft.class_2879;
import net.minecraft.class_2885;
import net.minecraft.class_2886;
import net.minecraft.class_9836;
import net.minecraft.class_2846.class_2847;
import net.minecraft.class_2848.class_2849;

public final class iIlllillIllllill {
   public static llIIiiililIIiiil IliIlllilIi(class_2596<?> p) {
      if (p == null) {
         return llIIiiililIIiiil.iiiliIIiil;
      } else if (p instanceof class_2828 var4) {
         return var4.method_36172() ? llIIiiililIIiiil.iilliIIiil : llIIiiililIIiiil.lilliIIiil;
      } else if (p instanceof class_9836) {
         return llIIiiililIIiiil.IiiliIIiil;
      } else if (p instanceof class_2851) {
         return llIIiiililIIiiil.IIiliIIiil;
      } else if (p instanceof class_2824 var3) {
         return IIIliiIilIIliiIi.IliIlllilIi(var3) ? llIIiiililIIiiil.liIliIIiil : llIIiiililIIiiil.iiIliIIiil;
      } else if (p instanceof class_2885) {
         return llIIiiililIIiiil.IIlliIIiil;
      } else if (p instanceof class_2886) {
         return llIIiiililIIiiil.lIlliIIiil;
      } else if (p instanceof class_2846 var2) {
         return iliIiiliiiii(var2.method_12363());
      } else if (p instanceof class_2868) {
         return llIIiiililIIiiil.IilliIIiil;
      } else if (p instanceof class_2879) {
         return llIIiiililIIiiil.liiliIIiil;
      } else if (p instanceof class_2848 var1) {
         return IIIllIIliIIl(var1.method_12365());
      } else if (p instanceof class_2813) {
         return llIIiiililIIiiil.IliliIIiil;
      } else if (p instanceof class_2815) {
         return llIIiiililIIiiil.lliliIIiil;
      } else {
         return p instanceof class_2793 ? llIIiiililIIiiil.ililiIIiil : llIIiiililIIiiil.iiiliIIiil;
      }
   }

   private iIlllillIllllill() {
   }

   public static float[] iIlIlllllill(class_2596<?> p) {
      if (p instanceof class_2828 var1 && var1.method_36172()) {
         return new float[]{var1.method_12271(0.0F), var1.method_12270(0.0F)};
      }

      return null;
   }

   public static int liiiIIllIl(class_2596<?> p) {
      return p instanceof class_2868 var1 ? var1.method_12442() : -1;
   }

   private static llIIiiililIIiiil IIIllIIliIIl(class_2849 mode) {
      if (mode == class_2849.field_12981) {
         return llIIiiililIIiiil.lIiliIIiil;
      } else {
         return mode == class_2849.field_12985 ? llIIiiililIIiiil.iIiliIIiil : llIIiiililIIiiil.iiiliIIiil;
      }
   }

   private static llIIiiililIIiiil iliIiiliiiii(class_2847 action) {
      if (action == null) {
         return llIIiiililIIiiil.iiiliIIiil;
      } else {
         return switch (action) {
            case field_12969 -> llIIiiililIIiiil.illliIIiil;
            case field_12974 -> llIIiiililIIiiil.IllliIIiil;
            case field_12975, field_12970 -> llIIiiililIIiiil.lllliIIiil;
            case field_12968, field_12973, field_12971 -> llIIiiililIIiiil.iIlliIIiil;
            case field_63165 -> llIIiiililIIiiil.liIliIIiil;
            default -> llIIiiililIIiiil.iiiliIIiil;
         };
      }
   }

   public static class_10185 IilliliilIIi(class_2596<?> p) {
      return p instanceof class_2851 var1 ? var1.comp_3139() : null;
   }

   public static float[] lIiiIiIlilli(class_2596<?> p) {
      return p instanceof class_2886 var1 ? new float[]{var1.method_60586(), var1.method_60587()} : null;
   }
}
