package gg.corz;

import net.minecraft.class_310;
import net.minecraft.class_4071;
import net.minecraft.class_418;
import net.minecraft.class_437;
import net.minecraft.class_746;

public final class IIiiiIllIiiiIl {
   public static final double iIliiiillIlliiiill = 20.0;

   private IIiiiIllIiiiIl() {
   }

   public static iIlIllIiIllIllIi IliIlllilIi(
      long tps, long aim, iIIilIiIlIilIi nowMs, ilIiilIlIiIiilIl override, illIIliIilIIli tick, iilllIiIIillIi conflicts
   ) {
      long var11 = -8137056658084270140L;
      class_310 var8 = class_310.method_1551();
      class_746 var9 = var8.field_1724;
      var11 ^= ((long)(var9 != null && var9.method_5805() && !var9.method_29504() && !(var8.field_1755 instanceof class_418) ? 1 : 0) << 32 ^ var11)
         & -1L << 32;
      return new iIlIllIiIllIllIi(
         tps,
         aim,
         var8.method_1562(),
         var8.field_1687,
         var9,
         (boolean)((int)(var11 >>> 32)),
         liiiIIllIl(var8.field_1755, var8.method_18506()),
         lilIliIiiilIliIi.iiiIlIIIll(),
         IIIiillllIIiilll.iIlIlllllill(),
         iiIliillIIlliill.liiiIIllIl(),
         iillIlllIIilIlll.IliIlllilIi(),
         nowMs != null && nowMs.IilliliilIIi(tps),
         nowMs == null ? 20.0 : nowMs.iIlIlllllill(),
         override != null && override.iliIiiliiiii(tps),
         tick != null && tick.iIlIlllllill(),
         tick == null ? null : tick.IliIlllilIi(),
         tick == null ? null : tick.liiiIIllIl(),
         var9 != null && var9.method_68878(),
         var9 != null && var9.method_7325(),
         var9 != null && var9.method_5765(),
         conflicts == null ? 0 : conflicts.IiIlliIliiIl()
      );
   }

   public static boolean liiiIIllIl(class_437 overlay, class_4071 screen) {
      return overlay != null || screen != null;
   }
}
