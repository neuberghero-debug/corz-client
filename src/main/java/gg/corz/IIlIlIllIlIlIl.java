package gg.corz;

import java.util.Objects;
import net.minecraft.class_2680;
import net.minecraft.class_2769;

public enum IIlIlIllIlIlIl {
   iIlIIIIllIllIIIIll,
   iilIIIIllIIiIIIIll,
   IliIIIIlllliIIIIll,
   lllIIIIllillIIIIll,
   IilIIIIlllilIIIIll,
   lIiIIIIlliIiIIIIll;

   public static IIlIlIllIlIlIl liiiIIllIl(class_2680 world, class_2680 want, boolean worldLoaded) {
      long var4 = 3776351159938632710L;
      if (!worldLoaded) {
         return IliIIIIlllliIIIIll;
      } else if (world == null) {
         return IliIIIIlllliIIIIll;
      } else if (world == want) {
         return iIlIIIIllIllIIIIll;
      } else {
         var4 ^= ((long)want.method_26215() << 32 ^ var4) & -1L << 32;
         if (world.method_26215()) {
            return (int)(var4 >>> 32) != 0 ? iIlIIIIllIllIIIIll : lIiIIIIlliIiIIIIll;
         } else if ((int)(var4 >>> 32) != 0) {
            return lllIIIIllillIIIIll;
         } else {
            return world.method_26204() != want.method_26204() ? IilIIIIlllilIIIIll : iilIIIIllIIiIIIIll;
         }
      }
   }

   private static boolean iIlIlllllill(class_2680 want, class_2680 world) {
      for (class_2769 var3 : want.method_28501()) {
         if (!iIiiiIlIliiiIl.IilliliilIIi(var3.method_11899())) {
            if (!world.method_28498(var3)) {
               return true;
            }

            if (!Objects.equals(want.method_11654(var3), world.method_11654(var3))) {
               return true;
            }
         }
      }

      return false;
   }

   public static IIlIlIllIlIlIl IliIlllilIi(class_2680 world, class_2680 worldLoaded, boolean want) {
      long var5 = -3854602206642214849L;
      if (!want) {
         return IliIIIIlllliIIIIll;
      } else if (world == null) {
         return IliIIIIlllliIIIIll;
      } else if (world == worldLoaded) {
         return iIlIIIIllIllIIIIll;
      } else {
         var5 ^= ((long)world.method_26215() << 32 ^ var5) & -1L << 32;
         var5 ^= ((long)worldLoaded.method_26215() ^ var5) & -1L >>> 32;
         if ((int)(var5 >>> 32) != 0) {
            return (int)var5 == 0 && !worldLoaded.method_45474() ? lIiIIIIlliIiIIIIll : iIlIIIIllIllIIIIll;
         } else if ((int)var5 == 0 && !worldLoaded.method_45474()) {
            if (world.method_26204() != worldLoaded.method_26204()) {
               return IilIIIIlllilIIIIll;
            } else {
               return iIlIlllllill(world, worldLoaded) ? iilIIIIllIIiIIIIll : iIlIIIIllIllIIIIll;
            }
         } else {
            return lllIIIIllillIIIIll;
         }
      }
   }
}
