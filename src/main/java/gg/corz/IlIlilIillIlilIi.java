package gg.corz;

import java.util.List;
import net.minecraft.class_2338;

record IlIlilIillIlilIi(class_2338 base, List<class_2338> obsidian, int top, boolean existing, boolean armed, int pendingBreakAt, int placeAfter) {
   private final int iilllllIIi;
   private final class_2338 IilllllIIi;
   private final int iIillllIIi;
   private final boolean lIillllIIi;
   private final List<class_2338> lilllllIIi;
   private final boolean IIillllIIi;
   private final int IlillllIIi;

   public int iliIiiliiiii() {
      return this.iIillllIIi;
   }

   public int IIIllIIliIIl() {
      return this.IlillllIIi;
   }

   public int iIlIlllllill() {
      return this.iilllllIIi;
   }

   public boolean IilliliilIIi() {
      return this.IIillllIIi;
   }

   public class_2338 IliIlllilIi() {
      return this.IilllllIIi;
   }

   public List<class_2338> liiiIIllIl() {
      return this.lilllllIIi;
   }

   private IlIlilIillIlilIi(class_2338 base, List<class_2338> obsidian, int top, boolean existing, boolean armed, int pendingBreakAt, int placeAfter) {
      this.IilllllIIi = base;
      this.lilllllIIi = obsidian;
      this.iilllllIIi = top;
      this.IIillllIIi = existing;
      this.lIillllIIi = armed;
      this.iIillllIIi = pendingBreakAt;
      this.IlillllIIi = placeAfter;
   }

   public boolean lIiiIiIlilli() {
      return this.lIillllIIi;
   }
}
