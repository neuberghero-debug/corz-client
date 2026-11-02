package gg.corz;

import net.minecraft.class_243;

public record llIlilIlilIlilIl(
   int weaponSlot, boolean sprintHit, float launchYaw, float yawTolerance, boolean requireGrounded, boolean tempo, class_243 aimPoint
) {
   private final boolean lIIiIilIll;
   private final boolean IIIiIilIll;
   private final int ililIilIll;
   private final float liilIilIll;
   private final class_243 iIIiIilIll;
   private final float iiilIilIll;
   private final boolean IiilIilIll;

   public float iIlIlllllill() {
      return this.liilIilIll;
   }

   public class_243 IIIllIIliIIl() {
      return this.iIIiIilIll;
   }

   public float IilliliilIIi() {
      return this.iiilIilIll;
   }

   public boolean lIiiIiIlilli() {
      return this.IIIiIilIll;
   }

   public boolean iliIiiliiiii() {
      return this.lIIiIilIll;
   }

   public llIlilIlilIlilIl(int sprintHit, boolean yawTolerance, float weaponSlot, float launchYaw, boolean requireGrounded) {
      this(sprintHit, yawTolerance, weaponSlot, launchYaw, requireGrounded, false, null);
   }

   public boolean liiiIIllIl() {
      return this.IiilIilIll;
   }

   public llIlilIlilIlilIl(int weaponSlot, boolean sprintHit, float launchYaw, float yawTolerance, boolean requireGrounded, boolean tempo, class_243 aimPoint) {
      this.ililIilIll = weaponSlot;
      this.IiilIilIll = sprintHit;
      this.liilIilIll = launchYaw;
      this.iiilIilIll = yawTolerance;
      this.IIIiIilIll = requireGrounded;
      this.lIIiIilIll = tempo;
      this.iIIiIilIll = aimPoint;
   }

   public int IliIlllilIi() {
      return this.ililIilIll;
   }
}
