package gg.corz;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public final class lIlIliIiiIlIliIi {
   public static final int IiIlIliIIi = 16;
   private final Deque<liIiiiiIii> liIlIliIIi = new ArrayDeque<>();

   public boolean IlIlllIlilIl() {
      liIiiiiIii var1 = this.liIlIliIIi.peekFirst();
      return var1 != null && var1.IlIillIiilIi() > 1 && !var1.IiIiliIiiiIi();
   }

   public void IliIlllilIi(liIiiiiIii e) {
      if (e != null) {
         liIiiiiIii var2 = this.liIlIliIIi.peekFirst();
         if (var2 != null && var2.IliIlllilIi(e)) {
            this.liIlIliIIi.removeFirst();
            this.liIlIliIIi
               .addFirst(
                  new liIiiiiIii(
                     e.iIlIlllllill(),
                     e.IilliliilIIi(),
                     e.lIiiIiIlilli(),
                     e.iliIiiliiiii(),
                     e.IIIllIIliIIl(),
                     e.IlIlllIlilIl(),
                     e.IiIlliIliiIl(),
                     e.IIlllIlliIll(),
                     e.Illlllllilll(),
                     e.Iilllilliill(),
                     e.IIillIiliIil(),
                     e.Ililllililil(),
                     e.Iiilliiliiil(),
                     e.IIIilIIiiIIi(),
                     var2.IlIillIiilIi() + 1,
                     e.IiIiliIiiiIi(),
                     e.IIlilIliiIli(),
                     e.Illillliilli(),
                     e.Iilililiiili()
                  )
               );
         } else {
            this.liIlIliIIi.addFirst(e);

            while (this.liIlIliIIi.size() > 16) {
               this.liIlIliIIi.removeLast();
            }
         }
      }
   }

   public List<liIiiiiIii> IilliliilIIi() {
      return List.copyOf(this.liIlIliIIi);
   }

   public liIiiiiIii lIiiIiIlilli() {
      return this.liIlIliIIi.peekFirst();
   }

   public void liiiIIllIl(long stand, long actionType, String target) {
      this.liIlIliIIi.removeIf(e -> e.iliIiiliiiii() == stand && e.IIIllIIliIIl() == actionType && e.IlIlllIlilIl().equals(target));
   }

   public int IIIllIIliIIl() {
      liIiiiiIii var1 = this.liIlIliIIi.peekFirst();
      return var1 == null ? 0 : var1.IlIillIiilIi();
   }

   public void iIlIlllllill() {
      this.liIlIliIIi.clear();
   }

   public int iliIiiliiiii() {
      return this.liIlIliIIi.size();
   }
}
