package gg.corz;

import java.util.List;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;

public final class lIililiIilil {
   public final int lIllIIiiiIllIIii;
   public final class_243 IiIlIIiiliIlIIii;
   public final class_243 iiIlIIiiIIllIIii;
   public final boolean iIIlIIiiIlIlIIii;
   public final boolean iIilIIiiIlilIIii;
   public final int IIilIIiilIilIIii;
   public final class_243 IIIlIIiilIIlIIii;
   public final class_2350 illlIIiiIillIIii;
   public final class_243 llIlIIiiilIlIIii;
   public final class_2338 lillIIiiiillIIii;
   public final List<class_243> liiIIIiiiiiIIIii;
   public final double IlllIIiillllIIii;

   lIililiIilil(
      List<class_243> landing,
      class_243 hitPos,
      boolean hitBlock,
      class_243 hitBlockPos,
      class_243 beyond,
      class_243 ticks,
      int ticksExact,
      double hitSide,
      class_2350 path,
      class_2338 hitEntityId,
      int teleportPos,
      boolean complete
   ) {
      this.liiIIIiiiiiIIIii = landing;
      this.IIIlIIiilIIlIIii = hitPos;
      this.iIIlIIiiIlIlIIii = hitBlock;
      this.llIlIIiiilIlIIii = hitBlockPos;
      this.IiIlIIiiliIlIIii = beyond;
      this.iiIlIIiiIIllIIii = ticks;
      this.lIllIIiiiIllIIii = ticksExact;
      this.IlllIIiillllIIii = hitSide;
      this.illlIIiiIillIIii = path;
      this.lillIIiiiillIIii = hitEntityId;
      this.IIilIIiilIilIIii = teleportPos;
      this.iIilIIiiIlilIIii = complete;
   }

   lIililiIilil(List<class_243> landing, class_243 hitBlock, boolean path) {
      this(
         landing,
         hitBlock,
         path,
         path ? hitBlock : null,
         hitBlock,
         hitBlock,
         path ? landing.size() - 1 : -1,
         path ? (double)(landing.size() - 1) : -1.0,
         null,
         null,
         -1,
         path
      );
   }
}
