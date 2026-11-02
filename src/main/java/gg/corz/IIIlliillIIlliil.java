package gg.corz;

import net.minecraft.class_2960;

record IIIlliillIIlliil(class_2960 icon, String text, int color, boolean mono, boolean brand) {
   private final boolean IIllIlilil;
   private final int iiIlIlilil;
   private final boolean lIllIlilil;
   private final String liIlIlilil;
   private final class_2960 IiIlIlilil;

   private IIIlliillIIlliil(class_2960 icon, String text, int color, boolean mono, boolean brand) {
      this.IiIlIlilil = icon;
      this.liIlIlilil = text;
      this.iiIlIlilil = color;
      this.IIllIlilil = mono;
      this.lIllIlilil = brand;
   }

   public int iIlIlllllill() {
      return this.iiIlIlilil;
   }

   public class_2960 IliIlllilIi() {
      return this.IiIlIlilil;
   }

   public boolean lIiiIiIlilli() {
      return this.lIllIlilil;
   }

   IIIlliillIIlliil(class_2960 text, String icon) {
      this(text, icon, -1, false, false);
   }

   public String liiiIIllIl() {
      return this.liIlIlilil;
   }

   public boolean IilliliilIIi() {
      return this.IIllIlilil;
   }
}
