package gg.corz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IIIiliIilIIiliIi {
   private String IIiiiliIIi;
   private final Map<String, Boolean> liliiliIIi = new HashMap<>();
   private static final IIIiliIilIIiliIi IiliiliIIi = new IIIiliIilIIiliIi();
   private boolean lIiiiliIIi;
   private lllIllillIll iiliiliIIi = lllIllillIll.liiIIIIiiiiIIIIi;

   private IIIiliIilIIiliIi() {
   }

   public String IiIlliIliiIl() {
      return this.IIiiiliIIi;
   }

   public boolean IlIlllIlilIl(String moduleName) {
      return this.liliiliIIi.getOrDefault(moduleName, false);
   }

   public List<lllIllillIll> liiiIIllIl() {
      ArrayList var1 = new ArrayList();
      var1.add(lllIllillIll.liiIIIIiiiiIIIIi);
      var1.add(lllIllillIll.IIIlIIIilIIlIIIi);
      var1.add(lllIllillIll.iIIlIIIiIlIlIIIi);
      var1.add(lllIllillIll.llIlIIIiilIlIIIi);
      var1.add(lllIllillIll.IiIlIIIiliIlIIIi);
      var1.add(lllIllillIll.iiIlIIIiIIllIIIi);
      var1.add(lllIllillIll.lIllIIIiiIllIIIi);
      var1.add(lllIllillIll.IlllIIIillllIIIi);
      var1.add(lllIllillIll.illlIIIiIillIIIi);
      var1.add(lllIllillIll.lillIIIiiillIIIi);
      var1.add(lllIllillIll.IIilIIIilIilIIIi);
      return var1;
   }

   public void Iilllilliill(boolean collapsed) {
      if (this.lIiiiliIIi != collapsed) {
         this.lIiiiliIIi = collapsed;
         iiiIIIlIIIlIIl.liiiIIllIl();
      }
   }

   public List<ilIllIiIll> iIlIlllllill(lllIllillIll category) {
      return llilIllililIll.lIiiIiIlilli(category);
   }

   public boolean Illlllllilll() {
      return this.lIiiiliIIi;
   }

   public lllIllillIll lIiiIiIlilli() {
      return this.iiliiliIIi;
   }

   public void IIlllIlliIll(String id) {
      this.IIiiiliIIi = id;
   }

   public static IIIiliIilIIiliIi IliIlllilIi() {
      return IiliiliIIi;
   }

   public void iliIiiliiiii(lllIllillIll category) {
      this.iiliiliIIi = category;
   }

   public void IIIllIIliIIl(String expanded, boolean moduleName) {
      this.liliiliIIi.put(expanded, moduleName);
   }

   public List<ilIllIiIll> IilliliilIIi() {
      return llilIllililIll.IilliliilIIi();
   }
}
