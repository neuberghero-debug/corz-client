package gg.corz;

import java.util.List;

public record llililIlilililIl(
   iIiiIIlIliiIIl kind,
   List<IiIillIlliIillIl> ranked,
   List<IiIillIlliIillIl> all,
   int listings,
   int fakes,
   int unread,
   int tooShort,
   int overPrice,
   int overBudget,
   int pages,
   boolean opened,
   long scannedAtMs
) {
   private final boolean IilililIll;
   private final int IllililIll;
   private final int lIlililIll;
   private final int iiIililIll;
   private final List<IiIillIlliIillIl> IiIililIll;
   private final List<IiIillIlliIillIl> liIililIll;
   private final int lllililIll;
   private final int iIlililIll;
   private final int IIlililIll;
   private final iIiiIIlIliiIIl ilIililIll;
   private final long lilililIll;
   private final int illililIll;

   public int IlIlllIlilIl() {
      return this.iIlililIll;
   }

   public int IiIlliIliiIl() {
      return this.IllililIll;
   }

   public int Illlllllilll() {
      return this.illililIll;
   }

   public List<IiIillIlliIillIl> IilliliilIIi() {
      return this.liIililIll;
   }

   public boolean Iilllilliill() {
      return this.IilililIll;
   }

   public int IIlllIlliIll() {
      return this.lllililIll;
   }

   public int IIIllIIliIIl() {
      return this.lIlililIll;
   }

   public int iliIiiliiiii() {
      return this.IIlililIll;
   }

   public List<IiIillIlliIillIl> iIlIlllllill() {
      return this.IiIililIll;
   }

   public llililIlilililIl(
      iIiiIIlIliiIIl kind,
      List<IiIillIlliIillIl> ranked,
      List<IiIillIlliIillIl> all,
      int listings,
      int fakes,
      int unread,
      int tooShort,
      int overPrice,
      int overBudget,
      int pages,
      boolean opened,
      long scannedAtMs
   ) {
      ranked = ranked == null ? List.of() : List.copyOf(ranked);
      all = all == null ? ranked : List.copyOf(all);
      this.ilIililIll = kind;
      this.IiIililIll = ranked;
      this.liIililIll = all;
      this.iiIililIll = listings;
      this.IIlililIll = fakes;
      this.lIlililIll = unread;
      this.iIlililIll = tooShort;
      this.IllililIll = overPrice;
      this.lllililIll = overBudget;
      this.illililIll = pages;
      this.IilililIll = opened;
      this.lilililIll = scannedAtMs;
   }

   public IiIillIlliIillIl IliIlllilIi() {
      return this.IiIililIll.isEmpty() ? null : this.IiIililIll.get(0);
   }

   public long IIillIiliIil() {
      return this.lilililIll;
   }

   public int lIiiIiIlilli() {
      return this.iiIililIll;
   }

   public iIiiIIlIliiIIl liiiIIllIl() {
      return this.ilIililIll;
   }
}
