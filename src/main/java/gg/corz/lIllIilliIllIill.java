package gg.corz;

import java.util.Iterator;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1887;
import net.minecraft.class_1914;
import net.minecraft.class_6880;
import net.minecraft.class_9304;
import net.minecraft.class_9334;

public final class lIllIilliIllIill {
   public final int IIIiIilill;
   public final String ilIiIilill;
   public final int IiilIilill;
   public final int IillIilill;
   public final int llllIilill;
   public final int iiilIilill;
   public final boolean iIIiIilill;
   public final class_6880<class_1887> llIiIilill;
   private final String liIiIilill;
   public final class_1792 lillIilill;
   public final int iillIilill;
   public final int IiIiIilill;
   public final int llilIilill;
   public final class_1799 IIilIilill;
   public final class_1792 lIilIilill;
   public final boolean IlIiIilill;
   public final int IlilIilill;
   public final boolean ililIilill;
   public final class_1792 illlIilill;
   public final float liilIilill;
   public final int lIIiIilill;
   public final int iIilIilill;

   public String iliIiiliiiii() {
      long var4 = 7651962781682935092L;
      if (this.IlIiIilill && !this.ilIiIilill.isEmpty()) {
         String var1 = IliiiiIilliiiiIi.lIiiIiIlilli(this.llIiIilill);
         var4 ^= (4294967296L ^ var4) & -1L << 32;

         try {
            if (this.llIiIilill != null) {
               var4 ^= ((long)((class_1887)this.llIiIilill.comp_349()).method_8183() << 32 ^ var4) & -1L << 32;
            }
         } catch (Exception var6) {
            var4 ^= ((long)this.IiIiIilill << 32 ^ var4) & -1L << 32;
         }

         return (int)(var4 >>> 32) > 1
            ? var1 + IiIlliIliiIl<"IiIlliIliiIl","ak4pjTP5D8dOLSGwKd53RGplNR1JzHiEvoXWwbk=">() + IliiiiIilliiiiIi.iliIiiliiiii(this.IiIiIilill)
            : var1;
      } else {
         return IiiIlliiIl.IlIlllIlilIl(this.lIilIilill);
      }
   }

   public static lIllIilliIllIill IliIlllilIi(class_1914 offer, int index) {
      long var17 = 4846553943339615757L;
      long var15 = -4258597919338607067L;
      class_1799 var2 = offer.method_19272();
      class_1799 var3 = offer.method_8247();
      class_1799 var4 = offer.method_8250().method_7972();
      class_1792 var5 = var2.method_7960() ? null : var2.method_7909();
      var15 ^= ((long)var2.method_7947() << 32 ^ var15) & -1L << 32;
      class_1792 var7 = var3.method_7960() ? null : var3.method_7909();
      var15 ^= ((long)(var3.method_7960() ? 0 : var3.method_7947()) ^ var15) & -1L >>> 32;
      class_6880 var9 = null;
      String var10 = "";
      var17 ^= (0L ^ var17) & -1L << 32;
      if (var4.method_31574(class_1802.field_8598)) {
         class_9304 var12 = (class_9304)var4.method_58695(class_9334.field_49643, class_9304.field_49385);
         Iterator var13 = var12.method_57534().iterator();
         if (var13.hasNext()) {
            class_6880 var14 = (class_6880)var13.next();
            var9 = var14;
            var17 ^= ((long)var12.method_57536(var14) << 32 ^ var17) & -1L << 32;
            var10 = IliiiiIilliiiiIi.IilliliilIIi(var14);
         }
      }

      return new lIllIilliIllIill(
         index,
         var5,
         (int)(var15 >>> 32),
         var7,
         (int)var15,
         var4,
         offer.method_8249(),
         offer.method_8248(),
         offer.method_8255(),
         offer.method_19277(),
         offer.method_19278(),
         offer.method_21725(),
         offer.method_19279(),
         var9,
         var10,
         (int)(var17 >>> 32)
      );
   }

   public boolean IilliliilIIi() {
      return this.lillIilill != null && this.iillIilill > 0;
   }

   public String lIiiIiIlilli() {
      return this.liIiIilill;
   }

