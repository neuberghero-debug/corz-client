package gg.corz;

import java.util.List;

public record Iillillillil(List<Ilililllllililll> listings, int items, int transactions, long price, int overbuy) {
   private final int ilIliiliIiIliili;
   private final int liIliiliiiIliili;
   private final int iIlliiliIllliili;
   private final List<Ilililllllililll> IlIliilillIliili;
   private final long IIlliililIlliili;

   public int lIiiIiIlilli() {
      return this.liIliiliiiIliili;
   }

   public int IilliliilIIi() {
      return this.ilIliiliIiIliili;
   }

   public String liiiIIllIl() {
      return IlIlllIlilIl<"IlIlllIlilIl","wAA1UjPSOq/xzW0/MjU/14Tp7ynQA43UA0+aFg849wnR8eOvJO91lBg=">()
         + this.liIliiliiiIliili
         + IlIlllIlilIl<"IlIlllIlilIl","1f4tZteDC9M+3CpzbMQq2GAwuyhgbyyDw0u4NzbOlTFYjjk=">()
         + this.ilIliiliIiIliili
         + IlIlllIlilIl<"IlIlllIlilIl","tZU4wX2TeYf91WWRIF7sHNf50g+Sr3t8PabBhtCbl0DswXE=">()
         + this.IIlliililIlliili
         + IlIlllIlilIl<"IlIlllIlilIl","nJHPE3mvTuGmguy5srBGawMmMI9piCIiKLwpoi5a+oKe0nmy8Q==">()
         + this.iIlliiliIllliili;
   }

   public long iliIiiliiiii() {
      return this.IIlliililIlliili;
   }

   public int IIIllIIliIIl() {
      return this.iIlliiliIllliili;
   }

   public Iillillillil(List<Ilililllllililll> listings, int items, int transactions, long price, int overbuy) {
      this.IlIliilillIliili = listings;
      this.ilIliiliIiIliili = items;
      this.liIliiliiiIliili = transactions;
      this.IIlliililIlliili = price;
      this.iIlliiliIllliili = overbuy;
   }

   public boolean IliIlllilIi() {
      return this.IlIliilillIliili.isEmpty();
   }

   public List<Ilililllllililll> iIlIlllllill() {
      return this.IlIliilillIliili;
   }
}
