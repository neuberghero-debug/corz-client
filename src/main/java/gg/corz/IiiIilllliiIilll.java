package gg.corz;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class IiiIilllliiIilll {
   private int lIillIlill;
   private final Map<Object, Integer> iilllIlill;
   private int IIillIlill;
   private final Map<Object, Long> lilllIlill = new HashMap<>();

   public void IilliliilIIi() {
      this.lilllIlill.clear();
      this.iilllIlill.clear();
      this.IIillIlill = 0;
      this.lIillIlill = 0;
   }

   public boolean iIlIlllllill(boolean sourceMatches, boolean destinationMatches, boolean countsMatch) {
      this.lIillIlill = sourceMatches && destinationMatches && countsMatch ? this.lIillIlill + 1 : 0;
      return this.lIillIlill >= 6;
   }

   public boolean liiiIIllIl(Object material, long contents) {
      if (!Objects.equals(this.lilllIlill.get(material), contents)) {
         return false;
      } else {
         Integer var4 = this.iilllIlill.get(material);
         return var4 != null && var4 == this.IIillIlill;
      }
   }

   public IiiIilllliiIilll() {
      this.iilllIlill = new HashMap<>();
   }

   public boolean IliIlllilIi(Object contents, long material) {
      if (this.liiiIIllIl(contents, material)) {
         return false;
      } else {
         this.lilllIlill.put(contents, material);
         this.iilllIlill.put(contents, ++this.IIillIlill);
         this.lIillIlill = 0;
         return true;
      }
   }
}
