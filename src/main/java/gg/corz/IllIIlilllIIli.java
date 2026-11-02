package gg.corz;

import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import java.util.List;
import net.minecraft.class_2338;
import net.minecraft.class_2680;

record IllIIlilllIIli(
   List<class_2338> positions,
   List<class_2680> expected,
   Long2ByteOpenHashMap classByCell,
   lIlIIiIliIlIIiIl view,
   IlIlilillIlili config,
   int accentColor,
   int correctColor,
   int missingColor,
   int wrongBlockColor,
   int wrongStateColor,
   int extraColor
) {
   private final Long2ByteOpenHashMap IlIiIiiiillIiIiiii;
   private final List<class_2338> iiilIiiiiIIIiIiiii;
   private final int iIliIiiiiIlliIiiii;
   private final int IiliIiiiililiIiiii;
   private final int iiliIiiiiIIiiIiiii;
   private final int llliIiiiiilliIiiii;
   private final IlIlilillIlili liIiIiiiiiiIiIiiii;
   private final lIlIIiIliIlIIiIl ilIiIiiiiIiIiIiiii;
   private final int lIiiIiiiiiIiiIiiii;
   private final int IIliIiiiilIliIiiii;
   private final List<class_2680> lIIiIiiiiiIIiIiiii;

   public int IlIlllIlilIl() {
      return this.llliIiiiiilliIiiii;
   }

   public Long2ByteOpenHashMap iIlIlllllill() {
      return this.IlIiIiiiillIiIiiii;
   }

   public int IIIllIIliIIl() {
      return this.iIliIiiiiIlliIiiii;
   }

   public List<class_2338> IliIlllilIi() {
      return this.iiilIiiiiIIIiIiiii;
   }

   public lIlIIiIliIlIIiIl IilliliilIIi() {
      return this.ilIiIiiiiIiIiIiiii;
   }

   public int iliIiiliiiii() {
      return this.IIliIiiiilIliIiiii;
   }

   public List<class_2680> liiiIIllIl() {
      return this.lIIiIiiiiiIIiIiiii;
   }

   IllIIlilllIIli(
      List<class_2338> positions,
      List<class_2680> expected,
      Long2ByteOpenHashMap classByCell,
      lIlIIiIliIlIIiIl view,
      IlIlilillIlili config,
      int accentColor,
      int correctColor,
      int missingColor,
      int wrongBlockColor,
      int wrongStateColor,
      int extraColor
   ) {
      this.iiilIiiiiIIIiIiiii = positions;
      this.lIIiIiiiiiIIiIiiii = expected;
      this.IlIiIiiiillIiIiiii = classByCell;
      this.ilIiIiiiiIiIiIiiii = view;
      this.liIiIiiiiiiIiIiiii = config;
      this.IIliIiiiilIliIiiii = accentColor;
      this.iIliIiiiiIlliIiiii = correctColor;
      this.llliIiiiiilliIiiii = missingColor;
      this.IiliIiiiililiIiiii = wrongBlockColor;
      this.iiliIiiiiIIiiIiiii = wrongStateColor;
      this.lIiiIiiiiiIiiIiiii = extraColor;
   }

   public int Illlllllilll() {
      return this.lIiiIiiiiiIiiIiiii;
   }

   public IlIlilillIlili lIiiIiIlilli() {
      return this.liIiIiiiiiiIiIiiii;
   }

   public int IIlllIlliIll() {
      return this.iiliIiiiiIIiiIiiii;
   }

   public int IiIlliIliiIl() {
      return this.IiliIiiiililiIiiii;
   }
}
