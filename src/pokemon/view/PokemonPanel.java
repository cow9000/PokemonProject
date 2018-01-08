package pokemon.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import pokemon.controller.PokemonController;

public class PokemonPanel extends JPanel
{
	private PokemonController appController;
	private SpringLayout appLayout;
	
	private JLabel healthLabel;
	private JLabel attackLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel evolvableLabel;
	private JLabel modifierLabel;
	private JLabel iconLabel;
	
	private JCheckBox evolvableBox;
	private JTextField nameField;
	private JTextField numberField;
	private JTextField attackField;
	private JTextField healthField;
	private JTextField modifierField;
	
	private JTextArea descriptionArea;
	private JTextArea typeArea;
	
	private JButton saveButton;
	private JButton clearButton;
	private JComboBox pokedexDropdown;
	
	private JPanel firstType;
	private JPanel secondType;
	private JPanel thirdType;
	private JPanel fourthType;
	
	public PokemonPanel(PokemonController appController){
		super();
		
		this.appController = appController;
		
		appLayout = new SpringLayout();	
		healthLabel = new JLabel("Health");
		attackLabel = new JLabel("Attack");
		nameLabel = new JLabel("Name");
		numberLabel = new JLabel("Number");
		evolvableLabel = new JLabel("Evolvable");
		modifierLabel = new JLabel("Modifier");

		iconLabel = new JLabel("", new ImageIcon(getClass().getResource("/pokemon/view/images/pokeball.png")), JLabel.CENTER);
		evolvableBox = new JCheckBox();
		
		nameField = new JTextField();
		numberField = new JTextField();
		attackField = new JTextField();
		healthField = new JTextField();
		modifierField = new JTextField();

		
		descriptionArea = new JTextArea(5,10);
		typeArea = new JTextArea(4,15);

		
		saveButton = new JButton("Save");
		clearButton = new JButton("Clear");

		pokedexDropdown = new JComboBox();

		
		
		firstType = new JPanel();
		secondType = new JPanel();
		thirdType = new JPanel();
		fourthType = new JPanel();
		setupComboBox();
		setupTypePanels();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel() {
		this.setLayout(appLayout);
		
		this.add(healthLabel);
		this.add(attackLabel);
		this.add(nameLabel);
		this.add(numberLabel);
		this.add(evolvableLabel);
		this.add(modifierLabel);
		this.add(iconLabel);
		
		this.add(evolvableBox);
		this.add(nameField);
		this.add(numberField);
		this.add(attackField);
		this.add(healthField);
		this.add(modifierField);
		
		this.add(descriptionArea);
		this.add(typeArea);
		
		this.add(saveButton);
		this.add(clearButton);
		this.add(pokedexDropdown);
		
		this.add(firstType);
		this.add(secondType);
		this.add(thirdType);
		this.add(fourthType);
	}
	private void setupLayout() {
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 15, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 0, SpringLayout.NORTH, healthLabel);
		appLayout.putConstraint(SpringLayout.EAST, attackLabel, 0, SpringLayout.EAST, numberLabel);
		appLayout.putConstraint(SpringLayout.WEST, numberLabel, 0, SpringLayout.WEST, healthLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, attackLabel, -17, SpringLayout.NORTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.NORTH, evolvableLabel, 59, SpringLayout.SOUTH, numberLabel);
		appLayout.putConstraint(SpringLayout.WEST, healthLabel, 0, SpringLayout.WEST, evolvableLabel);
		appLayout.putConstraint(SpringLayout.NORTH, modifierLabel, 0, SpringLayout.NORTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.EAST, evolvableBox, -73, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, evolvableLabel, 6, SpringLayout.EAST, evolvableBox);
		appLayout.putConstraint(SpringLayout.EAST, modifierLabel, -58, SpringLayout.WEST, evolvableBox);
		appLayout.putConstraint(SpringLayout.SOUTH, evolvableBox, 0, SpringLayout.SOUTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 6, SpringLayout.EAST, nameField);
		appLayout.putConstraint(SpringLayout.EAST, nameField, -430, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, nameField, -5, SpringLayout.NORTH, healthLabel);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 5, SpringLayout.NORTH, numberField);
		appLayout.putConstraint(SpringLayout.EAST, numberField, 0, SpringLayout.EAST, evolvableBox);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, -5, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.EAST, attackField, 0, SpringLayout.EAST, evolvableBox);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 18, SpringLayout.SOUTH, healthField);
		appLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, evolvableBox);
		appLayout.putConstraint(SpringLayout.NORTH, modifierField, -5, SpringLayout.NORTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.EAST, modifierField, -6, SpringLayout.WEST, modifierLabel);
		appLayout.putConstraint(SpringLayout.NORTH, descriptionArea, 0, SpringLayout.NORTH, healthLabel);
		appLayout.putConstraint(SpringLayout.WEST, descriptionArea, 0, SpringLayout.WEST, modifierField);
		appLayout.putConstraint(SpringLayout.SOUTH, iconLabel, -6, SpringLayout.NORTH, typeArea);
		appLayout.putConstraint(SpringLayout.WEST, typeArea, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, typeArea, -45, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, clearButton, 261, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, clearButton, -364, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 0, SpringLayout.NORTH, clearButton);
		appLayout.putConstraint(SpringLayout.WEST, saveButton, 6, SpringLayout.EAST, clearButton);
		appLayout.putConstraint(SpringLayout.WEST, iconLabel, 16, SpringLayout.EAST, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 120, SpringLayout.SOUTH, nameField);
		appLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, -388, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, secondType, -41, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, thirdType, -41, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, fourthType, 236, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, secondType, 0, SpringLayout.SOUTH, firstType);
		appLayout.putConstraint(SpringLayout.SOUTH, fourthType, -108, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, firstType, 34, SpringLayout.SOUTH, fourthType);
		appLayout.putConstraint(SpringLayout.SOUTH, thirdType, 0, SpringLayout.SOUTH, fourthType);
		appLayout.putConstraint(SpringLayout.EAST, firstType, 0, SpringLayout.EAST, fourthType);
	}
	private void setupListeners() {
		pokedexDropdown.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent selection) {
					int selectedPokemonIndex = pokedexDropdown.getSelectedIndex();
					updatePokedexInfo(selectedPokemonIndex);
					updateImage();
					updateTypePanels();
					repaint();
				}	
		});
	}
	
	private void updateImage() {
		iconLabel.setIcon(new ImageIcon(getClass().getResource("/pokemon/view/images/Cthun.png")));
	}
	
	private void updatePokedexInfo(int index) {
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber() + "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");
		
		descriptionArea.setText(appController.getPokedex().get(index).toString());
		
	}
	
	private void setupComboBox()
	{
		DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel(appController.convertPokedex());
		pokedexDropdown.setModel(pokemonModel);
	}
	
	private void setupTypePanels() {
		firstType.setSize(50,50);
		secondType.setSize(50,50);
		thirdType.setSize(50,50);
		fourthType.setSize(50,50);
	}
	
	private void updateTypePanels() {
		String[] types = appController.getPokedex().get(pokedexDropdown.getSelectedIndex()).getPokemonTypes();
		
		
		if(types[0].equals("Dark")) {
			firstType.setBackground(Color.BLACK);
		}else if(types[0].equals("Poison")) {
			firstType.setBackground(Color.GREEN);
		}else if(types[0].equals("Psychic")) {
			firstType.setBackground(Color.MAGENTA);
		}else {
			firstType.setBackground(Color.WHITE);
		}
		
		
		if(types.length > 1) {
			if(types[1].equals("Dark")) {
				secondType.setBackground(Color.BLACK);
			}else if(types[1].equals("Poison")) {
				secondType.setBackground(Color.GREEN);
			}else if(types[1].equals("Psychic")) {
				secondType.setBackground(Color.MAGENTA);
			}else {
				secondType.setBackground(Color.WHITE);
			}
			
			if(types.length == 3) {
				if(types[2].equals("Dark")) {
					thirdType.setBackground(Color.BLACK);
				}else if(types[2].equals("Poison")) {
					thirdType.setBackground(Color.GREEN);
				}else if(types[2].equals("Psychic")) {
					thirdType.setBackground(Color.MAGENTA);
				}else {
					thirdType.setBackground(Color.WHITE);
				}
			}
			
			if(types.length == 4) {
				if(types[3].equals("Dark")) {
					fourthType.setBackground(Color.BLACK);
				}else if(types[3].equals("Poison")) {
					fourthType.setBackground(Color.GREEN);
				}else if(types[3].equals("Psychic")) {
					fourthType.setBackground(Color.MAGENTA);
				}else {
					fourthType.setBackground(Color.WHITE);
				}
			}
		}
		
	}
	

}
