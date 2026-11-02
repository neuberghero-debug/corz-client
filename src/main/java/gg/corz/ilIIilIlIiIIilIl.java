package gg.corz;

import java.util.List;

public record ilIIilIlIiIIilIl(
   int live,
   int hardRequired,
   int active,
   int highFuture,
   int lowFuture,
   int stale,
   int orphaned,
   int reclaimableNow,
   int reclaimableBottomUp,
   int unreachable,
   int banned,
   int route,
   int protectedInRetire,
   List<Long> retireOrder,
   List<Long> bottomUpCells,
   List<Long> unreachableCells,
   List<Long> bannedCells
) {
   private final int IllIllliIl;
   private final List<Long> iIiIllliIl;
   private final int lilIllliIl;
   private final int IilIllliIl;
   private final int lIlIllliIl;
   private final List<Long> lliIllliIl;
   private final int IIlIllliIl;
   private final int iIlIllliIl;
   private final List<Long> lIiIllliIl;
   private final int illIllliIl;
   private final List<Long> IliIllliIl;
   private final int IiIIllliIl;
   private final int IIiIllliIl;
   private final int iiIIllliIl;
   private final int lllIllliIl;
   private final int liIIllliIl;
   private final int iilIllliIl;

   public int IIIllIIliIIl() {
      return this.lIlIllliIl;
   }

   public int lIiiIiIlilli() {
      return this.iiIIllliIl;
   }

   public int IiIlliIliiIl() {
      return this.IllIllliIl;
   }

   public int Iilllilliill() {
      return this.IilIllliIl;
   }

   public String liiiIIllIl() {
      return Illillliilli<"Illillliilli","PycemS1Na7KLtQTN8seksSErnp7GsTWRbnYSLdhwM2gS">()
         + this.IiIIllliIl
         + Illillliilli<"Illillliilli","aRjJcLX9MyUu+RQP4pWvonZXnzKgNc/H9AqILim2OSUkWDrlF0jgYiEjvh0=">()
         + this.lllIllliIl
         + Illillliilli<"Illillliilli","yFSh6wy0oRC1BOp5+6RGy1y56RQNOG2Iuwb7D2/BDY3Ls///8q4=">()
         + this.illIllliIl
         + Illillliilli<"Illillliilli","YyBjn3EqhVyBdSuCLUqh0zBmlLL+X35pczqFAJcsTqstvZh0ri7rwJGB">()
         + this.liIIllliIl
         + Illillliilli<"Illillliilli","E8UHtFzUtj46XpZHGPdVE/Ec9awXFsb5/8xRhTjuZFJp3u0=">()
         + this.iilIllliIl
         + Illillliilli<"Illillliilli","4wMdBDw2dyvom3uFV11XXl/Ku7P/jvuOvPQX7i9Udjih5REe">()
         + this.iiIIllliIl
         + Illillliilli<"Illillliilli","GpiLf0/UUf349kT5CdyxoiDjDXuaB6xxQvrxLaCZ8RSHIERiIPlov2Ccfg==">()
         + this.IIlIllliIl
         + Illillliilli<"Illillliilli","RTx1nWJj/fSokkRW/el6f4isDB07JqbYzthOXYo+vFFKql0F+1fd">()
         + this.lIlIllliIl
         + Illillliilli<"Illillliilli","Azn2XkqvKWQ/q6sNrYDCCngLVqd9YGt+VN4XR1zdPtNb1P8=">()
         + this.iIlIllliIl
         + Illillliilli<"Illillliilli","hOncGEUe7KdHkaDT1CKLQlNQshPZLbyuqO79l3iVcc8Lzg3s7O8=">()
         + this.IllIllliIl
         + Illillliilli<"Illillliilli","H1iPl0YnQcuarE6co85jC/RPX9DbLSHwPVOFOlFZaBkLqjomfMJchd0=">()
         + this.IilIllliIl
         + Illillliilli<"Illillliilli","SUo7HmbrEsw4WAJBXFAeYOKI2+ZDlId63LzO3AkbxgyswVZM">()
         + this.lilIllliIl
         + Illillliilli<"Illillliilli","DfTefr6gCcia9tr0mZOs1T2YkhhG2tKygFDutTjxtkvDpuKZogCxQFAMTxc=">()
         + this.IliIlllilIi();
   }

   public ilIIilIlIiIIilIl(
      int live,
      int hardRequired,
      int active,
      int highFuture,
      int lowFuture,
      int stale,
      int orphaned,
      int reclaimableNow,
      int reclaimableBottomUp,
      int unreachable,
      int banned,
      int route,
      int protectedInRetire,
      List<Long> retireOrder,
      List<Long> bottomUpCells,
      List<Long> unreachableCells,
      List<Long> bannedCells
   ) {
      this.IiIIllliIl = live;
      this.liIIllliIl = hardRequired;
      this.iiIIllliIl = active;
      this.IIlIllliIl = highFuture;
      this.lIlIllliIl = lowFuture;
      this.iIlIllliIl = stale;
      this.IllIllliIl = orphaned;
      this.lllIllliIl = reclaimableNow;
      this.illIllliIl = reclaimableBottomUp;
      this.IilIllliIl = unreachable;
      this.lilIllliIl = banned;
      this.iilIllliIl = route;
      this.IIiIllliIl = protectedInRetire;
      this.lIiIllliIl = retireOrder;
      this.iIiIllliIl = bottomUpCells;
      this.IliIllliIl = unreachableCells;
      this.lliIllliIl = bannedCells;
   }

   public List<Long> IIlilIliiIli() {
      return this.lliIllliIl;
   }

   public int IliIlllilIi() {
      return Math.max(0, this.IiIIllliIl - this.liIIllliIl - this.iiIIllliIl - this.IilIllliIl - this.lilIllliIl);
   }

   public List<Long> IlIillIiilIi() {
      return this.iIiIllliIl;
   }

   public int iliIiiliiiii() {
      return this.IIlIllliIl;
   }

   public int IIillIiliIil() {
      return this.lilIllliIl;
   }

   public int IilliliilIIi() {
      return this.liIIllliIl;
   }

   public List<Long> IiIiliIiiiIi() {
      return this.IliIllliIl;
   }

   public List<Long> IIIilIIiiIIi() {
      return this.lIiIllliIl;
   }

   public int Ililllililil() {
      return this.iilIllliIl;
   }

   public int Iiilliiliiil() {
      return this.IIiIllliIl;
   }

   public int IlIlllIlilIl() {
      return this.iIlIllliIl;
   }

   public int Illlllllilll() {
      return this.illIllliIl;
   }

   public int IIlllIlliIll() {
      return this.lllIllliIl;
   }

   public int iIlIlllllill() {
      return this.IiIIllliIl;
   }
}