   private lIllIilliIllIill(
      int disabled,
      class_1792 secondItem,
      int maxUses,
      class_1792 storedEnchant,
      int uses,
      class_1799 priceMultiplier,
      int storedEnchantPath,
      int specialPrice,
      boolean output,
      int merchantXp,
      float storedEnchantLevel,
      int firstCount,
      int firstItem,
      class_6880<class_1887> secondCount,
      String demandBonus,
      int index
   ) {
      long var18 = -1097929238992104529L;
      super();
      this.llllIilill = disabled;
      this.illlIilill = secondItem;
      this.IillIilill = maxUses;
      this.lillIilill = storedEnchant;
      this.iillIilill = uses;
      this.IIilIilill = priceMultiplier;
      this.lIilIilill = priceMultiplier.method_7909();
      this.iIilIilill = priceMultiplier.method_7947();
      this.IlilIilill = storedEnchantPath;
      this.llilIilill = specialPrice;
      this.ililIilill = output;
      this.IiilIilill = merchantXp;
      this.liilIilill = storedEnchantLevel;
      this.iiilIilill = firstCount;
      this.IIIiIilill = firstItem;
      this.iIIiIilill = priceMultiplier.method_31574(class_1802.field_8687);
      this.IlIiIilill = priceMultiplier.method_31574(class_1802.field_8598);
      this.llIiIilill = secondCount;
      this.ilIiIilill = demandBonus;
      this.IiIiIilill = index;
      var18 ^= (0L ^ var18) & -1L << 32;
      if (secondItem == class_1802.field_8687) {
         var18 ^= ((long)maxUses << 32 ^ var18) & -1L << 32;
      } else if (storedEnchant == class_1802.field_8687) {
         var18 ^= ((long)uses << 32 ^ var18) & -1L << 32;
      }

      this.lIIiIilill = (int)(var18 >>> 32);
      this.liIiIilill = IlIlllIlilIl(secondItem)
         + IiIlliIliiIl<"IiIlliIliiIl","prmLhrQO/JKxYH8EALsHvSFrHO9vBHAGkrT+haM=">()
         + maxUses
         + IiIlliIliiIl<"IiIlliIliiIl","7KbjrviS3NLolFWvAASsvW8T44ZsmBNhVCG7Ks4=">()
         + IlIlllIlilIl(storedEnchant)
         + IiIlliIliiIl<"IiIlliIliiIl","prmLhrQO/JKxYH8EALsHvSFrHO9vBHAGkrT+haM=">()
         + uses
         + IiIlliIliiIl<"IiIlliIliiIl","b1cBEEBcA9Vn3JC9CiOSm/l+W2K+bJkU8B/TSwY=">()
         + IlIlllIlilIl(this.lIilIilill)
         + IiIlliIliiIl<"IiIlliIliiIl","prmLhrQO/JKxYH8EALsHvSFrHO9vBHAGkrT+haM=">()
         + this.iIilIilill
         + (this.IlIiIilill ? IiIlliIliiIl<"IiIlliIliiIl","Rieh4gJfZQwpwalTwRGN8jbPpZQveE+lzgI+GCc=">() + demandBonus + index : "");
   }

   public boolean iIlIlllllill() {
      return !this.ililIilill && this.liiiIIllIl() > 0;
   }

   private static String IlIlllIlilIl(class_1792 item) {
      return item == null ? IiIlliIliiIl<"IiIlliIliiIl","kKysPqqFLWX5jp1xindRDXn4GG4lOq/32hFzFpE=">() : item.method_7876();
   }

   public int liiiIIllIl() {
      return Math.max(0, this.llilIilill - this.IlilIilill);
   }

   public String IIIllIIliIIl() {
      StringBuilder var1 = new StringBuilder();
      if (this.illlIilill != null) {
         var1.append(this.IillIilill)
            .append(IiIlliIliiIl<"IiIlliIliiIl","ak4pjTP5D8dOLSGwKd53RGplNR1JzHiEvoXWwbk=">())
            .append(IiiIlliiIl.IlIlllIlilIl(this.illlIilill));
      }

      if (this.IilliliilIIi()) {
         var1.append(IiIlliIliiIl<"IiIlliIliiIl","HPBq2FWfl0T+pJZNwECqrkgYIVqnEwN3GrUkRSGIUw==">())
            .append(this.iillIilill)
            .append(IiIlliIliiIl<"IiIlliIliiIl","ak4pjTP5D8dOLSGwKd53RGplNR1JzHiEvoXWwbk=">())
            .append(IiiIlliiIl.IlIlllIlilIl(this.lillIilill));
      }

      return var1.length() == 0 ? IiIlliIliiIl<"IiIlliIliiIl","Mes3OLy+/qnyAQf3JxzQKLtLbmA8YEU00LCtbbM=">() : var1.toString();
   }
}
