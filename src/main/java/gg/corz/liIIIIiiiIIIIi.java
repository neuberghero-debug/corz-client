package gg.corz;

import java.util.List;
import net.minecraft.class_2338;

final class liIIIIiiiIIIIi implements iIlIiIllIi {
   @Override
   public long IlIlllIlilIl() {
      return System.nanoTime();
   }

   @Override
   public long liiiIIllIl(Iiilliiliiil deck) {
      class_2338 var2 = this.liIIlIiliiiIIlIili.iillilIIilil(deck);
      return var2 == null ? 0L : var2.method_10063();
   }

   private liIIIIiiiIIIIi(final iIlIilIlIllIilIl param1) {
      this.liIIlIiliiiIIlIili = var1;
   }

   @Override
   public iIIiIlllIlIiIlll lIiiIiIlilli() {
      return this.liIIlIiliiiIIlIili.iIllilIlllil();
   }

   @Override
   public List<long[]> IliIlllilIi(Iiilliiliiil deck) {
      return iIiIilIiIliIilIi.IIIilIIiiIIi(this.liIIlIiliiiIIlIili.IliIlllIll, deck);
   }

   @Override
   public Illlllllllllllll iIlIlllllill() {
      return this.liIIlIiliiiIIlIili.llllililllil();
   }

   @Override
   public boolean IIIllIIliIIl(int deckY) {
      return this.liIIlIiliiiIIlIili.illIIIIIll != null && this.liIIlIiliiiIIlIili.illIIIIIll.IilliliilIIi().contains(deckY);
   }

   @Override
   public boolean IilliliilIIi() {
      if (!this.liIIlIiliiiIIlIili.IillIIllillIIl()) {
         return false;
      } else {
         this.liIIlIiliiiIIlIili
            .IiilIiiliilIii(
               IiIlliIliiIl<"IiIlliIliiIl","lIifJjY459UIN1rOxLZ4uEJXa2r6d4sb37CzD83Pb2RqWZx8kPD8rmkDsbSK5e+iMzfZNg18o+9AS3xnb/ecpYXWSIMrNAKTfMgE90VVHm4DgllQH7Z3CD26yy8FRuXDgeHQi6j61mUDJs4mPTBX8iH3YD1OSIA=">()
            );
         return true;
      }
   }

   @Override
   public IllIiillllIiil iliIiiliiiii(illIIIilIilIIIil astarAllowed, boolean c) {
      return this.liIIlIiliiiIIlIili.ilililIiilil(astarAllowed, c);
   }
}
