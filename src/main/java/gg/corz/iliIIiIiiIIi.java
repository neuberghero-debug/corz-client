package gg.corz;

import net.minecraft.class_1799;

record iliIIiIiiIIi(int swordSlot, int knockback, class_1799 sword, int crystalSlot, int obsidianSlot, int selectedItem) {
   private final int llIliiiiilIliiii;
   private final int liiIiiiiiiiIiiii;
   private final int iliIiiiiIiiIiiii;
   private final int IiIliiiiliIliiii;
   private final int iIIliiiiIlIliiii;
   private final class_1799 IIIliiiilIIliiii;

   public int liiiIIllIl() {
      return this.liiIiiiiiiiIiiii;
   }

   public int lIiiIiIlilli() {
      return this.llIliiiiilIliiii;
   }

   iliIIiIiiIIi(int swordSlot, int knockback, class_1799 sword, int crystalSlot, int obsidianSlot, int selectedItem) {
      this.iliIiiiiIiiIiiii = swordSlot;
      this.liiIiiiiiiiIiiii = knockback;
      this.IIIliiiilIIliiii = sword;
      this.iIIliiiiIlIliiii = crystalSlot;
      this.llIliiiiilIliiii = obsidianSlot;
      this.IiIliiiiliIliiii = selectedItem;
   }

   public int IliIlllilIi() {
      return this.iliIiiiiIiiIiiii;
   }

   public class_1799 iIlIlllllill() {
      return this.IIIliiiilIIliiii;
   }

   public int iliIiiliiiii() {
      return this.IiIliiiiliIliiii;
   }

   public int IilliliilIIi() {
      return this.iIIliiiiIlIliiii;
   }
}
